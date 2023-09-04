package com.example.mikailovhotel.feature.room.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.mikailovhotel.feature.room.R
import com.example.mikailovhotel.feature.room.databinding.ItemRoomBinding
import com.example.mikailovhotel.shared.core.domain.entity.Room
import com.example.mikailovhotel.shared.core.domain.entity.RoomList
import java.util.Locale
import kotlin.math.max

class RoomsAdapter() : RecyclerView.Adapter<RoomsAdapter.RoomViewHolder>() {

    var storageList: RoomList = RoomList(emptyList())
        set(value) {
            val diffResult = DiffUtil.calculateDiff(RoomDiffCallback(field.rooms, value.rooms))
            field = value
            diffResult.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        return RoomViewHolder(
            ItemRoomBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        val itemRoom = storageList.rooms[position]
        holder.bind(itemRoom)
    }

    override fun getItemCount(): Int = storageList.rooms.size


    inner class RoomViewHolder(private val binding: ItemRoomBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(hotelFeature: Room) = with(binding) {
            name.text = hotelFeature.name
            imageSlider.setImageList(
                hotelFeature.image_urls.map { SlideModel(it) }, ScaleTypes.FIT
            )
            showRecyclerView(
                recyclerViewRoomFeatures,
                hotelFeature.peculiarities,
                itemView
            )
            price.text = itemView.resources.getString(
                R.string.price_room_placeholder,
                String.format(Locale.FRANCE, "%,d", hotelFeature.price)
            )
            pricePer.text = hotelFeature.price_per
        }
    }

    inner class RoomDiffCallback(
        private val oldList: List<Room>, private val newList: List<Room>
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

    private fun showRecyclerView(
        recyclerViewRoomFeatures: RecyclerView,
        data: List<String>,
        itemView: View
    ) {
        recyclerViewRoomFeatures.apply {
            val applicationAdapter = RoomsFeaturesAdapter()
            applicationAdapter.storageList = data
            adapter = applicationAdapter
            val layoutManager =
                GridLayoutManager(itemView.context, max(1,data.size - 1))
            layoutManager.orientation = GridLayoutManager.HORIZONTAL
            this.layoutManager = layoutManager

        }
    }
}