package com.sample.simpsonsviewer.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/sample/simpsonsviewer/di/SimpsonsHomeFragmentDependenciesModule;", "", "provideHomeRepository", "Lcom/sample/simpsonsviewer/repository/SimpsonsHomeRepository;", "homeRepositoryImpl", "Lcom/sample/simpsonsviewer/repository/SimpsonsHomeRepositoryImpl;", "provideHomeViewModel", "Lcom/sample/simpsonsviewer/viewmodel/SimpsonsHomeViewModel;", "homeViewModelImpl", "Lcom/sample/simpsonsviewer/viewmodel/SimpsonsHomeViewModelImpl;", "HomeFragViewModelModule", "app_debug"})
@dagger.Module(includes = {com.sample.simpsonsviewer.di.SimpsonsHomeFragmentDependenciesModule.HomeFragViewModelModule.class})
public abstract interface SimpsonsHomeFragmentDependenciesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.sample.simpsonsviewer.repository.SimpsonsHomeRepository provideHomeRepository(@org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.repository.SimpsonsHomeRepositoryImpl homeRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModel provideHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModelImpl homeViewModelImpl);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/sample/simpsonsviewer/di/SimpsonsHomeFragmentDependenciesModule$HomeFragViewModelModule;", "", "()V", "provideHomeViewModelFactory", "Lcom/sample/simpsonsviewer/viewmodel/SimpsonsHomeViewModelFactory;", "homeRepository", "Lcom/sample/simpsonsviewer/repository/SimpsonsHomeRepository;", "provideViewModel", "Lcom/sample/simpsonsviewer/viewmodel/SimpsonsHomeViewModelImpl;", "homeFragment", "Lcom/sample/simpsonsviewer/view/SimpsonsHomeFragment;", "viewModelFactory", "app_debug"})
    @dagger.Module()
    public static final class HomeFragViewModelModule {
        @org.jetbrains.annotations.NotNull()
        public static final com.sample.simpsonsviewer.di.SimpsonsHomeFragmentDependenciesModule.HomeFragViewModelModule INSTANCE = null;
        
        private HomeFragViewModelModule() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModelFactory provideHomeViewModelFactory(@org.jetbrains.annotations.NotNull()
        com.sample.simpsonsviewer.repository.SimpsonsHomeRepository homeRepository) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModelImpl provideViewModel(@org.jetbrains.annotations.NotNull()
        com.sample.simpsonsviewer.view.SimpsonsHomeFragment homeFragment, @org.jetbrains.annotations.NotNull()
        com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModelFactory viewModelFactory) {
            return null;
        }
    }
}