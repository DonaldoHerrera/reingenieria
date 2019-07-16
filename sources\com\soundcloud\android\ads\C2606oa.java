package com.soundcloud.android.ads;

import android.content.Context;

/* renamed from: com.soundcloud.android.ads.oa reason: case insensitive filesystem */
/* compiled from: AdIdHelper_Factory */
public final class C2606oa implements C4961HMa<C2594la> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C2595lb> b;
    private final C7054oVa<C7730yHa> c;
    private final C7054oVa<C7319sKa> d;
    private final C7054oVa<HPa> e;

    public C2606oa(C7054oVa<Context> ova, C7054oVa<C2595lb> ova2, C7054oVa<C7730yHa> ova3, C7054oVa<C7319sKa> ova4, C7054oVa<HPa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C2606oa a(C7054oVa<Context> ova, C7054oVa<C2595lb> ova2, C7054oVa<C7730yHa> ova3, C7054oVa<C7319sKa> ova4, C7054oVa<HPa> ova5) {
        C2606oa oaVar = new C2606oa(ova, ova2, ova3, ova4, ova5);
        return oaVar;
    }

    public C2594la get() {
        C2594la laVar = new C2594la((Context) this.a.get(), (C2595lb) this.b.get(), (C7730yHa) this.c.get(), (C7319sKa) this.d.get(), (HPa) this.e.get());
        return laVar;
    }
}
