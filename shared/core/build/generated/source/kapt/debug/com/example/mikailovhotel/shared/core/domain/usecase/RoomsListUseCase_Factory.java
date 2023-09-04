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
public final class RoomsListUseCase_Factory implements Factory<RoomsListUseCase> {
  private final Provider<HotelRepository> repositoryProvider;

  public RoomsListUseCase_Factory(Provider<HotelRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RoomsListUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static RoomsListUseCase_Factory create(Provider<HotelRepository> repositoryProvider) {
    return new RoomsListUseCase_Factory(repositoryProvider);
  }

  public static RoomsListUseCase newInstance(HotelRepository repository) {
    return new RoomsListUseCase(repository);
  }
}
