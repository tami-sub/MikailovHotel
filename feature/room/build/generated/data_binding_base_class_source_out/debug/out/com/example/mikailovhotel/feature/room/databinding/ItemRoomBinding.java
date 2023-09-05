// Generated by view binder compiler. Do not edit!
package com.example.mikailovhotel.feature.room.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.denzcoskun.imageslider.ImageSlider;
import com.example.mikailovhotel.feature.room.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRoomBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton chooseRoom;

  @NonNull
  public final ImageSlider imageSlider;

  @NonNull
  public final MaterialButton moreInfoButton;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView pricePer;

  @NonNull
  public final RecyclerView recyclerViewRoomFeatures;

  private ItemRoomBinding(@NonNull ConstraintLayout rootView, @NonNull MaterialButton chooseRoom,
      @NonNull ImageSlider imageSlider, @NonNull MaterialButton moreInfoButton,
      @NonNull TextView name, @NonNull TextView price, @NonNull TextView pricePer,
      @NonNull RecyclerView recyclerViewRoomFeatures) {
    this.rootView = rootView;
    this.chooseRoom = chooseRoom;
    this.imageSlider = imageSlider;
    this.moreInfoButton = moreInfoButton;
    this.name = name;
    this.price = price;
    this.pricePer = pricePer;
    this.recyclerViewRoomFeatures = recyclerViewRoomFeatures;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_room, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRoomBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.choose_room;
      MaterialButton chooseRoom = ViewBindings.findChildViewById(rootView, id);
      if (chooseRoom == null) {
        break missingId;
      }

      id = R.id.image_slider;
      ImageSlider imageSlider = ViewBindings.findChildViewById(rootView, id);
      if (imageSlider == null) {
        break missingId;
      }

      id = R.id.more_info_button;
      MaterialButton moreInfoButton = ViewBindings.findChildViewById(rootView, id);
      if (moreInfoButton == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = ViewBindings.findChildViewById(rootView, id);
      if (price == null) {
        break missingId;
      }

      id = R.id.price_per;
      TextView pricePer = ViewBindings.findChildViewById(rootView, id);
      if (pricePer == null) {
        break missingId;
      }

      id = R.id.recycler_view_room_features;
      RecyclerView recyclerViewRoomFeatures = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewRoomFeatures == null) {
        break missingId;
      }

      return new ItemRoomBinding((ConstraintLayout) rootView, chooseRoom, imageSlider,
          moreInfoButton, name, price, pricePer, recyclerViewRoomFeatures);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
