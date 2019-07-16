package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: xB reason: default package and case insensitive filesystem */
final class C1834xB implements ServiceConnection {
    final /* synthetic */ C1654rB a;

    private C1834xB(C1654rB rBVar) {
        this.a = rBVar;
    }

    /* synthetic */ C1834xB(C1654rB rBVar, byte b) {
        this(rBVar);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.c.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c((C1684sB) new AB(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.c.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c((C1684sB) new C1894zB(this));
    }
}
