package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat */
class t implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ ResultReceiver d;
    final /* synthetic */ j e;

    t(j jVar, k kVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
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
            sb.append("search for callback that isn't registered query=");
            sb.append(this.b);
            Log.w("MBServiceCompat", sb.toString());
            return;
        }
        MediaBrowserServiceCompat.this.b(this.b, this.c, bVar, this.d);
    }
}
