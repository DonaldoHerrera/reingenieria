package com.soundcloud.android.tracks;

/* renamed from: com.soundcloud.android.tracks.n reason: case insensitive filesystem */
/* compiled from: DefaultFullTrackRepository_Factory */
public final class C6187n implements C4961HMa<C6184m> {
    private final C7054oVa<M> a;

    public C6187n(C7054oVa<M> ova) {
        this.a = ova;
    }

    public static C6187n a(C7054oVa<M> ova) {
        return new C6187n(ova);
    }

    public C6184m get() {
        return new C6184m((M) this.a.get());
    }
}
