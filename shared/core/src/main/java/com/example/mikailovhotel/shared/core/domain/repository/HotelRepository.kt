package com.example.mikailovhotel.shared.core.domain.repository

import com.example.mikailovhotel.shared.core.domain.entity.Hotel

interface HotelRepository {
    suspend fun getHotel(): Result<Hotel>
}