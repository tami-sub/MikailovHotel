package com.example.mikailovhotel.shared.core.data.repository

import com.example.mikailovhotel.shared.core.data.remote.RemoteApi
import com.example.mikailovhotel.shared.core.domain.entity.Booking
import com.example.mikailovhotel.shared.core.domain.entity.Hotel
import com.example.mikailovhotel.shared.core.domain.entity.RoomList
import com.example.mikailovhotel.shared.core.domain.repository.HotelRepository
import javax.inject.Inject

class HotelRepositoryImpl @Inject constructor(private val api: RemoteApi) : HotelRepository {
    override suspend fun getHotel(): Result<Hotel> {
        return api.getHotel()
    }

    override suspend fun getRoomList(): Result<RoomList> {
        return api.getRoomList()
    }

    override suspend fun getBookingInfo(): Result<Booking>{
        return api.getBookingInfo()
    }
}