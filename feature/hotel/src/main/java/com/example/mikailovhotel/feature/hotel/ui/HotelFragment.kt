package com.example.mikailovhotel.feature.hotel.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.example.mikailovhotel.component.navigation.navigate
import com.example.mikailovhotel.feature.hotel.R
import com.example.mikailovhotel.feature.hotel.databinding.FragmentHotelBinding
import com.example.mikailovhotel.feature.hotel.presentation.HotelState
import com.example.mikailovhotel.feature.hotel.presentation.HotelViewModel
import com.example.mikailovhotel.shared.core.presentation.ViewModelFactory
import com.example.mikailovhotel.shared.core.ui.BaseFragment
import dagger.android.support.AndroidSupportInjection
import java.util.Locale
import javax.inject.Inject
import kotlin.math.max

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
        setAppBarTitle(getString(R.string.hotel))
        viewModel.state.observe(viewLifecycleOwner) {
            renderState(it)
        }

        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.getHotelInfo()
            binding.swipeRefreshLayout.isRefreshing = false
        }

        binding.applyButton.setOnClickListener() {
            navigate(
                R.id.action_hotelFragment_to_roomsFragment, null,
                binding.name.text.toString()
            )
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
                showRecyclerView(state.hotel.aboutTheHotel.peculiarities.map { it.description })
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
                priceForIt.text = state.hotel.priceForIt
                description.text = state.hotel.aboutTheHotel.description
            }

            is HotelState.Error -> {
                hideProgressBar()
                state.exception.message?.let {
                    this@HotelFragment.showErrorSnackbar(it) {
                        viewModel.getHotelInfo()
                    }
                }
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
                StaggeredGridLayoutManager(
                    max(1, data.size - 1),
                    StaggeredGridLayoutManager.HORIZONTAL
                )
        }
    }
}