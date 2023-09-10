package com.example.mikailovhotel.feature.booking.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001fB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0002J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0002J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000bJ\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/mikailovhotel/feature/booking/ui/BookingAdapter;", "Lcom/hannesdorfmann/adapterdelegates4/ListDelegationAdapter;", "", "Lcom/example/mikailovhotel/feature/booking/domain/ListItem;", "navigate", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "customerFieldBinding", "Lcom/example/mikailovhotel/feature/booking/databinding/ItemCustomerInfoBinding;", "itemClickListener", "Lcom/example/mikailovhotel/feature/booking/ui/BookingAdapter$OnItemClickListener;", "touristFieldBindings", "", "Lcom/example/mikailovhotel/feature/booking/databinding/ItemTouristInfoBinding;", "addTouristDelegate", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "bookingDataDelegate", "buyButtonDelegate", "customerInfoDelegate", "hotelInfoDelegate", "isValidEmail", "", "email", "", "isValidPhone", "phone", "priceInfoDelegate", "setOnItemClickListener", "listener", "touristInfoDelegate", "OnItemClickListener", "booking_debug"})
public final class BookingAdapter extends com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter<java.util.List<? extends com.example.mikailovhotel.feature.booking.domain.ListItem>> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> navigate = null;
    private com.example.mikailovhotel.feature.booking.ui.BookingAdapter.OnItemClickListener itemClickListener;
    private com.example.mikailovhotel.feature.booking.databinding.ItemCustomerInfoBinding customerFieldBinding;
    private java.util.List<com.example.mikailovhotel.feature.booking.databinding.ItemTouristInfoBinding> touristFieldBindings;
    
    public BookingAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigate) {
        super();
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.feature.booking.ui.BookingAdapter.OnItemClickListener listener) {
    }
    
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem>> hotelInfoDelegate() {
        return null;
    }
    
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem>> bookingDataDelegate() {
        return null;
    }
    
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem>> customerInfoDelegate() {
        return null;
    }
    
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem>> touristInfoDelegate() {
        return null;
    }
    
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem>> addTouristDelegate() {
        return null;
    }
    
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem>> priceInfoDelegate() {
        return null;
    }
    
    private final com.hannesdorfmann.adapterdelegates4.AdapterDelegate<java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem>> buyButtonDelegate() {
        return null;
    }
    
    private final boolean isValidEmail(java.lang.String email) {
        return false;
    }
    
    private final boolean isValidPhone(java.lang.String phone) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mikailovhotel/feature/booking/ui/BookingAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "booking_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(int position);
    }
}