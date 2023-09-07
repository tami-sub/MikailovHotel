package com.example.mikailovhotel.di

import com.example.mikailovhotel.feature.booking.ui.BookingFragment
import com.example.mikailovhotel.feature.hotel.ui.HotelFragment
import com.example.mikailovhotel.feature.paid.ui.PaidFragment
import com.example.mikailovhotel.feature.room.ui.RoomsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {
    @ContributesAndroidInjector
    fun bindHotelFragment(): HotelFragment

    @ContributesAndroidInjector
    fun bindRoomsFragment(): RoomsFragment

    @ContributesAndroidInjector
    fun bindBookingFragment(): BookingFragment

    @ContributesAndroidInjector
    fun bindPaidFragment(): PaidFragment
}