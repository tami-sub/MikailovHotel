package com.example.mikailovhotel.feature.booking.ui

import android.view.View
import androidx.core.widget.doAfterTextChanged
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


    private lateinit var customerFieldBinding: ItemCustomerInfoBinding
    private var touristFieldBindings = mutableListOf<ItemTouristInfoBinding>()

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        itemClickListener = listener
    }

    init {
        delegatesManager.addDelegate(hotelInfoDelegate()).addDelegate(bookingDataDelegate())
            .addDelegate(customerInfoDelegate()).addDelegate(touristInfoDelegate())
            .addDelegate(addTouristDelegate()).addDelegate(priceInfoDelegate())
            .addDelegate(buyButtonDelegate())
    }

    private fun hotelInfoDelegate() =
        adapterDelegateViewBinding<HotelInfoItem, ListItem, ItemHotelInfoBinding>({ inflater, container ->
            ItemHotelInfoBinding.inflate(
                inflater, container, false
            )
        }) {
            bind {
                with(binding) {
                    goldenScore.text = item.score
                    name.text = item.name
                    address.text = item.address
                }
            }
        }

    private fun bookingDataDelegate() =
        adapterDelegateViewBinding<BookingDataItem, ListItem, ItemBookingDataBinding>({ inflater, container ->
            ItemBookingDataBinding.inflate(
                inflater, container, false
            )
        }) {
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
        adapterDelegateViewBinding<CustomerInfoItem, ListItem, ItemCustomerInfoBinding>({ inflater, container ->
            ItemCustomerInfoBinding.inflate(
                inflater, container, false
            )
        }) {
            with(binding) {
                customerFieldBinding = binding
                phoneInput.doAfterTextChanged {
                    phoneInput.backgroundTintList = null
                }
                email.doAfterTextChanged {
                    if (!isValidEmail(it.toString())) {
                        emailBox.error
                        emailBox.error = itemView.resources.getString(R.string.incorrect_format)
                        email.backgroundTintList =
                            getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                    } else {
                        emailBox.error = null
                        email.backgroundTintList = null
                    }
                }
            }
        }

    private fun touristInfoDelegate() =
        adapterDelegateViewBinding<TouristInfoItem, ListItem, ItemTouristInfoBinding>({ inflater, container ->
            ItemTouristInfoBinding.inflate(
                inflater, container, false
            )
        }) {
            bind {
                touristFieldBindings.add(binding)
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

                    name.doAfterTextChanged {
                        if (it.toString().isEmpty()) {
                            nameBox.error = itemView.resources.getString(R.string.incorrect_format)
                            name.backgroundTintList =
                                getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                        } else {
                            nameBox.error = null
                            name.backgroundTintList = null
                        }
                    }

                    surname.doAfterTextChanged {
                        if (it.toString().isEmpty()) {
                            surnameBox.error =
                                itemView.resources.getString(R.string.incorrect_format)
                            surname.backgroundTintList =
                                getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                        } else {
                            surnameBox.error = null
                            surname.backgroundTintList = null
                        }
                    }

                    birthDay.doAfterTextChanged {
                        if (it.toString().isEmpty()) {
                            birthDayBox.error =
                                itemView.resources.getString(R.string.incorrect_format)
                            birthDay.backgroundTintList =
                                getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                        } else {
                            birthDayBox.error = null
                            birthDay.backgroundTintList = null
                        }
                    }

                    citizenship.doAfterTextChanged {
                        if (it.toString().isEmpty()) {
                            citizenshipBox.error =
                                itemView.resources.getString(R.string.incorrect_format)
                            citizenship.backgroundTintList =
                                getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                        } else {
                            citizenshipBox.error = null
                            citizenship.backgroundTintList = null
                        }
                    }

                    passportNumber.doAfterTextChanged {
                        if (it.toString().isEmpty()) {
                            passportNumberBox.error =
                                itemView.resources.getString(R.string.incorrect_format)
                            passportNumber.backgroundTintList =
                                getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                        } else {
                            passportNumberBox.error = null
                            passportNumber.backgroundTintList = null
                        }
                    }

                    passportExpirationDate.doAfterTextChanged {
                        if (it.toString().isEmpty()) {
                            passportExpirationDateBox.error =
                                itemView.resources.getString(R.string.incorrect_format)
                            passportExpirationDate.backgroundTintList =
                                getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                        } else {
                            passportExpirationDateBox.error = null
                            passportExpirationDate.backgroundTintList = null
                        }
                    }
                }
            }
        }

    private fun addTouristDelegate() =
        adapterDelegateViewBinding<AddTouristItem, ListItem, ItemAddTouristBinding>({ inflater, container ->
            ItemAddTouristBinding.inflate(
                inflater, container, false
            )
        }) {
            binding.addTouristButton.setOnClickListener {
                itemClickListener?.onItemClick(layoutPosition)
            }
        }

    private fun priceInfoDelegate() =
        adapterDelegateViewBinding<PriceInfoItem, ListItem, ItemPriceInfoBinding>({ inflater, container ->
            ItemPriceInfoBinding.inflate(
                inflater, container, false
            )
        }) {
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
        adapterDelegateViewBinding<BuyButtonItem, ListItem, ItemBuyButtonBinding>({ inflater, container ->
            ItemBuyButtonBinding.inflate(
                inflater, container, false
            )
        }) {
            bind {
                binding.buyButton.text = item.price
                binding.buyButton.setOnClickListener {

                    customerFieldBinding.apply {
                        if (!isValidEmail(this.email.text.toString())) {
                            this.email.backgroundTintList =
                                getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                        }

                        if (!isValidPhone(this.phoneInput.text.toString())) {
                            this.phoneInput.backgroundTintList =
                                getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                        }
                    }

                    touristFieldBindings.forEach { view ->
                        view.name.apply {
                            if (this.text.toString().isEmpty()) {
                                this.backgroundTintList =
                                    getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                            }
                        }
                        view.surname.apply {
                            if (this.text.toString().isEmpty()) {
                                this.backgroundTintList =
                                    getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                            }
                        }
                        view.birthDay.apply {
                            if (this.text.toString().isEmpty()) {
                                this.backgroundTintList =
                                    getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                            }
                        }
                        view.citizenship.apply {
                            if (this.text.toString().isEmpty()) {
                                this.backgroundTintList =
                                    getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                            }
                        }
                        view.passportNumber.apply {
                            if (this.text.toString().isEmpty()) {
                                this.backgroundTintList =
                                    getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                            }
                        }
                        view.passportExpirationDate.apply {
                            if (this.text.toString().isEmpty()) {
                                this.backgroundTintList =
                                    getColorStateList(com.example.mikailovhotel.shared.core.R.color.error_background)
                            }
                        }
                    }


                    val hasError = touristFieldBindings.map {
                        it.name.text.toString().isNotEmpty() && it.surname.text.toString()
                            .isNotEmpty() && it.birthDay.text.toString()
                            .isNotEmpty() && it.citizenship.text.toString()
                            .isNotEmpty() && it.passportNumber.text.toString()
                            .isNotEmpty() && it.passportExpirationDate.text.toString().isNotEmpty()
                    }.contains(false)

                    if (isValidEmail(customerFieldBinding.email.text.toString()) &&
                        isValidPhone(customerFieldBinding.phoneInput.text.toString()) &&
                        !hasError
                    ) {
                        navigate()
                    }
                }
            }
        }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isValidPhone(phone: String): Boolean {
        return !phone.contains("*")
    }
}