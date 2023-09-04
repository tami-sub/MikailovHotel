package com.example.mikailovhotel.feature.room.ui;

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
public final class RoomsFragment_MembersInjector implements MembersInjector<RoomsFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public RoomsFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<RoomsFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new RoomsFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(RoomsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.mikailovhotel.feature.room.ui.RoomsFragment.viewModelFactory")
  public static void injectViewModelFactory(RoomsFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
