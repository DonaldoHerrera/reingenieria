package com.soundcloud.android.stations;

/* compiled from: BriteStationStorage_Factory */
public final class Q implements C4961HMa<B> {
    private final C7054oVa<Ia> a;
    private final C7054oVa<C5694cGa> b;

    public Q(C7054oVa<Ia> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Q a(C7054oVa<Ia> ova, C7054oVa<C5694cGa> ova2) {
        return new Q(ova, ova2);
    }

    public B get() {
        return new B((Ia) this.a.get(), (C5694cGa) this.b.get());
    }
}
