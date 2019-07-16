package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.clearcut.b reason: case insensitive filesystem */
public class C0739b {
    private static volatile UserManager a;
    private static volatile boolean b = (!a());

    private C0739b() {
    }

    private static boolean a() {
        return VERSION.SDK_INT >= 24;
    }

    public static boolean a(Context context) {
        return a() && !b(context);
    }

    @TargetApi(24)
    private static boolean b(Context context) {
        boolean z = b;
        if (!z) {
            UserManager userManager = a;
            if (userManager == null) {
                synchronized (C0739b.class) {
                    userManager = a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        a = userManager2;
                        if (userManager2 == null) {
                            b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                }
            }
            z = userManager.isUserUnlocked();
            b = z;
            if (z) {
                a = null;
            }
        }
        return z;
    }
}
