package com.soundcloud.android.comments;

/* compiled from: TrackCommentRepository_Factory */
public final class Cb implements C4961HMa<mb> {
    private final C7054oVa<gb> a;
    private final C7054oVa<C2878cb> b;

    public Cb(C7054oVa<gb> ova, C7054oVa<C2878cb> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Cb a(C7054oVa<gb> ova, C7054oVa<C2878cb> ova2) {
        return new Cb(ova, ova2);
    }

    public mb get() {
        return new mb((gb) this.a.get(), (C2878cb) this.b.get());
    }
}
