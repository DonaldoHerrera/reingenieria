package com.soundcloud.android.offline;

import android.content.SharedPreferences;

/* compiled from: OfflineContentStorage_Factory */
public final class Hd implements C4961HMa<Gd> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<HPa> b;

    public Hd(C7054oVa<SharedPreferences> ova, C7054oVa<HPa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Hd a(C7054oVa<SharedPreferences> ova, C7054oVa<HPa> ova2) {
        return new Hd(ova, ova2);
    }

    public Gd get() {
        return new Gd((SharedPreferences) this.a.get(), (HPa) this.b.get());
    }
}
