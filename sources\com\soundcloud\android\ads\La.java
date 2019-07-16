package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.J;

/* compiled from: AdTimerHelper_Factory */
public final class La implements C4961HMa<Ia> {
    private final C7054oVa<C5694cGa> a;
    private final C7054oVa<J> b;

    public La(C7054oVa<C5694cGa> ova, C7054oVa<J> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static La a(C7054oVa<C5694cGa> ova, C7054oVa<J> ova2) {
        return new La(ova, ova2);
    }

    public Ia get() {
        return new Ia((C5694cGa) this.a.get(), (J) this.b.get());
    }
}
