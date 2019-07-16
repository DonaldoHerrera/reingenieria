package com.soundcloud.android;

import android.content.SharedPreferences;

@EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/RealNightModeConfiguration;", "Lcom/soundcloud/appconfig/NightModeConfiguration;", "sharedPrefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "nightMode", "getNightMode", "()I", "setNightMode", "(I)V", "clear", "", "Companion", "application_release"}, mv = {1, 1, 15})
/* compiled from: RealNightModeConfiguration.kt */
public final class la implements C7250rKa {
    public static final a a = new a(null);
    private final SharedPreferences b;

    /* compiled from: RealNightModeConfiguration.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public la(SharedPreferences sharedPreferences) {
        C7471uYa.b(sharedPreferences, "sharedPrefs");
        this.b = sharedPreferences;
    }

    public int a() {
        return this.b.getInt("night_mode_int", 1);
    }

    public void clear() {
        this.b.edit().clear().apply();
    }

    public void a(int i) {
        this.b.edit().putInt("night_mode_int", i).apply();
    }
}
