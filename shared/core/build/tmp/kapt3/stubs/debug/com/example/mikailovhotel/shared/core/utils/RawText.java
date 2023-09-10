package com.example.mikailovhotel.shared.core.utils;

import java.lang.System;

/**
 * Raw text, another words TextWithout mask characters
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/RawText;", "", "()V", "<set-?>", "", "text", "getText", "()Ljava/lang/String;", "addToString", "", "newString", "start", "maxLength", "charAt", "", "position", "length", "subtractFromString", "", "range", "Lcom/example/mikailovhotel/shared/core/utils/Range;", "core_debug"})
public final class RawText {
    @org.jetbrains.annotations.NotNull
    private java.lang.String text = "";
    
    public RawText() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return null;
    }
    
    /**
     * text = 012345678, range = 123 =&gt; text = 0456789
     * @param range given range
     */
    public final void subtractFromString(@org.jetbrains.annotations.NotNull
    com.example.mikailovhotel.shared.core.utils.Range range) {
    }
    
    /**
     * @param newString New String to be added
     * @param start Position to insert newString
     * @param maxLength Maximum raw text length
     * @return Number of added characters
     */
    public final int addToString(@org.jetbrains.annotations.Nullable
    java.lang.String newString, int start, int maxLength) {
        return 0;
    }
    
    public final int length() {
        return 0;
    }
    
    public final char charAt(int position) {
        return '\u0000';
    }
}