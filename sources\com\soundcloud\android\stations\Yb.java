package com.soundcloud.android.stations;

/* compiled from: StationsCleanupHelper_Factory */
public final class Yb implements C4961HMa<Xb> {
    private final C7054oVa<B> a;

    public Yb(C7054oVa<B> ova) {
        this.a = ova;
    }

    public static Yb a(C7054oVa<B> ova) {
        return new Yb(ova);
    }

    public Xb get() {
        return new Xb((B) this.a.get());
    }
}
