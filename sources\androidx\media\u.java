package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat */
class u implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ ResultReceiver d;
    final /* synthetic */ j e;

    u(j jVar, k kVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.e = jVar;
        this.a = kVar;
        this.b = str;
        this.c = bundle;
        this.d = resultReceiver;
    }

    public void run() {
        b bVar = (b) MediaBrowserServiceCompat.this.c.get(this.a.asBinder());
        if (bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("sendCustomAction for callback that isn't registered action=");
            sb.append(this.b);
            sb.append(", extras=");
            sb.append(this.c);
            Log.w("MBServiceCompat", sb.toString());
            return;
        }
        MediaBrowserServiceCompat.this.a(this.b, this.c, bVar, this.d);
    }
}
