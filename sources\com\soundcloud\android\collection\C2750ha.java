package com.soundcloud.android.collection;

import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.collection.ha reason: case insensitive filesystem */
/* compiled from: CollectionOptionsStorage_Factory */
public final class C2750ha implements C4961HMa<C2746fa> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C2040FU> b;
    private final C7054oVa<Aca> c;

    public C2750ha(C7054oVa<SharedPreferences> ova, C7054oVa<C2040FU> ova2, C7054oVa<Aca> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2750ha a(C7054oVa<SharedPreferences> ova, C7054oVa<C2040FU> ova2, C7054oVa<Aca> ova3) {
        return new C2750ha(ova, ova2, ova3);
    }

    public C2746fa get() {
        return new C2746fa((SharedPreferences) this.a.get(), (C2040FU) this.b.get(), (Aca) this.c.get());
    }
}
