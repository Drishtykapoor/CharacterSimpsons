// Generated by Dagger (https://dagger.dev).
package com.sample.character.viewmodel;

import com.sample.character.repository.SimpsonsHomeRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SimpsonsHomeViewModelImpl_Factory implements Factory<SimpsonsHomeViewModelImpl> {
  private final Provider<SimpsonsHomeRepository> homeRepositoryProvider;

  public SimpsonsHomeViewModelImpl_Factory(
      Provider<SimpsonsHomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  @Override
  public SimpsonsHomeViewModelImpl get() {
    return newInstance(homeRepositoryProvider.get());
  }

  public static SimpsonsHomeViewModelImpl_Factory create(
      Provider<SimpsonsHomeRepository> homeRepositoryProvider) {
    return new SimpsonsHomeViewModelImpl_Factory(homeRepositoryProvider);
  }

  public static SimpsonsHomeViewModelImpl newInstance(SimpsonsHomeRepository homeRepository) {
    return new SimpsonsHomeViewModelImpl(homeRepository);
  }
}
