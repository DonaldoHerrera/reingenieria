package com.soundcloud.android.offline;

/* compiled from: OfflineAuditor_Factory */
public final class Fc implements C4961HMa<Ec> {
    private final C7054oVa<Vb> a;
    private final C7054oVa<C3469VY> b;

    public Fc(C7054oVa<Vb> ova, C7054oVa<C3469VY> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Fc a(C7054oVa<Vb> ova, C7054oVa<C3469VY> ova2) {
        return new Fc(ova, ova2);
    }

    public Ec get() {
        return new Ec((Vb) this.a.get(), (C3469VY) this.b.get());
    }
}
