package com.soundcloud.android.offline;

import com.soundcloud.android.likes.C3989m;

/* compiled from: OfflineContentController_Factory */
public final class Nc implements C4961HMa<Mc> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C4088fe> b;
    private final C7054oVa<Yd> c;
    private final C7054oVa<C4197yd> d;
    private final C7054oVa<C3989m> e;
    private final C7054oVa<Qb> f;

    public Nc(C7054oVa<C5327TLa> ova, C7054oVa<C4088fe> ova2, C7054oVa<Yd> ova3, C7054oVa<C4197yd> ova4, C7054oVa<C3989m> ova5, C7054oVa<Qb> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static Nc a(C7054oVa<C5327TLa> ova, C7054oVa<C4088fe> ova2, C7054oVa<Yd> ova3, C7054oVa<C4197yd> ova4, C7054oVa<C3989m> ova5, C7054oVa<Qb> ova6) {
        Nc nc = new Nc(ova, ova2, ova3, ova4, ova5, ova6);
        return nc;
    }

    public Mc get() {
        Mc mc = new Mc((C5327TLa) this.a.get(), (C4088fe) this.b.get(), (Yd) this.c.get(), (C4197yd) this.d.get(), (C3989m) this.e.get(), (Qb) this.f.get());
        return mc;
    }
}
