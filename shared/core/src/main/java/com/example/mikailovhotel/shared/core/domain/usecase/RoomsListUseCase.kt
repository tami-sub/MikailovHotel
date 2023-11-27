package com.example.mikailovhotel.shared.core.domain.usecase

import com.example.mikailovhotel.shared.core.domain.entity.Room
import com.example.mikailovhotel.shared.core.domain.repository.HotelRepository
import javax.inject.Inject

class RoomsListUseCase @Inject constructor(private val repository: HotelRepository) {
    suspend operator fun invoke(): Result<List<Room>> {
        return repository.getRoomList()
    }
}