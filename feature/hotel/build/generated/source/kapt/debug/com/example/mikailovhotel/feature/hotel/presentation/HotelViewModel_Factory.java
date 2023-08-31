package com.example.mikailovhotel.feature.hotel.presentation;

import com.example.mikailovhotel.shared.core.domain.usecase.GetHotelUseCase;
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
public final class HotelViewModel_Factory implements Factory<HotelViewModel> {
  private final Provider<GetHotelUseCase> hotelUseCaseProvider;

  public HotelViewModel_Factory(Provider<GetHotelUseCase> hotelUseCaseProvider) {
    this.hotelUseCaseProvider = hotelUseCaseProvider;
  }

  @Override
  public HotelViewModel get() {
    return newInstance(hotelUseCaseProvider.get());
  }

  public static HotelViewModel_Factory create(Provider<GetHotelUseCase> hotelUseCaseProvider) {
    return new HotelViewModel_Factory(hotelUseCaseProvider);
  }

  public static HotelViewModel newInstance(GetHotelUseCase hotelUseCase) {
    return new HotelViewModel(hotelUseCase);
  }
}
