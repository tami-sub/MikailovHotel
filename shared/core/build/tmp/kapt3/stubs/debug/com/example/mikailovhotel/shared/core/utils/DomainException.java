package com.example.mikailovhotel.shared.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0006\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/DomainException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "BadRequestException", "ForbiddenException", "NotFoundException", "ServerErrorException", "UnauthorizedException", "UnknownException", "Lcom/example/mikailovhotel/shared/core/utils/DomainException$BadRequestException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException$ForbiddenException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException$NotFoundException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException$ServerErrorException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException$UnauthorizedException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException$UnknownException;", "core_debug"})
public abstract class DomainException extends java.lang.RuntimeException {
    
    private DomainException(java.lang.String message) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/DomainException$BadRequestException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class BadRequestException extends com.example.mikailovhotel.shared.core.utils.DomainException {
        
        public BadRequestException(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/DomainException$UnauthorizedException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class UnauthorizedException extends com.example.mikailovhotel.shared.core.utils.DomainException {
        
        public UnauthorizedException(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/DomainException$ForbiddenException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class ForbiddenException extends com.example.mikailovhotel.shared.core.utils.DomainException {
        
        public ForbiddenException(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/DomainException$ServerErrorException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class ServerErrorException extends com.example.mikailovhotel.shared.core.utils.DomainException {
        
        public ServerErrorException(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/DomainException$NotFoundException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class NotFoundException extends com.example.mikailovhotel.shared.core.utils.DomainException {
        
        public NotFoundException(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mikailovhotel/shared/core/utils/DomainException$UnknownException;", "Lcom/example/mikailovhotel/shared/core/utils/DomainException;", "message", "", "(Ljava/lang/String;)V", "core_debug"})
    public static final class UnknownException extends com.example.mikailovhotel.shared.core.utils.DomainException {
        
        public UnknownException(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super(null);
        }
    }
}