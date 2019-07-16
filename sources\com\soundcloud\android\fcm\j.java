package com.soundcloud.android.fcm;

import android.content.SharedPreferences;

/* compiled from: DefaultFcmStorage_Factory */
public final class j implements C4961HMa<i> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C7181qKa> b;

    public j(C7054oVa<SharedPreferences> ova, C7054oVa<C7181qKa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static j a(C7054oVa<SharedPreferences> ova, C7054oVa<C7181qKa> ova2) {
        return new j(ova, ova2);
    }

    public i get() {
        return new i((SharedPreferences) this.a.get(), (C7181qKa) this.b.get());
    }
}
