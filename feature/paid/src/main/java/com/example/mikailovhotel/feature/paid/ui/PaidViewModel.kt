package com.example.mikailovhotel.feature.paid.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mikailovhotel.feature.paid.R
import javax.inject.Inject
import kotlin.random.Random

class PaidViewModel @Inject constructor(private val app: Application) : ViewModel() {
    private val _state: MutableLiveData<String> = MutableLiveData<String>()
    val state: LiveData<String> = _state
    private val getRandomNumber = lazy { Random.nextInt(100000, 200000) }

    init {
        getOrderNumber()
    }

    private fun getOrderNumber() {
        _state.value = app.resources.getString(R.string.confirmation, getRandomNumber.value)
    }

}