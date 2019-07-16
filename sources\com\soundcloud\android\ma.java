package com.soundcloud.android;

import android.content.SharedPreferences;

/* compiled from: RealNightModeConfiguration_Factory */
public final class ma implements C4961HMa<la> {
    private final C7054oVa<SharedPreferences> a;

    public ma(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static ma a(C7054oVa<SharedPreferences> ova) {
        return new ma(ova);
    }

    public la get() {
        return new la((SharedPreferences) this.a.get());
    }
}
