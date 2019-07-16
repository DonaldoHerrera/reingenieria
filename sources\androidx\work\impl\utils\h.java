package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor */
public class h implements Executor {
    private final ArrayDeque<a> a = new ArrayDeque<>();
    private final Executor b;
    private final Object c = new Object();
    private volatile Runnable d;

    /* compiled from: SerialExecutor */
    static class a implements Runnable {
        final h a;
        final Runnable b;

        a(h hVar, Runnable runnable) {
            this.a = hVar;
            this.b = runnable;
        }

        public void run() {
            try {
                this.b.run();
            } finally {
                this.a.a();
            }
        }
    }

    public h(Executor executor) {
        this.b = executor;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        synchronized (this.c) {
            Runnable runnable = (Runnable) this.a.poll();
            this.d = runnable;
            if (runnable != null) {
                this.b.execute(this.d);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.c) {
            this.a.add(new a(this, runnable));
            if (this.d == null) {
                a();
            }
        }
    }
}
