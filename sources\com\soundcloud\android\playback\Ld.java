package com.soundcloud.android.playback;

import com.soundcloud.android.playback.C4298dd.a;

/* compiled from: Observables.kt */
public final class Ld<T1, T2, R> implements C6504gQa<HVa<? extends Ba, ? extends a>, C3509cea, R> {
    final /* synthetic */ Jd a;

    public Ld(Jd jd) {
        this.a = jd;
    }

    public final R apply(HVa<? extends Ba, ? extends a> hVa, C3509cea cea) {
        C3509cea cea2 = cea;
        HVa hVa2 = hVa;
        Jd jd = this.a;
        Ba ba = (Ba) hVa2.c();
        a aVar = (a) hVa2.d();
        C7471uYa.a((Object) cea2, "track");
        return jd.a(ba, aVar, cea2, this.a.c);
    }
}
