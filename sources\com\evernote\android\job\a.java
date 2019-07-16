package com.evernote.android.job;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.evernote.android.job.gcm.b;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.List;

/* compiled from: GcmAvailableHelper */
final class a {
    private static final Dj a = new Dj("GcmAvailableHelper");
    private static final boolean b;
    private static int c = -1;
    private static boolean d;

    static {
        boolean z;
        try {
            Class.forName("com.google.android.gms.gcm.GcmNetworkManager");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        b = z;
    }

    public static boolean a(Context context) {
        try {
            if (!d) {
                d = true;
                a(context, b);
            }
            if (b && GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0 && b(context) == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int b(Context context) {
        if (c < 0) {
            synchronized (e.class) {
                if (c < 0) {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(context, a()));
                    if (!a(context.getPackageManager().queryIntentServices(intent, 0))) {
                        c = 1;
                        int i = c;
                        return i;
                    }
                    Intent intent2 = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
                    intent2.setPackage(context.getPackageName());
                    if (!a(context.getPackageManager().queryIntentServices(intent2, 0))) {
                        c = 1;
                        int i2 = c;
                        return i2;
                    }
                    c = 0;
                }
            }
        }
        return c;
    }

    private static boolean a(List<ResolveInfo> list) {
        if (list != null && !list.isEmpty()) {
            for (ResolveInfo resolveInfo : list) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    if ("com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE".equals(serviceInfo.permission) && resolveInfo.serviceInfo.exported) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void a(Context context, boolean z) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, a());
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            if (componentEnabledSetting != 0) {
                if (componentEnabledSetting != 1) {
                    if (componentEnabledSetting != 2) {
                        return;
                    }
                } else if (!z) {
                    packageManager.setComponentEnabledSetting(componentName, 2, 1);
                    a.c("GCM service disabled");
                    return;
                } else {
                    return;
                }
            }
            if (z) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                a.c("GCM service enabled");
            }
        } catch (Throwable unused) {
        }
    }

    private static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(b.class.getPackage().getName());
        sb.append(".PlatformGcmService");
        return sb.toString();
    }
}
