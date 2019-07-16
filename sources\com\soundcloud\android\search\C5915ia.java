package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.playback.Db;

/* renamed from: com.soundcloud.android.search.ia reason: case insensitive filesystem */
/* compiled from: SearchResultsPresenter_Factory */
public final class C5915ia implements C4961HMa<C5903ha> {
    private final C7054oVa<C5933s> a;
    private final C7054oVa<Ja> b;
    private final C7054oVa<F> c;
    private final C7054oVa<Db> d;
    private final C7054oVa<C2390YL> e;
    private final C7054oVa<C3240rR> f;
    private final C7054oVa<HPa> g;

    public C5915ia(C7054oVa<C5933s> ova, C7054oVa<Ja> ova2, C7054oVa<F> ova3, C7054oVa<Db> ova4, C7054oVa<C2390YL> ova5, C7054oVa<C3240rR> ova6, C7054oVa<HPa> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static C5915ia a(C7054oVa<C5933s> ova, C7054oVa<Ja> ova2, C7054oVa<F> ova3, C7054oVa<Db> ova4, C7054oVa<C2390YL> ova5, C7054oVa<C3240rR> ova6, C7054oVa<HPa> ova7) {
        C5915ia iaVar = new C5915ia(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return iaVar;
    }

    public C5903ha get() {
        C5903ha haVar = new C5903ha((C5933s) this.a.get(), (Ja) this.b.get(), (F) this.c.get(), (Db) this.d.get(), (C2390YL) this.e.get(), (C3240rR) this.f.get(), (HPa) this.g.get());
        return haVar;
    }
}
