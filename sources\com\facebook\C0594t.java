package com.facebook;

/* renamed from: com.facebook.t reason: case insensitive filesystem */
/* compiled from: FacebookException */
public class C0594t extends RuntimeException {
    public C0594t() {
    }

    public String toString() {
        return getMessage();
    }

    public C0594t(String str) {
        super(str);
    }

    public C0594t(String str, Object... objArr) {
        this(String.format(str, objArr));
    }

    public C0594t(String str, Throwable th) {
        super(str, th);
    }

    public C0594t(Throwable th) {
        super(th);
    }
}
