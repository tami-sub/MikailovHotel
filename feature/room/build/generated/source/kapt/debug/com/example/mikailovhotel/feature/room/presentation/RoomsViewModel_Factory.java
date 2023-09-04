package com.example.mikailovhotel.feature.room.presentation;

import com.example.mikailovhotel.shared.core.domain.usecase.RoomsListUseCase;
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
public final class RoomsViewModel_Factory implements Factory<RoomsViewModel> {
  private final Provider<RoomsListUseCase> roomsListUseCaseProvider;

  public RoomsViewModel_Factory(Provider<RoomsListUseCase> roomsListUseCaseProvider) {
    this.roomsListUseCaseProvider = roomsListUseCaseProvider;
  }

  @Override
  public RoomsViewModel get() {
    return newInstance(roomsListUseCaseProvider.get());
  }

  public static RoomsViewModel_Factory create(Provider<RoomsListUseCase> roomsListUseCaseProvider) {
    return new RoomsViewModel_Factory(roomsListUseCaseProvider);
  }

  public static RoomsViewModel newInstance(RoomsListUseCase roomsListUseCase) {
    return new RoomsViewModel(roomsListUseCase);
  }
}
