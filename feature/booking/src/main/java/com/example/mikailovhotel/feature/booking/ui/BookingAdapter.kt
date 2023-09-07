package com.example.mikailovhotel.feature.booking.ui

import android.view.View
import com.example.mikailovhotel.feature.booking.R
import com.example.mikailovhotel.feature.booking.databinding.ItemAddTouristBinding
import com.example.mikailovhotel.feature.booking.databinding.ItemBookingDataBinding
import com.example.mikailovhotel.feature.booking.databinding.ItemBuyButtonBinding
import com.example.mikailovhotel.feature.booking.databinding.ItemCustomerInfoBinding
import com.example.mikailovhotel.feature.booking.databinding.ItemHotelInfoBinding
import com.example.mikailovhotel.feature.booking.databinding.ItemPriceInfoBinding
import com.example.mikailovhotel.feature.booking.databinding.ItemTouristInfoBinding
import com.example.mikailovhotel.feature.booking.domain.AddTouristItem
import com.example.mikailovhotel.feature.booking.domain.BookingDataItem
import com.example.mikailovhotel.feature.booking.domain.BuyButtonItem
import com.example.mikailovhotel.feature.booking.domain.CustomerInfoItem
import com.example.mikailovhotel.feature.booking.domain.HotelInfoItem
import com.example.mikailovhotel.feature.booking.domain.ListItem
import com.example.mikailovhotel.feature.booking.domain.PriceInfoItem
import com.example.mikailovhotel.feature.booking.domain.TouristInfoItem
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

class BookingAdapter(private val navigate: () -> Unit) : ListDelegationAdapter<List<ListItem>>() {

    private var itemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        itemClickListener = listener
    }

    init {
        delegatesManager
            .addDelegate(hotelInfoDelegate())
            .addDelegate(bookingDataDelegate())
            .addDelegate(customerInfoDelegate())
            .addDelegate(touristInfoDelegate())
            .addDelegate(addTouristDelegate())
            .addDelegate(priceInfoDelegate())
            .addDelegate(buyButtonDelegate())
    }

    private fun hotelInfoDelegate() =
        adapterDelegateViewBinding<HotelInfoItem, ListItem, ItemHotelInfoBinding>(
            { inflater, container -> ItemHotelInfoBinding.inflate(inflater, container, false) }
        ) {
            bind {
                with(binding) {
                    goldenScore.text = item.score
                    name.text = item.name
                    address.text = item.address
                }
            }
        }

    private fun bookingDataDelegate() =
        adapterDelegateViewBinding<BookingDataItem, ListItem, ItemBookingDataBinding>(
            { inflater, container -> ItemBookingDataBinding.inflate(inflater, container, false) }
        ) {
            bind {
                with(binding) {
                    departureFrom.text = item.departure_from
                    county.text = item.county
                    date.text = item.date
                    duration.text = item.duration
                    hotel.text = item.hotel
                    room.text = item.room
                    meal.text = item.meal
                }
            }
        }

    private fun customerInfoDelegate() =
        adapterDelegateViewBinding<CustomerInfoItem, ListItem, ItemCustomerInfoBinding>(
            { inflater, container -> ItemCustomerInfoBinding.inflate(inflater, container, false) }
        ) {}

    private fun touristInfoDelegate() =
        adapterDelegateViewBinding<TouristInfoItem, ListItem, ItemTouristInfoBinding>(
            { inflater, container -> ItemTouristInfoBinding.inflate(inflater, container, false) }
        ) {
            bind {
                with(binding) {
                    tourist.text = item.serialNumber
                    expandArrow.setOnClickListener {
                        contentExpandable.visibility =
                            if (contentExpandable.visibility == View.GONE) {
                                expandArrow.setImageDrawable(getDrawable(R.drawable.arrow_opened))
                                View.VISIBLE
                            } else {
                                expandArrow.setImageDrawable(getDrawable(R.drawable.arrow_closed))
                                View.GONE
                            }
                        notifyDataSetChanged()
                    }
                }
            }
        }

    private fun addTouristDelegate() =
        adapterDelegateViewBinding<AddTouristItem, ListItem, ItemAddTouristBinding>(
            { inflater, container -> ItemAddTouristBinding.inflate(inflater, container, false) }
        ) {
            bind {
                binding.addTouristButton.setOnClickListener {
                    itemClickListener?.onItemClick(layoutPosition)
                }
            }
        }

    private fun priceInfoDelegate() =
        adapterDelegateViewBinding<PriceInfoItem, ListItem, ItemPriceInfoBinding>(
            { inflater, container -> ItemPriceInfoBinding.inflate(inflater, container, false) }) {
            bind {
                with(binding) {
                    tour.text = item.tour
                    fuel.text = item.fuel
                    service.text = item.fuel
                    finalPrice.text = item.price
                }
            }
        }


    private fun buyButtonDelegate() =
        adapterDelegateViewBinding<BuyButtonItem, ListItem, ItemBuyButtonBinding>(
            { inflater, container -> ItemBuyButtonBinding.inflate(inflater, container, false) }
        ) {
            bind {
                binding.buyButton.text = item.price
                binding.buyButton.setOnClickListener {
                    navigate()
                }
            }
        }
}