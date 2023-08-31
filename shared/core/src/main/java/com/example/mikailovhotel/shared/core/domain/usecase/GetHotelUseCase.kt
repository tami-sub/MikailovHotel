package com.example.mikailovhotel.shared.core.domain.usecase

import com.example.mikailovhotel.shared.core.domain.entity.Hotel
import com.example.mikailovhotel.shared.core.domain.repository.HotelRepository
import javax.inject.Inject

class GetHotelUseCase @Inject constructor(private val repository: HotelRepository) {
    suspend operator fun invoke(): Result<Hotel> {
        return repository.getHotel()
    }
}