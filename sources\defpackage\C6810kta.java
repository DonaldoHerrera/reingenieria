package defpackage;

import android.content.SharedPreferences;

/* renamed from: kta reason: default package and case insensitive filesystem */
/* compiled from: PolicySettingsStorage */
public class C6810kta {
    private final SharedPreferences a;

    public C6810kta(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public void a(long j) {
        this.a.edit().putLong("last_policy_check_time", j).apply();
    }

    public long a() {
        return this.a.getLong("last_policy_check_time", -1);
    }
}
