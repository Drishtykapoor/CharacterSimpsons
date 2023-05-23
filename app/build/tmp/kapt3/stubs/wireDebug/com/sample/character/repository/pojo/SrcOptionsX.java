package com.sample.character.repository.pojo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0001H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u00020\u0005H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013\u00a8\u00062"}, d2 = {"Lcom/sample/character/repository/pojo/SrcOptionsX;", "", "directory", "", "is_fanon", "", "is_mediawiki", "is_wikipedia", "language", "min_abstract_length", "skip_abstract", "skip_abstract_paren", "skip_icon", "skip_image_name", "skip_qr", "src_info", "src_skip", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/Object;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDirectory", "()Ljava/lang/String;", "()I", "getLanguage", "getMin_abstract_length", "()Ljava/lang/Object;", "getSkip_abstract", "getSkip_abstract_paren", "getSkip_icon", "getSkip_image_name", "getSkip_qr", "getSrc_info", "getSrc_skip", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_wireDebug"})
public final class SrcOptionsX {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String directory = null;
    private final int is_fanon = 0;
    private final int is_mediawiki = 0;
    private final int is_wikipedia = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String language = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object min_abstract_length = null;
    private final int skip_abstract = 0;
    private final int skip_abstract_paren = 0;
    private final int skip_icon = 0;
    private final int skip_image_name = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String skip_qr = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String src_info = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String src_skip = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.character.repository.pojo.SrcOptionsX copy(@org.jetbrains.annotations.NotNull()
    java.lang.String directory, int is_fanon, int is_mediawiki, int is_wikipedia, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.Object min_abstract_length, int skip_abstract, int skip_abstract_paren, int skip_icon, int skip_image_name, @org.jetbrains.annotations.NotNull()
    java.lang.String skip_qr, @org.jetbrains.annotations.NotNull()
    java.lang.String src_info, @org.jetbrains.annotations.NotNull()
    java.lang.String src_skip) {
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
    
    public SrcOptionsX(@org.jetbrains.annotations.NotNull()
    java.lang.String directory, int is_fanon, int is_mediawiki, int is_wikipedia, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.Object min_abstract_length, int skip_abstract, int skip_abstract_paren, int skip_icon, int skip_image_name, @org.jetbrains.annotations.NotNull()
    java.lang.String skip_qr, @org.jetbrains.annotations.NotNull()
    java.lang.String src_info, @org.jetbrains.annotations.NotNull()
    java.lang.String src_skip) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDirectory() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int is_fanon() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int is_mediawiki() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int is_wikipedia() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMin_abstract_length() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getSkip_abstract() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getSkip_abstract_paren() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getSkip_icon() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getSkip_image_name() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSkip_qr() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSrc_info() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSrc_skip() {
        return null;
    }
}