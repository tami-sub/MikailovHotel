package com.example.mikailovhotel.feature.booking.domain

data class PriceInfoItem(
    val tour: String,
    val fuel: String,
    val service: String,
    val price: String
) : ListItem
