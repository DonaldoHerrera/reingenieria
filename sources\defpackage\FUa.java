package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: FUa reason: default package */
/* compiled from: HalfSerializer */
public final class FUa {
    public static <T> void a(C5551aBb<? super T> abb, T t, AtomicInteger atomicInteger, C7743yUa yua) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            abb.a(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = yua.a();
                if (a != null) {
                    abb.a(a);
                } else {
                    abb.onComplete();
                }
            }
        }
    }

    public static void a(C5551aBb<?> abb, Throwable th, AtomicInteger atomicInteger, C7743yUa yua) {
        if (!yua.a(th)) {
            WUa.b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            abb.a(yua.a());
        }
    }

    public static void a(C5551aBb<?> abb, AtomicInteger atomicInteger, C7743yUa yua) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = yua.a();
            if (a != null) {
                abb.a(a);
            } else {
                abb.onComplete();
            }
        }
    }
}
