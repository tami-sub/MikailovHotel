package com.example.mikailovhotel.shared.core.domain.usecase

import com.example.mikailovhotel.shared.core.domain.entity.RoomList
import com.example.mikailovhotel.shared.core.domain.repository.HotelRepository
import javax.inject.Inject

class RoomsListUseCase @Inject constructor(private val repository: HotelRepository) {
    suspend operator fun invoke(): Result<RoomList> {
        return repository.getRoomList()
    }
}