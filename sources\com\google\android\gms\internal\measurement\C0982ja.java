package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.ja reason: case insensitive filesystem */
public class C0982ja {
    private static UserManager a;
    private static volatile boolean b = (!a());
    private static boolean c = false;

    private C0982ja() {
    }

    public static boolean a() {
        return VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    private static boolean b(Context context) {
        boolean z;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (a == null) {
                a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                    z = true;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                a = null;
                i++;
            }
        }
        if (z) {
            a = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @TargetApi(24)
    private static boolean c(Context context) {
        if (b) {
            return true;
        }
        synchronized (C0982ja.class) {
            if (b) {
                return true;
            }
            boolean b2 = b(context);
            if (b2) {
                b = b2;
            }
        }
    }

    public static boolean a(Context context) {
        return !a() || c(context);
    }
}
