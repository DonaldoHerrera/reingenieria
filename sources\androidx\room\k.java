package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.room.C0436e.a;

/* compiled from: MultiInstanceInvalidationClient */
class k implements ServiceConnection {
    final /* synthetic */ p a;

    k(p pVar) {
        this.a = pVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.f = a.a(iBinder);
        p pVar = this.a;
        pVar.g.execute(pVar.k);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        p pVar = this.a;
        pVar.g.execute(pVar.l);
        p pVar2 = this.a;
        pVar2.f = null;
        pVar2.a = null;
    }
}
