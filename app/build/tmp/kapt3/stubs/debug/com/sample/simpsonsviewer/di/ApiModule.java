package com.sample.simpsonsviewer.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/sample/simpsonsviewer/di/ApiModule;", "", "()V", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "context", "Landroid/content/Context;", "hasNetwork", "", "provideEmployeeService", "Lcom/sample/simpsonsviewer/repository/SimpsonsService;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "app_debug"})
@dagger.Module()
public final class ApiModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.sample.simpsonsviewer.di.ApiModule INSTANCE = null;
    
    private ApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.sample.simpsonsviewer.repository.SimpsonsService provideEmployeeService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final boolean hasNetwork(android.content.Context context) {
        return false;
    }
    
    private final okhttp3.OkHttpClient createOkHttpClient(android.content.Context context) {
        return null;
    }
}