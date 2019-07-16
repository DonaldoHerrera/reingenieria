package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: PlayerUpsellImpressionController_Factory */
public final class Ub implements C4961HMa<Tb> {
    private final C7054oVa<C3700b> a;

    public Ub(C7054oVa<C3700b> ova) {
        this.a = ova;
    }

    public static Ub a(C7054oVa<C3700b> ova) {
        return new Ub(ova);
    }

    public Tb get() {
        return new Tb((C3700b) this.a.get());
    }
}
