package com.soundcloud.android.stations;

/* compiled from: StationsApi_Factory */
public final class Wb implements C4961HMa<Vb> {
    private final C7054oVa<efa> a;
    private final C7054oVa<dfa> b;

    public Wb(C7054oVa<efa> ova, C7054oVa<dfa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Wb a(C7054oVa<efa> ova, C7054oVa<dfa> ova2) {
        return new Wb(ova, ova2);
    }

    public Vb get() {
        return new Vb((efa) this.a.get(), (dfa) this.b.get());
    }
}
