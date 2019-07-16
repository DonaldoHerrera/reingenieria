package com.soundcloud.android.ads.data;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: VideoAdStorage_Factory */
public final class u implements C4961HMa<t> {
    private final C7054oVa<C6699jHa> a;
    private final C7054oVa<v> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<C3469VY> d;

    public u(C7054oVa<C6699jHa> ova, C7054oVa<v> ova2, C7054oVa<C3700b> ova3, C7054oVa<C3469VY> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static u a(C7054oVa<C6699jHa> ova, C7054oVa<v> ova2, C7054oVa<C3700b> ova3, C7054oVa<C3469VY> ova4) {
        return new u(ova, ova2, ova3, ova4);
    }

    public t get() {
        return new t((C6699jHa) this.a.get(), (v) this.b.get(), (C3700b) this.c.get(), (C3469VY) this.d.get());
    }
}
