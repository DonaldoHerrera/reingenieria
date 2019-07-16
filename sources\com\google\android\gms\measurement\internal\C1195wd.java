package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.Ad;

/* renamed from: com.google.android.gms.measurement.internal.wd reason: case insensitive filesystem */
public final class C1195wd<T extends Context & Ad> {
    private final T a;

    public C1195wd(T t) {
        Preconditions.checkNotNull(t);
        this.a = t;
    }

    public final void a() {
        Mb a2 = Mb.a((Context) this.a, (zzx) null);
        C1124ib e = a2.e();
        a2.a();
        e.A().a("Local AppMeasurementService is starting up");
    }

    public final void b() {
        Mb a2 = Mb.a((Context) this.a, (zzx) null);
        C1124ib e = a2.e();
        a2.a();
        e.A().a("Local AppMeasurementService is shutting down");
    }

    public final boolean c(Intent intent) {
        if (intent == null) {
            c().s().a("onUnbind called with null intent");
            return true;
        }
        c().A().a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    private final C1124ib c() {
        return Mb.a((Context) this.a, (zzx) null).e();
    }

    public final int a(Intent intent, int i, int i2) {
        Mb a2 = Mb.a((Context) this.a, (zzx) null);
        C1124ib e = a2.e();
        if (intent == null) {
            e.v().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a2.a();
        e.A().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            a((Runnable) new C1190vd(this, i2, e, intent));
        }
        return 2;
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().s().a("onRebind called with null intent");
            return;
        }
        c().A().a("onRebind called. action", intent.getAction());
    }

    private final void a(Runnable runnable) {
        Kd a2 = Kd.a((Context) this.a);
        a2.d().a((Runnable) new C1200xd(this, a2, runnable));
    }

    public final IBinder a(Intent intent) {
        if (intent == null) {
            c().s().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new Nb(Kd.a((Context) this.a));
        }
        c().v().a("onBind received unknown action", action);
        return null;
    }

    @TargetApi(24)
    public final boolean a(JobParameters jobParameters) {
        Mb a2 = Mb.a((Context) this.a, (zzx) null);
        C1124ib e = a2.e();
        String string = jobParameters.getExtras().getString("action");
        a2.a();
        e.A().a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            a((Runnable) new C1205yd(this, e, jobParameters));
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(C1124ib ibVar, JobParameters jobParameters) {
        ibVar.A().a("AppMeasurementJobService processed last upload request.");
        ((Ad) this.a).a(jobParameters, false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void a(int i, C1124ib ibVar, Intent intent) {
        if (((Ad) this.a).a(i)) {
            ibVar.A().a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            c().A().a("Completed wakeful intent.");
            ((Ad) this.a).a(intent);
        }
    }
}
