package androidx.media;

import android.os.IBinder;
import android.util.Log;

/* compiled from: MediaBrowserServiceCompat */
class p implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ String b;
    final /* synthetic */ IBinder c;
    final /* synthetic */ j d;

    p(j jVar, k kVar, String str, IBinder iBinder) {
        this.d = jVar;
        this.a = kVar;
        this.b = str;
        this.c = iBinder;
    }

    public void run() {
        b bVar = (b) MediaBrowserServiceCompat.this.c.get(this.a.asBinder());
        String str = "MBServiceCompat";
        if (bVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("removeSubscription for callback that isn't registered id=");
            sb.append(this.b);
            Log.w(str, sb.toString());
            return;
        }
        if (!MediaBrowserServiceCompat.this.a(this.b, bVar, this.c)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("removeSubscription called for ");
            sb2.append(this.b);
            sb2.append(" which is not subscribed");
            Log.w(str, sb2.toString());
        }
    }
}
