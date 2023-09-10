package com.example.mikailovhotel.feature.paid.ui;

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
public final class PaidFragment_MembersInjector implements MembersInjector<PaidFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public PaidFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PaidFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new PaidFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PaidFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.mikailovhotel.feature.paid.ui.PaidFragment.viewModelFactory")
  public static void injectViewModelFactory(PaidFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
