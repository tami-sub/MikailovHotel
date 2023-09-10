package com.example.mikailovhotel.feature.booking.ui;

import com.example.mikailovhotel.shared.core.presentation.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BookingFragment_MembersInjector implements MembersInjector<BookingFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public BookingFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<BookingFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new BookingFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(BookingFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.mikailovhotel.feature.booking.ui.BookingFragment.viewModelFactory")
  public static void injectViewModelFactory(BookingFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
