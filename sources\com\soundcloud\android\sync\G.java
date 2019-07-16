package com.soundcloud.android.sync;

import android.content.SharedPreferences;

/* compiled from: SyncCleanupAction */
public class G {
    private final la a;
    private final C6135s b;
    private final SharedPreferences c;
    private final SharedPreferences d;

    public G(la laVar, C6135s sVar, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.a = laVar;
        this.b = sVar;
        this.c = sharedPreferences;
        this.d = sharedPreferences2;
    }

    public void a() {
        this.b.a();
        this.a.a();
        this.c.edit().clear().apply();
        this.d.edit().clear().apply();
    }
}
