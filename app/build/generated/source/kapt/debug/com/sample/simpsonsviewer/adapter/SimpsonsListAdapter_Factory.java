// Generated by Dagger (https://dagger.dev).
package com.sample.simpsonsviewer.adapter;

import androidx.navigation.NavController;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SimpsonsListAdapter_Factory implements Factory<SimpsonsListAdapter> {
  private final Provider<NavController> navControllerProvider;

  public SimpsonsListAdapter_Factory(Provider<NavController> navControllerProvider) {
    this.navControllerProvider = navControllerProvider;
  }

  @Override
  public SimpsonsListAdapter get() {
    return newInstance(navControllerProvider.get());
  }

  public static SimpsonsListAdapter_Factory create(Provider<NavController> navControllerProvider) {
    return new SimpsonsListAdapter_Factory(navControllerProvider);
  }

  public static SimpsonsListAdapter newInstance(NavController navController) {
    return new SimpsonsListAdapter(navController);
  }
}
