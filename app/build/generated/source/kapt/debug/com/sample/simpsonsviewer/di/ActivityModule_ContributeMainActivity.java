package com.sample.simpsonsviewer.di;

import com.sample.simpsonsviewer.view.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_ContributeMainActivity.MainActivitySubcomponent.class)
public abstract class ActivityModule_ContributeMainActivity {
  private ActivityModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {
      UtilModule.class,
      ActivityModule.NavigationModule.class,
      SimpsonsHomeFragmentModule.class,
      SimpsonsDetailFragmentModule.class,
      ApiModule.class
    }
  )
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
