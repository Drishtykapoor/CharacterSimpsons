package com.sample.simpsonsviewer.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00112\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0016\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001eH\u0007J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/sample/simpsonsviewer/adapter/SimpsonsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sample/simpsonsviewer/adapter/SimpsonsListAdapter$ViewHolder;", "navController", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;)V", "imagePrefixUrl", "", "getImagePrefixUrl", "()Ljava/lang/String;", "myData", "", "Lcom/sample/simpsonsviewer/repository/pojo/RelatedTopic;", "getNavController", "()Landroidx/navigation/NavController;", "originalDataSet", "filterData", "", "filterText", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "topics", "", "sort", "sortOrder", "Lcom/sample/simpsonsviewer/viewmodel/SortOrder;", "ViewHolder", "app_debug"})
public final class SimpsonsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sample.simpsonsviewer.adapter.SimpsonsListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavController navController = null;
    private final java.util.List<com.sample.simpsonsviewer.repository.pojo.RelatedTopic> myData = null;
    private final java.util.List<com.sample.simpsonsviewer.repository.pojo.RelatedTopic> originalDataSet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imagePrefixUrl = "https://duckduckgo.com/";
    
    @javax.inject.Inject()
    public SimpsonsListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImagePrefixUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sample.simpsonsviewer.adapter.SimpsonsListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.adapter.SimpsonsListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sample.simpsonsviewer.repository.pojo.RelatedTopic> topics) {
    }
    
    public final void filterData(@org.jetbrains.annotations.NotNull()
    java.lang.String filterText) {
    }
    
    public final void sort(@org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.viewmodel.SortOrder sortOrder) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/sample/simpsonsviewer/adapter/SimpsonsListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/sample/simpsonsviewer/adapter/SimpsonsListAdapter;Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "onBind", "", "topic", "Lcom/sample/simpsonsviewer/repository/pojo/RelatedTopic;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView name = null;
        private final android.widget.ImageView image = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.sample.simpsonsviewer.repository.pojo.RelatedTopic topic) {
        }
    }
}