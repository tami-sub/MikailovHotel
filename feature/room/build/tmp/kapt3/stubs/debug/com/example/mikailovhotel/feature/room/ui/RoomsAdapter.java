package com.example.mikailovhotel.feature.room.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J&\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/example/mikailovhotel/feature/room/ui/RoomsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mikailovhotel/feature/room/ui/RoomsAdapter$RoomViewHolder;", "()V", "value", "Lcom/example/mikailovhotel/shared/core/domain/entity/RoomList;", "storageList", "getStorageList", "()Lcom/example/mikailovhotel/shared/core/domain/entity/RoomList;", "setStorageList", "(Lcom/example/mikailovhotel/shared/core/domain/entity/RoomList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showRecyclerView", "recyclerViewRoomFeatures", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "", "itemView", "Landroid/view/View;", "RoomDiffCallback", "RoomViewHolder", "room_debug"})
public final class RoomsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mikailovhotel.feature.room.ui.RoomsAdapter.RoomViewHolder> {
    @org.jetbrains.annotations.NotNull
    private com.example.mikailovhotel.shared.core.domain.entity.RoomList storageList;
    
    public RoomsAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mikailovhotel.shared.core.domain.entity.RoomList getStorageList() {
        return null;
    }
    
    public final void setStorageList(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.shared.core.domain.entity.RoomList value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.mikailovhotel.feature.room.ui.RoomsAdapter.RoomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.feature.room.ui.RoomsAdapter.RoomViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    private final void showRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerViewRoomFeatures, java.util.List<java.lang.String> data, android.view.View itemView) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/mikailovhotel/feature/room/ui/RoomsAdapter$RoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/mikailovhotel/feature/room/databinding/ItemRoomBinding;", "(Lcom/example/mikailovhotel/feature/room/ui/RoomsAdapter;Lcom/example/mikailovhotel/feature/room/databinding/ItemRoomBinding;)V", "bind", "", "hotelFeature", "Lcom/example/mikailovhotel/shared/core/domain/entity/Room;", "room_debug"})
    public final class RoomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.mikailovhotel.feature.room.databinding.ItemRoomBinding binding = null;
        
        public RoomViewHolder(@org.jetbrains.annotations.NotNull
        com.example.mikailovhotel.feature.room.databinding.ItemRoomBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.mikailovhotel.shared.core.domain.entity.Room hotelFeature) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/mikailovhotel/feature/room/ui/RoomsAdapter$RoomDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/example/mikailovhotel/shared/core/domain/entity/Room;", "newList", "(Lcom/example/mikailovhotel/feature/room/ui/RoomsAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldPosition", "", "newPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "room_debug"})
    public final class RoomDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.example.mikailovhotel.shared.core.domain.entity.Room> oldList = null;
        private final java.util.List<com.example.mikailovhotel.shared.core.domain.entity.Room> newList = null;
        
        public RoomDiffCallback(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.mikailovhotel.shared.core.domain.entity.Room> oldList, @org.jetbrains.annotations.NotNull
        java.util.List<com.example.mikailovhotel.shared.core.domain.entity.Room> newList) {
            super();
        }
        
        @java.lang.Override
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(int oldPosition, int newPosition) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(int oldPosition, int newPosition) {
            return false;
        }
    }
}