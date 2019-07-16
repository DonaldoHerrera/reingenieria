package com.soundcloud.android.playback;

import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.playback.ui.view.g;

/* compiled from: ConcurrentPlaybackOperations_Factory */
public final class L implements C4961HMa<K> {
    private final C7054oVa<C4298dd> a;
    private final C7054oVa<C4412qb> b;
    private final C7054oVa<C4416rb> c;
    private final C7054oVa<C2732f> d;
    private final C7054oVa<g> e;

    public L(C7054oVa<C4298dd> ova, C7054oVa<C4412qb> ova2, C7054oVa<C4416rb> ova3, C7054oVa<C2732f> ova4, C7054oVa<g> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static L a(C7054oVa<C4298dd> ova, C7054oVa<C4412qb> ova2, C7054oVa<C4416rb> ova3, C7054oVa<C2732f> ova4, C7054oVa<g> ova5) {
        L l = new L(ova, ova2, ova3, ova4, ova5);
        return l;
    }

    public static K a(C4298dd ddVar, C4412qb qbVar, C4416rb rbVar, C2732f fVar, g gVar) {
        K k = new K(ddVar, qbVar, rbVar, fVar, gVar);
        return k;
    }

    public K get() {
        K k = new K((C4298dd) this.a.get(), (C4412qb) this.b.get(), (C4416rb) this.c.get(), (C2732f) this.d.get(), (g) this.e.get());
        return k;
    }
}
