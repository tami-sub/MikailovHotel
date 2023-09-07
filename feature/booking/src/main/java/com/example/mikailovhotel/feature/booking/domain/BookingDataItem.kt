package com.example.mikailovhotel.feature.booking.domain

data class BookingDataItem(
    val departure_from: String,
    val county: String,
    val date: String,
    val duration: String,
    val hotel: String,
    val room: String,
    val meal: String
): ListItem
