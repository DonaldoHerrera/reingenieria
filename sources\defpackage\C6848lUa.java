package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: lUa reason: default package and case insensitive filesystem */
/* compiled from: ScheduledRunnable */
public final class C6848lUa extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, VPa {
    static final Object a = new Object();
    static final Object b = new Object();
    static final Object c = new Object();
    static final Object d = new Object();
    final Runnable e;

    public C6848lUa(Runnable runnable, C7394tQa tqa) {
        super(3);
        this.e = runnable;
        lazySet(0, tqa);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != d) {
                if (obj == b) {
                    future.cancel(false);
                    return;
                } else if (obj == c) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    public void dispose() {
        Object obj;
        Object obj2;
        while (true) {
            Object obj3 = get(1);
            if (obj3 == d || obj3 == b || obj3 == c) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (compareAndSet(1, obj3, z ? c : b)) {
                if (obj3 != null) {
                    ((Future) obj3).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj != d) {
                obj2 = a;
                if (obj == obj2 || obj == null) {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((C7394tQa) obj).c(this);
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.e.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == a || !compareAndSet(0, obj3, d) || obj3 == null)) {
                ((C7394tQa) obj3).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == b || obj2 == c) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, d));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == a || !compareAndSet(0, obj4, d) || obj4 == null)) {
            ((C7394tQa) obj4).c(this);
        }
        do {
            obj = get(1);
            if (obj == b || obj == c) {
                return;
            }
        } while (!compareAndSet(1, obj, d));
    }

    public boolean a() {
        Object obj = get(0);
        if (obj == a || obj == d) {
            return true;
        }
        return false;
    }
}
