package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.soundcloud.android.payments.C;

/* renamed from: ila reason: default package and case insensitive filesystem */
/* compiled from: BillingService */
class C4583ila implements ServiceConnection {
    final /* synthetic */ C4591jla a;

    C4583ila(C4591jla jla) {
        this.a = jla;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C4623nla.a("Service connected");
        C4591jla jla = this.a;
        jla.h = jla.b.a(iBinder);
        this.a.e.a(this.a.c() ? C.READY : C.UNSUPPORTED);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C4623nla.a("Service disconnected");
        this.a.h = null;
        this.a.e.a(C.DISCONNECTED);
    }
}
