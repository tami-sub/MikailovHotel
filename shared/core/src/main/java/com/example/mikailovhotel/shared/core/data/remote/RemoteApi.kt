package com.example.mikailovhotel.shared.core.data.remote

import com.example.mikailovhotel.shared.core.domain.entity.Booking
import com.example.mikailovhotel.shared.core.domain.entity.Hotel
import com.example.mikailovhotel.shared.core.domain.entity.RoomList
import retrofit2.http.GET


interface RemoteApi {
    @GET("35e0d18e-2521-4f1b-a575-f0fe366f66e3")
    suspend fun getHotel(): Result<Hotel>

    @GET("f9a38183-6f95-43aa-853a-9c83cbb05ecd")
    suspend fun getRoomList(): Result<RoomList>

    @GET("e8868481-743f-4eb2-a0d7-2bc4012275c8")
    suspend fun getBookingInfo(): Result<Booking>
}