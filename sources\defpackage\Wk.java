package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.B;

/* renamed from: Wk reason: default package */
/* compiled from: InAppPurchaseActivityLifecycleTracker */
class Wk implements ServiceConnection {
    Wk() {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        _k.h = C0311al.a(B.e(), iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
