package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.b;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.h;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.c;
import androidx.work.impl.utils.f;
import java.util.List;

/* compiled from: Schedulers */
public class e {
    private static final String a = i.a("Schedulers");

    public static void a(b bVar, WorkDatabase workDatabase, List<d> list) {
        if (list != null && list.size() != 0) {
            C0305af t = workDatabase.t();
            workDatabase.c();
            try {
                List<_e> a2 = t.a(bVar.c());
                if (a2 != null && a2.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (_e _eVar : a2) {
                        t.a(_eVar.c, currentTimeMillis);
                    }
                }
                workDatabase.m();
                if (a2 != null && a2.size() > 0) {
                    _e[] _eVarArr = (_e[]) a2.toArray(new _e[0]);
                    for (d a3 : list) {
                        a3.a(_eVarArr);
                    }
                }
            } finally {
                workDatabase.e();
            }
        }
    }

    @SuppressLint({"NewApi"})
    static d a(Context context, m mVar) {
        if (VERSION.SDK_INT >= 23) {
            c cVar = new c(context, mVar);
            f.a(context, SystemJobService.class, true);
            i.a().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return cVar;
        }
        d a2 = a(context);
        if (a2 != null) {
            return a2;
        }
        h hVar = new h(context);
        f.a(context, SystemAlarmService.class, true);
        i.a().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        return hVar;
    }

    private static d a(Context context) {
        try {
            d dVar = (d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            i.a().a(a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return dVar;
        } catch (Throwable th) {
            i.a().a(a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
