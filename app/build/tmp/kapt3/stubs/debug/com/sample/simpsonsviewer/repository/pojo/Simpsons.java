package com.sample.simpsonsviewer.repository.pojo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00e9\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020EH\u00d6\u0001J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u00a8\u0006G"}, d2 = {"Lcom/sample/simpsonsviewer/repository/pojo/Simpsons;", "", "Abstract", "", "AbstractSource", "AbstractText", "AbstractURL", "Answer", "AnswerType", "Definition", "DefinitionSource", "DefinitionURL", "Entity", "Heading", "Image", "Infobox", "Redirect", "RelatedTopics", "", "Lcom/sample/simpsonsviewer/repository/pojo/RelatedTopic;", "Results", "Type", "meta", "Lcom/sample/simpsonsviewer/repository/pojo/Meta;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/sample/simpsonsviewer/repository/pojo/Meta;)V", "getAbstract", "()Ljava/lang/String;", "getAbstractSource", "getAbstractText", "getAbstractURL", "getAnswer", "getAnswerType", "getDefinition", "getDefinitionSource", "getDefinitionURL", "getEntity", "getHeading", "getImage", "getInfobox", "getRedirect", "getRelatedTopics", "()Ljava/util/List;", "getResults", "getType", "getMeta", "()Lcom/sample/simpsonsviewer/repository/pojo/Meta;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Simpsons {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Abstract = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String AbstractSource = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String AbstractText = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String AbstractURL = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Answer = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String AnswerType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Definition = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String DefinitionSource = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String DefinitionURL = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Entity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Heading = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Image = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Infobox = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Redirect = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.sample.simpsonsviewer.repository.pojo.RelatedTopic> RelatedTopics = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> Results = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String Type = null;
    @org.jetbrains.annotations.Nullable()
    private final com.sample.simpsonsviewer.repository.pojo.Meta meta = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.simpsonsviewer.repository.pojo.Simpsons copy(@org.jetbrains.annotations.Nullable()
    java.lang.String Abstract, @org.jetbrains.annotations.Nullable()
    java.lang.String AbstractSource, @org.jetbrains.annotations.Nullable()
    java.lang.String AbstractText, @org.jetbrains.annotations.Nullable()
    java.lang.String AbstractURL, @org.jetbrains.annotations.Nullable()
    java.lang.String Answer, @org.jetbrains.annotations.Nullable()
    java.lang.String AnswerType, @org.jetbrains.annotations.Nullable()
    java.lang.String Definition, @org.jetbrains.annotations.Nullable()
    java.lang.String DefinitionSource, @org.jetbrains.annotations.Nullable()
    java.lang.String DefinitionURL, @org.jetbrains.annotations.Nullable()
    java.lang.String Entity, @org.jetbrains.annotations.Nullable()
    java.lang.String Heading, @org.jetbrains.annotations.Nullable()
    java.lang.String Image, @org.jetbrains.annotations.Nullable()
    java.lang.String Infobox, @org.jetbrains.annotations.Nullable()
    java.lang.String Redirect, @org.jetbrains.annotations.NotNull()
    java.util.List<com.sample.simpsonsviewer.repository.pojo.RelatedTopic> RelatedTopics, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> Results, @org.jetbrains.annotations.Nullable()
    java.lang.String Type, @org.jetbrains.annotations.Nullable()
    com.sample.simpsonsviewer.repository.pojo.Meta meta) {
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
    
    public Simpsons(@org.jetbrains.annotations.Nullable()
    java.lang.String Abstract, @org.jetbrains.annotations.Nullable()
    java.lang.String AbstractSource, @org.jetbrains.annotations.Nullable()
    java.lang.String AbstractText, @org.jetbrains.annotations.Nullable()
    java.lang.String AbstractURL, @org.jetbrains.annotations.Nullable()
    java.lang.String Answer, @org.jetbrains.annotations.Nullable()
    java.lang.String AnswerType, @org.jetbrains.annotations.Nullable()
    java.lang.String Definition, @org.jetbrains.annotations.Nullable()
    java.lang.String DefinitionSource, @org.jetbrains.annotations.Nullable()
    java.lang.String DefinitionURL, @org.jetbrains.annotations.Nullable()
    java.lang.String Entity, @org.jetbrains.annotations.Nullable()
    java.lang.String Heading, @org.jetbrains.annotations.Nullable()
    java.lang.String Image, @org.jetbrains.annotations.Nullable()
    java.lang.String Infobox, @org.jetbrains.annotations.Nullable()
    java.lang.String Redirect, @org.jetbrains.annotations.NotNull()
    java.util.List<com.sample.simpsonsviewer.repository.pojo.RelatedTopic> RelatedTopics, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> Results, @org.jetbrains.annotations.Nullable()
    java.lang.String Type, @org.jetbrains.annotations.Nullable()
    com.sample.simpsonsviewer.repository.pojo.Meta meta) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAbstract() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAbstractSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAbstractText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAbstractURL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnswerType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefinition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefinitionSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefinitionURL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInfobox() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRedirect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sample.simpsonsviewer.repository.pojo.RelatedTopic> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.sample.simpsonsviewer.repository.pojo.RelatedTopic> getRelatedTopics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sample.simpsonsviewer.repository.pojo.Meta component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sample.simpsonsviewer.repository.pojo.Meta getMeta() {
        return null;
    }
}