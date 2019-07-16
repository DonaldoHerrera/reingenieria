package androidx.media;

import android.os.IBinder;

/* compiled from: MediaBrowserServiceCompat */
class s implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ j b;

    s(j jVar, k kVar) {
        this.b = jVar;
        this.a = kVar;
    }

    public void run() {
        IBinder asBinder = this.a.asBinder();
        b bVar = (b) MediaBrowserServiceCompat.this.c.remove(asBinder);
        if (bVar != null) {
            asBinder.unlinkToDeath(bVar, 0);
        }
    }
}
