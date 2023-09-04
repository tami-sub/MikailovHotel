package com.example.mikailovhotel.di

import com.example.mikailovhotel.feature.hotel.ui.HotelFragment
import com.example.mikailovhotel.feature.room.ui.RoomsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {
    @ContributesAndroidInjector
    fun bindHotelFragment(): HotelFragment

    @ContributesAndroidInjector
    fun bindRoomsFragment(): RoomsFragment
}