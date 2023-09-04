package com.example.mikailovhotel.feature.room.presentation

import com.example.mikailovhotel.shared.core.domain.entity.RoomList

sealed interface RoomsState {
    object Loading : RoomsState
    data class Success(val roomsList: RoomList) : RoomsState
    data class Error(val exception: Throwable) : RoomsState
    object Clear : RoomsState
}