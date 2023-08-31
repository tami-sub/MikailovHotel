package com.example.mikailovhotel.di

import com.example.mikailovhotel.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {
    @ContributesAndroidInjector
    fun injectMainActivity(): MainActivity
}