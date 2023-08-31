package com.example.mikailovhotel.di

import com.example.mikailovhotel.shared.core.data.repository.HotelRepositoryImpl
import com.example.mikailovhotel.shared.core.domain.repository.HotelRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    fun bindHotelRepository(impl: HotelRepositoryImpl): HotelRepository
}