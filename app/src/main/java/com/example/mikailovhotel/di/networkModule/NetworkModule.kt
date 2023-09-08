package com.example.mikailovhotel.di.networkModule

import android.app.Application
import com.example.mikailovhotel.BuildConfig
import com.example.mikailovhotel.shared.core.data.remote.RemoteApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule() {

    @Provides


    fun getRemoteApi(app: Application): RemoteApi = Retrofit.Builder().baseUrl(BuildConfig.BASE_URL)
        .addCallAdapterFactory(ResultCallAdapterFactory(app.applicationContext))
        .addConverterFactory(GsonConverterFactory.create()).build()
        .create(RemoteApi::class.java)
}