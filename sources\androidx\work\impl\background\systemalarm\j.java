package androidx.work.impl.background.systemalarm;

import androidx.work.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer */
class j {
    private static final String a = i.a("WorkTimer");
    private final ThreadFactory b = new i(this);
    private final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor(this.b);
    final Map<String, b> d = new HashMap();
    final Map<String, a> e = new HashMap();
    final Object f = new Object();

    /* compiled from: WorkTimer */
    interface a {
        void a(String str);
    }

    /* compiled from: WorkTimer */
    static class b implements Runnable {
        private final j a;
        private final String b;

        b(j jVar, String str) {
            this.a = jVar;
            this.b = str;
        }

        public void run() {
            synchronized (this.a.f) {
                if (((b) this.a.d.remove(this.b)) != null) {
                    a aVar = (a) this.a.e.remove(this.b);
                    if (aVar != null) {
                        aVar.a(this.b);
                    }
                } else {
                    i.a().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.b}), new Throwable[0]);
                }
            }
        }
    }

    j() {
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, long j, a aVar) {
        synchronized (this.f) {
            i.a().a(a, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            a(str);
            b bVar = new b(this, str);
            this.d.put(str, bVar);
            this.e.put(str, aVar);
            this.c.schedule(bVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        synchronized (this.f) {
            if (((b) this.d.remove(str)) != null) {
                i.a().a(a, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.e.remove(str);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (!this.c.isShutdown()) {
            this.c.shutdownNow();
        }
    }
}
