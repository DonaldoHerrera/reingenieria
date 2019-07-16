package com.soundcloud.android.payments;

import android.content.SharedPreferences;

/* compiled from: TokenStorage_Factory */
public final class Na implements C4961HMa<Ma> {
    private final C7054oVa<SharedPreferences> a;

    public static Ma a(SharedPreferences sharedPreferences) {
        return new Ma(sharedPreferences);
    }

    public Ma get() {
        return new Ma((SharedPreferences) this.a.get());
    }
}
