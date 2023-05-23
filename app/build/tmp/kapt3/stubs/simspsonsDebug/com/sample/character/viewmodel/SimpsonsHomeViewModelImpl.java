package com.sample.character.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/sample/character/viewmodel/SimpsonsHomeViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Lcom/sample/character/viewmodel/SimpsonsHomeViewModel;", "homeRepository", "Lcom/sample/character/repository/SimpsonsHomeRepository;", "(Lcom/sample/character/repository/SimpsonsHomeRepository;)V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sample/character/repository/viewstate/SimpsonsResponseState;", "fetchData", "", "getData", "getLiveData", "Landroidx/lifecycle/LiveData;", "refreshData", "app_simspsonsDebug"})
public final class SimpsonsHomeViewModelImpl extends androidx.lifecycle.ViewModel implements com.sample.character.viewmodel.SimpsonsHomeViewModel {
    private final com.sample.character.repository.SimpsonsHomeRepository homeRepository = null;
    private androidx.lifecycle.MutableLiveData<com.sample.character.repository.viewstate.SimpsonsResponseState> liveData;
    
    @javax.inject.Inject()
    public SimpsonsHomeViewModelImpl(@org.jetbrains.annotations.NotNull()
    com.sample.character.repository.SimpsonsHomeRepository homeRepository) {
        super();
    }
    
    @java.lang.Override()
    public void getData() {
    }
    
    @java.lang.Override()
    public void refreshData() {
    }
    
    private final void fetchData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.sample.character.repository.viewstate.SimpsonsResponseState> getLiveData() {
        return null;
    }
}