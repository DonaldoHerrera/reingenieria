package com.soundcloud.android.features.library;

import com.soundcloud.android.collection.C2746fa;
import com.soundcloud.android.collection.E;
import com.soundcloud.android.collection.H;
import com.soundcloud.android.collection.playhistory.Z;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.stations.Ga;

/* compiled from: LibraryPresenter_Factory */
public final class U implements C4961HMa<T> {
    private final C7054oVa<H> a;
    private final C7054oVa<E> b;
    private final C7054oVa<Z> c;
    private final C7054oVa<C2746fa> d;
    private final C7054oVa<C4655rja> e;
    private final C7054oVa<Ga> f;
    private final C7054oVa<C3700b> g;
    private final C7054oVa<C5606ava> h;
    private final C7054oVa<HPa> i;
    private final C7054oVa<Ica> j;
    private final C7054oVa<C2436_U> k;

    public U(C7054oVa<H> ova, C7054oVa<E> ova2, C7054oVa<Z> ova3, C7054oVa<C2746fa> ova4, C7054oVa<C4655rja> ova5, C7054oVa<Ga> ova6, C7054oVa<C3700b> ova7, C7054oVa<C5606ava> ova8, C7054oVa<HPa> ova9, C7054oVa<Ica> ova10, C7054oVa<C2436_U> ova11) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
        this.j = ova10;
        this.k = ova11;
    }

    public static U a(C7054oVa<H> ova, C7054oVa<E> ova2, C7054oVa<Z> ova3, C7054oVa<C2746fa> ova4, C7054oVa<C4655rja> ova5, C7054oVa<Ga> ova6, C7054oVa<C3700b> ova7, C7054oVa<C5606ava> ova8, C7054oVa<HPa> ova9, C7054oVa<Ica> ova10, C7054oVa<C2436_U> ova11) {
        U u = new U(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11);
        return u;
    }

    public T get() {
        T t = new T((H) this.a.get(), (E) this.b.get(), (Z) this.c.get(), (C2746fa) this.d.get(), (C4655rja) this.e.get(), (Ga) this.f.get(), (C3700b) this.g.get(), (C5606ava) this.h.get(), (HPa) this.i.get(), (Ica) this.j.get(), (C2436_U) this.k.get());
        return t;
    }
}
