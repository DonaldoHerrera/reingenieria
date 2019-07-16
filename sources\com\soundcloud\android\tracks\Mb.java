package com.soundcloud.android.tracks;

/* compiled from: VaultTrackRepository_Factory */
public final class Mb implements C4961HMa<Lb> {
    private final C7054oVa<Hb> a;

    public Mb(C7054oVa<Hb> ova) {
        this.a = ova;
    }

    public static Mb a(C7054oVa<Hb> ova) {
        return new Mb(ova);
    }

    public Lb get() {
        return new Lb((Hb) this.a.get());
    }
}
