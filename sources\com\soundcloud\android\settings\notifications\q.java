package com.soundcloud.android.settings.notifications;

import android.content.SharedPreferences;

/* compiled from: NotificationPreferencesStorage_Factory */
public final class q implements C4961HMa<p> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C5694cGa> b;

    public q(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static q a(C7054oVa<SharedPreferences> ova, C7054oVa<C5694cGa> ova2) {
        return new q(ova, ova2);
    }

    public p get() {
        return new p((SharedPreferences) this.a.get(), (C5694cGa) this.b.get());
    }
}
