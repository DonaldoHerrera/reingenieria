package com.soundcloud.android.playback;

import com.soundcloud.android.ads.Yb;

/* compiled from: PlaybackAnalyticsPublisher_Factory */
public final class Bb implements C4961HMa<Ab> {
    private final C7054oVa<C4525xb> a;
    private final C7054oVa<ee> b;
    private final C7054oVa<Yb> c;
    private final C7054oVa<C4421sb> d;
    private final C7054oVa<C5628bIa> e;

    public Bb(C7054oVa<C4525xb> ova, C7054oVa<ee> ova2, C7054oVa<Yb> ova3, C7054oVa<C4421sb> ova4, C7054oVa<C5628bIa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static Bb a(C7054oVa<C4525xb> ova, C7054oVa<ee> ova2, C7054oVa<Yb> ova3, C7054oVa<C4421sb> ova4, C7054oVa<C5628bIa> ova5) {
        Bb bb = new Bb(ova, ova2, ova3, ova4, ova5);
        return bb;
    }

    public Ab get() {
        Ab ab = new Ab((C4525xb) this.a.get(), (ee) this.b.get(), (Yb) this.c.get(), (C4421sb) this.d.get(), (C5628bIa) this.e.get());
        return ab;
    }
}
