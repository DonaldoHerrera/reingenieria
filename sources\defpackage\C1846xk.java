package defpackage;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: xk reason: default package and case insensitive filesystem */
/* compiled from: ViewIndexer */
class C1846xk implements Runnable {
    final /* synthetic */ TimerTask a;
    final /* synthetic */ Ak b;

    C1846xk(Ak ak, TimerTask timerTask) {
        this.b = ak;
        this.a = timerTask;
    }

    public void run() {
        try {
            if (this.b.e != null) {
                this.b.e.cancel();
            }
            this.b.f = null;
            this.b.e = new Timer();
            this.b.e.scheduleAtFixedRate(this.a, 0, 1000);
        } catch (Exception e) {
            Log.e(Ak.a, "Error scheduling indexing job", e);
        }
    }
}
