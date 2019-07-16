package com.soundcloud.android.tracks;

/* compiled from: TrackStorageReader_Factory */
public final class xb implements C4961HMa<wb> {
    private final C7054oVa<Ya> a;

    public xb(C7054oVa<Ya> ova) {
        this.a = ova;
    }

    public static xb a(C7054oVa<Ya> ova) {
        return new xb(ova);
    }

    public wb get() {
        return new wb((Ya) this.a.get());
    }
}
