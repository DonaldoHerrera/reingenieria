package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat */
class o implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ String b;
    final /* synthetic */ IBinder c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ j e;

    o(j jVar, k kVar, String str, IBinder iBinder, Bundle bundle) {
        this.e = jVar;
        this.a = kVar;
        this.b = str;
        this.c = iBinder;
        this.d = bundle;
    }

    public void run() {
        b bVar = (b) MediaBrowserServiceCompat.this.c.get(this.a.asBinder());
        if (bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("addSubscription for callback that isn't registered id=");
            sb.append(this.b);
            Log.w("MBServiceCompat", sb.toString());
            return;
        }
        MediaBrowserServiceCompat.this.a(this.b, bVar, this.c, this.d);
    }
}
