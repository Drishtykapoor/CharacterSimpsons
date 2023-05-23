// Generated by Dagger (https://dagger.dev).
package com.sample.simpsonsviewer.di;

import com.sample.simpsonsviewer.repository.SimpsonsHomeRepository;
import com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModelFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SimpsonsHomeFragmentDependenciesModule_HomeFragViewModelModule_ProvideHomeViewModelFactoryFactory implements Factory<SimpsonsHomeViewModelFactory> {
  private final Provider<SimpsonsHomeRepository> homeRepositoryProvider;

  public SimpsonsHomeFragmentDependenciesModule_HomeFragViewModelModule_ProvideHomeViewModelFactoryFactory(
      Provider<SimpsonsHomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  @Override
  public SimpsonsHomeViewModelFactory get() {
    return provideHomeViewModelFactory(homeRepositoryProvider.get());
  }

  public static SimpsonsHomeFragmentDependenciesModule_HomeFragViewModelModule_ProvideHomeViewModelFactoryFactory create(
      Provider<SimpsonsHomeRepository> homeRepositoryProvider) {
    return new SimpsonsHomeFragmentDependenciesModule_HomeFragViewModelModule_ProvideHomeViewModelFactoryFactory(homeRepositoryProvider);
  }

  public static SimpsonsHomeViewModelFactory provideHomeViewModelFactory(
      SimpsonsHomeRepository homeRepository) {
    return Preconditions.checkNotNullFromProvides(SimpsonsHomeFragmentDependenciesModule.HomeFragViewModelModule.INSTANCE.provideHomeViewModelFactory(homeRepository));
  }
}
