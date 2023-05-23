// Generated by Dagger (https://dagger.dev).
package com.sample.character.di;

import com.sample.character.view.SimpsonsHomeFragment;
import com.sample.character.viewmodel.SimpsonsHomeViewModelFactory;
import com.sample.character.viewmodel.SimpsonsHomeViewModelImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SimpsonsHomeFragmentDependenciesModule_HomeFragViewModelModule_ProvideViewModelFactory implements Factory<SimpsonsHomeViewModelImpl> {
  private final Provider<SimpsonsHomeFragment> homeFragmentProvider;

  private final Provider<SimpsonsHomeViewModelFactory> viewModelFactoryProvider;

  public SimpsonsHomeFragmentDependenciesModule_HomeFragViewModelModule_ProvideViewModelFactory(
      Provider<SimpsonsHomeFragment> homeFragmentProvider,
      Provider<SimpsonsHomeViewModelFactory> viewModelFactoryProvider) {
    this.homeFragmentProvider = homeFragmentProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  @Override
  public SimpsonsHomeViewModelImpl get() {
    return provideViewModel(homeFragmentProvider.get(), viewModelFactoryProvider.get());
  }

  public static SimpsonsHomeFragmentDependenciesModule_HomeFragViewModelModule_ProvideViewModelFactory create(
      Provider<SimpsonsHomeFragment> homeFragmentProvider,
      Provider<SimpsonsHomeViewModelFactory> viewModelFactoryProvider) {
    return new SimpsonsHomeFragmentDependenciesModule_HomeFragViewModelModule_ProvideViewModelFactory(homeFragmentProvider, viewModelFactoryProvider);
  }

  public static SimpsonsHomeViewModelImpl provideViewModel(SimpsonsHomeFragment homeFragment,
      SimpsonsHomeViewModelFactory viewModelFactory) {
    return Preconditions.checkNotNullFromProvides(SimpsonsHomeFragmentDependenciesModule.HomeFragViewModelModule.INSTANCE.provideViewModel(homeFragment, viewModelFactory));
  }
}
