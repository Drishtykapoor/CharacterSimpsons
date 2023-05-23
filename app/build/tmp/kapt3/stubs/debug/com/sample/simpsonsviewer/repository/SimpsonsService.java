package com.sample.simpsonsviewer.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/sample/simpsonsviewer/repository/SimpsonsService;", "", "getData", "Lretrofit2/Response;", "Lcom/sample/simpsonsviewer/repository/pojo/Simpsons;", "q", "", "format", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SimpsonsService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object getData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "format")
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.sample.simpsonsviewer.repository.pojo.Simpsons>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}