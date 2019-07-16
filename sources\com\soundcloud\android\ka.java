package com.soundcloud.android;

import android.content.res.Resources;

/* compiled from: RealAppConfiguration_Factory */
public final class ka implements C4961HMa<ja> {
    private final C7054oVa<Resources> a;

    public ka(C7054oVa<Resources> ova) {
        this.a = ova;
    }

    public static ka a(C7054oVa<Resources> ova) {
        return new ka(ova);
    }

    public ja get() {
        return new ja((Resources) this.a.get());
    }
}
