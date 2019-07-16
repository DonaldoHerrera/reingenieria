package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.Cb;
import com.google.android.gms.measurement.internal.Eb;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements Eb {
    private Cb c;

    public final void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new Cb(this);
        }
        this.c.a(context, intent);
    }

    public final PendingResult a() {
        return goAsync();
    }
}
