package com.soundcloud.android.tracks;

/* compiled from: FullTrackStorageReader_Factory */
public final class L implements C4961HMa<K> {
    private final C7054oVa<Ya> a;

    public L(C7054oVa<Ya> ova) {
        this.a = ova;
    }

    public static L a(C7054oVa<Ya> ova) {
        return new L(ova);
    }

    public K get() {
        return new K((Ya) this.a.get());
    }
}
