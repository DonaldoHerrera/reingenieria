package com.soundcloud.android.tracks;

/* compiled from: TrackStorage_Factory */
public final class Gb implements C4961HMa<Ya> {
    private final C7054oVa<C4898FLa> a;
    private final C7054oVa<C1502mT> b;

    public Gb(C7054oVa<C4898FLa> ova, C7054oVa<C1502mT> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Gb a(C7054oVa<C4898FLa> ova, C7054oVa<C1502mT> ova2) {
        return new Gb(ova, ova2);
    }

    public Ya get() {
        return new Ya((C4898FLa) this.a.get(), (C1502mT) this.b.get());
    }
}
