package com.sample.simpsonsviewer.repository.pojo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00f9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0010$\u001a\u00020\u0001\u00a2\u0006\u0002\u0010%J\t\u0010H\u001a\u00020\u0001H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0010H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0001H\u00c6\u0003J\t\u0010M\u001a\u00020\u0014H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0001H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0001H\u00c6\u0003J\t\u0010T\u001a\u00020\u0005H\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020\u0001H\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\t\u0010X\u001a\u00020\u001fH\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0001H\u00c6\u0003J\t\u0010[\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u00c6\u0003J\t\u0010]\u001a\u00020\u0001H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0001H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\u00b7\u0002\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010$\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010i\u001a\u00020\u0010H\u00d6\u0001J\t\u0010j\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\'R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u00103R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\'R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0011\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\'R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0011\u0010\u001c\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\'R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010 \u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0011\u0010!\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\'R\u0011\u0010\"\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0011\u0010$\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\'\u00a8\u0006k"}, d2 = {"Lcom/sample/simpsonsviewer/repository/pojo/MetaX;", "", "attribution", "blockgroup", "created_date", "", "description", "designer", "dev_date", "dev_milestone", "developer", "", "Lcom/sample/simpsonsviewer/repository/pojo/DeveloperX;", "example_query", "id", "is_stackexchange", "", "js_callback_name", "live_date", "maintainer", "Lcom/sample/simpsonsviewer/repository/pojo/MaintainerX;", "name", "perl_module", "producer", "production_state", "repo", "signal_from", "src_domain", "src_id", "src_name", "src_options", "Lcom/sample/simpsonsviewer/repository/pojo/SrcOptionsX;", "src_url", "status", "tab", "topic", "unsafe", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Lcom/sample/simpsonsviewer/repository/pojo/MaintainerX;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/sample/simpsonsviewer/repository/pojo/SrcOptionsX;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)V", "getAttribution", "()Ljava/lang/Object;", "getBlockgroup", "getCreated_date", "()Ljava/lang/String;", "getDescription", "getDesigner", "getDev_date", "getDev_milestone", "getDeveloper", "()Ljava/util/List;", "getExample_query", "getId", "()I", "getJs_callback_name", "getLive_date", "getMaintainer", "()Lcom/sample/simpsonsviewer/repository/pojo/MaintainerX;", "getName", "getPerl_module", "getProducer", "getProduction_state", "getRepo", "getSignal_from", "getSrc_domain", "getSrc_id", "getSrc_name", "getSrc_options", "()Lcom/sample/simpsonsviewer/repository/pojo/SrcOptionsX;", "getSrc_url", "getStatus", "getTab", "getTopic", "getUnsafe", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class MetaX {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object attribution = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object blockgroup = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object designer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dev_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dev_milestone = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.sample.simpsonsviewer.repository.pojo.DeveloperX> developer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String example_query = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final int is_stackexchange = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String js_callback_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object live_date = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sample.simpsonsviewer.repository.pojo.MaintainerX maintainer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String perl_module = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object producer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String production_state = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String repo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String signal_from = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String src_domain = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object src_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String src_name = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sample.simpsonsviewer.repository.pojo.SrcOptionsX src_options = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String src_url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tab = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> topic = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object unsafe = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.simpsonsviewer.repository.pojo.MetaX copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object attribution, @org.jetbrains.annotations.NotNull()
    java.lang.Object blockgroup, @org.jetbrains.annotations.NotNull()
    java.lang.String created_date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.Object designer, @org.jetbrains.annotations.NotNull()
    java.lang.String dev_date, @org.jetbrains.annotations.NotNull()
    java.lang.String dev_milestone, @org.jetbrains.annotations.NotNull()
    java.util.List<com.sample.simpsonsviewer.repository.pojo.DeveloperX> developer, @org.jetbrains.annotations.NotNull()
    java.lang.String example_query, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int is_stackexchange, @org.jetbrains.annotations.NotNull()
    java.lang.String js_callback_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object live_date, @org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.repository.pojo.MaintainerX maintainer, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String perl_module, @org.jetbrains.annotations.NotNull()
    java.lang.Object producer, @org.jetbrains.annotations.NotNull()
    java.lang.String production_state, @org.jetbrains.annotations.NotNull()
    java.lang.String repo, @org.jetbrains.annotations.NotNull()
    java.lang.String signal_from, @org.jetbrains.annotations.NotNull()
    java.lang.String src_domain, @org.jetbrains.annotations.NotNull()
    java.lang.Object src_id, @org.jetbrains.annotations.NotNull()
    java.lang.String src_name, @org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.repository.pojo.SrcOptionsX src_options, @org.jetbrains.annotations.NotNull()
    java.lang.String src_url, @org.jetbrains.annotations.NotNull()
    java.lang.Object status, @org.jetbrains.annotations.NotNull()
    java.lang.String tab, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> topic, @org.jetbrains.annotations.NotNull()
    java.lang.Object unsafe) {
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
    
    public MetaX(@org.jetbrains.annotations.NotNull()
    java.lang.Object attribution, @org.jetbrains.annotations.NotNull()
    java.lang.Object blockgroup, @org.jetbrains.annotations.NotNull()
    java.lang.String created_date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.Object designer, @org.jetbrains.annotations.NotNull()
    java.lang.String dev_date, @org.jetbrains.annotations.NotNull()
    java.lang.String dev_milestone, @org.jetbrains.annotations.NotNull()
    java.util.List<com.sample.simpsonsviewer.repository.pojo.DeveloperX> developer, @org.jetbrains.annotations.NotNull()
    java.lang.String example_query, @org.jetbrains.annotations.NotNull()
    java.lang.String id, int is_stackexchange, @org.jetbrains.annotations.NotNull()
    java.lang.String js_callback_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object live_date, @org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.repository.pojo.MaintainerX maintainer, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String perl_module, @org.jetbrains.annotations.NotNull()
    java.lang.Object producer, @org.jetbrains.annotations.NotNull()
    java.lang.String production_state, @org.jetbrains.annotations.NotNull()
    java.lang.String repo, @org.jetbrains.annotations.NotNull()
    java.lang.String signal_from, @org.jetbrains.annotations.NotNull()
    java.lang.String src_domain, @org.jetbrains.annotations.NotNull()
    java.lang.Object src_id, @org.jetbrains.annotations.NotNull()
    java.lang.String src_name, @org.jetbrains.annotations.NotNull()
    com.sample.simpsonsviewer.repository.pojo.SrcOptionsX src_options, @org.jetbrains.annotations.NotNull()
    java.lang.String src_url, @org.jetbrains.annotations.NotNull()
    java.lang.Object status, @org.jetbrains.annotations.NotNull()
    java.lang.String tab, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> topic, @org.jetbrains.annotations.NotNull()
    java.lang.Object unsafe) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAttribution() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBlockgroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDesigner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDev_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDev_milestone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sample.simpsonsviewer.repository.pojo.DeveloperX> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sample.simpsonsviewer.repository.pojo.DeveloperX> getDeveloper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExample_query() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int is_stackexchange() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJs_callback_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLive_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.simpsonsviewer.repository.pojo.MaintainerX component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.simpsonsviewer.repository.pojo.MaintainerX getMaintainer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPerl_module() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getProducer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProduction_state() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSignal_from() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSrc_domain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSrc_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSrc_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.simpsonsviewer.repository.pojo.SrcOptionsX component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.simpsonsviewer.repository.pojo.SrcOptionsX getSrc_options() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSrc_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTab() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getTopic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getUnsafe() {
        return null;
    }
}