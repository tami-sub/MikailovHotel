package com.example.mikailovhotel.shared.core.data.remote

import com.example.mikailovhotel.shared.core.domain.entity.Booking
import com.example.mikailovhotel.shared.core.domain.entity.Hotel
import com.example.mikailovhotel.shared.core.domain.entity.Room
import retrofit2.http.GET


interface RemoteApi {
    @GET("Hotels")
    suspend fun getHotel(): Result<List<Hotel>>

    @GET("Rooms")
    suspend fun getRoomList(): Result<List<Room>>

    @GET("Bookings")
    suspend fun getBookingInfo(): Result<List<Booking>>
}