package com.soundcloud.android.search;

import android.content.res.Resources;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.search.history.A;

/* compiled from: SearchPresenter_Factory */
public final class D implements C4961HMa<C> {
    private final C7054oVa<C5922m> a;
    private final C7054oVa<Ja> b;
    private final C7054oVa<Resources> c;
    private final C7054oVa<C4801CHa> d;
    private final C7054oVa<C3700b> e;
    private final C7054oVa<F> f;
    private final C7054oVa<A> g;

    public static C a(Object obj, Ja ja, Resources resources, C4801CHa cHa, C3700b bVar, F f2, A a2) {
        C c2 = new C((C5922m) obj, ja, resources, cHa, bVar, f2, a2);
        return c2;
    }

    public C get() {
        C c2 = new C((C5922m) this.a.get(), (Ja) this.b.get(), (Resources) this.c.get(), (C4801CHa) this.d.get(), (C3700b) this.e.get(), (F) this.f.get(), (A) this.g.get());
        return c2;
    }
}
