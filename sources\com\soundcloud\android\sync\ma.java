package com.soundcloud.android.sync;

import android.content.SharedPreferences;

/* compiled from: SyncStateStorage_Factory */
public final class ma implements C4961HMa<la> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C5694cGa> b;

    public ma(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static ma a(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        return new ma(ova, ova2);
    }

    public la get() {
        return new la((SharedPreferences) this.a.get(), (C5694cGa) this.b.get());
    }
}
