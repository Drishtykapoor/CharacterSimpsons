// Generated by Dagger (https://dagger.dev).
package com.sample.character.di;

import com.sample.character.repository.SimpsonsService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideEmployeeServiceFactory implements Factory<SimpsonsService> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideEmployeeServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public SimpsonsService get() {
    return provideEmployeeService(retrofitProvider.get());
  }

  public static ApiModule_ProvideEmployeeServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideEmployeeServiceFactory(retrofitProvider);
  }

  public static SimpsonsService provideEmployeeService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideEmployeeService(retrofit));
  }
}
