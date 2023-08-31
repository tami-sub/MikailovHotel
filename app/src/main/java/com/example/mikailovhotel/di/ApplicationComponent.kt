package com.example.mikailovhotel.di

import android.content.Context
import com.example.mikailovhotel.di.networkModule.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [ActivityModule::class, NetworkModule::class, RepositoryModule::class,
        FragmentModule::class, ViewModelModule::class,
        AndroidSupportInjectionModule::class]
)

interface ApplicationComponent : AndroidInjector<HotelApp> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}