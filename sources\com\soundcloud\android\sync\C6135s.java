package com.soundcloud.android.sync;

import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.sync.s reason: case insensitive filesystem */
/* compiled from: EntitySyncStateStorage */
public class C6135s {
    private final SharedPreferences a;
    private final C5694cGa b;

    public C6135s(SharedPreferences sharedPreferences, C5694cGa cga) {
        this.a = sharedPreferences;
        this.b = cga;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.edit().clear().apply();
    }

    public void b(C3508cda cda) {
        this.a.edit().putLong(cda.toString(), this.b.a()).apply();
    }

    public long a(C3508cda cda) {
        return this.a.getLong(cda.toString(), -1);
    }
}
