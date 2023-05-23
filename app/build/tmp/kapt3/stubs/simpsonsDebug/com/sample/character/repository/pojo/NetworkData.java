package com.sample.character.repository.pojo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00b9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0019H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\u00e7\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u00c6\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020MH\u00d6\u0001J\t\u0010N\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102\u00a8\u0006O"}, d2 = {"Lcom/sample/character/repository/pojo/NetworkData;", "", "Abstract", "", "AbstractSource", "AbstractText", "AbstractURL", "Answer", "AnswerType", "Definition", "DefinitionSource", "DefinitionURL", "Entity", "Heading", "Image", "ImageHeight", "ImageIsLogo", "ImageWidth", "Infobox", "Redirect", "RelatedTopics", "", "Results", "Type", "meta", "Lcom/sample/character/repository/pojo/MetaX;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/sample/character/repository/pojo/MetaX;)V", "getAbstract", "()Ljava/lang/String;", "getAbstractSource", "getAbstractText", "getAbstractURL", "getAnswer", "getAnswerType", "getDefinition", "getDefinitionSource", "getDefinitionURL", "getEntity", "getHeading", "getImage", "getImageHeight", "getImageIsLogo", "getImageWidth", "getInfobox", "getRedirect", "getRelatedTopics", "()Ljava/util/List;", "getResults", "getType", "getMeta", "()Lcom/sample/character/repository/pojo/MetaX;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_simpsonsDebug"})
public final class NetworkData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Abstract = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AbstractSource = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AbstractText = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AbstractURL = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Answer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AnswerType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Definition = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DefinitionSource = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DefinitionURL = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Entity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Heading = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ImageHeight = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ImageIsLogo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ImageWidth = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Infobox = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Redirect = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> RelatedTopics = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> Results = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Type = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sample.character.repository.pojo.MetaX meta = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.character.repository.pojo.NetworkData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String Abstract, @org.jetbrains.annotations.NotNull()
    java.lang.String AbstractSource, @org.jetbrains.annotations.NotNull()
    java.lang.String AbstractText, @org.jetbrains.annotations.NotNull()
    java.lang.String AbstractURL, @org.jetbrains.annotations.NotNull()
    java.lang.String Answer, @org.jetbrains.annotations.NotNull()
    java.lang.String AnswerType, @org.jetbrains.annotations.NotNull()
    java.lang.String Definition, @org.jetbrains.annotations.NotNull()
    java.lang.String DefinitionSource, @org.jetbrains.annotations.NotNull()
    java.lang.String DefinitionURL, @org.jetbrains.annotations.NotNull()
    java.lang.String Entity, @org.jetbrains.annotations.NotNull()
    java.lang.String Heading, @org.jetbrains.annotations.NotNull()
    java.lang.String Image, @org.jetbrains.annotations.NotNull()
    java.lang.String ImageHeight, @org.jetbrains.annotations.NotNull()
    java.lang.String ImageIsLogo, @org.jetbrains.annotations.NotNull()
    java.lang.String ImageWidth, @org.jetbrains.annotations.NotNull()
    java.lang.String Infobox, @org.jetbrains.annotations.NotNull()
    java.lang.String Redirect, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> RelatedTopics, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> Results, @org.jetbrains.annotations.NotNull()
    java.lang.String Type, @org.jetbrains.annotations.NotNull()
    com.sample.character.repository.pojo.MetaX meta) {
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
    
    public NetworkData(@org.jetbrains.annotations.NotNull()
    java.lang.String Abstract, @org.jetbrains.annotations.NotNull()
    java.lang.String AbstractSource, @org.jetbrains.annotations.NotNull()
    java.lang.String AbstractText, @org.jetbrains.annotations.NotNull()
    java.lang.String AbstractURL, @org.jetbrains.annotations.NotNull()
    java.lang.String Answer, @org.jetbrains.annotations.NotNull()
    java.lang.String AnswerType, @org.jetbrains.annotations.NotNull()
    java.lang.String Definition, @org.jetbrains.annotations.NotNull()
    java.lang.String DefinitionSource, @org.jetbrains.annotations.NotNull()
    java.lang.String DefinitionURL, @org.jetbrains.annotations.NotNull()
    java.lang.String Entity, @org.jetbrains.annotations.NotNull()
    java.lang.String Heading, @org.jetbrains.annotations.NotNull()
    java.lang.String Image, @org.jetbrains.annotations.NotNull()
    java.lang.String ImageHeight, @org.jetbrains.annotations.NotNull()
    java.lang.String ImageIsLogo, @org.jetbrains.annotations.NotNull()
    java.lang.String ImageWidth, @org.jetbrains.annotations.NotNull()
    java.lang.String Infobox, @org.jetbrains.annotations.NotNull()
    java.lang.String Redirect, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> RelatedTopics, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> Results, @org.jetbrains.annotations.NotNull()
    java.lang.String Type, @org.jetbrains.annotations.NotNull()
    com.sample.character.repository.pojo.MetaX meta) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbstract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbstractSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbstractText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbstractURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAnswerType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefinition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefinitionSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefinitionURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageIsLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageWidth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInfobox() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRedirect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getRelatedTopics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.character.repository.pojo.MetaX component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.character.repository.pojo.MetaX getMeta() {
        return null;
    }
}