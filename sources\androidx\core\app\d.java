package androidx.core.app;

import android.app.ActivityManager;
import android.os.Build.VERSION;

/* compiled from: ActivityManagerCompat */
public final class d {
    public static boolean a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
