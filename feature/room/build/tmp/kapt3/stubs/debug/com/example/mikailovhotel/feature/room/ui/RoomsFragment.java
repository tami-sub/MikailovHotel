package com.example.mikailovhotel.feature.room.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/mikailovhotel/feature/room/ui/RoomsFragment;", "Lcom/example/mikailovhotel/shared/core/ui/BaseFragment;", "Lcom/example/mikailovhotel/feature/room/databinding/FragmentRoomsBinding;", "()V", "viewModel", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsViewModel;", "viewModelFactory", "Lcom/example/mikailovhotel/shared/core/presentation/ViewModelFactory;", "getViewModelFactory", "()Lcom/example/mikailovhotel/shared/core/presentation/ViewModelFactory;", "setViewModelFactory", "(Lcom/example/mikailovhotel/shared/core/presentation/ViewModelFactory;)V", "injectDependencies", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "renderState", "state", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState;", "(Lcom/example/mikailovhotel/feature/room/presentation/RoomsState;)Lkotlin/Unit;", "showRecyclerView", "data", "Lcom/example/mikailovhotel/shared/core/domain/entity/RoomList;", "room_debug"})
public final class RoomsFragment extends com.example.mikailovhotel.shared.core.ui.BaseFragment<com.example.mikailovhotel.feature.room.databinding.FragmentRoomsBinding> {
    @javax.inject.Inject
    public com.example.mikailovhotel.shared.core.presentation.ViewModelFactory viewModelFactory;
    private com.example.mikailovhotel.feature.room.presentation.RoomsViewModel viewModel;
    
    public RoomsFragment() {
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
    
    private final kotlin.Unit renderState(com.example.mikailovhotel.feature.room.presentation.RoomsState state) {
        return null;
    }
    
    @java.lang.Override
    protected void injectDependencies() {
    }
    
    private final void showRecyclerView(com.example.mikailovhotel.shared.core.domain.entity.RoomList data) {
    }
}