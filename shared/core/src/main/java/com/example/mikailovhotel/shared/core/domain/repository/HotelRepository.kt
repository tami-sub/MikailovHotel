package com.example.mikailovhotel.shared.core.domain.repository

import com.example.mikailovhotel.shared.core.domain.entity.Booking
import com.example.mikailovhotel.shared.core.domain.entity.Hotel
import com.example.mikailovhotel.shared.core.domain.entity.RoomList

interface HotelRepository {
    suspend fun getHotel(): Result<Hotel>

    suspend fun getRoomList(): Result<RoomList>

    suspend fun getBookingInfo(): Result<Booking>
}