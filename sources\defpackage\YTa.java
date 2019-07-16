package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: YTa reason: default package */
/* compiled from: SpscArrayQueue */
public final class YTa<E> extends AtomicReferenceArray<E> implements MQa<E> {
    private static final Integer a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    final int b = (length() - 1);
    final AtomicLong c = new AtomicLong();
    long d;
    final AtomicLong e = new AtomicLong();
    final int f;

    public YTa(int i) {
        super(IUa.a(i));
        this.f = Math.min(i / 4, a.intValue());
    }

    /* access modifiers changed from: 0000 */
    public int a(long j) {
        return this.b & ((int) j);
    }

    /* access modifiers changed from: 0000 */
    public int a(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: 0000 */
    public void b(long j) {
        this.e.lazySet(j);
    }

    /* access modifiers changed from: 0000 */
    public void c(long j) {
        this.c.lazySet(j);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.c.get() == this.e.get();
    }

    public boolean offer(E e2) {
        if (e2 != null) {
            int i = this.b;
            long j = this.c.get();
            int a2 = a(j, i);
            if (j >= this.d) {
                long j2 = ((long) this.f) + j;
                if (a(a(j2, i)) == null) {
                    this.d = j2;
                } else if (a(a2) != null) {
                    return false;
                }
            }
            a(a2, e2);
            c(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.e.get();
        int a2 = a(j);
        E a3 = a(a2);
        if (a3 == null) {
            return null;
        }
        b(j + 1);
        a(a2, (E) null);
        return a3;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, E e2) {
        lazySet(i, e2);
    }

    /* access modifiers changed from: 0000 */
    public E a(int i) {
        return get(i);
    }
}
