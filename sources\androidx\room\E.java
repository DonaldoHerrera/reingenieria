package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor */
class E implements Executor {
    private final Executor a;
    private final ArrayDeque<Runnable> b = new ArrayDeque<>();
    private Runnable c;

    E(Executor executor) {
        this.a = executor;
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a() {
        Runnable runnable = (Runnable) this.b.poll();
        this.c = runnable;
        if (runnable != null) {
            this.a.execute(this.c);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.b.offer(new D(this, runnable));
        if (this.c == null) {
            a();
        }
    }
}
