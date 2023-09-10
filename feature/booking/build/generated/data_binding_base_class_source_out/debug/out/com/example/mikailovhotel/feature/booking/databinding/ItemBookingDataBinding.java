// Generated by view binder compiler. Do not edit!
package com.example.mikailovhotel.feature.booking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mikailovhotel.feature.booking.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBookingDataBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView county;

  @NonNull
  public final TextView countyHint;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView dateHint;

  @NonNull
  public final TextView departureFrom;

  @NonNull
  public final TextView departureFromHint;

  @NonNull
  public final TextView duration;

  @NonNull
  public final TextView durationHint;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final TextView hotel;

  @NonNull
  public final TextView hotelHint;

  @NonNull
  public final TextView meal;

  @NonNull
  public final TextView mealHint;

  @NonNull
  public final TextView room;

  @NonNull
  public final TextView roomHint;

  private ItemBookingDataBinding(@NonNull ConstraintLayout rootView, @NonNull TextView county,
      @NonNull TextView countyHint, @NonNull TextView date, @NonNull TextView dateHint,
      @NonNull TextView departureFrom, @NonNull TextView departureFromHint,
      @NonNull TextView duration, @NonNull TextView durationHint, @NonNull Guideline guideline,
      @NonNull TextView hotel, @NonNull TextView hotelHint, @NonNull TextView meal,
      @NonNull TextView mealHint, @NonNull TextView room, @NonNull TextView roomHint) {
    this.rootView = rootView;
    this.county = county;
    this.countyHint = countyHint;
    this.date = date;
    this.dateHint = dateHint;
    this.departureFrom = departureFrom;
    this.departureFromHint = departureFromHint;
    this.duration = duration;
    this.durationHint = durationHint;
    this.guideline = guideline;
    this.hotel = hotel;
    this.hotelHint = hotelHint;
    this.meal = meal;
    this.mealHint = mealHint;
    this.room = room;
    this.roomHint = roomHint;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBookingDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBookingDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_booking_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBookingDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.county;
      TextView county = ViewBindings.findChildViewById(rootView, id);
      if (county == null) {
        break missingId;
      }

      id = R.id.county_hint;
      TextView countyHint = ViewBindings.findChildViewById(rootView, id);
      if (countyHint == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.date_hint;
      TextView dateHint = ViewBindings.findChildViewById(rootView, id);
      if (dateHint == null) {
        break missingId;
      }

      id = R.id.departure_from;
      TextView departureFrom = ViewBindings.findChildViewById(rootView, id);
      if (departureFrom == null) {
        break missingId;
      }

      id = R.id.departure_from_hint;
      TextView departureFromHint = ViewBindings.findChildViewById(rootView, id);
      if (departureFromHint == null) {
        break missingId;
      }

      id = R.id.duration;
      TextView duration = ViewBindings.findChildViewById(rootView, id);
      if (duration == null) {
        break missingId;
      }

      id = R.id.duration_hint;
      TextView durationHint = ViewBindings.findChildViewById(rootView, id);
      if (durationHint == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.hotel;
      TextView hotel = ViewBindings.findChildViewById(rootView, id);
      if (hotel == null) {
        break missingId;
      }

      id = R.id.hotel_hint;
      TextView hotelHint = ViewBindings.findChildViewById(rootView, id);
      if (hotelHint == null) {
        break missingId;
      }

      id = R.id.meal;
      TextView meal = ViewBindings.findChildViewById(rootView, id);
      if (meal == null) {
        break missingId;
      }

      id = R.id.meal_hint;
      TextView mealHint = ViewBindings.findChildViewById(rootView, id);
      if (mealHint == null) {
        break missingId;
      }

      id = R.id.room;
      TextView room = ViewBindings.findChildViewById(rootView, id);
      if (room == null) {
        break missingId;
      }

      id = R.id.room_hint;
      TextView roomHint = ViewBindings.findChildViewById(rootView, id);
      if (roomHint == null) {
        break missingId;
      }

      return new ItemBookingDataBinding((ConstraintLayout) rootView, county, countyHint, date,
          dateHint, departureFrom, departureFromHint, duration, durationHint, guideline, hotel,
          hotelHint, meal, mealHint, room, roomHint);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}