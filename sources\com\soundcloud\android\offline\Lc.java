package com.soundcloud.android.offline;

/* compiled from: OfflineContentClearer_Factory */
public final class Lc implements C4961HMa<Kc> {
    private final C7054oVa<Gd> a;
    private final C7054oVa<C4088fe> b;

    public Lc(C7054oVa<Gd> ova, C7054oVa<C4088fe> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Lc a(C7054oVa<Gd> ova, C7054oVa<C4088fe> ova2) {
        return new Lc(ova, ova2);
    }

    public Kc get() {
        return new Kc((Gd) this.a.get(), (C4088fe) this.b.get());
    }
}
