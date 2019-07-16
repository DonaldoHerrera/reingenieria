package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: _Ta reason: default package */
/* compiled from: AbstractDirectTask */
abstract class _Ta extends AtomicReference<Future<?>> implements VPa, C6577hVa {
    protected static final FutureTask<Void> a = new FutureTask<>(C7808zQa.b, null);
    protected static final FutureTask<Void> b = new FutureTask<>(C7808zQa.b, null);
    protected final Runnable c;
    protected Thread d;

    _Ta(Runnable runnable) {
        this.c = runnable;
    }

    public final boolean a() {
        Future future = (Future) get();
        return future == a || future == b;
    }

    public final void dispose() {
        Future future = (Future) get();
        if (future != a) {
            FutureTask<Void> futureTask = b;
            if (future != futureTask && compareAndSet(future, futureTask) && future != null) {
                future.cancel(this.d != Thread.currentThread());
            }
        }
    }

    public final void a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != a) {
                if (future2 == b) {
                    future.cancel(this.d != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
