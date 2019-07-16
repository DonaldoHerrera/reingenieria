package com.soundcloud.android.upsell;

import android.content.SharedPreferences;

/* compiled from: InlineUpsellStorage_Factory */
public final class d implements C4961HMa<c> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C5694cGa> b;

    public d(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static d a(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        return new d(ova, ova2);
    }

    public c get() {
        return new c((SharedPreferences) this.a.get(), (C5694cGa) this.b.get());
    }
}
