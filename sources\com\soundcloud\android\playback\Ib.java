package com.soundcloud.android.playback;

/* compiled from: PlaybackInitiator_Factory */
public final class Ib implements C4961HMa<Db> {
    private final C7054oVa<C3814lca> a;
    private final C7054oVa<C4412qb> b;
    private final C7054oVa<C4336lb> c;
    private final C7054oVa<HPa> d;

    public Ib(C7054oVa<C3814lca> ova, C7054oVa<C4412qb> ova2, C7054oVa<C4336lb> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Ib a(C7054oVa<C3814lca> ova, C7054oVa<C4412qb> ova2, C7054oVa<C4336lb> ova3, C7054oVa<HPa> ova4) {
        return new Ib(ova, ova2, ova3, ova4);
    }

    public Db get() {
        return new Db((C3814lca) this.a.get(), (C4412qb) this.b.get(), (C4336lb) this.c.get(), (HPa) this.d.get());
    }
}
