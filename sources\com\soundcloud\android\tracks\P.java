package com.soundcloud.android.tracks;

/* compiled from: FullTracksVault_Factory */
public final class P implements C4961HMa<M> {
    private final C7054oVa<N> a;

    public P(C7054oVa<N> ova) {
        this.a = ova;
    }

    public static P a(C7054oVa<N> ova) {
        return new P(ova);
    }

    public M get() {
        return new M((N) this.a.get());
    }
}
