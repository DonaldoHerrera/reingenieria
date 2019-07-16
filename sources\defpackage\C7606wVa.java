package defpackage;

import java.io.Serializable;

/* renamed from: wVa reason: default package and case insensitive filesystem */
/* compiled from: Lazy.kt */
public final class C7606wVa<T> implements C7744yVa<T>, Serializable {
    private final T a;

    public C7606wVa(T t) {
        this.a = t;
    }

    public T getValue() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
