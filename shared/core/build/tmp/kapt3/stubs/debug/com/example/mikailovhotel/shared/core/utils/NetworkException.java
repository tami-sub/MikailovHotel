package com.example.mikailovhotel.shared.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/NetworkException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "IOException", "TimeoutException", "Lcom/example/mikailovhotel/shared/core/utils/NetworkException$IOException;", "Lcom/example/mikailovhotel/shared/core/utils/NetworkException$TimeoutException;", "core_debug"})
public abstract class NetworkException extends java.lang.RuntimeException {
    
    private NetworkException(java.lang.String message) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/NetworkException$IOException;", "Lcom/example/mikailovhotel/shared/core/utils/NetworkException;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class IOException extends com.example.mikailovhotel.shared.core.utils.NetworkException {
        
        public IOException(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/NetworkException$TimeoutException;", "Lcom/example/mikailovhotel/shared/core/utils/NetworkException;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class TimeoutException extends com.example.mikailovhotel.shared.core.utils.NetworkException {
        
        public TimeoutException(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super(null);
        }
    }
}