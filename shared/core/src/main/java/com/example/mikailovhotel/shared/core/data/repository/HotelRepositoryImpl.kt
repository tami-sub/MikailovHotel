package com.example.mikailovhotel.shared.core.data.repository

import android.util.Log
import com.example.mikailovhotel.shared.core.data.remote.RemoteApi
import com.example.mikailovhotel.shared.core.domain.entity.Booking
import com.example.mikailovhotel.shared.core.domain.entity.Hotel
import com.example.mikailovhotel.shared.core.domain.entity.Room
import com.example.mikailovhotel.shared.core.domain.repository.HotelRepository
import javax.inject.Inject

class HotelRepositoryImpl @Inject constructor(private val api: RemoteApi) : HotelRepository {
    override suspend fun getHotel(): Result<List<Hotel>> {
        Log.d("HotelRepositoryImpl", "getHotel")
        return api.getHotel()
    }

    override suspend fun getRoomList(): Result<List<Room>> {
        Log.d("HotelRepositoryImpl", "getRoomList")
        return api.getRoomList()
    }

    override suspend fun getBookingInfo(): Result<List<Booking>>{
        Log.d("HotelRepositoryImpl", "getBookingInfo")
        return api.getBookingInfo()
    }
}