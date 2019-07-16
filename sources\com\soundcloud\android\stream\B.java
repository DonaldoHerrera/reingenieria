package com.soundcloud.android.stream;

import android.content.res.Resources;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.image.N;

/* compiled from: StreamCardViewPresenter_Factory */
public final class B implements C4961HMa<A> {
    private final C7054oVa<C3700b> a;
    private final C7054oVa<F> b;
    private final C7054oVa<Resources> c;
    private final C7054oVa<N> d;
    private final C7054oVa<C4655rja> e;

    public static A a(C3700b bVar, F f, Resources resources, N n, C4655rja rja) {
        A a2 = new A(bVar, f, resources, n, rja);
        return a2;
    }

    public A get() {
        A a2 = new A((C3700b) this.a.get(), (F) this.b.get(), (Resources) this.c.get(), (N) this.d.get(), (C4655rja) this.e.get());
        return a2;
    }
}
