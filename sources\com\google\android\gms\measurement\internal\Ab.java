package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C0977ib;
import com.google.android.gms.internal.measurement.Ib;

public final class Ab implements ServiceConnection {
    /* access modifiers changed from: private */
    public final String a;
    final /* synthetic */ C1198xb b;

    Ab(C1198xb xbVar, String str) {
        this.b = xbVar;
        this.a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.e().v().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            Ib a2 = C0977ib.a(iBinder);
            if (a2 == null) {
                this.b.a.e().v().a("Install Referrer Service implementation was not found");
                return;
            }
            this.b.a.e().y().a("Install Referrer Service connected");
            this.b.a.d().a((Runnable) new C1208zb(this, a2, this));
        } catch (Exception e) {
            this.b.a.e().v().a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.e().y().a("Install Referrer Service disconnected");
    }
}
