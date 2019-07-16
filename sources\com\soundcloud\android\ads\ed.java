package com.soundcloud.android.ads;

import android.content.res.Resources;

/* compiled from: SponsoredSessionVideoView_Factory */
public final class ed implements C4961HMa<dd> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<Ga> b;

    public ed(C7054oVa<Resources> ova, C7054oVa<Ga> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static ed a(C7054oVa<Resources> ova, C7054oVa<Ga> ova2) {
        return new ed(ova, ova2);
    }

    public dd get() {
        return new dd((Resources) this.a.get(), (Ga) this.b.get());
    }
}
