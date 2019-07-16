package com.soundcloud.android.tracks;

/* compiled from: TracksVault_Factory */
public final class Kb implements C4961HMa<Hb> {
    private final C7054oVa<Ib> a;

    public Kb(C7054oVa<Ib> ova) {
        this.a = ova;
    }

    public static Kb a(C7054oVa<Ib> ova) {
        return new Kb(ova);
    }

    public Hb get() {
        return new Hb((Ib) this.a.get());
    }
}
