package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.ta;

public class ReconnectionService extends Service {
    private static final C0710ia a = new C0710ia("ReconnectionService");
    private T b;

    public IBinder onBind(Intent intent) {
        try {
            return this.b.a(intent);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onBind", T.class.getSimpleName());
            return null;
        }
    }

    public void onCreate() {
        C0635c a2 = C0635c.a((Context) this);
        this.b = ta.a(this, a2.c().c(), a2.g().a());
        try {
            this.b.onCreate();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onCreate", T.class.getSimpleName());
        }
        super.onCreate();
    }

    public void onDestroy() {
        try {
            this.b.onDestroy();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onDestroy", T.class.getSimpleName());
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.b.a(intent, i, i2);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "onStartCommand", T.class.getSimpleName());
            return 1;
        }
    }
}
