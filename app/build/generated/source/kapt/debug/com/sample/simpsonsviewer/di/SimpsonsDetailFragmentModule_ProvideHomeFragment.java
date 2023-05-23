package com.sample.simpsonsviewer.di;

import com.sample.simpsonsviewer.view.SimpsonsDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SimpsonsDetailFragmentModule_ProvideHomeFragment.SimpsonsDetailFragmentSubcomponent.class
)
public abstract class SimpsonsDetailFragmentModule_ProvideHomeFragment {
  private SimpsonsDetailFragmentModule_ProvideHomeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SimpsonsDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SimpsonsDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SimpsonsDetailFragmentSubcomponent
      extends AndroidInjector<SimpsonsDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SimpsonsDetailFragment> {}
  }
}
