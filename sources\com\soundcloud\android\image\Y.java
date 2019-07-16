package com.soundcloud.android.image;

/* compiled from: ImageUrlBuilder_Factory */
public final class Y implements C4961HMa<X> {
    private final C7054oVa<C2961dP> a;

    public Y(C7054oVa<C2961dP> ova) {
        this.a = ova;
    }

    public static Y a(C7054oVa<C2961dP> ova) {
        return new Y(ova);
    }

    public X get() {
        return new X((C2961dP) this.a.get());
    }
}
