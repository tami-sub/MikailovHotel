// Generated by view binder compiler. Do not edit!
package com.example.mikailovhotel.feature.booking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mikailovhotel.feature.booking.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTouristInfoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputEditText birthDay;

  @NonNull
  public final TextInputLayout birthDayBox;

  @NonNull
  public final TextInputEditText citizenship;

  @NonNull
  public final TextInputLayout citizenshipBox;

  @NonNull
  public final LinearLayoutCompat contentExpandable;

  @NonNull
  public final ImageButton expandArrow;

  @NonNull
  public final TextInputEditText name;

  @NonNull
  public final TextInputLayout nameBox;

  @NonNull
  public final TextInputEditText passportExpirationDate;

  @NonNull
  public final TextInputLayout passportExpirationDateBox;

  @NonNull
  public final TextInputEditText passportNumber;

  @NonNull
  public final TextInputLayout passportNumberBox;

  @NonNull
  public final TextInputEditText surname;

  @NonNull
  public final TextInputLayout surnameBox;

  @NonNull
  public final TextView tourist;

  private ItemTouristInfoBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputEditText birthDay, @NonNull TextInputLayout birthDayBox,
      @NonNull TextInputEditText citizenship, @NonNull TextInputLayout citizenshipBox,
      @NonNull LinearLayoutCompat contentExpandable, @NonNull ImageButton expandArrow,
      @NonNull TextInputEditText name, @NonNull TextInputLayout nameBox,
      @NonNull TextInputEditText passportExpirationDate,
      @NonNull TextInputLayout passportExpirationDateBox, @NonNull TextInputEditText passportNumber,
      @NonNull TextInputLayout passportNumberBox, @NonNull TextInputEditText surname,
      @NonNull TextInputLayout surnameBox, @NonNull TextView tourist) {
    this.rootView = rootView;
    this.birthDay = birthDay;
    this.birthDayBox = birthDayBox;
    this.citizenship = citizenship;
    this.citizenshipBox = citizenshipBox;
    this.contentExpandable = contentExpandable;
    this.expandArrow = expandArrow;
    this.name = name;
    this.nameBox = nameBox;
    this.passportExpirationDate = passportExpirationDate;
    this.passportExpirationDateBox = passportExpirationDateBox;
    this.passportNumber = passportNumber;
    this.passportNumberBox = passportNumberBox;
    this.surname = surname;
    this.surnameBox = surnameBox;
    this.tourist = tourist;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTouristInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTouristInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_tourist_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTouristInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.birth_day;
      TextInputEditText birthDay = ViewBindings.findChildViewById(rootView, id);
      if (birthDay == null) {
        break missingId;
      }

      id = R.id.birth_day_box;
      TextInputLayout birthDayBox = ViewBindings.findChildViewById(rootView, id);
      if (birthDayBox == null) {
        break missingId;
      }

      id = R.id.citizenship;
      TextInputEditText citizenship = ViewBindings.findChildViewById(rootView, id);
      if (citizenship == null) {
        break missingId;
      }

      id = R.id.citizenship_box;
      TextInputLayout citizenshipBox = ViewBindings.findChildViewById(rootView, id);
      if (citizenshipBox == null) {
        break missingId;
      }

      id = R.id.content_expandable;
      LinearLayoutCompat contentExpandable = ViewBindings.findChildViewById(rootView, id);
      if (contentExpandable == null) {
        break missingId;
      }

      id = R.id.expand_arrow;
      ImageButton expandArrow = ViewBindings.findChildViewById(rootView, id);
      if (expandArrow == null) {
        break missingId;
      }

      id = R.id.name;
      TextInputEditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.name_box;
      TextInputLayout nameBox = ViewBindings.findChildViewById(rootView, id);
      if (nameBox == null) {
        break missingId;
      }

      id = R.id.passport_expiration_date;
      TextInputEditText passportExpirationDate = ViewBindings.findChildViewById(rootView, id);
      if (passportExpirationDate == null) {
        break missingId;
      }

      id = R.id.passport_expiration_date_box;
      TextInputLayout passportExpirationDateBox = ViewBindings.findChildViewById(rootView, id);
      if (passportExpirationDateBox == null) {
        break missingId;
      }

      id = R.id.passport_number;
      TextInputEditText passportNumber = ViewBindings.findChildViewById(rootView, id);
      if (passportNumber == null) {
        break missingId;
      }

      id = R.id.passport_number_box;
      TextInputLayout passportNumberBox = ViewBindings.findChildViewById(rootView, id);
      if (passportNumberBox == null) {
        break missingId;
      }

      id = R.id.surname;
      TextInputEditText surname = ViewBindings.findChildViewById(rootView, id);
      if (surname == null) {
        break missingId;
      }

      id = R.id.surname_box;
      TextInputLayout surnameBox = ViewBindings.findChildViewById(rootView, id);
      if (surnameBox == null) {
        break missingId;
      }

      id = R.id.tourist;
      TextView tourist = ViewBindings.findChildViewById(rootView, id);
      if (tourist == null) {
        break missingId;
      }

      return new ItemTouristInfoBinding((ConstraintLayout) rootView, birthDay, birthDayBox,
          citizenship, citizenshipBox, contentExpandable, expandArrow, name, nameBox,
          passportExpirationDate, passportExpirationDateBox, passportNumber, passportNumberBox,
          surname, surnameBox, tourist);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
