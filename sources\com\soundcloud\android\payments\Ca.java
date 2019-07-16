package com.soundcloud.android.payments;

import android.content.res.Resources;

/* compiled from: ProductInfoFormatter_Factory */
public final class Ca implements C4961HMa<Ba> {
    private final C7054oVa<Resources> a;

    public Ca(C7054oVa<Resources> ova) {
        this.a = ova;
    }

    public static Ca a(C7054oVa<Resources> ova) {
        return new Ca(ova);
    }

    public static Ba a(Resources resources) {
        return new Ba(resources);
    }

    public Ba get() {
        return new Ba((Resources) this.a.get());
    }
}
