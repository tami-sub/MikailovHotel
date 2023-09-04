package com.example.mikailovhotel.feature.room.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/example/mikailovhotel/feature/room/presentation/RoomsState;", "", "Clear", "Error", "Loading", "Success", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState$Clear;", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState$Error;", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState$Loading;", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState$Success;", "room_debug"})
public abstract interface RoomsState {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/mikailovhotel/feature/room/presentation/RoomsState$Loading;", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState;", "()V", "room_debug"})
    public static final class Loading implements com.example.mikailovhotel.feature.room.presentation.RoomsState {
        @org.jetbrains.annotations.NotNull
        public static final com.example.mikailovhotel.feature.room.presentation.RoomsState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/mikailovhotel/feature/room/presentation/RoomsState$Success;", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState;", "roomsList", "Lcom/example/mikailovhotel/shared/core/domain/entity/RoomList;", "(Lcom/example/mikailovhotel/shared/core/domain/entity/RoomList;)V", "getRoomsList", "()Lcom/example/mikailovhotel/shared/core/domain/entity/RoomList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "room_debug"})
    public static final class Success implements com.example.mikailovhotel.feature.room.presentation.RoomsState {
        @org.jetbrains.annotations.NotNull
        private final com.example.mikailovhotel.shared.core.domain.entity.RoomList roomsList = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.mikailovhotel.feature.room.presentation.RoomsState.Success copy(@org.jetbrains.annotations.NotNull
        com.example.mikailovhotel.shared.core.domain.entity.RoomList roomsList) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull
        com.example.mikailovhotel.shared.core.domain.entity.RoomList roomsList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.mikailovhotel.shared.core.domain.entity.RoomList component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.mikailovhotel.shared.core.domain.entity.RoomList getRoomsList() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/mikailovhotel/feature/room/presentation/RoomsState$Error;", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState;", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "room_debug"})
    public static final class Error implements com.example.mikailovhotel.feature.room.presentation.RoomsState {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Throwable exception = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.mikailovhotel.feature.room.presentation.RoomsState.Error copy(@org.jetbrains.annotations.NotNull
        java.lang.Throwable exception) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.Throwable exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable getException() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/mikailovhotel/feature/room/presentation/RoomsState$Clear;", "Lcom/example/mikailovhotel/feature/room/presentation/RoomsState;", "()V", "room_debug"})
    public static final class Clear implements com.example.mikailovhotel.feature.room.presentation.RoomsState {
        @org.jetbrains.annotations.NotNull
        public static final com.example.mikailovhotel.feature.room.presentation.RoomsState.Clear INSTANCE = null;
        
        private Clear() {
            super();
        }
    }
}