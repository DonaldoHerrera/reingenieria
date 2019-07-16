package com.soundcloud.android.tracks;

/* compiled from: LegacyTrackWriter_Factory */
public final class U implements C4961HMa<T> {
    private final C7054oVa<C5014JDa> a;
    private final C7054oVa<Ya> b;

    public U(C7054oVa<C5014JDa> ova, C7054oVa<Ya> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static U a(C7054oVa<C5014JDa> ova, C7054oVa<Ya> ova2) {
        return new U(ova, ova2);
    }

    public T get() {
        return new T((C5014JDa) this.a.get(), (Ya) this.b.get());
    }
}
