package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vUa reason: default package and case insensitive filesystem */
/* compiled from: ScalarSubscription */
public final class C7536vUa<T> extends AtomicInteger implements KQa<T> {
    final T a;
    final C5551aBb<? super T> b;

    public C7536vUa(C5551aBb<? super T> abb, T t) {
        this.b = abb;
        this.a = t;
    }

    public int a(int i) {
        return i & 1;
    }

    public void a(long j) {
        if (C7605wUa.b(j) && compareAndSet(0, 1)) {
            C5551aBb<? super T> abb = this.b;
            abb.a(this.a);
            if (get() != 2) {
                abb.onComplete();
            }
        }
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    public boolean isEmpty() {
        return get() != 0;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }
}
