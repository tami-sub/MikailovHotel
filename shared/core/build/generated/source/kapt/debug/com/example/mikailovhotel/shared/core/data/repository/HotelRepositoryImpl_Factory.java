package com.example.mikailovhotel.shared.core.data.repository;

import com.example.mikailovhotel.shared.core.data.remote.RemoteApi;
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
public final class HotelRepositoryImpl_Factory implements Factory<HotelRepositoryImpl> {
  private final Provider<RemoteApi> apiProvider;

  public HotelRepositoryImpl_Factory(Provider<RemoteApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public HotelRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static HotelRepositoryImpl_Factory create(Provider<RemoteApi> apiProvider) {
    return new HotelRepositoryImpl_Factory(apiProvider);
  }

  public static HotelRepositoryImpl newInstance(RemoteApi api) {
    return new HotelRepositoryImpl(api);
  }
}
