package com.example.mikailovhotel.feature.booking.presentation

import com.example.mikailovhotel.feature.booking.domain.ListItem

sealed interface BookingState {
    object Loading : BookingState
    data class Success(val bookingInfo: MutableList<ListItem>) : BookingState
    data class Error(val exception: Throwable) : BookingState
    object Clear : BookingState
}