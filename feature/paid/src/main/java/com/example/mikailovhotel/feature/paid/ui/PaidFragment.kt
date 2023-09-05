package com.example.mikailovhotel.feature.paid.ui

import android.os.Bundle
import android.view.View
import com.example.mikailovhotel.feature.paid.databinding.FragmentPaidBinding
import com.example.mikailovhotel.shared.core.ui.BaseFragment
import dagger.android.support.AndroidSupportInjection

class PaidFragment : BaseFragment<FragmentPaidBinding>(FragmentPaidBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun injectDependencies() {
        AndroidSupportInjection.inject(this)
    }

}