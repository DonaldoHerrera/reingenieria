package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat */
class m implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ Bundle e;
    final /* synthetic */ j f;

    m(j jVar, k kVar, String str, int i, int i2, Bundle bundle) {
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
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat.d = bVar;
        bVar.h = mediaBrowserServiceCompat.a(this.b, this.d, this.e);
        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat2.d = null;
        String str = "MBServiceCompat";
        if (bVar.h == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No root for client ");
            sb.append(this.b);
            sb.append(" from service ");
            sb.append(m.class.getName());
            Log.i(str, sb.toString());
            try {
                this.a.a();
            } catch (RemoteException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                sb2.append(this.b);
                Log.w(str, sb2.toString());
            }
        } else {
            try {
                mediaBrowserServiceCompat2.c.put(asBinder, bVar);
                asBinder.linkToDeath(bVar, 0);
                if (MediaBrowserServiceCompat.this.f != null) {
                    this.a.a(bVar.h.b(), MediaBrowserServiceCompat.this.f, bVar.h.a());
                }
            } catch (RemoteException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                sb3.append(this.b);
                Log.w(str, sb3.toString());
                MediaBrowserServiceCompat.this.c.remove(asBinder);
            }
        }
    }
}
