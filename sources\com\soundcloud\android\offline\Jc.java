package com.soundcloud.android.offline;

/* compiled from: OfflineContentCleanupHelper_Factory */
public final class Jc implements C4961HMa<Ic> {
    private final C7054oVa<Gd> a;

    public Jc(C7054oVa<Gd> ova) {
        this.a = ova;
    }

    public static Jc a(C7054oVa<Gd> ova) {
        return new Jc(ova);
    }

    public Ic get() {
        return new Ic((Gd) this.a.get());
    }
}
