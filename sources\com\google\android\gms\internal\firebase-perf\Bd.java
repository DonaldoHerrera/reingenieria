package com.google.android.gms.internal.firebase-perf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;

public final class Bd<K, V> {
    private Object[] a;
    private int b;
    private boolean c;

    public Bd() {
        this(4);
    }

    private final void a(int i) {
        int i2 = i << 1;
        Object[] objArr = this.a;
        if (i2 > objArr.length) {
            this.a = Arrays.copyOf(objArr, vd.a(objArr.length, i2));
            this.c = false;
        }
    }

    Bd(int i) {
        this.a = new Object[(i * 2)];
        this.b = 0;
        this.c = false;
    }

    public final Bd<K, V> a(K k, V v) {
        a(this.b + 1);
        rd.a((Object) k, (Object) v);
        Object[] objArr = this.a;
        int i = this.b;
        objArr[i * 2] = k;
        objArr[(i * 2) + 1] = v;
        this.b = i + 1;
        return this;
    }

    public final Bd<K, V> a(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            a(this.b + ((Collection) iterable).size());
        }
        for (Entry entry : iterable) {
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final yd<K, V> a() {
        this.c = true;
        return Cd.a(this.b, this.a);
    }
}
