package defpackage;

import android.content.SharedPreferences;

/* renamed from: dU reason: default package and case insensitive filesystem */
/* compiled from: DeviceManagementStorage */
public class C2965dU {
    private final SharedPreferences a;

    public C2965dU(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public void a() {
        this.a.edit().putBoolean("device_conflict", false).apply();
    }

    public boolean b() {
        return this.a.getBoolean("device_conflict", false);
    }

    public void c() {
        this.a.edit().putBoolean("device_conflict", true).apply();
    }
}
