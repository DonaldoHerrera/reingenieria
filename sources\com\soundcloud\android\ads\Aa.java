package com.soundcloud.android.ads;

import com.soundcloud.android.playback.A;

/* compiled from: AdPlayerAnalyticsController_Factory */
public final class Aa implements C4961HMa<C2649za> {
    private final C7054oVa<A> a;

    public Aa(C7054oVa<A> ova) {
        this.a = ova;
    }

    public static Aa a(C7054oVa<A> ova) {
        return new Aa(ova);
    }

    public C2649za get() {
        return new C2649za((A) this.a.get());
    }
}
