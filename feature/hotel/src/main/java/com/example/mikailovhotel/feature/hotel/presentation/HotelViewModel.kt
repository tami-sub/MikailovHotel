package com.example.mikailovhotel.feature.hotel.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mikailovhotel.shared.core.domain.usecase.GetHotelUseCase
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.UnknownHostException
import javax.inject.Inject

class HotelViewModel @Inject constructor(private val hotelUseCase: GetHotelUseCase) : ViewModel() {

    private val _state: MutableLiveData<HotelState> = MutableLiveData<HotelState>()
    val state: LiveData<HotelState> = _state

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        when (throwable) {
            is UnknownHostException -> handleError(throwable)
            is IllegalArgumentException -> handleError(throwable)
        }
    }

    fun getHotel() {
        viewModelScope.launch(Dispatchers.IO) {
            hotelUseCase.invoke().onSuccess {
                with(Dispatchers.Main) {
                    Log.d("hohma", it.name)
                }

            }.onFailure {
                _state.value = HotelState.Error(it)
            }
        }
    }

    private fun handleError(throwable: Throwable) {
        _state.value = HotelState.Error(throwable)
    }
}