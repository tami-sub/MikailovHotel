package com.example.mikailovhotel.feature.room.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/example/mikailovhotel/feature/room/presentation/RoomsViewModel;", "Landroidx/lifecycle/ViewModel;", "roomsListUseCase", "Lcom/example/mikailovhotel/shared/core/domain/usecase/RoomsListUseCase;", "(Lcom/example/mikailovhotel/shared/core/domain/usecase/RoomsListUseCase;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "getRoomsList", "", "handleError", "throwable", "", "room_debug"})
public final class RoomsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mikailovhotel.shared.core.domain.usecase.RoomsListUseCase roomsListUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.example.mikailovhotel.feature.room.presentation.RoomsState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.mikailovhotel.feature.room.presentation.RoomsState> state = null;
    private kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler;
    
    @javax.inject.Inject
    public RoomsViewModel(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.shared.core.domain.usecase.RoomsListUseCase roomsListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.mikailovhotel.feature.room.presentation.RoomsState> getState() {
        return null;
    }
    
    public final void getRoomsList() {
    }
    
    private final void handleError(java.lang.Throwable throwable) {
    }
}