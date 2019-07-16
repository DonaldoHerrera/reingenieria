package com.soundcloud.android.fcm;

import android.content.SharedPreferences;

/* compiled from: DefaultFcmStorage */
public class i implements C3856qea {
    private final SharedPreferences a;
    private final C7181qKa b;

    public i(SharedPreferences sharedPreferences, C7181qKa qka) {
        this.a = sharedPreferences;
        this.b = qka;
    }

    private void d() {
        this.a.edit().remove("gcmToken").apply();
    }

    private boolean e() {
        return this.a.getBoolean("hasRegistered", false);
    }

    private boolean f() {
        return this.a.contains("gcmToken");
    }

    public void a(String str) {
        c(str);
        if (this.b.j()) {
            a(true);
        }
    }

    public void b(String str) {
        c(str);
        if (this.b.j()) {
            a(false);
        }
    }

    public boolean c() {
        if (this.b.j()) {
            if (!e()) {
                return true;
            }
        } else if (!f()) {
            return true;
        }
        return false;
    }

    private void c(String str) {
        this.a.edit().putString("gcmToken", str).apply();
    }

    private void a(boolean z) {
        this.a.edit().putBoolean("hasRegistered", z).apply();
    }

    public void b() {
        d();
        if (this.b.j()) {
            a(false);
        }
    }

    public String a() {
        return this.a.getString("gcmToken", null);
    }
}
