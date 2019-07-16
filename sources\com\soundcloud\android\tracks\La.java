package com.soundcloud.android.tracks;

/* compiled from: TrackNetworkFetcher_Factory */
public final class La implements C4961HMa<Ja> {
    private final C7054oVa<efa> a;
    private final C7054oVa<C4643qga> b;
    private final C7054oVa<HPa> c;

    public La(C7054oVa<efa> ova, C7054oVa<C4643qga> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static La a(C7054oVa<efa> ova, C7054oVa<C4643qga> ova2, C7054oVa<HPa> ova3) {
        return new La(ova, ova2, ova3);
    }

    public Ja get() {
        return new Ja((efa) this.a.get(), (C4643qga) this.b.get(), (HPa) this.c.get());
    }
}
