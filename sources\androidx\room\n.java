package androidx.room;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: MultiInstanceInvalidationClient */
class n implements Runnable {
    final /* synthetic */ p a;

    n(p pVar) {
        this.a = pVar;
    }

    public void run() {
        p pVar = this.a;
        pVar.d.b(pVar.e);
        try {
            C0436e eVar = this.a.f;
            if (eVar != null) {
                eVar.a(this.a.h, this.a.c);
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
        }
        p pVar2 = this.a;
        Context context = pVar2.a;
        if (context != null) {
            context.unbindService(pVar2.j);
            this.a.a = null;
        }
    }
}
