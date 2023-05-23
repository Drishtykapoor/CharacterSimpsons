package com.sample.character.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/sample/character/viewmodel/SimpsonsHomeViewModel;", "", "getData", "", "getLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/sample/character/repository/viewstate/SimpsonsResponseState;", "refreshData", "app_simpsonsDebug"})
public abstract interface SimpsonsHomeViewModel {
    
    public abstract void getData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.sample.character.repository.viewstate.SimpsonsResponseState> getLiveData();
    
    public abstract void refreshData();
}