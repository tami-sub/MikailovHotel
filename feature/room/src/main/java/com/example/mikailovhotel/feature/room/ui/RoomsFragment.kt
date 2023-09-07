package com.example.mikailovhotel.feature.room.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.mikailovhotel.component.navigation.navigate
import com.example.mikailovhotel.component.navigation.navigationData
import com.example.mikailovhotel.feature.room.R
import com.example.mikailovhotel.feature.room.databinding.FragmentRoomsBinding
import com.example.mikailovhotel.feature.room.presentation.RoomsState
import com.example.mikailovhotel.feature.room.presentation.RoomsViewModel
import com.example.mikailovhotel.shared.core.domain.entity.RoomList
import com.example.mikailovhotel.shared.core.presentation.ViewModelFactory
import com.example.mikailovhotel.shared.core.ui.BaseFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class RoomsFragment : BaseFragment<FragmentRoomsBinding>(FragmentRoomsBinding::inflate) {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var viewModel: RoomsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory)[RoomsViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setAppBarTitle(
            navigationData.toString()
        )
        viewModel.state.observe(viewLifecycleOwner) {
            renderState(it)
        }

        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.getRoomsList()
            binding.swipeRefreshLayout.isRefreshing = false
        }
    }

    private fun renderState(state: RoomsState) = with(binding) {
        when (state) {
            is RoomsState.Loading -> {
                showProgressBar()
                contentRooms.visibility = View.GONE
                dismissErrorSnackBar()
            }

            is RoomsState.Success -> {
                hideProgressBar()
                contentRooms.visibility = View.VISIBLE
                showRecyclerView(state.roomsList)
            }

            is RoomsState.Error -> {
                hideProgressBar()
                state.exception.message?.let {
                    this@RoomsFragment.showErrorSnackbar(it) {
                        viewModel.getRoomsList()
                    }
                }
            }

            is RoomsState.Clear -> {}
        }
    }

    override fun injectDependencies() {
        AndroidSupportInjection.inject(this)
    }

    private fun showRecyclerView(data: RoomList) {
        binding.recyclerViewRooms.apply {
            val applicationAdapter = RoomsAdapter { navigate(R.id.action_roomsFragment_to_bookingFragment) }
            applicationAdapter.storageList = data
            adapter = applicationAdapter
        }
    }

}