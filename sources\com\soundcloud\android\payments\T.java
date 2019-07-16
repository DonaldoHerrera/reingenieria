package com.soundcloud.android.payments;

import android.content.res.Resources;

/* compiled from: LegacyConversionView_Factory */
public final class T implements C4961HMa<S> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<Ba> b;

    public T(C7054oVa<Resources> ova, C7054oVa<Ba> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static T a(C7054oVa<Resources> ova, C7054oVa<Ba> ova2) {
        return new T(ova, ova2);
    }

    public static S a(Resources resources, Ba ba) {
        return new S(resources, ba);
    }

    public S get() {
        return new S((Resources) this.a.get(), (Ba) this.b.get());
    }
}
