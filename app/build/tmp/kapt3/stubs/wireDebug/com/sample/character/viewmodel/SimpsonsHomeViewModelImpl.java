package com.sample.character.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/character/viewmodel/SimpsonsHomeViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Lcom/sample/character/viewmodel/SimpsonsHomeViewModel;", "homeRepository", "Lcom/sample/character/repository/SimpsonsHomeRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/sample/character/repository/SimpsonsHomeRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sample/character/repository/viewstate/SimpsonsResponseState;", "fetchData", "", "getData", "getLiveData", "Landroidx/lifecycle/LiveData;", "refreshData", "app_wireDebug"})
public final class SimpsonsHomeViewModelImpl extends androidx.lifecycle.ViewModel implements com.sample.character.viewmodel.SimpsonsHomeViewModel {
    private final com.sample.character.repository.SimpsonsHomeRepository homeRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private androidx.lifecycle.MutableLiveData<com.sample.character.repository.viewstate.SimpsonsResponseState> liveData;
    
    @javax.inject.Inject()
    public SimpsonsHomeViewModelImpl(@org.jetbrains.annotations.NotNull()
    com.sample.character.repository.SimpsonsHomeRepository homeRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @java.lang.Override()
    public void getData() {
    }
    
    @java.lang.Override()
    public void refreshData() {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void fetchData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.sample.character.repository.viewstate.SimpsonsResponseState> getLiveData() {
        return null;
    }
}