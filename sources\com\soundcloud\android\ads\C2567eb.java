package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.J;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.utilities.android.k;
import com.soundcloud.android.utilities.android.t;

/* renamed from: com.soundcloud.android.ads.eb reason: case insensitive filesystem */
/* compiled from: AdsOperations_Factory */
public final class C2567eb implements C4961HMa<Na> {
    private final C7054oVa<HPa> a;
    private final C7054oVa<C3814lca> b;
    private final C7054oVa<C2436_U> c;
    private final C7054oVa<efa> d;
    private final C7054oVa<C5327TLa> e;
    private final C7054oVa<C3700b> f;
    private final C7054oVa<Wb> g;
    private final C7054oVa<C5694cGa> h;
    private final C7054oVa<t> i;
    private final C7054oVa<J> j;
    private final C7054oVa<r> k;
    private final C7054oVa<k> l;

    public C2567eb(C7054oVa<HPa> ova, C7054oVa<C3814lca> ova2, C7054oVa<C2436_U> ova3, C7054oVa<efa> ova4, C7054oVa<C5327TLa> ova5, C7054oVa<C3700b> ova6, C7054oVa<Wb> ova7, C7054oVa<C5694cGa> ova8, C7054oVa<t> ova9, C7054oVa<J> ova10, C7054oVa<r> ova11, C7054oVa<k> ova12) {
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

    public static C2567eb a(C7054oVa<HPa> ova, C7054oVa<C3814lca> ova2, C7054oVa<C2436_U> ova3, C7054oVa<efa> ova4, C7054oVa<C5327TLa> ova5, C7054oVa<C3700b> ova6, C7054oVa<Wb> ova7, C7054oVa<C5694cGa> ova8, C7054oVa<t> ova9, C7054oVa<J> ova10, C7054oVa<r> ova11, C7054oVa<k> ova12) {
        C2567eb ebVar = new C2567eb(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12);
        return ebVar;
    }

    public Na get() {
        Na na = new Na((HPa) this.a.get(), (C3814lca) this.b.get(), (C2436_U) this.c.get(), (efa) this.d.get(), (C5327TLa) this.e.get(), (C3700b) this.f.get(), C4930GMa.a(this.g), (C5694cGa) this.h.get(), (t) this.i.get(), (J) this.j.get(), (r) this.k.get(), (k) this.l.get());
        return na;
    }
}
