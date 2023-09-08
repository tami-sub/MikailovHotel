package com.example.mikailovhotel.feature.hotel.presentation

import com.denzcoskun.imageslider.models.SlideModel
import com.example.mikailovhotel.shared.core.domain.entity.Hotel

sealed interface HotelState {
    object Loading : HotelState
    data class Success(val hotel: Hotel, val imageList: ArrayList<SlideModel>) : HotelState
    data class Error(val exception: Throwable) : HotelState
}