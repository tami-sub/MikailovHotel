package com.example.mikailovhotel.feature.booking.presentation

import android.content.Context
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
    private val bookingUseCase: BookingUseCase, private val context: Context
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
            bookingUseCase.invoke().onSuccess { data ->
                withContext(Dispatchers.Main) {
                    val finalPrice = context.getString(
                        R.string.price_placeholder, String.format(
                            Locale.FRANCE,
                            "%,d",
                            data.tour_price + data.fuel_charge + data.service_charge
                        )
                    )
                    val bookingInfo = mutableListOf(
                        HotelInfoItem(data.rating_name, data.hotel_name, data.hotel_adress),
                        BookingDataItem(
                            data.departure,
                            data.arrival_country,
                            context.getString(
                                R.string.date_placeholder, data.tour_date_start, data.tour_date_stop
                            ),
                            data.number_of_nights.toString(),
                            data.hotel_name,
                            data.room,
                            data.nutrition
                        ),
                        CustomerInfoItem(),
                        TouristInfoItem(context.resources.getStringArray(R.array.serial_tourist_number)[0]),
                        AddTouristItem(),
                        PriceInfoItem(
                            context.getString(
                                R.string.price_placeholder,
                                String.format(Locale.FRANCE, "%,d", data.tour_price)
                            ), context.getString(
                                R.string.price_placeholder,
                                String.format(Locale.FRANCE, "%,d", data.fuel_charge)
                            ), context.getString(
                                R.string.price_placeholder,
                                String.format(Locale.FRANCE, "%,d", data.service_charge)
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