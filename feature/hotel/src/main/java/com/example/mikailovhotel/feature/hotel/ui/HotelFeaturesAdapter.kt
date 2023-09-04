package com.example.mikailovhotel.feature.hotel.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mikailovhotel.feature.hotel.databinding.ItemHotelFeaturesBinding

class HotelFeaturesAdapter() : RecyclerView.Adapter<HotelFeaturesAdapter.HotelFeatureViewHolder>() {

    var storageList: List<String> = emptyList()
        set(value) {
            val diffResult = DiffUtil.calculateDiff(HotelFeatureDiffCallback(field, value))
            field = value
            diffResult.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelFeatureViewHolder {
        return HotelFeatureViewHolder(
            ItemHotelFeaturesBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: HotelFeatureViewHolder, position: Int) {
        val itemHotelFeature = storageList[position]
        holder.bind(itemHotelFeature)
    }

    override fun getItemCount(): Int = storageList.size


    inner class HotelFeatureViewHolder(private val binding: ItemHotelFeaturesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(hotelFeature: String) = with(binding) {
            nestedHorizontalHotelFeature.text = hotelFeature
        }
    }

    inner class HotelFeatureDiffCallback(
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