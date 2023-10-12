package com.example.mikailovhotel.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mikailovhotel.feature.booking.presentation.BookingViewModel
import com.example.mikailovhotel.feature.hotel.presentation.HotelViewModel
import com.example.mikailovhotel.feature.paid.presentation.PaidViewModel
import com.example.mikailovhotel.feature.room.presentation.RoomsViewModel
import com.example.mikailovhotel.shared.core.presentation.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HotelViewModel::class)
    fun hotelViewModel(viewModel: HotelViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RoomsViewModel::class)
    fun roomsViewModel(viewModel: RoomsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BookingViewModel::class)
    fun bookingViewModel(viewModel: BookingViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PaidViewModel::class)
    fun paidViewModel(viewModel: PaidViewModel): ViewModel
}