package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;

public abstract class zzc extends Service {
    final ExecutorService a;
    private Binder b;
    private final Object c;
    private int d;
    private int e;

    public zzc() {
        Es a2 = Ds.a();
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = "Firebase-";
        this.a = a2.a(new NamedThreadFactory(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)), Is.a);
        this.c = new Object();
        this.e = 0;
    }

    /* access modifiers changed from: private */
    public final void d(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.a(intent);
        }
        synchronized (this.c) {
            this.e--;
            if (this.e == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Intent a(Intent intent) {
        return intent;
    }

    public boolean b(Intent intent) {
        return false;
    }

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.b == null) {
            this.b = new I(this);
        }
        return this.b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent a2 = a(intent);
        if (a2 == null) {
            d(intent);
            return 2;
        } else if (b(a2)) {
            d(intent);
            return 2;
        } else {
            this.a.execute(new D(this, a2, intent));
            return 3;
        }
    }
}
