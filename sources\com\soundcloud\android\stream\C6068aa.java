package com.soundcloud.android.stream;

import com.soundcloud.android.sync.ca;
import com.soundcloud.android.upsell.a;

/* renamed from: com.soundcloud.android.stream.aa reason: case insensitive filesystem */
/* compiled from: StreamDataSource_Factory */
public final class C6068aa implements C4961HMa<Z> {
    private final C7054oVa<lb> a;
    private final C7054oVa<ca> b;
    private final C7054oVa<C6106u> c;
    private final C7054oVa<HPa> d;
    private final C7054oVa<a> e;
    private final C7054oVa<Aca> f;
    private final C7054oVa<C5604aua> g;

    public C6068aa(C7054oVa<lb> ova, C7054oVa<ca> ova2, C7054oVa<C6106u> ova3, C7054oVa<HPa> ova4, C7054oVa<a> ova5, C7054oVa<Aca> ova6, C7054oVa<C5604aua> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static C6068aa a(C7054oVa<lb> ova, C7054oVa<ca> ova2, C7054oVa<C6106u> ova3, C7054oVa<HPa> ova4, C7054oVa<a> ova5, C7054oVa<Aca> ova6, C7054oVa<C5604aua> ova7) {
        C6068aa aaVar = new C6068aa(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return aaVar;
    }

    public Z get() {
        Z z = new Z((lb) this.a.get(), (ca) this.b.get(), (C6106u) this.c.get(), (HPa) this.d.get(), (a) this.e.get(), (Aca) this.f.get(), (C5604aua) this.g.get());
        return z;
    }
}
