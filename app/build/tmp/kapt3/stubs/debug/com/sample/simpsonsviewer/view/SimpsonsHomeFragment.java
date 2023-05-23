package com.sample.simpsonsviewer.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J*\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0013H\u0016J*\u0010\'\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0013H\u0002J\u0012\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006-"}, d2 = {"Lcom/sample/simpsonsviewer/view/SimpsonsHomeFragment;", "Ldagger/android/support/DaggerFragment;", "Landroid/text/TextWatcher;", "()V", "adapter", "Lcom/sample/simpsonsviewer/adapter/SimpsonsListAdapter;", "getAdapter", "()Lcom/sample/simpsonsviewer/adapter/SimpsonsListAdapter;", "setAdapter", "(Lcom/sample/simpsonsviewer/adapter/SimpsonsListAdapter;)V", "binding", "Lcom/sample/simpsonsviewer/databinding/SimpsonsHomeFragmentBinding;", "viewModel", "Lcom/sample/simpsonsviewer/viewmodel/SimpsonsHomeViewModelImpl;", "getViewModel", "()Lcom/sample/simpsonsviewer/viewmodel/SimpsonsHomeViewModelImpl;", "setViewModel", "(Lcom/sample/simpsonsviewer/viewmodel/SimpsonsHomeViewModelImpl;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "hideError", "hideRefresh", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onTextChanged", "before", "showEmptyData", "showError", "it", "", "app_debug"})
public final class SimpsonsHomeFragment extends dagger.android.support.DaggerFragment implements android.text.TextWatcher {
    private com.sample.simpsonsviewer.databinding.SimpsonsHomeFragmentBinding binding;
    @javax.inject.Inject()
    public com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModelImpl viewModel;
    public com.sample.simpsonsviewer.adapter.SimpsonsListAdapter adapter;
    
    public SimpsonsHomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModelImpl getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.viewmodel.SimpsonsHomeViewModelImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.simpsonsviewer.adapter.SimpsonsListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.adapter.SimpsonsListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void hideRefresh() {
    }
    
    private final void showError(java.lang.String it) {
    }
    
    private final void hideError() {
    }
    
    private final void showEmptyData() {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
}