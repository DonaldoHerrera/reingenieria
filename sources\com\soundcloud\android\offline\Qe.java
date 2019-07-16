package com.soundcloud.android.offline;

/* compiled from: TrackDownloadsStorage_Factory */
public final class Qe implements C4961HMa<De> {
    private final C7054oVa<C5694cGa> a;
    private final C7054oVa<Jd> b;

    public Qe(C7054oVa<C5694cGa> ova, C7054oVa<Jd> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Qe a(C7054oVa<C5694cGa> ova, C7054oVa<Jd> ova2) {
        return new Qe(ova, ova2);
    }

    public De get() {
        return new De((C5694cGa) this.a.get(), (Jd) this.b.get());
    }
}
