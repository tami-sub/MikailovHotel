package com.example.mikailovhotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import dagger.android.DaggerApplication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}