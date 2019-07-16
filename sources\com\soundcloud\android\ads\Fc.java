package com.soundcloud.android.ads;

import com.soundcloud.android.comments.Ea;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.r;

/* compiled from: PlayerAdsControllerProxy_Factory */
public final class Fc implements C4961HMa<C2568ec> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<Yb> b;
    private final C7054oVa<Hc> c;
    private final C7054oVa<Ea> d;
    private final C7054oVa<C2587jb> e;
    private final C7054oVa<r> f;
    private final C7054oVa<APa<J>> g;
    private final C7054oVa<C2630ub> h;

    public Fc(C7054oVa<C5327TLa> ova, C7054oVa<Yb> ova2, C7054oVa<Hc> ova3, C7054oVa<Ea> ova4, C7054oVa<C2587jb> ova5, C7054oVa<r> ova6, C7054oVa<APa<J>> ova7, C7054oVa<C2630ub> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static Fc a(C7054oVa<C5327TLa> ova, C7054oVa<Yb> ova2, C7054oVa<Hc> ova3, C7054oVa<Ea> ova4, C7054oVa<C2587jb> ova5, C7054oVa<r> ova6, C7054oVa<APa<J>> ova7, C7054oVa<C2630ub> ova8) {
        Fc fc = new Fc(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return fc;
    }

    public C2568ec get() {
        C2568ec ecVar = new C2568ec((C5327TLa) this.a.get(), C4930GMa.a(this.b), (Hc) this.c.get(), (Ea) this.d.get(), (C2587jb) this.e.get(), (r) this.f.get(), (APa) this.g.get(), (C2630ub) this.h.get());
        return ecVar;
    }
}
