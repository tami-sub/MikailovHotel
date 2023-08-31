package com.example.mikailovhotel.shared.core.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0007H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006,"}, d2 = {"Lcom/example/mikailovhotel/shared/core/domain/entity/Hotel;", "", "aboutTheHotel", "Lcom/example/mikailovhotel/shared/core/domain/entity/AboutTheHotel;", "address", "", "id", "", "imageUrls", "", "minimalPrice", "name", "priceForIt", "rating", "ratingName", "(Lcom/example/mikailovhotel/shared/core/domain/entity/AboutTheHotel;Ljava/lang/String;ILjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAboutTheHotel", "()Lcom/example/mikailovhotel/shared/core/domain/entity/AboutTheHotel;", "getAddress", "()Ljava/lang/String;", "getId", "()I", "getImageUrls", "()Ljava/util/List;", "getMinimalPrice", "getName", "getPriceForIt", "getRating", "getRatingName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "core_debug"})
public final class Hotel {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "about_the_hotel")
    private final com.example.mikailovhotel.shared.core.domain.entity.AboutTheHotel aboutTheHotel = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "adress")
    private final java.lang.String address = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "@SerializedName(\"\")")
    private final java.util.List<java.lang.String> imageUrls = null;
    @com.google.gson.annotations.SerializedName(value = "minimal_price")
    private final int minimalPrice = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "price_for_it")
    private final java.lang.String priceForIt = null;
    private final int rating = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "rating_name")
    private final java.lang.String ratingName = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mikailovhotel.shared.core.domain.entity.Hotel copy(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.shared.core.domain.entity.AboutTheHotel aboutTheHotel, @org.jetbrains.annotations.NotNull
    java.lang.String address, int id, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> imageUrls, int minimalPrice, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String priceForIt, int rating, @org.jetbrains.annotations.NotNull
    java.lang.String ratingName) {
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
    
    public Hotel(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.shared.core.domain.entity.AboutTheHotel aboutTheHotel, @org.jetbrains.annotations.NotNull
    java.lang.String address, int id, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> imageUrls, int minimalPrice, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String priceForIt, int rating, @org.jetbrains.annotations.NotNull
    java.lang.String ratingName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mikailovhotel.shared.core.domain.entity.AboutTheHotel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mikailovhotel.shared.core.domain.entity.AboutTheHotel getAboutTheHotel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getImageUrls() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getMinimalPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPriceForIt() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getRating() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRatingName() {
        return null;
    }
}