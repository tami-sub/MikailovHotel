package com.example.mikailovhotel.feature.paid.ui;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class PaidViewModel_Factory implements Factory<PaidViewModel> {
  private final Provider<Application> appProvider;

  public PaidViewModel_Factory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public PaidViewModel get() {
    return newInstance(appProvider.get());
  }

  public static PaidViewModel_Factory create(Provider<Application> appProvider) {
    return new PaidViewModel_Factory(appProvider);
  }

  public static PaidViewModel newInstance(Application app) {
    return new PaidViewModel(app);
  }
}
