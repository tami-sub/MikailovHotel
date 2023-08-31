package com.example.mikailovhotel.feature.hotel.ui;

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
public final class HotelFragment_MembersInjector implements MembersInjector<HotelFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public HotelFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<HotelFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new HotelFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(HotelFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.mikailovhotel.feature.hotel.ui.HotelFragment.viewModelFactory")
  public static void injectViewModelFactory(HotelFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
