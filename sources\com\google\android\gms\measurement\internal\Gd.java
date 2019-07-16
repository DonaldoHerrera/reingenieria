package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.C0972hd;

public final class Gd extends Ld {
    private final AlarmManager d = ((AlarmManager) getContext().getSystemService("alarm"));
    private final C1087b e;
    private Integer f;

    protected Gd(Kd kd) {
        super(kd);
        this.e = new Jd(this, kd.q(), kd);
    }

    private final int v() {
        if (this.f == null) {
            String str = "measurement";
            String valueOf = String.valueOf(getContext().getPackageName());
            this.f = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f.intValue();
    }

    @TargetApi(24)
    private final void w() {
        JobScheduler jobScheduler = (JobScheduler) getContext().getSystemService("jobscheduler");
        int v = v();
        e().A().a("Cancelling job. JobID", Integer.valueOf(v));
        jobScheduler.cancel(v);
    }

    private final PendingIntent x() {
        Context context = getContext();
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    public final void a(long j) {
        s();
        a();
        Context context = getContext();
        if (!Cb.a(context)) {
            e().z().a("Receiver not registered/enabled");
        }
        if (!Vd.a(context, false)) {
            e().z().a("Service not registered/enabled");
        }
        u();
        long elapsedRealtime = c().elapsedRealtime() + j;
        if (j < Math.max(0, ((Long) C1127j.I.a(null)).longValue()) && !this.e.c()) {
            e().A().a("Scheduling upload with DelayedRunnable");
            this.e.a(j);
        }
        a();
        if (VERSION.SDK_INT >= 24) {
            e().A().a("Scheduling upload with JobScheduler");
            Context context2 = getContext();
            ComponentName componentName = new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int v = v();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new Builder(v, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            e().A().a("Scheduling job. JobID", Integer.valueOf(v));
            C0972hd.a(context2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        e().A().a("Scheduling upload with AlarmManager");
        this.d.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) C1127j.D.a(null)).longValue(), j), x());
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C1097d j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ C1114gb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Vd l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Rd m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ ae n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ he o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        this.d.cancel(x());
        if (VERSION.SDK_INT >= 24) {
            w();
        }
        return false;
    }

    public final void u() {
        s();
        this.d.cancel(x());
        this.e.a();
        if (VERSION.SDK_INT >= 24) {
            w();
        }
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
