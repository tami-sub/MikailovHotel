package com.example.mikailovhotel.feature.booking.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/mikailovhotel/feature/booking/presentation/BookingState;", "", "Error", "Loading", "Success", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingState$Error;", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingState$Loading;", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingState$Success;", "booking_debug"})
public abstract interface BookingState {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/mikailovhotel/feature/booking/presentation/BookingState$Loading;", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingState;", "()V", "booking_debug"})
    public static final class Loading implements com.example.mikailovhotel.feature.booking.presentation.BookingState {
        @org.jetbrains.annotations.NotNull
        public static final com.example.mikailovhotel.feature.booking.presentation.BookingState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/mikailovhotel/feature/booking/presentation/BookingState$Success;", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingState;", "bookingInfo", "", "Lcom/example/mikailovhotel/feature/booking/domain/ListItem;", "(Ljava/util/List;)V", "getBookingInfo", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "booking_debug"})
    public static final class Success implements com.example.mikailovhotel.feature.booking.presentation.BookingState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem> bookingInfo = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.mikailovhotel.feature.booking.presentation.BookingState.Success copy(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem> bookingInfo) {
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
        java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem> bookingInfo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.mikailovhotel.feature.booking.domain.ListItem> getBookingInfo() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/mikailovhotel/feature/booking/presentation/BookingState$Error;", "Lcom/example/mikailovhotel/feature/booking/presentation/BookingState;", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "booking_debug"})
    public static final class Error implements com.example.mikailovhotel.feature.booking.presentation.BookingState {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Throwable exception = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.mikailovhotel.feature.booking.presentation.BookingState.Error copy(@org.jetbrains.annotations.NotNull
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
}