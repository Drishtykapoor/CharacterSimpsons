package com.sample.character.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H&\u00a8\u0006\u0007"}, d2 = {"Lcom/sample/character/di/ApplicationComponent;", "Ldagger/android/AndroidInjector;", "Lcom/sample/character/MainApplication;", "inject", "", "mainApplication", "Builder", "app_simpsonsDebug"})
@dagger.Component(modules = {com.sample.character.di.ActivityModule.class, dagger.android.AndroidInjectionModule.class})
public abstract interface ApplicationComponent extends dagger.android.AndroidInjector<com.sample.character.MainApplication> {
    
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.sample.character.MainApplication mainApplication);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/sample/character/di/ApplicationComponent$Builder;", "", "addContext", "context", "Landroid/content/Context;", "application", "Landroid/app/Application;", "build", "Lcom/sample/character/di/ApplicationComponent;", "app_simpsonsDebug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.sample.character.di.ApplicationComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.sample.character.di.ApplicationComponent.Builder addContext(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.sample.character.di.ApplicationComponent build();
    }
}