package com.soundcloud.android.sync;

import android.annotation.SuppressLint;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@SuppressLint({"ParcelCreator"})
class BackgroundSyncResultReceiver extends ResultReceiver {
    private final Runnable a;
    private final SyncResult b;
    private final la c;

    public BackgroundSyncResultReceiver(Runnable runnable, SyncResult syncResult, la laVar) {
        super(new Handler());
        this.a = runnable;
        this.b = syncResult;
        this.c = laVar;
    }

    private void a(na naVar, SyncJobResult syncJobResult) {
        if (syncJobResult.e()) {
            this.c.e(naVar);
        } else {
            this.c.d(naVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        for (String str : bundle.keySet()) {
            na valueOf = na.valueOf(str);
            SyncJobResult syncJobResult = (SyncJobResult) bundle.getParcelable(str);
            if (syncJobResult.f()) {
                a(valueOf, syncJobResult);
            } else {
                a(syncJobResult);
            }
        }
        this.a.run();
    }

    private void a(SyncJobResult syncJobResult) {
        Exception b2 = syncJobResult.b();
        if (b2 instanceof ifa) {
            a((ifa) b2);
        } else {
            C7316sHa.d(b2);
        }
    }

    private void a(ifa ifa) {
        int i = C6129l.a[ifa.j().ordinal()];
        if (i == 1 || i == 2) {
            this.b.stats.numAuthExceptions++;
        } else if (i == 3) {
            this.b.stats.numIoExceptions++;
        } else if (i != 4) {
            C7316sHa.d(ifa);
        } else {
            this.b.delayUntil = a();
        }
    }

    private static long a() {
        return TimeUnit.MINUTES.toSeconds((long) (new Random().nextInt(20) + 10));
    }
}
