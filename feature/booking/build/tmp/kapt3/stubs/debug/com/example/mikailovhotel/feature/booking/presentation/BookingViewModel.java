package com.example.mikailovhotel.feature.booking.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/mikailovhotel/feature/booking/presentation/BookingViewModel;", "Landroidx/lifecycle/ViewModel;", "bookingUseCase", "Lcom/example/mikailovhotel/shared/core/domain/usecase/BookingUseCase;", "application", "Landroid/app/Application;", "(Lcom/example/mikailovhotel/shared/core/domain/usecase/BookingUseCase;Landroid/app/Application;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingState;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "getBookingInfo", "", "handleError", "throwable", "", "booking_debug"})
public final class BookingViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mikailovhotel.shared.core.domain.usecase.BookingUseCase bookingUseCase = null;
    private final android.app.Application application = null;
    private final androidx.lifecycle.MutableLiveData<com.example.mikailovhotel.feature.booking.presentation.BookingState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.mikailovhotel.feature.booking.presentation.BookingState> state = null;
    private kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler;
    
    @javax.inject.Inject
    public BookingViewModel(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.shared.core.domain.usecase.BookingUseCase bookingUseCase, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.mikailovhotel.feature.booking.presentation.BookingState> getState() {
        return null;
    }
    
    public final void getBookingInfo() {
    }
    
    private final void handleError(java.lang.Throwable throwable) {
    }
}