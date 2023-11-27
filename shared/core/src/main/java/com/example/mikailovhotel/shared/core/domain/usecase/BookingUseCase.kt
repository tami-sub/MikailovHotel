package com.example.mikailovhotel.shared.core.domain.usecase

import com.example.mikailovhotel.shared.core.domain.entity.Booking
import com.example.mikailovhotel.shared.core.domain.repository.HotelRepository
import javax.inject.Inject

class BookingUseCase @Inject constructor(private val repository: HotelRepository) {
    suspend operator fun invoke(): Result<List<Booking>> {
        return repository.getBookingInfo()
    }
}