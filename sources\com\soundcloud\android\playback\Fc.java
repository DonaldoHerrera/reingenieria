package com.soundcloud.android.playback;

/* compiled from: PlayerCacheFactory_Factory */
public final class Fc implements C4961HMa<Ec> {
    private final C7054oVa<C6291dHa> a;

    public Fc(C7054oVa<C6291dHa> ova) {
        this.a = ova;
    }

    public static Fc a(C7054oVa<C6291dHa> ova) {
        return new Fc(ova);
    }

    public Ec get() {
        return new Ec((C6291dHa) this.a.get());
    }
}
