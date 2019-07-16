package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat */
class r implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Bundle e;
    final /* synthetic */ j f;

    r(j jVar, k kVar, String str, int i, int i2, Bundle bundle) {
        this.f = jVar;
        this.a = kVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = bundle;
    }

    public void run() {
        IBinder asBinder = this.a.asBinder();
        MediaBrowserServiceCompat.this.c.remove(asBinder);
        b bVar = new b(this.b, this.c, this.d, this.e, this.a);
        MediaBrowserServiceCompat.this.c.put(asBinder, bVar);
        try {
            asBinder.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
