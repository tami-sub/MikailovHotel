package com.example.mikailovhotel.di

import com.example.mikailovhotel.di.networkModule.NetworkModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [ActivityModule::class, NetworkModule::class, RepositoryModule::class,
        FragmentModule::class, ViewModelModule::class, AppModule::class,
        AndroidSupportInjectionModule::class]
)

interface ApplicationComponent : AndroidInjector<HotelApp> {
    @Component.Factory
    interface Factory {
        fun create(appModule: AppModule): ApplicationComponent
    }
}