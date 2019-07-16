package com.soundcloud.android.offline;

/* compiled from: OfflinePlaybackOperations_Factory */
public final class Wd implements C4961HMa<Vd> {
    private final C7054oVa<C2436_U> a;
    private final C7054oVa<De> b;
    private final C7054oVa<Se> c;

    public Wd(C7054oVa<C2436_U> ova, C7054oVa<De> ova2, C7054oVa<Se> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static Wd a(C7054oVa<C2436_U> ova, C7054oVa<De> ova2, C7054oVa<Se> ova3) {
        return new Wd(ova, ova2, ova3);
    }

    public Vd get() {
        return new Vd((C2436_U) this.a.get(), (De) this.b.get(), (Se) this.c.get());
    }
}
