package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.sync.ca;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.ba reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedOperations_Factory */
public final class C2802ba implements C4961HMa<J> {
    private final C7054oVa<Ga> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<ca> c;
    private final C7054oVa<C2805d> d;
    private final C7054oVa<C5141NFa> e;
    private final C7054oVa<C4785Bra> f;
    private final C7054oVa<Vda> g;
    private final C7054oVa<Ica> h;

    public C2802ba(C7054oVa<Ga> ova, C7054oVa<HPa> ova2, C7054oVa<ca> ova3, C7054oVa<C2805d> ova4, C7054oVa<C5141NFa> ova5, C7054oVa<C4785Bra> ova6, C7054oVa<Vda> ova7, C7054oVa<Ica> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static C2802ba a(C7054oVa<Ga> ova, C7054oVa<HPa> ova2, C7054oVa<ca> ova3, C7054oVa<C2805d> ova4, C7054oVa<C5141NFa> ova5, C7054oVa<C4785Bra> ova6, C7054oVa<Vda> ova7, C7054oVa<Ica> ova8) {
        C2802ba baVar = new C2802ba(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return baVar;
    }

    public J get() {
        J j = new J((Ga) this.a.get(), (HPa) this.b.get(), (ca) this.c.get(), (C2805d) this.d.get(), (C5141NFa) this.e.get(), (C4785Bra) this.f.get(), (Vda) this.g.get(), (Ica) this.h.get());
        return j;
    }
}
