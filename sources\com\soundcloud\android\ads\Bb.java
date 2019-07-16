package com.soundcloud.android.ads;

import android.content.Context;

/* compiled from: DefaultKruxSegmentProvider_Factory */
public final class Bb implements C4961HMa<Ab> {
    private final C7054oVa<Context> a;

    public Bb(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static Bb a(C7054oVa<Context> ova) {
        return new Bb(ova);
    }

    public Ab get() {
        return new Ab((Context) this.a.get());
    }
}
