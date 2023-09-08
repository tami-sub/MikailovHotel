package com.example.mikailovhotel.feature.booking.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.children
import androidx.lifecycle.ViewModelProvider
import com.example.mikailovhotel.component.navigation.navigate
import com.example.mikailovhotel.feature.booking.R
import com.example.mikailovhotel.feature.booking.databinding.FragmentBookingBinding
import com.example.mikailovhotel.feature.booking.domain.BuyButtonItem
import com.example.mikailovhotel.feature.booking.domain.ListItem
import com.example.mikailovhotel.feature.booking.domain.TouristInfoItem
import com.example.mikailovhotel.feature.booking.presentation.BookingState
import com.example.mikailovhotel.feature.booking.presentation.BookingViewModel
import com.example.mikailovhotel.shared.core.presentation.ViewModelFactory
import com.example.mikailovhotel.shared.core.ui.BaseFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class BookingFragment : BaseFragment<FragmentBookingBinding>(FragmentBookingBinding::inflate) {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var viewModel: BookingViewModel
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory)[BookingViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.state.observe(viewLifecycleOwner) {
            renderState(it)
        }

        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.getBookingInfo()
            binding.swipeRefreshLayout.isRefreshing = false
        }
    }


    private fun renderState(state: BookingState) = with(binding) {
        when (state) {
            is BookingState.Loading -> {
                showProgressBar()
                contentBooking.visibility = View.GONE
                dismissErrorSnackBar()
            }

            is BookingState.Success -> {
                hideProgressBar()
                contentBooking.visibility = View.VISIBLE
                showRecyclerView(state.bookingInfo)
            }

            is BookingState.Error -> {
                hideProgressBar()
                state.exception.message?.let {
                    this@BookingFragment.showErrorSnackbar(it) {
                        viewModel.getBookingInfo()
                    }
                }
            }

            is BookingState.Clear -> {}
        }
    }

    override fun injectDependencies() {
        AndroidSupportInjection.inject(this)
    }

    private fun showRecyclerView(dataList: MutableList<ListItem>) {
        binding.recyclerViewBooking.apply {
            val applicationAdapter = BookingAdapter {
                navigate(R.id.action_bookingFragment_to_paidFragment)
            }
            applicationAdapter.items = dataList
            adapter = applicationAdapter
            (adapter as BookingAdapter).setOnItemClickListener(object :
                BookingAdapter.OnItemClickListener {
                override fun onItemClick(position: Int) {
                    counter++
                    if (counter < 5 && (position == dataList.size - 3)) {
                        dataList.add(
                            dataList.size - 3, TouristInfoItem(
                                resources.getStringArray(R.array.serial_tourist_number)[counter]
                            )
                        )
                        (adapter as BookingAdapter).notifyItemInserted(dataList.size - 4)
                    }
                }
            })
        }
    }
}