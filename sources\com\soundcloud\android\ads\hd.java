package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: StreamAdsController_Factory */
public final class hd implements C4961HMa<gd> {
    private final C7054oVa<Na> a;
    private final C7054oVa<C3678e> b;
    private final C7054oVa<Tb> c;
    private final C7054oVa<Rb> d;
    private final C7054oVa<Ga> e;
    private final C7054oVa<C2645ya> f;
    private final C7054oVa<C2436_U> g;
    private final C7054oVa<C5694cGa> h;
    private final C7054oVa<C5327TLa> i;
    private final C7054oVa<C3700b> j;

    public hd(C7054oVa<Na> ova, C7054oVa<C3678e> ova2, C7054oVa<Tb> ova3, C7054oVa<Rb> ova4, C7054oVa<Ga> ova5, C7054oVa<C2645ya> ova6, C7054oVa<C2436_U> ova7, C7054oVa<C5694cGa> ova8, C7054oVa<C5327TLa> ova9, C7054oVa<C3700b> ova10) {
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
    }

    public static hd a(C7054oVa<Na> ova, C7054oVa<C3678e> ova2, C7054oVa<Tb> ova3, C7054oVa<Rb> ova4, C7054oVa<Ga> ova5, C7054oVa<C2645ya> ova6, C7054oVa<C2436_U> ova7, C7054oVa<C5694cGa> ova8, C7054oVa<C5327TLa> ova9, C7054oVa<C3700b> ova10) {
        hd hdVar = new hd(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10);
        return hdVar;
    }

    public gd get() {
        gd gdVar = new gd((Na) this.a.get(), (C3678e) this.b.get(), (Tb) this.c.get(), (Rb) this.d.get(), (Ga) this.e.get(), C4930GMa.a(this.f), (C2436_U) this.g.get(), (C5694cGa) this.h.get(), (C5327TLa) this.i.get(), (C3700b) this.j.get());
        return gdVar;
    }
}
