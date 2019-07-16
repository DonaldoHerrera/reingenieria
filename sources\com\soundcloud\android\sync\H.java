package com.soundcloud.android.sync;

import android.content.SharedPreferences;

/* compiled from: SyncCleanupAction_Factory */
public final class H implements C4961HMa<G> {
    private final C7054oVa<la> a;
    private final C7054oVa<C6135s> b;
    private final C7054oVa<SharedPreferences> c;
    private final C7054oVa<SharedPreferences> d;

    public H(C7054oVa<la> ova, C7054oVa<C6135s> ova2, C7054oVa<SharedPreferences> ova3, C7054oVa<SharedPreferences> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static H a(C7054oVa<la> ova, C7054oVa<C6135s> ova2, C7054oVa<SharedPreferences> ova3, C7054oVa<SharedPreferences> ova4) {
        return new H(ova, ova2, ova3, ova4);
    }

    public G get() {
        return new G((la) this.a.get(), (C6135s) this.b.get(), (SharedPreferences) this.c.get(), (SharedPreferences) this.d.get());
    }
}
