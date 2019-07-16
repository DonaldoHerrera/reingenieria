package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.Db;

/* compiled from: TrackLikesSearchPresenter_Factory */
public final class L implements C4961HMa<K> {
    private final C7054oVa<Db> a;
    private final C7054oVa<C4425ta> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<HPa> d;
    private final C7054oVa<C3614j> e;

    public L(C7054oVa<Db> ova, C7054oVa<C4425ta> ova2, C7054oVa<C3700b> ova3, C7054oVa<HPa> ova4, C7054oVa<C3614j> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static L a(C7054oVa<Db> ova, C7054oVa<C4425ta> ova2, C7054oVa<C3700b> ova3, C7054oVa<HPa> ova4, C7054oVa<C3614j> ova5) {
        L l = new L(ova, ova2, ova3, ova4, ova5);
        return l;
    }

    public K get() {
        K k = new K((Db) this.a.get(), (C4425ta) this.b.get(), (C3700b) this.c.get(), (HPa) this.d.get(), (C3614j) this.e.get());
        return k;
    }
}
