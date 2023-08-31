package com.example.mikailovhotel.feature.hotel.presentation

import androidx.lifecycle.ViewModel
import com.example.mikailovhotel.shared.core.domain.usecase.GetHotelUseCase
import javax.inject.Inject

class HotelViewModel @Inject constructor(private val hotelUseCase: GetHotelUseCase) : ViewModel() {

}