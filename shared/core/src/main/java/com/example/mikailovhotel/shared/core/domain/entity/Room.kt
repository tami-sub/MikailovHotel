package com.example.mikailovhotel.shared.core.domain.entity

import com.google.gson.annotations.SerializedName

data class Room(
    @SerializedName("RoomsId")
    val id: Int,
    @SerializedName("RoomsImageUrls")
    val imageUrls: List<HotelImageUrl>,
    @SerializedName("Name")
    val name: String,
    @SerializedName("RoomsPeculiarities")
    val peculiarities: List<Peculiarities>,
    @SerializedName("Price")
    val price: Int,
    @SerializedName("PriceForIt")
    val pricePer: String
)