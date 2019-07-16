package com.soundcloud.android.ads;

import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.ads.gb reason: case insensitive filesystem */
/* compiled from: AdsStorage_Factory */
public final class C2575gb implements C4961HMa<C2571fb> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C5694cGa> b;

    public C2575gb(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2575gb a(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        return new C2575gb(ova, ova2);
    }

    public C2571fb get() {
        return new C2571fb((SharedPreferences) this.a.get(), (C5694cGa) this.b.get());
    }
}
