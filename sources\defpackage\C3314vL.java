package defpackage;

import android.content.SharedPreferences;

/* renamed from: vL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsSettingMigration.kt */
public final class C3314vL implements C5040Jxa {
    private final SharedPreferences a;
    private final C3129mM b;

    public C3314vL(SharedPreferences sharedPreferences, C3129mM mMVar) {
        C7471uYa.b(sharedPreferences, "sharedPreferences");
        C7471uYa.b(mMVar, "privacySettingsOperations");
        this.a = sharedPreferences;
        this.b = mMVar;
    }

    public void a() {
        if (!this.a.getBoolean("analytics_enabled", true)) {
            this.b.a(false).c(new C4943Gua());
        }
    }
}
