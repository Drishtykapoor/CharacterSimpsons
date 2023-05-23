package com.sample.simpsonsviewer.repository.viewstate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState;", "", "()V", "Empty", "Error", "Loading", "Success", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState$Empty;", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState$Error;", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState$Loading;", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState$Success;", "app_debug"})
public abstract class SimpsonsResponseState {
    
    private SimpsonsResponseState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState$Empty;", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState;", "()V", "app_debug"})
    public static final class Empty extends com.sample.simpsonsviewer.repository.viewstate.SimpsonsResponseState {
        @org.jetbrains.annotations.NotNull()
        public static final com.sample.simpsonsviewer.repository.viewstate.SimpsonsResponseState.Empty INSTANCE = null;
        
        private Empty() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState$Loading;", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState;", "()V", "app_debug"})
    public static final class Loading extends com.sample.simpsonsviewer.repository.viewstate.SimpsonsResponseState {
        @org.jetbrains.annotations.NotNull()
        public static final com.sample.simpsonsviewer.repository.viewstate.SimpsonsResponseState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState$Success;", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState;", "simpsonsResponse", "Lcom/sample/simpsonsviewer/repository/pojo/Simpsons;", "(Lcom/sample/simpsonsviewer/repository/pojo/Simpsons;)V", "getSimpsonsResponse", "()Lcom/sample/simpsonsviewer/repository/pojo/Simpsons;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success extends com.sample.simpsonsviewer.repository.viewstate.SimpsonsResponseState {
        @org.jetbrains.annotations.NotNull()
        private final com.sample.simpsonsviewer.repository.pojo.Simpsons simpsonsResponse = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.simpsonsviewer.repository.viewstate.SimpsonsResponseState.Success copy(@org.jetbrains.annotations.NotNull()
        com.sample.simpsonsviewer.repository.pojo.Simpsons simpsonsResponse) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        com.sample.simpsonsviewer.repository.pojo.Simpsons simpsonsResponse) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.simpsonsviewer.repository.pojo.Simpsons component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.simpsonsviewer.repository.pojo.Simpsons getSimpsonsResponse() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState$Error;", "Lcom/sample/simpsonsviewer/repository/viewstate/SimpsonsResponseState;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class Error extends com.sample.simpsonsviewer.repository.viewstate.SimpsonsResponseState {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.simpsonsviewer.repository.viewstate.SimpsonsResponseState.Error copy(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessage() {
            return null;
        }
    }
}