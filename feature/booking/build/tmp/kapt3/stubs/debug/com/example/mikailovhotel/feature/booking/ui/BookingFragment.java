package com.example.mikailovhotel.feature.booking.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/example/mikailovhotel/feature/booking/ui/BookingFragment;", "Lcom/example/mikailovhotel/shared/core/ui/BaseFragment;", "Lcom/example/mikailovhotel/feature/booking/databinding/FragmentBookingBinding;", "()V", "counter", "", "viewModel", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingViewModel;", "viewModelFactory", "Lcom/example/mikailovhotel/shared/core/presentation/ViewModelFactory;", "getViewModelFactory", "()Lcom/example/mikailovhotel/shared/core/presentation/ViewModelFactory;", "setViewModelFactory", "(Lcom/example/mikailovhotel/shared/core/presentation/ViewModelFactory;)V", "injectDependencies", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "renderState", "state", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingState;", "(Lcom/example/mikailovhotel/feature/booking/presentation/BookingState;)Lkotlin/Unit;", "showRecyclerView", "dataList", "", "Lcom/example/mikailovhotel/feature/booking/domain/ListItem;", "booking_debug"})
public final class BookingFragment extends com.example.mikailovhotel.shared.core.ui.BaseFragment<com.example.mikailovhotel.feature.booking.databinding.FragmentBookingBinding> {
    @javax.inject.Inject
    public com.example.mikailovhotel.shared.core.presentation.ViewModelFactory viewModelFactory;
    private com.example.mikailovhotel.feature.booking.presentation.BookingViewModel viewModel;
    private int counter = 0;
    
    public BookingFragment() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mikailovhotel.shared.core.presentation.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.shared.core.presentation.ViewModelFactory p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlin.Unit renderState(com.example.mikailovhotel.feature.booking.presentation.BookingState state) {
        return null;
    }
    
    @java.lang.Override
    protected void injectDependencies() {
    }
    
    private final void showRecyclerView(java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem> dataList) {
    }
}