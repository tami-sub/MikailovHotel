package com.example.mikailovhotel.di.networkModule

import android.app.Application
import android.content.Context
import com.example.mikailovhotel.shared.core.data.remote.RemoteApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule() {

    @Provides
    fun getAuthApi(context: Context): RemoteApi = Retrofit.Builder().baseUrl(BASE_URL)
        .addCallAdapterFactory(ResultCallAdapterFactory(context))
        .addConverterFactory(GsonConverterFactory.create()).build()
        .create(RemoteApi::class.java)

    companion object{
        const val BASE_URL = "https://run.mocky.io/v3/"
    }
}