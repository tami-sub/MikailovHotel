package com.example.mikailovhotel.shared.core.domain.entity

import com.google.gson.annotations.SerializedName

data class AboutTheHotel(
    @SerializedName("Description")
    val description: String,
    @SerializedName("Peculiarities")
    val peculiarities: List<Peculiarities>
)