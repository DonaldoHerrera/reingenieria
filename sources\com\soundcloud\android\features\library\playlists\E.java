package com.soundcloud.android.features.library.playlists;

import com.soundcloud.android.collection.C2746fa;
import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: PlaylistCollectionPresenter_Factory */
public final class E implements C4961HMa<D> {
    private final C7054oVa<C2287SS> a;
    private final C7054oVa<C2746fa> b;
    private final C7054oVa<C4655rja> c;
    private final C7054oVa<C3700b> d;
    private final C7054oVa<C3636m> e;
    private final C7054oVa<HPa> f;
    private final C7054oVa<C5606ava> g;

    public E(C7054oVa<C2287SS> ova, C7054oVa<C2746fa> ova2, C7054oVa<C4655rja> ova3, C7054oVa<C3700b> ova4, C7054oVa<C3636m> ova5, C7054oVa<HPa> ova6, C7054oVa<C5606ava> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static E a(C7054oVa<C2287SS> ova, C7054oVa<C2746fa> ova2, C7054oVa<C4655rja> ova3, C7054oVa<C3700b> ova4, C7054oVa<C3636m> ova5, C7054oVa<HPa> ova6, C7054oVa<C5606ava> ova7) {
        E e2 = new E(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return e2;
    }

    public D get() {
        D d2 = new D((C2287SS) this.a.get(), (C2746fa) this.b.get(), (C4655rja) this.c.get(), (C3700b) this.d.get(), (C3636m) this.e.get(), (HPa) this.f.get(), (C5606ava) this.g.get());
        return d2;
    }
}
