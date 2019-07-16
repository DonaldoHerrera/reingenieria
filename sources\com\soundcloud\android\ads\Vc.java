package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.C4416rb;

/* compiled from: PrestitialAdsController_Factory */
public final class Vc implements C4961HMa<PrestitialAdsController> {
    private final C7054oVa<Yb> a;
    private final C7054oVa<gd> b;
    private final C7054oVa<Na> c;
    private final C7054oVa<C4416rb> d;
    private final C7054oVa<C4655rja> e;
    private final C7054oVa<C2571fb> f;
    private final C7054oVa<C3700b> g;

    public Vc(C7054oVa<Yb> ova, C7054oVa<gd> ova2, C7054oVa<Na> ova3, C7054oVa<C4416rb> ova4, C7054oVa<C4655rja> ova5, C7054oVa<C2571fb> ova6, C7054oVa<C3700b> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static Vc a(C7054oVa<Yb> ova, C7054oVa<gd> ova2, C7054oVa<Na> ova3, C7054oVa<C4416rb> ova4, C7054oVa<C4655rja> ova5, C7054oVa<C2571fb> ova6, C7054oVa<C3700b> ova7) {
        Vc vc = new Vc(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return vc;
    }

    public PrestitialAdsController get() {
        PrestitialAdsController prestitialAdsController = new PrestitialAdsController((Yb) this.a.get(), (gd) this.b.get(), (Na) this.c.get(), (C4416rb) this.d.get(), (C4655rja) this.e.get(), (C2571fb) this.f.get(), (C3700b) this.g.get());
        return prestitialAdsController;
    }
}
