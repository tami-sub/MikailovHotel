package com.example.mikailovhotel.feature.room.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mikailovhotel.shared.core.domain.usecase.RoomsListUseCase
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.UnknownHostException
import javax.inject.Inject

class RoomsViewModel @Inject constructor(private val roomsListUseCase: RoomsListUseCase) :
    ViewModel() {
    private val _state: MutableLiveData<RoomsState> = MutableLiveData<RoomsState>()
    val state: LiveData<RoomsState> = _state
    private var exceptionHandler: CoroutineExceptionHandler

    init {
        exceptionHandler = CoroutineExceptionHandler { _, throwable ->
            when (throwable) {
                is UnknownHostException -> handleError(throwable)
                is IllegalArgumentException -> handleError(throwable)
                is CancellationException -> handleError(throwable)
            }
        }
        getRoomsList()
    }

    fun getRoomsList() {
        _state.value = RoomsState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            roomsListUseCase.invoke().onSuccess { roomsList ->
                withContext(Dispatchers.Main) {
                    _state.value = RoomsState.Success(roomsList)
                }

            }.onFailure {
                withContext(Dispatchers.Main) {
                    _state.value = RoomsState.Error(it)
                }
            }
        }
    }

    private fun handleError(throwable: Throwable) {
        _state.value = RoomsState.Error(throwable)
    }
}