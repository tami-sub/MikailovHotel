package com.example.mikailovhotel.shared.core.domain.repository

import com.example.mikailovhotel.shared.core.domain.entity.Booking
import com.example.mikailovhotel.shared.core.domain.entity.Hotel
import com.example.mikailovhotel.shared.core.domain.entity.Room

interface HotelRepository {
    suspend fun getHotel(): Result<List<Hotel>>

    suspend fun getRoomList(): Result<List<Room>>

    suspend fun getBookingInfo(): Result<List<Booking>>
}