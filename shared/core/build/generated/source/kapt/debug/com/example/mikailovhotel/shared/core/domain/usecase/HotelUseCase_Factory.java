package com.example.mikailovhotel.shared.core.domain.usecase;

import com.example.mikailovhotel.shared.core.domain.repository.HotelRepository;
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
public final class HotelUseCase_Factory implements Factory<HotelUseCase> {
  private final Provider<HotelRepository> repositoryProvider;

  public HotelUseCase_Factory(Provider<HotelRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HotelUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static HotelUseCase_Factory create(Provider<HotelRepository> repositoryProvider) {
    return new HotelUseCase_Factory(repositoryProvider);
  }

  public static HotelUseCase newInstance(HotelRepository repository) {
    return new HotelUseCase(repository);
  }
}
