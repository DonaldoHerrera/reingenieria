package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.Ad;
import com.google.android.gms.measurement.internal.C1195wd;

public final class AppMeasurementService extends Service implements Ad {
    private C1195wd<AppMeasurementService> a;

    private final C1195wd<AppMeasurementService> a() {
        if (this.a == null) {
            this.a = new C1195wd<>(this);
        }
        return this.a;
    }

    public final IBinder onBind(Intent intent) {
        return a().a(intent);
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

    public final int onStartCommand(Intent intent, int i, int i2) {
        return a().a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return a().c(intent);
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    public final void a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final void a(Intent intent) {
        WakefulBroadcastReceiver.a(intent);
    }
}
