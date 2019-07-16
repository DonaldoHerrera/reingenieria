package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import com.evernote.android.job.s;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
/* compiled from: TransientBundleCompat */
final class d {
    private static final Dj a = new Dj("TransientBundleCompat");

    public static void a(Context context, s sVar) {
        PendingIntent service = PendingIntent.getService(context, sVar.k(), PlatformAlarmServiceExact.a(context, sVar.k(), sVar.q()), 134217728);
        ((AlarmManager) context.getSystemService("alarm")).setExact(1, System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1000), service);
    }

    public static boolean b(Context context, s sVar) {
        PendingIntent service = PendingIntent.getService(context, sVar.k(), PlatformAlarmServiceExact.a(context, sVar.k(), null), 536870912);
        if (service == null) {
            return false;
        }
        try {
            a.c("Delegating transient job %s to API 14", sVar);
            service.send();
            if (!sVar.u()) {
                a(context, sVar.k(), service);
            }
            return true;
        } catch (CanceledException e) {
            a.a((Throwable) e);
            return false;
        }
    }

    public static boolean a(Context context, int i) {
        return PendingIntent.getService(context, i, PlatformAlarmServiceExact.a(context, i, null), 536870912) != null;
    }

    public static void a(Context context, int i, PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            try {
                pendingIntent = PendingIntent.getService(context, i, PlatformAlarmServiceExact.a(context, i, null), 536870912);
                if (pendingIntent == null) {
                    return;
                }
            } catch (Exception e) {
                a.a((Throwable) e);
            }
        }
        ((AlarmManager) context.getSystemService("alarm")).cancel(pendingIntent);
        pendingIntent.cancel();
    }
}
