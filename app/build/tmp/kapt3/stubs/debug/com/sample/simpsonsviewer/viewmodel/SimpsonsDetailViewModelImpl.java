package com.sample.simpsonsviewer.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/sample/simpsonsviewer/viewmodel/SimpsonsDetailViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Lcom/sample/simpsonsviewer/viewmodel/SimpsonsDetailViewModel;", "homeRepository", "Lcom/sample/simpsonsviewer/repository/SimpsonsHomeRepository;", "(Lcom/sample/simpsonsviewer/repository/SimpsonsHomeRepository;)V", "simpsonsData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsDetailResponseState;", "getData", "", "teamId", "", "getSimpsonsLiveData", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class SimpsonsDetailViewModelImpl extends androidx.lifecycle.ViewModel implements com.sample.simpsonsviewer.viewmodel.SimpsonsDetailViewModel {
    private final com.sample.simpsonsviewer.repository.SimpsonsHomeRepository homeRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.sample.simpsonsviewer.repository.viewstate.SimpsonsDetailResponseState> simpsonsData = null;
    
    public SimpsonsDetailViewModelImpl(@org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.repository.SimpsonsHomeRepository homeRepository) {
        super();
    }
    
    @java.lang.Override()
    public void getData(@org.jetbrains.annotations.NotNull()
    java.lang.String teamId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.sample.simpsonsviewer.repository.viewstate.SimpsonsDetailResponseState> getSimpsonsLiveData() {
        return null;
    }
}