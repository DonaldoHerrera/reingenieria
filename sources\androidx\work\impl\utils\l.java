package androidx.work.impl.utils;

import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.m;
import androidx.work.q.a;

/* compiled from: StopWorkRunnable */
public class l implements Runnable {
    private static final String a = i.a("StopWorkRunnable");
    private m b;
    private String c;

    public l(m mVar, String str) {
        this.b = mVar;
        this.c = str;
    }

    public void run() {
        WorkDatabase g = this.b.g();
        C0305af t = g.t();
        g.c();
        try {
            if (t.b(this.c) == a.RUNNING) {
                t.a(a.ENQUEUED, this.c);
            }
            boolean e = this.b.e().e(this.c);
            i.a().a(a, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.c, Boolean.valueOf(e)}), new Throwable[0]);
            g.m();
        } finally {
            g.e();
        }
    }
}
