package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: UH reason: default package and case insensitive filesystem */
/* compiled from: BehaviorRelay */
public final class C2314UH<T> extends C2350WH<T> {
    private static final Object[] a = new Object[0];
    static final a[] b = new a[0];
    final AtomicReference<T> c;
    final AtomicReference<a<T>[]> d;
    final Lock e;
    final Lock f;
    long g;

    /* renamed from: UH$a */
    /* compiled from: BehaviorRelay */
    static final class a<T> implements VPa, defpackage.C2295TH.a<T> {
        final GPa<? super T> a;
        final C2314UH<T> b;
        boolean c;
        boolean d;
        C2295TH<T> e;
        boolean f;
        volatile boolean g;
        long h;

        a(GPa<? super T> gPa, C2314UH<T> uh) {
            this.a = gPa;
            this.b = uh;
        }

        public boolean a() {
            return this.g;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
            test(r0);
            c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
            return;
         */
        public void b() {
            if (!this.g) {
                synchronized (this) {
                    if (!this.g) {
                        if (!this.c) {
                            C2314UH<T> uh = this.b;
                            Lock lock = uh.e;
                            lock.lock();
                            this.h = uh.g;
                            Object obj = uh.c.get();
                            lock.unlock();
                            this.d = obj != null;
                            this.c = true;
                        }
                    }
                }
            }
        }

        /* JADX INFO: used method not loaded: TH.a(TH$a):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.a((defpackage.C2295TH.a) r2);
         */
        public void c() {
            while (!this.g) {
                synchronized (this) {
                    C2295TH<T> th = this.e;
                    if (th == null) {
                        this.d = false;
                        return;
                    }
                    this.e = null;
                }
            }
        }

        public void dispose() {
            if (!this.g) {
                this.g = true;
                this.b.b(this);
            }
        }

        public boolean test(T t) {
            if (!this.g) {
                this.a.a(t);
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f = true;
         */
        public void a(T t, long j) {
            if (!this.g) {
                if (!this.f) {
                    synchronized (this) {
                        if (!this.g) {
                            if (this.h != j) {
                                if (this.d) {
                                    C2295TH<T> th = this.e;
                                    if (th == null) {
                                        th = new C2295TH<>(4);
                                        this.e = th;
                                    }
                                    th.a(t);
                                    return;
                                }
                                this.c = true;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                test(t);
            }
        }
    }

    C2314UH() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock.readLock();
        this.f = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference<>(b);
        this.c = new AtomicReference<>();
    }

    public static <T> C2314UH<T> f(T t) {
        return new C2314UH<>(t);
    }

    public static <T> C2314UH<T> s() {
        return new C2314UH<>();
    }

    /* access modifiers changed from: 0000 */
    public void a(a<T> aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.d.get();
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.d.compareAndSet(aVarArr, aVarArr2));
    }

    public void accept(T t) {
        if (t != null) {
            g(t);
            for (a a2 : (a[]) this.d.get()) {
                a2.a(t, this.g);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this);
        gPa.a((VPa) aVar);
        a(aVar);
        if (aVar.g) {
            b(aVar);
        } else {
            aVar.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void g(T t) {
        this.f.lock();
        this.g++;
        this.c.lazySet(t);
        this.f.unlock();
    }

    public T t() {
        return this.c.get();
    }

    public boolean u() {
        return this.c.get() != null;
    }

    C2314UH(T t) {
        this();
        if (t != null) {
            this.c.lazySet(t);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }

    /* access modifiers changed from: 0000 */
    public void b(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.d.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = b;
                    } else {
                        a[] aVarArr3 = new a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.d.compareAndSet(aVarArr, aVarArr2));
    }
}
