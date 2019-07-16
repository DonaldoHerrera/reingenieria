package com.soundcloud.android.playback;

import com.soundcloud.android.properties.a;

/* compiled from: PlaybackKits_Factory */
public final class Yb implements C4961HMa<Xb> {
    private final C7054oVa<Yla> a;
    private final C7054oVa<a> b;

    public Yb(C7054oVa<Yla> ova, C7054oVa<a> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Yb a(C7054oVa<Yla> ova, C7054oVa<a> ova2) {
        return new Yb(ova, ova2);
    }

    public Xb get() {
        return new Xb((Yla) this.a.get(), (a) this.b.get());
    }
}
