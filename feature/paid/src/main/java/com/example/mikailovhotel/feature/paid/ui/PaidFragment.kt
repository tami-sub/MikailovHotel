package com.example.mikailovhotel.feature.paid.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mikailovhotel.feature.paid.R
import com.example.mikailovhotel.feature.paid.databinding.FragmentPaidBinding
import com.example.mikailovhotel.feature.paid.presentation.PaidViewModel
import com.example.mikailovhotel.shared.core.presentation.ViewModelFactory
import com.example.mikailovhotel.shared.core.ui.BaseFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class PaidFragment : BaseFragment<FragmentPaidBinding>(FragmentPaidBinding::inflate) {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private lateinit var viewModel: PaidViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory)[PaidViewModel::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.state.observe(viewLifecycleOwner) {
            binding.confirmationText.text = it
        }
        binding.superButton.setOnClickListener {
            findNavController().popBackStack(R.id.hotelFragment, false)
        }
    }

    override fun injectDependencies() {
        AndroidSupportInjection.inject(this)
    }

}