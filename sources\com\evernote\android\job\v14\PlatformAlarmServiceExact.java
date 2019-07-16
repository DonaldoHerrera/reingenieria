package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.evernote.android.job.g;
import java.util.HashSet;
import java.util.Set;

public final class PlatformAlarmServiceExact extends Service {
    /* access modifiers changed from: private */
    public static final Dj a = new Dj("PlatformAlarmServiceExact");
    private final Object b = new Object();
    private volatile Set<Integer> c;
    private volatile int d;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.c = new HashSet();
    }

    public void onDestroy() {
        synchronized (this.b) {
            this.c = null;
            this.d = 0;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c.add(Integer.valueOf(i2));
            this.d = i2;
        }
        g.b().execute(new b(this, intent, i2));
        return 2;
    }

    public static Intent a(Context context, int i, Bundle bundle) {
        Intent intent = new Intent(context, PlatformAlarmServiceExact.class);
        intent.putExtra("EXTRA_JOB_ID", i);
        if (bundle != null) {
            intent.putExtra("EXTRA_TRANSIENT_EXTRAS", bundle);
        }
        return intent;
    }

    /* access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.b) {
            Set<Integer> set = this.c;
            if (set != null) {
                set.remove(Integer.valueOf(i));
                if (set.isEmpty()) {
                    stopSelfResult(this.d);
                }
            }
        }
    }
}
