package com.soundcloud.android.sync;

import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.sync.t reason: case insensitive filesystem */
/* compiled from: EntitySyncStateStorage_Factory */
public final class C6136t implements C4961HMa<C6135s> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C5694cGa> b;

    public C6136t(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6136t a(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        return new C6136t(ova, ova2);
    }

    public C6135s get() {
        return new C6135s((SharedPreferences) this.a.get(), (C5694cGa) this.b.get());
    }
}
