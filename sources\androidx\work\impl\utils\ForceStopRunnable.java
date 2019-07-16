package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.c;
import androidx.work.impl.e;
import androidx.work.impl.m;
import androidx.work.q.a;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {
    private static final String a = i.a("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final m d;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = i.a("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    i.a().d(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                    ForceStopRunnable.b(context);
                }
            }
        }
    }

    public ForceStopRunnable(Context context, m mVar) {
        this.c = context.getApplicationContext();
        this.d = mVar;
    }

    public boolean a() {
        if (VERSION.SDK_INT >= 23) {
            c.b(this.c);
        }
        WorkDatabase g = this.d.g();
        C0305af t = g.t();
        g.c();
        try {
            List<_e> c2 = t.c();
            boolean z = c2 != null && !c2.isEmpty();
            if (z) {
                for (_e _eVar : c2) {
                    t.a(a.ENQUEUED, _eVar.c);
                    t.a(_eVar.c, -1);
                }
            }
            g.m();
            return z;
        } finally {
            g.e();
        }
    }

    public boolean b() {
        if (a(this.c, 536870912) != null) {
            return false;
        }
        b(this.c);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.d.d().a();
    }

    public void run() {
        i.a().a(a, "Performing cleanup operations.", new Throwable[0]);
        boolean a2 = a();
        if (c()) {
            i.a().a(a, "Rescheduling Workers.", new Throwable[0]);
            this.d.j();
            this.d.d().a(false);
        } else if (b()) {
            i.a().a(a, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.d.j();
        } else if (a2) {
            i.a().a(a, "Found unfinished work, scheduling it.", new Throwable[0]);
            e.a(this.d.c(), this.d.g(), this.d.f());
        }
        this.d.i();
    }

    static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a2 = a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager == null) {
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, a2);
        } else {
            alarmManager.set(0, currentTimeMillis, a2);
        }
    }

    private static PendingIntent a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, a(context), i);
    }

    static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }
}
