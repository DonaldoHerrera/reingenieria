package com.soundcloud.android.playback;

/* compiled from: Observables.kt */
public final class Md<T1, T2, R> implements C6504gQa<HVa<? extends Ba, ? extends C4519wc>, C3509cea, R> {
    final /* synthetic */ Jd a;

    public Md(Jd jd) {
        this.a = jd;
    }

    public final R apply(HVa<? extends Ba, ? extends C4519wc> hVa, C3509cea cea) {
        C3509cea cea2 = cea;
        HVa hVa2 = hVa;
        Jd jd = this.a;
        C7471uYa.a((Object) cea2, "track");
        return jd.a(cea2, (Ba) hVa2.c(), (C4519wc) hVa2.d());
    }
}
