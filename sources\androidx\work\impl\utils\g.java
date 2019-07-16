package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: Preferences */
public class g {
    private Context a;
    private SharedPreferences b;

    public g(Context context) {
        this.a = context;
    }

    private SharedPreferences b() {
        SharedPreferences sharedPreferences;
        synchronized (g.class) {
            if (this.b == null) {
                this.b = this.a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.b;
        }
        return sharedPreferences;
    }

    public boolean a() {
        return b().getBoolean("reschedule_needed", false);
    }

    public void a(boolean z) {
        b().edit().putBoolean("reschedule_needed", z).apply();
    }
}
