package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: ErrorAdController_Factory */
public final class Db implements C4961HMa<Cb> {
    private final C7054oVa<C3700b> a;
    private final C7054oVa<Yaa> b;

    public Db(C7054oVa<C3700b> ova, C7054oVa<Yaa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Db a(C7054oVa<C3700b> ova, C7054oVa<Yaa> ova2) {
        return new Db(ova, ova2);
    }

    public Cb get() {
        return new Cb((C3700b) this.a.get(), (Yaa) this.b.get());
    }
}
