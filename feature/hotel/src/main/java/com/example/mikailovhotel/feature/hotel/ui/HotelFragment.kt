package com.example.mikailovhotel.feature.hotel.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.example.mikailovhotel.feature.hotel.R
import com.example.mikailovhotel.feature.hotel.databinding.FragmentHotelBinding
import com.example.mikailovhotel.feature.hotel.presentation.HotelState
import com.example.mikailovhotel.feature.hotel.presentation.HotelViewModel
import com.example.mikailovhotel.shared.core.presentation.ViewModelFactory
import com.example.mikailovhotel.shared.core.ui.BaseFragment
import dagger.android.support.AndroidSupportInjection
import java.util.Locale
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
            renderState(it)
        }

        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.getHotelInfo()
            binding.swipeRefreshLayout.isRefreshing = false
        }
    }

    private fun renderState(state: HotelState) = with(binding) {
        when (state) {
            is HotelState.Loading -> {
                showProgressBar()
                content.visibility = View.GONE
                dismissErrorSnackBar()
            }

            is HotelState.Success -> {
                hideProgressBar()
                content.visibility = View.VISIBLE
                imageSlider.setImageList(state.imageList, ScaleTypes.FIT)
                showRecyclerView(state.hotel.aboutTheHotel.peculiarities)
                applyButton.isEnabled = true
                goldenScore.text = getString(
                    com.example.mikailovhotel.shared.core.R.string.golden_score,
                    state.hotel.rating,
                    state.hotel.ratingName
                )
                name.text = state.hotel.name
                address.text = state.hotel.address

                price.text = getString(
                    R.string.price_placeholder,
                    String.format(Locale.FRANCE, "%,d", state.hotel.minimalPrice)
                )
                description.text = state.hotel.aboutTheHotel.description

            }

            is HotelState.Error -> {
                hideProgressBar()
                state.exception.message?.let {
                    this@HotelFragment.showErrorSnackbar(it) {
                        viewModel.getHotelInfo()
                    }
                }
                applyButton.isEnabled = false
            }

            is HotelState.Clear -> {}
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