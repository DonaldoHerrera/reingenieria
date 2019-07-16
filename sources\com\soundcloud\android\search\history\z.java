package com.soundcloud.android.search.history;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;

/* compiled from: SearchHistoryPresenter_Factory */
public final class z implements C4961HMa<y> {
    private final C7054oVa<A> a;
    private final C7054oVa<C3700b> b;
    private final C7054oVa<F> c;
    private final C7054oVa<HPa> d;

    public z(C7054oVa<A> ova, C7054oVa<C3700b> ova2, C7054oVa<F> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static z a(C7054oVa<A> ova, C7054oVa<C3700b> ova2, C7054oVa<F> ova3, C7054oVa<HPa> ova4) {
        return new z(ova, ova2, ova3, ova4);
    }

    public y get() {
        return new y((A) this.a.get(), (C3700b) this.b.get(), (F) this.c.get(), (HPa) this.d.get());
    }
}
