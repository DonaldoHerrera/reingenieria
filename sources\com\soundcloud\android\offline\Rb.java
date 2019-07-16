package com.soundcloud.android.offline;

/* compiled from: DownloadLogger_Factory */
public final class Rb implements C4961HMa<Qb> {
    private final C7054oVa<C3469VY> a;

    public Rb(C7054oVa<C3469VY> ova) {
        this.a = ova;
    }

    public static Rb a(C7054oVa<C3469VY> ova) {
        return new Rb(ova);
    }

    public Qb get() {
        return new Qb((C3469VY) this.a.get());
    }
}
