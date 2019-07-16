package com.soundcloud.android.stations;

/* compiled from: StartStationHandler_Factory */
public final class Ha implements C4961HMa<Ga> {
    private final C7054oVa<C4655rja> a;
    private final C7054oVa<C2014EO> b;

    public Ha(C7054oVa<C4655rja> ova, C7054oVa<C2014EO> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Ha a(C7054oVa<C4655rja> ova, C7054oVa<C2014EO> ova2) {
        return new Ha(ova, ova2);
    }

    public Ga get() {
        return new Ga((C4655rja) this.a.get(), (C2014EO) this.b.get());
    }
}
