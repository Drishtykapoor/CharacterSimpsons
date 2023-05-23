package com.sample.simpsonsviewer.di;

import com.sample.simpsonsviewer.view.SimpsonsHomeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SimpsonsHomeFragmentModule_ProvideHomeFragment.SimpsonsHomeFragmentSubcomponent.class
)
public abstract class SimpsonsHomeFragmentModule_ProvideHomeFragment {
  private SimpsonsHomeFragmentModule_ProvideHomeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SimpsonsHomeFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SimpsonsHomeFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = SimpsonsHomeFragmentDependenciesModule.class)
  public interface SimpsonsHomeFragmentSubcomponent extends AndroidInjector<SimpsonsHomeFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SimpsonsHomeFragment> {}
  }
}
