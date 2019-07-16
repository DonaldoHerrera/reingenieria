package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.i;
import androidx.work.impl.utils.n;

/* compiled from: SystemAlarmDispatcher */
class f implements Runnable {
    final /* synthetic */ g a;

    f(g gVar) {
        this.a = gVar;
    }

    public void run() {
        c cVar;
        g gVar;
        synchronized (this.a.i) {
            this.a.j = (Intent) this.a.i.get(0);
        }
        Intent intent = this.a.j;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.a.j.getIntExtra("KEY_START_ID", 0);
            i.a().a(g.a, String.format("Processing command %s, %s", new Object[]{this.a.j, Integer.valueOf(intExtra)}), new Throwable[0]);
            WakeLock a2 = n.a(this.a.b, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
            try {
                i.a().a(g.a, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a2}), new Throwable[0]);
                a2.acquire();
                this.a.g.a(this.a.j, intExtra, this.a);
                i.a().a(g.a, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a2}), new Throwable[0]);
                a2.release();
                gVar = this.a;
                cVar = new c(gVar);
            } catch (Throwable th) {
                i.a().a(g.a, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a2}), new Throwable[0]);
                a2.release();
                g gVar2 = this.a;
                gVar2.a((Runnable) new c(gVar2));
                throw th;
            }
            gVar.a((Runnable) cVar);
        }
    }
}
