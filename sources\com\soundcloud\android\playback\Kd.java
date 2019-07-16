package com.soundcloud.android.playback;

/* compiled from: Observables.kt */
public final class Kd<T1, T2, R> implements C6504gQa<Ba, C3509cea, R> {
    final /* synthetic */ Jd a;

    public Kd(Jd jd) {
        this.a = jd;
    }

    public final R apply(Ba ba, C3509cea cea) {
        C3509cea cea2 = cea;
        Ba ba2 = ba;
        Jd jd = this.a;
        C7471uYa.a((Object) cea2, "track");
        C7471uYa.a((Object) ba2, "playStateEvent");
        return jd.b(cea2, ba2);
    }
}
