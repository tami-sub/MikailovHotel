package com.example.mikailovhotel.feature.hotel.presentation

import com.example.mikailovhotel.shared.core.domain.entity.Hotel

sealed interface HotelState {
    object Loading : HotelState
    data class Success(val hotel: Hotel) : HotelState
    data class Error(val exception: Throwable) : HotelState
    object Clear : HotelState
}