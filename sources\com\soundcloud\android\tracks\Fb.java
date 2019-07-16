package com.soundcloud.android.tracks;

/* compiled from: TrackStorageWriter_Factory */
public final class Fb implements C4961HMa<Eb> {
    private final C7054oVa<Ya> a;
    private final C7054oVa<WV> b;
    private final C7054oVa<C4643qga> c;
    private final C7054oVa<C5014JDa> d;
    private final C7054oVa<HPa> e;

    public Fb(C7054oVa<Ya> ova, C7054oVa<WV> ova2, C7054oVa<C4643qga> ova3, C7054oVa<C5014JDa> ova4, C7054oVa<HPa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static Fb a(C7054oVa<Ya> ova, C7054oVa<WV> ova2, C7054oVa<C4643qga> ova3, C7054oVa<C5014JDa> ova4, C7054oVa<HPa> ova5) {
        Fb fb = new Fb(ova, ova2, ova3, ova4, ova5);
        return fb;
    }

    public Eb get() {
        Eb eb = new Eb((Ya) this.a.get(), (WV) this.b.get(), (C4643qga) this.c.get(), (C5014JDa) this.d.get(), (HPa) this.e.get());
        return eb;
    }
}
