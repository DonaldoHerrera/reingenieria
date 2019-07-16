package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public abstract class Ea<T> implements Serializable {
    Ea() {
    }

    public static <T> Ea<T> a(T t) {
        Ha.a(t);
        return new Ga(t);
    }

    public static <T> Ea<T> c() {
        return Ca.a;
    }

    public abstract T a();

    public abstract boolean b();
}
