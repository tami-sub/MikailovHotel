package com.example.mikailovhotel.feature.booking.presentation

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mikailovhotel.feature.booking.R
import com.example.mikailovhotel.feature.booking.domain.AddTouristItem
import com.example.mikailovhotel.feature.booking.domain.BookingDataItem
import com.example.mikailovhotel.feature.booking.domain.BuyButtonItem
import com.example.mikailovhotel.feature.booking.domain.CustomerInfoItem
import com.example.mikailovhotel.feature.booking.domain.HotelInfoItem
import com.example.mikailovhotel.feature.booking.domain.PriceInfoItem
import com.example.mikailovhotel.feature.booking.domain.TouristInfoItem
import com.example.mikailovhotel.shared.core.domain.usecase.BookingUseCase
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.UnknownHostException
import java.util.Locale
import javax.inject.Inject

class BookingViewModel @Inject constructor(
    private val bookingUseCase: BookingUseCase, private val application: Application
) : ViewModel() {
    private val _state: MutableLiveData<BookingState> = MutableLiveData<BookingState>()
    val state: LiveData<BookingState> = _state
    private var exceptionHandler: CoroutineExceptionHandler

    init {
        exceptionHandler = CoroutineExceptionHandler { _, throwable ->
            when (throwable) {
                is UnknownHostException -> handleError(throwable)
                is IllegalArgumentException -> handleError(throwable)
                is CancellationException -> handleError(throwable)
            }
        }
        getBookingInfo()
    }

    fun getBookingInfo() {
        _state.value = BookingState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            bookingUseCase.invoke().onSuccess { dataList ->
                val data = dataList.first()
                withContext(Dispatchers.Main) {
                    val finalPrice = application.getString(
                        R.string.price_placeholder, String.format(
                            Locale.FRANCE,
                            "%,d",
                            data.tourPrice + data.fuelCharge + data.serviceCharge
                        )
                    )
                    val bookingInfo = mutableListOf(
                        HotelInfoItem(
                            application.getString(
                                com.example.mikailovhotel.shared.core.R.string.golden_score,
                                data.horating,
                                data.ratingName
                            ), data.hotelName, data.hotelAddress
                        ),
                        BookingDataItem(
                            data.departure, data.arrivalCountry, application.getString(
                                R.string.date_placeholder, data.tourDateStart, data.tourDateStop
                            ), application.getString(
                                R.string.nights, data.numberOfNights
                            ), data.hotelName, data.room, data.nutrition
                        ),
                        CustomerInfoItem(),
                        TouristInfoItem(application.resources.getStringArray(R.array.serial_tourist_number)[0]),
                        AddTouristItem(),
                        PriceInfoItem(
                            application.getString(
                                R.string.price_placeholder,
                                String.format(Locale.FRANCE, "%,d", data.tourPrice)
                            ), application.getString(
                                R.string.price_placeholder,
                                String.format(Locale.FRANCE, "%,d", data.fuelCharge)
                            ), application.getString(
                                R.string.price_placeholder,
                                String.format(Locale.FRANCE, "%,d", data.serviceCharge)
                            ), finalPrice
                        ),
                        BuyButtonItem(finalPrice)
                    )

                    _state.value = BookingState.Success(bookingInfo)
                }

            }.onFailure {
                withContext(Dispatchers.Main) {
                    _state.value = BookingState.Error(it)
                }
            }
        }
    }

    private fun handleError(throwable: Throwable) {
        _state.value = BookingState.Error(throwable)
    }
}