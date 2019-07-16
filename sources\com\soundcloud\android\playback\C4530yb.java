package com.soundcloud.android.playback;

import com.soundcloud.android.ads.Na;

/* renamed from: com.soundcloud.android.playback.yb reason: case insensitive filesystem */
/* compiled from: PlaybackAnalyticsController_Factory */
public final class C4530yb implements C4961HMa<C4525xb> {
    private final C7054oVa<Jd> a;
    private final C7054oVa<A> b;
    private final C7054oVa<C3814lca> c;
    private final C7054oVa<Na> d;

    public C4530yb(C7054oVa<Jd> ova, C7054oVa<A> ova2, C7054oVa<C3814lca> ova3, C7054oVa<Na> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C4530yb a(C7054oVa<Jd> ova, C7054oVa<A> ova2, C7054oVa<C3814lca> ova3, C7054oVa<Na> ova4) {
        return new C4530yb(ova, ova2, ova3, ova4);
    }

    public C4525xb get() {
        return new C4525xb((Jd) this.a.get(), (A) this.b.get(), (C3814lca) this.c.get(), (Na) this.d.get());
    }
}
