package com.example.mikailovhotel.feature.hotel.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mikailovhotel.feature.hotel.R
import com.example.mikailovhotel.feature.hotel.databinding.FragmentHotelBinding
import com.example.mikailovhotel.feature.hotel.presentation.HotelViewModel
import com.example.mikailovhotel.shared.core.presentation.ViewModelFactory
import com.example.mikailovhotel.shared.core.ui.BaseFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class HotelFragment : BaseFragment<FragmentHotelBinding>(FragmentHotelBinding::inflate) {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var viewModel: HotelViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory)[HotelViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).supportActionBar?.title = getString(R.string.hotel)
    }

    override fun injectDependencies() {
        AndroidSupportInjection.inject(this)
    }

}