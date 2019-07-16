package com.soundcloud.android.playback;

/* compiled from: CurrentPlayQueueItemProvider_Factory */
public final class Q implements C4961HMa<P> {
    private final C7054oVa<C3814lca> a;

    public Q(C7054oVa<C3814lca> ova) {
        this.a = ova;
    }

    public static Q a(C7054oVa<C3814lca> ova) {
        return new Q(ova);
    }

    public P get() {
        return new P((C3814lca) this.a.get());
    }
}
