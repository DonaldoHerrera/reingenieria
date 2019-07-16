package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.a;
import androidx.work.c;
import androidx.work.d;
import androidx.work.i;
import androidx.work.j;

/* compiled from: SystemJobInfoConverter */
class b {
    private static final String a = i.a("SystemJobInfoConverter");
    private final ComponentName b;

    b(Context context) {
        this.b = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* access modifiers changed from: 0000 */
    public JobInfo a(_e _eVar, int i) {
        c cVar = _eVar.l;
        int a2 = a(cVar.b());
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", _eVar.c);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", _eVar.d());
        Builder extras = new Builder(i, this.b).setRequiredNetworkType(a2).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        if (!cVar.h()) {
            extras.setBackoffCriteria(_eVar.o, _eVar.n == a.LINEAR ? 0 : 1);
        }
        extras.setMinimumLatency(Math.max(_eVar.a() - System.currentTimeMillis(), 0));
        if (VERSION.SDK_INT >= 24 && cVar.e()) {
            for (d.a a3 : cVar.a().a()) {
                extras.addTriggerContentUri(a(a3));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        return extras.build();
    }

    private static TriggerContentUri a(d.a aVar) {
        return new TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int a(j jVar) {
        int i = a.a[jVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (VERSION.SDK_INT >= 24) {
            return 3;
        }
        i.a().a(a, String.format("API version too low. Cannot convert network type value %s", new Object[]{jVar}), new Throwable[0]);
        return 1;
    }
}
