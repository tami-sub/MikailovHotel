package com.example.mikailovhotel.feature.booking.presentation;

import android.app.Application;
import com.example.mikailovhotel.shared.core.domain.usecase.BookingUseCase;
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
public final class BookingViewModel_Factory implements Factory<BookingViewModel> {
  private final Provider<BookingUseCase> bookingUseCaseProvider;

  private final Provider<Application> applicationProvider;

  public BookingViewModel_Factory(Provider<BookingUseCase> bookingUseCaseProvider,
      Provider<Application> applicationProvider) {
    this.bookingUseCaseProvider = bookingUseCaseProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public BookingViewModel get() {
    return newInstance(bookingUseCaseProvider.get(), applicationProvider.get());
  }

  public static BookingViewModel_Factory create(Provider<BookingUseCase> bookingUseCaseProvider,
      Provider<Application> applicationProvider) {
    return new BookingViewModel_Factory(bookingUseCaseProvider, applicationProvider);
  }

  public static BookingViewModel newInstance(BookingUseCase bookingUseCase,
      Application application) {
    return new BookingViewModel(bookingUseCase, application);
  }
}
