package com.soundcloud.android.collection;

import com.soundcloud.android.collection.playhistory.Z;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.stations.Ga;

/* compiled from: CollectionPresenter_Factory */
public final class va implements C4961HMa<ua> {
    private final C7054oVa<H> a;
    private final C7054oVa<E> b;
    private final C7054oVa<Z> c;
    private final C7054oVa<C4425ta> d;
    private final C7054oVa<C2746fa> e;
    private final C7054oVa<C4655rja> f;
    private final C7054oVa<Ga> g;
    private final C7054oVa<C3700b> h;
    private final C7054oVa<HPa> i;

    public va(C7054oVa<H> ova, C7054oVa<E> ova2, C7054oVa<Z> ova3, C7054oVa<C4425ta> ova4, C7054oVa<C2746fa> ova5, C7054oVa<C4655rja> ova6, C7054oVa<Ga> ova7, C7054oVa<C3700b> ova8, C7054oVa<HPa> ova9) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
    }

    public static va a(C7054oVa<H> ova, C7054oVa<E> ova2, C7054oVa<Z> ova3, C7054oVa<C4425ta> ova4, C7054oVa<C2746fa> ova5, C7054oVa<C4655rja> ova6, C7054oVa<Ga> ova7, C7054oVa<C3700b> ova8, C7054oVa<HPa> ova9) {
        va vaVar = new va(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9);
        return vaVar;
    }

    public ua get() {
        ua uaVar = new ua((H) this.a.get(), (E) this.b.get(), (Z) this.c.get(), (C4425ta) this.d.get(), (C2746fa) this.e.get(), (C4655rja) this.f.get(), (Ga) this.g.get(), (C3700b) this.h.get(), (HPa) this.i.get());
        return uaVar;
    }
}
