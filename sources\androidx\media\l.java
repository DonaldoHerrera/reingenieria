package androidx.media;

import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import java.util.Iterator;

/* compiled from: MediaBrowserServiceCompat */
class l implements Runnable {
    final /* synthetic */ Token a;
    final /* synthetic */ h b;

    l(h hVar, Token token) {
        this.b = hVar;
        this.a = token;
    }

    public void run() {
        Iterator it = MediaBrowserServiceCompat.this.c.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            try {
                bVar.f.a(bVar.h.b(), this.a, bVar.h.a());
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connection for ");
                sb.append(bVar.a);
                sb.append(" is no longer valid.");
                Log.w("MBServiceCompat", sb.toString());
                it.remove();
            }
        }
    }
}
