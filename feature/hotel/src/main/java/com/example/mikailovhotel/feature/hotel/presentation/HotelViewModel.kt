package com.example.mikailovhotel.feature.hotel.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denzcoskun.imageslider.models.SlideModel
import com.example.mikailovhotel.shared.core.domain.usecase.GetHotelUseCase
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.UnknownHostException
import javax.inject.Inject

class HotelViewModel @Inject constructor(private val hotelUseCase: GetHotelUseCase) : ViewModel() {

    private val _state: MutableLiveData<HotelState> = MutableLiveData<HotelState>()
    val state: LiveData<HotelState> = _state
    private var exceptionHandler: CoroutineExceptionHandler

    init {
        exceptionHandler = CoroutineExceptionHandler { _, throwable ->
            when (throwable) {
                is UnknownHostException -> handleError(throwable)
                is IllegalArgumentException -> handleError(throwable)
                is CancellationException -> handleError(throwable)
            }
        }
        getHotelInfo()
    }

    fun getHotelInfo() {
        _state.value = HotelState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            hotelUseCase.invoke().onSuccess { hotel ->
                val imageList = ArrayList<SlideModel>()
                hotel.imageUrls.mapTo(imageList) { SlideModel(it) }
                withContext(Dispatchers.Main) {
                    _state.value = HotelState.Success(hotel, imageList)
                }

            }.onFailure {
                withContext(Dispatchers.Main) {
                    _state.value = HotelState.Error(it)
                }
            }
        }
    }

    private fun handleError(throwable: Throwable) {
        _state.value = HotelState.Error(throwable)
    }
}