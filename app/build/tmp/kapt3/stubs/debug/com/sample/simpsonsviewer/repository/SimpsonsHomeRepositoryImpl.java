package com.sample.simpsonsviewer.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/sample/simpsonsviewer/repository/SimpsonsHomeRepositoryImpl;", "Lcom/sample/simpsonsviewer/repository/SimpsonsHomeRepository;", "simpsonsService", "Lcom/sample/simpsonsviewer/repository/SimpsonsService;", "(Lcom/sample/simpsonsviewer/repository/SimpsonsService;)V", "getData", "Lretrofit2/Response;", "Lcom/sample/simpsonsviewer/repository/pojo/Simpsons;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SimpsonsHomeRepositoryImpl implements com.sample.simpsonsviewer.repository.SimpsonsHomeRepository {
    private final com.sample.simpsonsviewer.repository.SimpsonsService simpsonsService = null;
    
    @javax.inject.Inject()
    public SimpsonsHomeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.repository.SimpsonsService simpsonsService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.sample.simpsonsviewer.repository.pojo.Simpsons>> continuation) {
        return null;
    }
}