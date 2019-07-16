package com.soundcloud.android.payments;

import android.content.res.Resources;

/* compiled from: ConversionView_Factory */
public final class N implements C4961HMa<H> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<Ba> b;

    public N(C7054oVa<Resources> ova, C7054oVa<Ba> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static N a(C7054oVa<Resources> ova, C7054oVa<Ba> ova2) {
        return new N(ova, ova2);
    }

    public H get() {
        return new H((Resources) this.a.get(), (Ba) this.b.get());
    }
}
