package com.evernote.android.job;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import com.evernote.android.job.v14.PlatformAlarmReceiver;
import com.evernote.android.job.v14.PlatformAlarmService;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import com.evernote.android.job.v14.a;
import com.evernote.android.job.v21.PlatformJobService;
import com.evernote.android.job.work.b;
import java.util.List;

/* compiled from: JobApi */
public enum e {
    WORK_MANAGER(true, false, true),
    V_26(true, false, true),
    V_24(true, false, false),
    V_21(true, true, false),
    V_19(true, true, true),
    V_14(false, true, true),
    GCM(true, false, true);
    
    private volatile n i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    private e(boolean z, boolean z2, boolean z3) {
        this.j = z;
        this.k = z2;
        this.l = z3;
    }

    private n d(Context context) {
        switch (d.a[ordinal()]) {
            case 1:
                return new b(context);
            case 2:
                return new Oj(context);
            case 3:
                return new Mj(context);
            case 4:
                return new com.evernote.android.job.v21.b(context);
            case 5:
                return new Kj(context);
            case 6:
                return new a(context);
            case 7:
                return new com.evernote.android.job.gcm.b(context);
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    public synchronized void a() {
        this.i = null;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public synchronized n b(Context context) {
        if (this.i == null) {
            this.i = d(context);
        }
        return this.i;
    }

    public boolean c(Context context) {
        String str = "android.permission.BIND_JOB_SERVICE";
        boolean z = true;
        switch (d.a[ordinal()]) {
            case 1:
                return x.a();
            case 2:
                if (VERSION.SDK_INT < 26 || !b(context, PlatformJobService.class)) {
                    z = false;
                }
                return z;
            case 3:
                if (VERSION.SDK_INT < 24 || !a(context, PlatformJobService.class, str)) {
                    z = false;
                }
                return z;
            case 4:
                if (VERSION.SDK_INT < 21 || !a(context, PlatformJobService.class, str)) {
                    z = false;
                }
                return z;
            case 5:
                if (VERSION.SDK_INT < 19 || !b(context, PlatformAlarmService.class) || !a(context, PlatformAlarmReceiver.class)) {
                    z = false;
                }
                return z;
            case 6:
                if (!g.g() && (!b(context, PlatformAlarmService.class) || !b(context, PlatformAlarmServiceExact.class) || !a(context, PlatformAlarmReceiver.class))) {
                    z = false;
                }
                return z;
            case 7:
                try {
                    return a.a(context);
                } catch (Exception unused) {
                    return false;
                }
            default:
                throw new IllegalStateException("not implemented");
        }
    }

    private static boolean a(Context context, Class<? extends Service> cls, String str) {
        try {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(context, cls), 0);
            if (queryIntentServices != null) {
                if (!queryIntentServices.isEmpty()) {
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (resolveInfo.serviceInfo != null && str.equals(resolveInfo.serviceInfo.permission)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean b(Context context, Class<? extends Service> cls) {
        try {
            List queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(context, cls), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(Context context, Class<? extends BroadcastReceiver> cls) {
        try {
            List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent(context, cls), 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static e a(Context context) {
        if (WORK_MANAGER.c(context) && g.a(WORK_MANAGER)) {
            return WORK_MANAGER;
        }
        if (V_26.c(context) && g.a(V_26)) {
            return V_26;
        }
        if (V_24.c(context) && g.a(V_24)) {
            return V_24;
        }
        if (V_21.c(context) && g.a(V_21)) {
            return V_21;
        }
        if (GCM.c(context) && g.a(GCM)) {
            return GCM;
        }
        if (V_19.c(context) && g.a(V_19)) {
            return V_19;
        }
        if (g.a(V_14)) {
            return V_14;
        }
        throw new IllegalStateException("All supported APIs are disabled");
    }
}
