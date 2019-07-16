package com.soundcloud.android.ads;

import com.soundcloud.android.image.N;

/* compiled from: VisualPrestitialView_Factory */
public final class nd implements C4961HMa<md> {
    private final C7054oVa<N> a;

    public nd(C7054oVa<N> ova) {
        this.a = ova;
    }

    public static nd a(C7054oVa<N> ova) {
        return new nd(ova);
    }

    public md get() {
        return new md((N) this.a.get());
    }
}
