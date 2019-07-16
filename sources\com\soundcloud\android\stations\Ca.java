package com.soundcloud.android.stations;

/* compiled from: LikedStationsSyncProvider_Factory */
public final class Ca implements C4961HMa<Ba> {
    private final C7054oVa<Da> a;
    private final C7054oVa<kc> b;

    public Ca(C7054oVa<Da> ova, C7054oVa<kc> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Ca a(C7054oVa<Da> ova, C7054oVa<kc> ova2) {
        return new Ca(ova, ova2);
    }

    public Ba get() {
        return new Ba(this.a, (kc) this.b.get());
    }
}
