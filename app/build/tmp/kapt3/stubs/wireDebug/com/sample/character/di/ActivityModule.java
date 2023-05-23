package com.sample.character.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/sample/character/di/ActivityModule;", "", "()V", "contributeMainActivity", "Lcom/sample/character/view/MainActivity;", "NavigationModule", "app_wireDebug"})
@dagger.Module()
public abstract class ActivityModule {
    
    public ActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.sample.character.di.UtilModule.class, com.sample.character.di.ActivityModule.NavigationModule.class, com.sample.character.di.SimpsonsHomeFragmentModule.class, com.sample.character.di.SimpsonsDetailFragmentModule.class, com.sample.character.di.ApiModule.class})
    public abstract com.sample.character.view.MainActivity contributeMainActivity();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/sample/character/di/ActivityModule$NavigationModule;", "", "()V", "provideNavigationController", "Landroidx/navigation/NavController;", "mainActivity", "Lcom/sample/character/view/MainActivity;", "app_wireDebug"})
    @dagger.Module()
    public static final class NavigationModule {
        @org.jetbrains.annotations.NotNull()
        public static final com.sample.character.di.ActivityModule.NavigationModule INSTANCE = null;
        
        private NavigationModule() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final androidx.navigation.NavController provideNavigationController(@org.jetbrains.annotations.NotNull()
        com.sample.character.view.MainActivity mainActivity) {
            return null;
        }
    }
}