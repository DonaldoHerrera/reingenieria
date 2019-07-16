package com.soundcloud.android.payments;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: RelaunchConversionPresenter_Factory */
public final class Ka implements C4961HMa<Ga> {
    private final C7054oVa<_a> a;
    private final C7054oVa<H> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<C2436_U> d;
    private final C7054oVa<C4655rja> e;
    private final C7054oVa<HPa> f;

    public Ka(C7054oVa<_a> ova, C7054oVa<H> ova2, C7054oVa<C3700b> ova3, C7054oVa<C2436_U> ova4, C7054oVa<C4655rja> ova5, C7054oVa<HPa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static Ka a(C7054oVa<_a> ova, C7054oVa<H> ova2, C7054oVa<C3700b> ova3, C7054oVa<C2436_U> ova4, C7054oVa<C4655rja> ova5, C7054oVa<HPa> ova6) {
        Ka ka = new Ka(ova, ova2, ova3, ova4, ova5, ova6);
        return ka;
    }

    public Ga get() {
        Ga ga = new Ga((_a) this.a.get(), (H) this.b.get(), (C3700b) this.c.get(), (C2436_U) this.d.get(), (C4655rja) this.e.get(), (HPa) this.f.get());
        return ga;
    }
}
