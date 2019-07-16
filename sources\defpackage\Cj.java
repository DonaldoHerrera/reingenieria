package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.PowerManager;
import com.evernote.android.job.s.d;

/* renamed from: Cj reason: default package */
/* compiled from: Device */
public final class Cj {
    @TargetApi(17)
    public static C1905zj a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return C1905zj.a;
        }
        float intExtra = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = false;
        int intExtra2 = registerReceiver.getIntExtra("plugged", 0);
        if (intExtra2 == 1 || intExtra2 == 2 || (VERSION.SDK_INT >= 17 && intExtra2 == 4)) {
            z = true;
        }
        return new C1905zj(z, intExtra);
    }

    public static boolean a() {
        return false;
    }

    public static d b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                return d.ANY;
            }
            if (!C1628qb.a(connectivityManager)) {
                return d.UNMETERED;
            }
            if (a(connectivityManager, activeNetworkInfo)) {
                return d.CONNECTED;
            }
            return d.NOT_ROAMING;
        } catch (Throwable unused) {
            return d.ANY;
        }
    }

    public static boolean c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i >= 23) {
            if (!powerManager.isDeviceIdleMode() && powerManager.isInteractive()) {
                z = false;
            }
            return z;
        } else if (i >= 20) {
            return !powerManager.isInteractive();
        } else {
            return !powerManager.isScreenOn();
        }
    }

    private static boolean a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (VERSION.SDK_INT < 28) {
            return networkInfo.isRoaming();
        }
        try {
            return connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()).hasCapability(18);
        } catch (Exception unused) {
            return networkInfo.isRoaming();
        }
    }
}
