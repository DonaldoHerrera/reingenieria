package com.soundcloud.android.payments;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: LegacyConversionPresenter_Factory */
public final class Q implements C4961HMa<P> {
    private final C7054oVa<_a> a;
    private final C7054oVa<S> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<C2436_U> d;

    public Q(C7054oVa<_a> ova, C7054oVa<S> ova2, C7054oVa<C3700b> ova3, C7054oVa<C2436_U> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Q a(C7054oVa<_a> ova, C7054oVa<S> ova2, C7054oVa<C3700b> ova3, C7054oVa<C2436_U> ova4) {
        return new Q(ova, ova2, ova3, ova4);
    }

    public P get() {
        return new P((_a) this.a.get(), (S) this.b.get(), (C3700b) this.c.get(), (C2436_U) this.d.get());
    }
}
