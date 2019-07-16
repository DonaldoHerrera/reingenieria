package com.soundcloud.android.sync;

import android.content.SharedPreferences;

/* compiled from: SyncStateStorage */
public class la {
    private final SharedPreferences a;
    private final C5694cGa b;

    public la(SharedPreferences sharedPreferences, C5694cGa cga) {
        this.a = sharedPreferences;
        this.b = cga;
    }

    private long b(String str) {
        return this.a.getLong(str, -1);
    }

    private String g(na naVar) {
        return String.format("%s_misses", new Object[]{naVar.name()});
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.edit().clear().apply();
    }

    public boolean c(na naVar) {
        return a(naVar.name());
    }

    /* access modifiers changed from: 0000 */
    public void d(na naVar) {
        this.a.edit().putInt(g(naVar), b(naVar) + 1).apply();
    }

    public void e(na naVar) {
        this.a.edit().putInt(g(naVar), 0).apply();
    }

    public void f(na naVar) {
        this.a.edit().putLong(naVar.name(), this.b.a()).apply();
    }

    public void a(na naVar) {
        this.a.edit().remove(naVar.name()).apply();
    }

    /* access modifiers changed from: 0000 */
    public int b(na naVar) {
        return this.a.getInt(g(naVar), 0);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(na naVar, long j) {
        return a(naVar.name(), j);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str, long j) {
        return b(str) >= this.b.a() - j;
    }

    public boolean a(String str) {
        return this.a.getLong(str, -1) != -1;
    }
}
