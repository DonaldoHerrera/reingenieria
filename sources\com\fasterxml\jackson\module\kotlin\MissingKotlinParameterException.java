package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.Closeable;

@EVa(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/MissingKotlinParameterException;", "Lcom/fasterxml/jackson/databind/JsonMappingException;", "parameter", "Lkotlin/reflect/KParameter;", "processor", "Ljava/io/Closeable;", "msg", "", "(Lkotlin/reflect/KParameter;Ljava/io/Closeable;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getParameter", "()Lkotlin/reflect/KParameter;", "getProcessor", "()Ljava/io/Closeable;", "jackson-module-kotlin"}, mv = {1, 1, 9})
/* compiled from: Exceptions.kt */
public final class MissingKotlinParameterException extends JsonMappingException {
    private final String msg;
    private final CZa parameter;
    private final Closeable processor;

    public MissingKotlinParameterException(CZa cZa, Closeable closeable, String str) {
        C7471uYa.b(cZa, "parameter");
        C7471uYa.b(str, "msg");
        super(closeable, str);
        this.parameter = cZa;
        this.processor = closeable;
        this.msg = str;
    }
}
