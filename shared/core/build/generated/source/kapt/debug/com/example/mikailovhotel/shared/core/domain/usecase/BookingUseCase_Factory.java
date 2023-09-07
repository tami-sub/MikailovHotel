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
public final class BookingUseCase_Factory implements Factory<BookingUseCase> {
  private final Provider<HotelRepository> repositoryProvider;

  public BookingUseCase_Factory(Provider<HotelRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public BookingUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static BookingUseCase_Factory create(Provider<HotelRepository> repositoryProvider) {
    return new BookingUseCase_Factory(repositoryProvider);
  }

  public static BookingUseCase newInstance(HotelRepository repository) {
    return new BookingUseCase(repository);
  }
}
