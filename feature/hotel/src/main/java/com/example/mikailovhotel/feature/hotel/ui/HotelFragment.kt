package com.example.mikailovhotel.feature.hotel.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.mikailovhotel.feature.hotel.R
import com.example.mikailovhotel.feature.hotel.databinding.FragmentHotelBinding
import com.example.mikailovhotel.feature.hotel.presentation.HotelState
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
        viewModel.state.observe(viewLifecycleOwner) {
            when (it) {
                is HotelState.Loading -> {}
                is HotelState.Success -> {
                    binding.imageSlider.setImageList(it.imageList, ScaleTypes.FIT)
                    showRecyclerView(it.hotel.aboutTheHotel.peculiarities)
                }
                is HotelState.Error -> {}
                is HotelState.Clear -> {}
            }
        }
    }

    override fun injectDependencies() {
        AndroidSupportInjection.inject(this)
    }

    private fun showRecyclerView(data: List<String>) {
        binding.recyclerViewHotel.apply {
            val applicationAdapter = HotelFeaturesAdapter()
            applicationAdapter.storageList = data
            adapter = applicationAdapter
            this.layoutManager =
                StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)
        }
    }

}