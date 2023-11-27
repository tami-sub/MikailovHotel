package com.example.mikailovhotel.shared.core.domain.entity

import com.google.gson.annotations.SerializedName

data class Peculiarities(
    @SerializedName("Description")
    val description: String,
)