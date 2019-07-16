package androidx.room;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: MultiInstanceInvalidationClient */
class l implements Runnable {
    final /* synthetic */ p a;

    l(p pVar) {
        this.a = pVar;
    }

    public void run() {
        try {
            C0436e eVar = this.a.f;
            if (eVar != null) {
                this.a.c = eVar.a(this.a.h, this.a.b);
                this.a.d.a(this.a.e);
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }
}
