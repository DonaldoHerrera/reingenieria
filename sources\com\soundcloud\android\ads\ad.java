package com.soundcloud.android.ads;

import android.content.SharedPreferences;

/* compiled from: PromotedImpressionsStorage_Factory */
public final class ad implements C4961HMa<_c> {
    private final C7054oVa<SharedPreferences> a;

    public ad(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static ad a(C7054oVa<SharedPreferences> ova) {
        return new ad(ova);
    }

    public _c get() {
        return new _c((SharedPreferences) this.a.get());
    }
}
