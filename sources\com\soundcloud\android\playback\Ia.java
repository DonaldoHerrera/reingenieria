package com.soundcloud.android.playback;

/* compiled from: MediaControllerCallback_Factory */
public final class Ia implements C4961HMa<Ha> {
    private final C7054oVa<C4350oa> a;
    private final C7054oVa<Wa> b;
    private final C7054oVa<C3469VY> c;

    public Ia(C7054oVa<C4350oa> ova, C7054oVa<Wa> ova2, C7054oVa<C3469VY> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static Ia a(C7054oVa<C4350oa> ova, C7054oVa<Wa> ova2, C7054oVa<C3469VY> ova3) {
        return new Ia(ova, ova2, ova3);
    }

    public Ha get() {
        return new Ha((C4350oa) this.a.get(), (Wa) this.b.get(), (C3469VY) this.c.get());
    }
}
