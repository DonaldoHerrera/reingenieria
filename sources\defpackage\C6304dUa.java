package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dUa reason: default package and case insensitive filesystem */
/* compiled from: InstantPeriodicTask */
final class C6304dUa implements Callable<Void>, VPa {
    static final FutureTask<Void> a = new FutureTask<>(C7808zQa.b, null);
    final Runnable b;
    final AtomicReference<Future<?>> c = new AtomicReference<>();
    final AtomicReference<Future<?>> d = new AtomicReference<>();
    final ExecutorService e;
    Thread f;

    C6304dUa(Runnable runnable, ExecutorService executorService) {
        this.b = runnable;
        this.e = executorService;
    }

    public boolean a() {
        return this.d.get() == a;
    }

    /* access modifiers changed from: 0000 */
    public void b(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.c.get();
            if (future2 == a) {
                future.cancel(this.f != Thread.currentThread());
                return;
            }
        } while (!this.c.compareAndSet(future2, future));
    }

    public void dispose() {
        Future future = (Future) this.d.getAndSet(a);
        boolean z = true;
        if (!(future == null || future == a)) {
            future.cancel(this.f != Thread.currentThread());
        }
        Future future2 = (Future) this.c.getAndSet(a);
        if (future2 != null && future2 != a) {
            if (this.f == Thread.currentThread()) {
                z = false;
            }
            future2.cancel(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.d.get();
            if (future2 == a) {
                future.cancel(this.f != Thread.currentThread());
                return;
            }
        } while (!this.d.compareAndSet(future2, future));
    }

    public Void call() throws Exception {
        this.f = Thread.currentThread();
        try {
            this.b.run();
            b(this.e.submit(this));
            this.f = null;
        } catch (Throwable th) {
            this.f = null;
            WUa.b(th);
        }
        return null;
    }
}
