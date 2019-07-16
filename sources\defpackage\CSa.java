package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: CSa reason: default package */
/* compiled from: ObservableFlatMap */
public final class CSa<T, U> extends C6642iSa<T, U> {
    final C7118pQa<? super T, ? extends EPa<? extends U>> b;
    final boolean c;
    final int d;
    final int e;

    /* renamed from: CSa$a */
    /* compiled from: ObservableFlatMap */
    static final class a<T, U> extends AtomicReference<VPa> implements GPa<U> {
        final long a;
        final b<T, U> b;
        volatile boolean c;
        volatile NQa<U> d;
        int e;

        a(b<T, U> bVar, long j) {
            this.a = j;
            this.b = bVar;
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa) && (vPa instanceof IQa)) {
                IQa iQa = (IQa) vPa;
                int a2 = iQa.a(7);
                if (a2 == 1) {
                    this.e = a2;
                    this.d = iQa;
                    this.c = true;
                    this.b.d();
                } else if (a2 == 2) {
                    this.e = a2;
                    this.d = iQa;
                }
            }
        }

        public void onComplete() {
            this.c = true;
            this.b.d();
        }

        public void a(U u) {
            if (this.e == 0) {
                this.b.a(u, this);
            } else {
                this.b.d();
            }
        }

        public void a(Throwable th) {
            if (this.b.j.a(th)) {
                b<T, U> bVar = this.b;
                if (!bVar.e) {
                    bVar.c();
                }
                this.c = true;
                this.b.d();
                return;
            }
            WUa.b(th);
        }

        public void a() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }
    }

    /* renamed from: CSa$b */
    /* compiled from: ObservableFlatMap */
    static final class b<T, U> extends AtomicInteger implements VPa, GPa<T> {
        static final a<?, ?>[] a = new a[0];
        static final a<?, ?>[] b = new a[0];
        final GPa<? super U> c;
        final C7118pQa<? super T, ? extends EPa<? extends U>> d;
        final boolean e;
        final int f;
        final int g;
        volatile MQa<U> h;
        volatile boolean i;
        final C7743yUa j = new C7743yUa();
        volatile boolean k;
        final AtomicReference<a<?, ?>[]> l;
        VPa m;
        long n;
        long o;
        int p;
        Queue<EPa<? extends U>> q;
        int r;

        b(GPa<? super U> gPa, C7118pQa<? super T, ? extends EPa<? extends U>> pqa, boolean z, int i2, int i3) {
            this.c = gPa;
            this.d = pqa;
            this.e = z;
            this.f = i2;
            this.g = i3;
            if (i2 != Integer.MAX_VALUE) {
                this.q = new ArrayDeque(i2);
            }
            this.l = new AtomicReference<>(a);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.m, vPa)) {
                this.m = vPa;
                this.c.a((VPa) this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b(a<T, U> aVar) {
            a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (a[]) this.l.get();
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
                            obj = a;
                        } else {
                            a[] aVarArr2 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i2);
                            System.arraycopy(aVarArr, i2 + 1, aVarArr2, i2, (length - i2) - 1);
                            obj = aVarArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.l.compareAndSet(aVarArr, obj));
        }

        /* access modifiers changed from: 0000 */
        public boolean c() {
            this.m.dispose();
            a<?, ?>[] aVarArr = (a[]) this.l.get();
            a<?, ?>[] aVarArr2 = b;
            if (aVarArr != aVarArr2) {
                a<?, ?>[] aVarArr3 = (a[]) this.l.getAndSet(aVarArr2);
                if (aVarArr3 != b) {
                    for (a<?, ?> a2 : aVarArr3) {
                        a2.a();
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        public void dispose() {
            if (!this.k) {
                this.k = true;
                if (c()) {
                    Throwable a2 = this.j.a();
                    if (a2 != null && a2 != EUa.a) {
                        WUa.b(a2);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void e() {
            int i2;
            int i3;
            int i4;
            GPa<? super U> gPa = this.c;
            int i5 = 1;
            while (!b()) {
                MQa<U> mQa = this.h;
                if (mQa != null) {
                    while (!b()) {
                        Object poll = mQa.poll();
                        if (poll != null) {
                            gPa.a(poll);
                        }
                    }
                    return;
                }
                boolean z = this.i;
                MQa<U> mQa2 = this.h;
                a[] aVarArr = (a[]) this.l.get();
                int length = aVarArr.length;
                if (this.f != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i2 = this.q.size();
                    }
                } else {
                    i2 = 0;
                }
                if (!z || !((mQa2 == null || mQa2.isEmpty()) && length == 0 && i2 == 0)) {
                    if (length != 0) {
                        long j2 = this.o;
                        int i6 = this.p;
                        if (length <= i6 || aVarArr[i6].a != j2) {
                            if (length <= i6) {
                                i6 = 0;
                            }
                            int i7 = i6;
                            for (int i8 = 0; i8 < length && aVarArr[i7].a != j2; i8++) {
                                i7++;
                                if (i7 == length) {
                                    i7 = 0;
                                }
                            }
                            this.p = i7;
                            this.o = aVarArr[i7].a;
                            i6 = i7;
                        }
                        int i9 = 0;
                        i3 = 0;
                        while (i9 < length) {
                            if (!b()) {
                                a aVar = aVarArr[i4];
                                NQa<U> nQa = aVar.d;
                                if (nQa != null) {
                                    while (true) {
                                        try {
                                            Object poll2 = nQa.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            gPa.a(poll2);
                                            if (b()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            _Pa.b(th);
                                            aVar.a();
                                            this.j.a(th);
                                            if (!b()) {
                                                b(aVar);
                                                i3++;
                                                i4++;
                                                if (i4 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.c;
                                NQa<U> nQa2 = aVar.d;
                                if (z2 && (nQa2 == null || nQa2.isEmpty())) {
                                    b(aVar);
                                    if (!b()) {
                                        i3++;
                                    } else {
                                        return;
                                    }
                                }
                                i4++;
                                if (i4 != length) {
                                    i9++;
                                }
                                i4 = 0;
                                i9++;
                            } else {
                                return;
                            }
                        }
                        this.p = i4;
                        this.o = aVarArr[i4].a;
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        i5 = addAndGet(-i5);
                        if (i5 == 0) {
                            return;
                        }
                    } else if (this.f != Integer.MAX_VALUE) {
                        while (true) {
                            int i10 = i3 - 1;
                            if (i3 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                EPa ePa = (EPa) this.q.poll();
                                if (ePa == null) {
                                    this.r--;
                                } else {
                                    a(ePa);
                                }
                            }
                            i3 = i10;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable a2 = this.j.a();
                    if (a2 != EUa.a) {
                        if (a2 == null) {
                            gPa.onComplete();
                        } else {
                            gPa.a(a2);
                        }
                    }
                    return;
                }
            }
        }

        public void onComplete() {
            if (!this.i) {
                this.i = true;
                d();
            }
        }

        public void a(T t) {
            if (!this.i) {
                try {
                    Object apply = this.d.apply(t);
                    AQa.a(apply, "The mapper returned a null ObservableSource");
                    EPa ePa = (EPa) apply;
                    if (this.f != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.r == this.f) {
                                this.q.offer(ePa);
                                return;
                            }
                            this.r++;
                        }
                    }
                    a(ePa);
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.m.dispose();
                    a(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean b() {
            if (this.k) {
                return true;
            }
            Throwable th = (Throwable) this.j.get();
            if (this.e || th == null) {
                return false;
            }
            c();
            Throwable a2 = this.j.a();
            if (a2 != EUa.a) {
                this.c.a(a2);
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public void a(EPa<? extends U> ePa) {
            EPa<? extends U> ePa2;
            while (ePa instanceof Callable) {
                if (a((Callable) ePa) && this.f != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        ePa2 = (EPa) this.q.poll();
                        if (ePa2 == null) {
                            this.r--;
                            z = true;
                        }
                    }
                    if (z) {
                        d();
                        return;
                    }
                    ePa = ePa2;
                } else {
                    return;
                }
            }
            long j2 = this.n;
            this.n = 1 + j2;
            a aVar = new a(this, j2);
            if (a(aVar)) {
                ePa.a(aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.l.get();
                if (aVarArr == b) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.l.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    MQa<U> mQa = this.h;
                    if (mQa == null) {
                        int i2 = this.f;
                        if (i2 == Integer.MAX_VALUE) {
                            mQa = new ZTa<>(this.g);
                        } else {
                            mQa = new YTa<>(i2);
                        }
                        this.h = mQa;
                    }
                    if (!mQa.offer(call)) {
                        a((Throwable) new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.c.a(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                e();
                return true;
            } catch (Throwable th) {
                _Pa.b(th);
                this.j.a(th);
                d();
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(U u, a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                NQa nQa = aVar.d;
                if (nQa == null) {
                    nQa = new ZTa(this.g);
                    aVar.d = nQa;
                }
                nQa.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.c.a(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            e();
        }

        public void a(Throwable th) {
            if (this.i) {
                WUa.b(th);
                return;
            }
            if (this.j.a(th)) {
                this.i = true;
                d();
            } else {
                WUa.b(th);
            }
        }

        public boolean a() {
            return this.k;
        }
    }

    public CSa(EPa<T> ePa, C7118pQa<? super T, ? extends EPa<? extends U>> pqa, boolean z, int i, int i2) {
        super(ePa);
        this.b = pqa;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public void b(GPa<? super U> gPa) {
        if (!C6371eTa.a(this.a, gPa, this.b)) {
            EPa<T> ePa = this.a;
            b bVar = new b(gPa, this.b, this.c, this.d, this.e);
            ePa.a(bVar);
        }
    }
}
