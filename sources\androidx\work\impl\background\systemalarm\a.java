package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.i;
import androidx.work.impl.m;
import androidx.work.impl.utils.e;

/* compiled from: Alarms */
class a {
    private static final String a = i.a("Alarms");

    public static void a(Context context, m mVar, String str, long j) {
        Re r = mVar.g().r();
        Qe a2 = r.a(str);
        if (a2 != null) {
            a(context, str, a2.b);
            a(context, str, a2.b, j);
            return;
        }
        int a3 = new e(context).a();
        r.a(new Qe(str, a3));
        a(context, str, a3, j);
    }

    public static void a(Context context, m mVar, String str) {
        Re r = mVar.g().r();
        Qe a2 = r.a(str);
        if (a2 != null) {
            a(context, str, a2.b);
            i.a().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            r.b(str);
        }
    }

    private static void a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.a(context, str), 536870912);
        if (service != null && alarmManager != null) {
            i.a().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    private static void a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.a(context, str), 1073741824);
        if (alarmManager == null) {
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
