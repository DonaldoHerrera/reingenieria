package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.Ub;
import com.soundcloud.android.playback.ke;

/* compiled from: AdPlayer_Factory */
public final class Ea implements C4961HMa<C2645ya> {
    private final C7054oVa<C4685uma> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<C3678e> c;
    private final C7054oVa<C2649za> d;
    private final C7054oVa<Ga> e;
    private final C7054oVa<Yaa> f;
    private final C7054oVa<C4412qb> g;
    private final C7054oVa<C5694cGa> h;
    private final C7054oVa<Ub> i;
    private final C7054oVa<ke> j;
    private final C7054oVa<C3700b> k;

    public Ea(C7054oVa<C4685uma> ova, C7054oVa<C5327TLa> ova2, C7054oVa<C3678e> ova3, C7054oVa<C2649za> ova4, C7054oVa<Ga> ova5, C7054oVa<Yaa> ova6, C7054oVa<C4412qb> ova7, C7054oVa<C5694cGa> ova8, C7054oVa<Ub> ova9, C7054oVa<ke> ova10, C7054oVa<C3700b> ova11) {
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
    }

    public static Ea a(C7054oVa<C4685uma> ova, C7054oVa<C5327TLa> ova2, C7054oVa<C3678e> ova3, C7054oVa<C2649za> ova4, C7054oVa<Ga> ova5, C7054oVa<Yaa> ova6, C7054oVa<C4412qb> ova7, C7054oVa<C5694cGa> ova8, C7054oVa<Ub> ova9, C7054oVa<ke> ova10, C7054oVa<C3700b> ova11) {
        Ea ea = new Ea(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11);
        return ea;
    }

    public C2645ya get() {
        C2645ya yaVar = new C2645ya((C4685uma) this.a.get(), (C5327TLa) this.b.get(), (C3678e) this.c.get(), (C2649za) this.d.get(), (Ga) this.e.get(), (Yaa) this.f.get(), (C4412qb) this.g.get(), (C5694cGa) this.h.get(), (Ub) this.i.get(), (ke) this.j.get(), (C3700b) this.k.get());
        return yaVar;
    }
}
