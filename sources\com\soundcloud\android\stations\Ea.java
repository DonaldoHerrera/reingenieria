package com.soundcloud.android.stations;

/* compiled from: LikedStationsSyncer_Factory */
public final class Ea implements C4961HMa<Da> {
    private final C7054oVa<Vb> a;
    private final C7054oVa<kc> b;

    public Ea(C7054oVa<Vb> ova, C7054oVa<kc> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Ea a(C7054oVa<Vb> ova, C7054oVa<kc> ova2) {
        return new Ea(ova, ova2);
    }

    public Da get() {
        return new Da((Vb) this.a.get(), (kc) this.b.get());
    }
}
