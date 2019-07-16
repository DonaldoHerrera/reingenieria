package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* compiled from: PlatformServiceClient */
public abstract class ba implements ServiceConnection {
    private final Context a;
    private final Handler b;
    private a c;
    private boolean d;
    private Messenger e;
    private int f;
    private int g;
    private final String h;
    private final int i;

    /* compiled from: PlatformServiceClient */
    public interface a {
        void a(Bundle bundle);
    }

    public ba(Context context, int i2, int i3, int i4, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.a = context;
        this.f = i2;
        this.g = i3;
        this.h = str;
        this.i = i4;
        this.b = new aa(this);
    }

    private void c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        a(bundle);
        Message obtain = Message.obtain(null, this.f);
        obtain.arg1 = this.i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.b);
        try {
            this.e.send(obtain);
        } catch (RemoteException unused) {
            b(null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Bundle bundle);

    public void a(a aVar) {
        this.c = aVar;
    }

    public boolean b() {
        if (this.d || Z.a(this.i) == -1) {
            return false;
        }
        Intent a2 = Z.a(this.a);
        if (a2 == null) {
            return false;
        }
        this.d = true;
        this.a.bindService(a2, this, 1);
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.e = new Messenger(iBinder);
        c();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        b(null);
    }

    public void a() {
        this.d = false;
    }

    /* access modifiers changed from: protected */
    public void a(Message message) {
        if (message.what == this.g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                b(null);
            } else {
                b(data);
            }
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private void b(Bundle bundle) {
        if (this.d) {
            this.d = false;
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(bundle);
            }
        }
    }
}
