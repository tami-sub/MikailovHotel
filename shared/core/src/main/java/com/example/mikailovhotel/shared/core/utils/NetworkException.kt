package com.example.mikailovhotel.shared.core.utils

sealed class NetworkException(message: String) : RuntimeException(message) {
    class IOException(message: String) : NetworkException(message)
    class TimeoutException(message: String) : NetworkException(message)
}
