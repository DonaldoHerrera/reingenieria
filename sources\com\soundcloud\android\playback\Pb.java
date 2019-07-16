package com.soundcloud.android.playback;

/* compiled from: PlaybackItemFactory_Factory */
public final class Pb implements C4961HMa<Jb> {
    private final C7054oVa<C4527xd> a;
    private final C7054oVa<ie> b;
    private final C7054oVa<ke> c;
    private final C7054oVa<C3284tV> d;

    public Pb(C7054oVa<C4527xd> ova, C7054oVa<ie> ova2, C7054oVa<ke> ova3, C7054oVa<C3284tV> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Pb a(C7054oVa<C4527xd> ova, C7054oVa<ie> ova2, C7054oVa<ke> ova3, C7054oVa<C3284tV> ova4) {
        return new Pb(ova, ova2, ova3, ova4);
    }

    public Jb get() {
        return new Jb((C4527xd) this.a.get(), (ie) this.b.get(), (ke) this.c.get(), (C3284tV) this.d.get());
    }
}
