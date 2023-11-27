package com.example.mikailovhotel.shared.core.domain.entity

import com.google.gson.annotations.SerializedName

data class Hotel(
    @SerializedName("AboutTheHotels")
    val aboutTheHotel: AboutTheHotel,
    @SerializedName("Address")
    val address: String,
    @SerializedName("HotelsId")
    val id: Int,
    @SerializedName("HotelsImageUrls")
    val imageUrls: List<HotelImageUrl>,
    @SerializedName("MinimalPrice")
    val minimalPrice: Int,
    @SerializedName("Name")
    val name: String,
    @SerializedName("PriceForIt")
    val priceForIt: String,
    @SerializedName("Rating")
    val rating: Int,
    @SerializedName("RatingName")
    val ratingName: String
)