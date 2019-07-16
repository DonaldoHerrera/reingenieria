package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: jVa reason: default package and case insensitive filesystem */
/* compiled from: BehaviorSubject */
public final class C6713jVa<T> extends C6985nVa<T> {
    private static final Object[] a = new Object[0];
    static final a[] b = new a[0];
    static final a[] c = new a[0];
    final AtomicReference<Object> d;
    final AtomicReference<a<T>[]> e;
    final ReadWriteLock f;
    final Lock g;
    final Lock h;
    final AtomicReference<Throwable> i;
    long j;

    /* renamed from: jVa$a */
    /* compiled from: BehaviorSubject */
    static final class a<T> implements VPa, defpackage.C7674xUa.a<Object> {
        final GPa<? super T> a;
        final C6713jVa<T> b;
        boolean c;
        boolean d;
        C7674xUa<Object> e;
        boolean f;
        volatile boolean g;
        long h;

        a(GPa<? super T> gPa, C6713jVa<T> jva) {
            this.a = gPa;
            this.b = jva;
        }

        public boolean a() {
            return this.g;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (test(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
            return;
         */
        public void b() {
            if (!this.g) {
                synchronized (this) {
                    if (!this.g) {
                        if (!this.c) {
                            C6713jVa<T> jva = this.b;
                            Lock lock = jva.g;
                            lock.lock();
                            this.h = jva.j;
                            Object obj = jva.d.get();
                            lock.unlock();
                            this.d = obj != null;
                            this.c = true;
                        }
                    }
                }
            }
        }

        /* JADX INFO: used method not loaded: xUa.a(xUa$a):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.a((defpackage.C7674xUa.a) r2);
         */
        public void c() {
            while (!this.g) {
                synchronized (this) {
                    C7674xUa<Object> xua = this.e;
                    if (xua == null) {
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

        public boolean test(Object obj) {
            return this.g || GUa.a(obj, this.a);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f = true;
         */
        public void a(Object obj, long j) {
            if (!this.g) {
                if (!this.f) {
                    synchronized (this) {
                        if (!this.g) {
                            if (this.h != j) {
                                if (this.d) {
                                    C7674xUa<Object> xua = this.e;
                                    if (xua == null) {
                                        xua = new C7674xUa<>(4);
                                        this.e = xua;
                                    }
                                    xua.a(obj);
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
                test(obj);
            }
        }
    }

    C6713jVa() {
        this.f = new ReentrantReadWriteLock();
        this.g = this.f.readLock();
        this.h = this.f.writeLock();
        this.e = new AtomicReference<>(b);
        this.d = new AtomicReference<>();
        this.i = new AtomicReference<>();
    }

    public static <T> C6713jVa<T> f(T t) {
        return new C6713jVa<>(t);
    }

    public static <T> C6713jVa<T> s() {
        return new C6713jVa<>();
    }

    public void a(VPa vPa) {
        if (this.i.get() != null) {
            vPa.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this);
        gPa.a((VPa) aVar);
        if (!a(aVar)) {
            Throwable th = (Throwable) this.i.get();
            if (th == EUa.a) {
                gPa.onComplete();
            } else {
                gPa.a(th);
            }
        } else if (aVar.g) {
            b(aVar);
        } else {
            aVar.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public void g(Object obj) {
        this.h.lock();
        this.j++;
        this.d.lazySet(obj);
        this.h.unlock();
    }

    /* access modifiers changed from: 0000 */
    public a<T>[] h(Object obj) {
        a<T>[] aVarArr = (a[]) this.e.getAndSet(c);
        if (aVarArr != c) {
            g(obj);
        }
        return aVarArr;
    }

    public void onComplete() {
        if (this.i.compareAndSet(null, EUa.a)) {
            Object a2 = GUa.a();
            for (a a3 : h(a2)) {
                a3.a(a2, this.j);
            }
        }
    }

    public T t() {
        T t = this.d.get();
        if (GUa.c(t) || GUa.d(t)) {
            return null;
        }
        GUa.b(t);
        return t;
    }

    public boolean u() {
        Object obj = this.d.get();
        return obj != null && !GUa.c(obj) && !GUa.d(obj);
    }

    public void a(T t) {
        AQa.a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.i.get() == null) {
            GUa.e(t);
            g(t);
            for (a a2 : (a[]) this.e.get()) {
                a2.a(t, this.j);
            }
        }
    }

    C6713jVa(T t) {
        this();
        AtomicReference<Object> atomicReference = this.d;
        AQa.a(t, "defaultValue is null");
        atomicReference.lazySet(t);
    }

    public void a(Throwable th) {
        AQa.a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.i.compareAndSet(null, th)) {
            WUa.b(th);
            return;
        }
        Object a2 = GUa.a(th);
        for (a a3 : h(a2)) {
            a3.a(a2, this.j);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(a<T> aVar) {
        a<T>[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.e.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (aVarArr[i3] == aVar) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 >= 0) {
                    if (length == 1) {
                        aVarArr2 = b;
                    } else {
                        a[] aVarArr3 = new a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                        System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.e.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: 0000 */
    public boolean a(a<T> aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.e.get();
            if (aVarArr == c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.e.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
