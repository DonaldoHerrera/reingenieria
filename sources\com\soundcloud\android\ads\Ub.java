package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: InlayAdOperations_Factory */
public final class Ub implements C4961HMa<Tb> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C3700b> b;
    private final C7054oVa<Yaa> c;
    private final C7054oVa<C2645ya> d;

    public Ub(C7054oVa<C5327TLa> ova, C7054oVa<C3700b> ova2, C7054oVa<Yaa> ova3, C7054oVa<C2645ya> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Ub a(C7054oVa<C5327TLa> ova, C7054oVa<C3700b> ova2, C7054oVa<Yaa> ova3, C7054oVa<C2645ya> ova4) {
        return new Ub(ova, ova2, ova3, ova4);
    }

    public Tb get() {
        return new Tb((C5327TLa) this.a.get(), (C3700b) this.b.get(), (Yaa) this.c.get(), C4930GMa.a(this.d));
    }
}
