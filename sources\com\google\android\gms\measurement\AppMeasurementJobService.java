package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.Ad;
import com.google.android.gms.measurement.internal.C1195wd;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements Ad {
    private C1195wd<AppMeasurementJobService> a;

    private final C1195wd<AppMeasurementJobService> a() {
        if (this.a == null) {
            this.a = new C1195wd<>(this);
        }
        return this.a;
    }

    public final void a(Intent intent) {
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return a().a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return a().c(intent);
    }

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    public final void a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
