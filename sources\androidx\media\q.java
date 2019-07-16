package androidx.media;

import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat */
class q implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ String b;
    final /* synthetic */ ResultReceiver c;
    final /* synthetic */ j d;

    q(j jVar, k kVar, String str, ResultReceiver resultReceiver) {
        this.d = jVar;
        this.a = kVar;
        this.b = str;
        this.c = resultReceiver;
    }

    public void run() {
        b bVar = (b) MediaBrowserServiceCompat.this.c.get(this.a.asBinder());
        if (bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("getMediaItem for callback that isn't registered id=");
            sb.append(this.b);
            Log.w("MBServiceCompat", sb.toString());
            return;
        }
        MediaBrowserServiceCompat.this.a(this.b, bVar, this.c);
    }
}
