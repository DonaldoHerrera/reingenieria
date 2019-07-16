package com.soundcloud.android.stations;

/* compiled from: StationModule_ProvideStationStorageFactory */
public final class Eb implements C4961HMa<kc> {
    private final C7054oVa<C5694cGa> a;
    private final C7054oVa<Ia> b;

    public Eb(C7054oVa<C5694cGa> ova, C7054oVa<Ia> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Eb a(C7054oVa<C5694cGa> ova, C7054oVa<Ia> ova2) {
        return new Eb(ova, ova2);
    }

    public static kc a(C5694cGa cga, Ia ia) {
        kc a2 = Db.a(cga, ia);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public kc get() {
        return a((C5694cGa) this.a.get(), (Ia) this.b.get());
    }
}
