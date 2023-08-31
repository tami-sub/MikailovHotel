package com.example.mikailovhotel.shared.core.data.remote

import com.example.mikailovhotel.shared.core.domain.entity.Hotel
import retrofit2.http.GET


interface RemoteApi {
    @GET("35e0d18e-2521-4f1b-a575-f0fe366f66e3")
    suspend fun getHotel(): Result<Hotel>
}