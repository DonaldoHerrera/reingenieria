package com.soundcloud.android.ads;

/* compiled from: InlayAdHelperFactory_Factory */
public final class Sb implements C4961HMa<Rb> {
    private final C7054oVa<C5694cGa> a;
    private final C7054oVa<C5327TLa> b;

    public Sb(C7054oVa<C5694cGa> ova, C7054oVa<C5327TLa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Sb a(C7054oVa<C5694cGa> ova, C7054oVa<C5327TLa> ova2) {
        return new Sb(ova, ova2);
    }

    public Rb get() {
        return new Rb(this.a, this.b);
    }
}
