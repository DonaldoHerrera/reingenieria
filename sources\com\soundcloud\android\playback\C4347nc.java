package com.soundcloud.android.playback;

import com.soundcloud.android.ads.Yb;
import com.soundcloud.android.discovery.systemplaylist.E;
import com.soundcloud.android.foundation.playqueue.r;

/* renamed from: com.soundcloud.android.playback.nc reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider_Factory */
public final class C4347nc implements C4961HMa<C4302ec> {
    private final C7054oVa<r> a;
    private final C7054oVa<C4412qb> b;
    private final C7054oVa<C3814lca> c;
    private final C7054oVa<C4336lb> d;
    private final C7054oVa<Qb> e;
    private final C7054oVa<Fma> f;
    private final C7054oVa<Yb> g;
    private final C7054oVa<P> h;
    private final C7054oVa<C4416rb> i;
    private final C7054oVa<C4909Fra> j;
    private final C7054oVa<E> k;
    private final C7054oVa<HPa> l;

    public C4347nc(C7054oVa<r> ova, C7054oVa<C4412qb> ova2, C7054oVa<C3814lca> ova3, C7054oVa<C4336lb> ova4, C7054oVa<Qb> ova5, C7054oVa<Fma> ova6, C7054oVa<Yb> ova7, C7054oVa<P> ova8, C7054oVa<C4416rb> ova9, C7054oVa<C4909Fra> ova10, C7054oVa<E> ova11, C7054oVa<HPa> ova12) {
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
        this.l = ova12;
    }

    public static C4347nc a(C7054oVa<r> ova, C7054oVa<C4412qb> ova2, C7054oVa<C3814lca> ova3, C7054oVa<C4336lb> ova4, C7054oVa<Qb> ova5, C7054oVa<Fma> ova6, C7054oVa<Yb> ova7, C7054oVa<P> ova8, C7054oVa<C4416rb> ova9, C7054oVa<C4909Fra> ova10, C7054oVa<E> ova11, C7054oVa<HPa> ova12) {
        C4347nc ncVar = new C4347nc(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12);
        return ncVar;
    }

    public C4302ec get() {
        C4302ec ecVar = new C4302ec((r) this.a.get(), (C4412qb) this.b.get(), (C3814lca) this.c.get(), (C4336lb) this.d.get(), (Qb) this.e.get(), (Fma) this.f.get(), (Yb) this.g.get(), (P) this.h.get(), (C4416rb) this.i.get(), (C4909Fra) this.j.get(), (E) this.k.get(), (HPa) this.l.get());
        return ecVar;
    }
}
