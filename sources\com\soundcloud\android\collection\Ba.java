package com.soundcloud.android.collection;

import com.soundcloud.android.properties.a;
import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.la;

/* compiled from: CollectionSyncer_Factory */
public final class Ba implements C4961HMa<Aa> {
    private final C7054oVa<a> a;
    private final C7054oVa<ca> b;
    private final C7054oVa<la> c;
    private final C7054oVa<T> d;
    private final C7054oVa<C5606ava> e;
    private final C7054oVa<Ica> f;

    public Ba(C7054oVa<a> ova, C7054oVa<ca> ova2, C7054oVa<la> ova3, C7054oVa<T> ova4, C7054oVa<C5606ava> ova5, C7054oVa<Ica> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static Ba a(C7054oVa<a> ova, C7054oVa<ca> ova2, C7054oVa<la> ova3, C7054oVa<T> ova4, C7054oVa<C5606ava> ova5, C7054oVa<Ica> ova6) {
        Ba ba = new Ba(ova, ova2, ova3, ova4, ova5, ova6);
        return ba;
    }

    public Aa get() {
        Aa aa = new Aa((a) this.a.get(), (ca) this.b.get(), (la) this.c.get(), (T) this.d.get(), (C5606ava) this.e.get(), (Ica) this.f.get());
        return aa;
    }
}
