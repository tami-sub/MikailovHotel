package com.example.mikailovhotel.di

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class HotelApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var injector: DispatchingAndroidInjector<Any>

    val appComponent =  DaggerApplicationComponent.factory().create(createAppModule()).inject(this)

    override fun androidInjector(): AndroidInjector<Any> = injector

    private fun createAppModule(): AppModule {
        return AppModule(this)
    }
}