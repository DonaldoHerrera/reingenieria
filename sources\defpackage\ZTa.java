package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ZTa reason: default package */
/* compiled from: SpscLinkedArrayQueue */
public final class ZTa<T> implements MQa<T> {
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object b = new Object();
    final AtomicLong c = new AtomicLong();
    int d;
    long e;
    final int f;
    AtomicReferenceArray<Object> g;
    final int h;
    AtomicReferenceArray<Object> i;
    final AtomicLong j = new AtomicLong();

    public ZTa(int i2) {
        int a2 = IUa.a(Math.max(8, i2));
        int i3 = a2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a2 + 1);
        this.g = atomicReferenceArray;
        this.f = i3;
        a(a2);
        this.i = atomicReferenceArray;
        this.h = i3;
        this.e = (long) (i3 - 1);
        b(0);
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        a(atomicReferenceArray, i2, (Object) t);
        b(j2 + 1);
        return true;
    }

    private static int b(int i2) {
        return i2;
    }

    private AtomicReferenceArray<Object> b(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        b(i2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) a(atomicReferenceArray, i2);
        a(atomicReferenceArray, i2, (Object) null);
        return atomicReferenceArray2;
    }

    private long c() {
        return this.j.get();
    }

    private long d() {
        return this.c.get();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return d() == c();
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.g;
            long b2 = b();
            int i2 = this.f;
            int a2 = a(b2, i2);
            if (b2 < this.e) {
                return a(atomicReferenceArray, t, b2, a2);
            }
            long j2 = ((long) this.d) + b2;
            if (a(atomicReferenceArray, a(j2, i2)) == null) {
                this.e = j2 - 1;
                return a(atomicReferenceArray, t, b2, a2);
            } else if (a(atomicReferenceArray, a(1 + b2, i2)) == null) {
                return a(atomicReferenceArray, t, b2, a2);
            } else {
                a(atomicReferenceArray, b2, a2, t, (long) i2);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.i;
        long a2 = a();
        int i2 = this.h;
        int a3 = a(a2, i2);
        T a4 = a(atomicReferenceArray, a3);
        boolean z = a4 == b;
        if (a4 != null && !z) {
            a(atomicReferenceArray, a3, (Object) null);
            a(a2 + 1);
            return a4;
        } else if (z) {
            return a(b(atomicReferenceArray, i2 + 1), a2, i2);
        } else {
            return null;
        }
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.g = atomicReferenceArray2;
        this.e = (j3 + j2) - 1;
        a(atomicReferenceArray2, i2, (Object) t);
        a(atomicReferenceArray, atomicReferenceArray2);
        a(atomicReferenceArray, i2, b);
        b(j2 + 1);
    }

    private long b() {
        return this.c.get();
    }

    private void b(long j2) {
        this.c.lazySet(j2);
    }

    private void a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        b(length);
        a(atomicReferenceArray, length, (Object) atomicReferenceArray2);
    }

    private T a(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.i = atomicReferenceArray;
        int a2 = a(j2, i2);
        T a3 = a(atomicReferenceArray, a2);
        if (a3 != null) {
            a(atomicReferenceArray, a2, (Object) null);
            a(j2 + 1);
        }
        return a3;
    }

    private void a(int i2) {
        this.d = Math.min(i2 / 4, a);
    }

    private long a() {
        return this.j.get();
    }

    private void a(long j2) {
        this.j.lazySet(j2);
    }

    private static int a(long j2, int i2) {
        int i3 = ((int) j2) & i2;
        b(i3);
        return i3;
    }

    private static void a(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private static <E> Object a(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }
}
