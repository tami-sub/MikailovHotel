package com.example.mikailovhotel.feature.hotel.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mikailovhotel.feature.hotel.databinding.ItemHotelFeaturesBinding

class HotelFeaturesAdapter() : RecyclerView.Adapter<HotelFeaturesAdapter.LoanViewHolder>() {

    var storageList: List<String> = emptyList()
        set(value) {
            val diffResult = DiffUtil.calculateDiff(LoanDiffCallback(field, value))
            field = value
            diffResult.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoanViewHolder {
        return LoanViewHolder(
            ItemHotelFeaturesBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: LoanViewHolder, position: Int) {
        val itemLoan = storageList[position]
        holder.bind(itemLoan)
    }

    override fun getItemCount(): Int = storageList.size


    inner class LoanViewHolder(private val binding: ItemHotelFeaturesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(hotelFeature: String) = with(binding) {
            nestedHorizontalHotelFeature.text = hotelFeature
        }
    }

    inner class LoanDiffCallback(
        private val oldList: List<String>, private val newList: List<String>
    ) : DiffUtil.Callback() {
        override fun getOldListSize(): Int = oldList.size
        override fun getNewListSize(): Int = newList.size
        override fun areItemsTheSame(oldPosition: Int, newPosition: Int): Boolean {
            return oldList[oldPosition] == newList[newPosition]
        }

        override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
            return oldList[oldPosition] == newList[newPosition]
        }
    }
}