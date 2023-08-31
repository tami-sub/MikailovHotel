package com.example.mikailovhotel.di

import com.example.mikailovhotel.feature.hotel.ui.HotelFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {
    @ContributesAndroidInjector
    fun bindHotelFragment(): HotelFragment
}