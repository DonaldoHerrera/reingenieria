package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sRa reason: default package and case insensitive filesystem */
/* compiled from: FlowableFlatMap */
public final class C7326sRa<T, U> extends C7257rRa<T, U> {

    /* renamed from: sRa$a */
    /* compiled from: FlowableFlatMap */
    static final class a<T, U> extends AtomicReference<C5619bBb> implements C7462uPa<U>, VPa {
        final long a;
        final b<T, U> b;
        final int c = (this.d >> 2);
        final int d;
        volatile boolean e;
        volatile NQa<U> f;
        long g;
        int h;

        a(b<T, U> bVar, long j) {
            this.a = j;
            this.b = bVar;
            this.d = bVar.g;
        }

        public void a(C5619bBb bbb) {
            if (C7605wUa.a((AtomicReference<C5619bBb>) this, bbb)) {
                if (bbb instanceof KQa) {
                    KQa kQa = (KQa) bbb;
                    int a2 = kQa.a(7);
                    if (a2 == 1) {
                        this.h = a2;
                        this.f = kQa;
                        this.e = true;
                        this.b.d();
                        return;
                    } else if (a2 == 2) {
                        this.h = a2;
                        this.f = kQa;
                    }
                }
                bbb.a((long) this.d);
            }
        }

        public void dispose() {
            C7605wUa.a((AtomicReference<C5619bBb>) this);
        }

        public void onComplete() {
            this.e = true;
            this.b.d();
        }

        public void a(U u) {
            if (this.h != 2) {
                this.b.a(u, this);
            } else {
                this.b.d();
            }
        }

        public void a(Throwable th) {
            lazySet(C7605wUa.CANCELLED);
            this.b.a(this, th);
        }

        /* access modifiers changed from: 0000 */
        public void a(long j) {
            if (this.h != 1) {
                long j2 = this.g + j;
                if (j2 >= ((long) this.c)) {
                    this.g = 0;
                    ((C5619bBb) get()).a(j2);
                    return;
                }
                this.g = j2;
            }
        }

        public boolean a() {
            return get() == C7605wUa.CANCELLED;
        }
    }

    /* renamed from: sRa$b */
    /* compiled from: FlowableFlatMap */
    static final class b<T, U> extends AtomicInteger implements C7462uPa<T>, C5619bBb {
        static final a<?, ?>[] a = new a[0];
        static final a<?, ?>[] b = new a[0];
        final C5551aBb<? super U> c;
        final C7118pQa<? super T, ? extends _Ab<? extends U>> d;
        final boolean e;
        final int f;
        final int g;
        volatile MQa<U> h;
        volatile boolean i;
        final C7743yUa j = new C7743yUa();
        volatile boolean k;
        final AtomicReference<a<?, ?>[]> l = new AtomicReference<>();
        final AtomicLong m = new AtomicLong();
        C5619bBb n;
        long o;
        long p;
        int q;
        int r;
        final int s;

        b(C5551aBb<? super U> abb, C7118pQa<? super T, ? extends _Ab<? extends U>> pqa, boolean z, int i2, int i3) {
            this.c = abb;
            this.d = pqa;
            this.e = z;
            this.f = i2;
            this.g = i3;
            this.s = Math.max(1, i2 >> 1);
            this.l.lazySet(a);
        }

        public void a(C5619bBb bbb) {
            if (C7605wUa.a(this.n, bbb)) {
                this.n = bbb;
                this.c.a((C5619bBb) this);
                if (!this.k) {
                    int i2 = this.f;
                    if (i2 == Integer.MAX_VALUE) {
                        bbb.a(Long.MAX_VALUE);
                    } else {
                        bbb.a((long) i2);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public NQa<U> b(a<T, U> aVar) {
            NQa<U> nQa = aVar.f;
            if (nQa != null) {
                return nQa;
            }
            YTa yTa = new YTa(this.g);
            aVar.f = yTa;
            return yTa;
        }

        /* access modifiers changed from: 0000 */
        public void c(a<T, U> aVar) {
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

        public void cancel() {
            if (!this.k) {
                this.k = true;
                this.n.cancel();
                c();
                if (getAndIncrement() == 0) {
                    MQa<U> mQa = this.h;
                    if (mQa != null) {
                        mQa.clear();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        /* access modifiers changed from: 0000 */
        public void e() {
            long j2;
            long j3;
            int i2;
            long j4;
            long j5;
            boolean z;
            a[] aVarArr;
            int i3;
            long j6;
            C5551aBb<? super U> abb = this.c;
            int i4 = 1;
            while (!a()) {
                MQa<U> mQa = this.h;
                long j7 = this.m.get();
                boolean z2 = j7 == Long.MAX_VALUE;
                long j8 = 0;
                if (mQa != null) {
                    j2 = 0;
                    while (true) {
                        long j9 = 0;
                        Object obj = null;
                        while (true) {
                            if (j7 == 0) {
                                break;
                            }
                            Object poll = mQa.poll();
                            if (!a()) {
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                abb.a(poll);
                                j2++;
                                j9++;
                                j7--;
                                obj = poll;
                            } else {
                                return;
                            }
                        }
                        if (j9 != 0) {
                            if (z2) {
                                j7 = Long.MAX_VALUE;
                            } else {
                                j7 = this.m.addAndGet(-j9);
                            }
                        }
                        if (j7 == 0 || obj == null) {
                            break;
                        }
                    }
                } else {
                    j2 = 0;
                }
                boolean z3 = this.i;
                MQa<U> mQa2 = this.h;
                a[] aVarArr2 = (a[]) this.l.get();
                int length = aVarArr2.length;
                if (!z3 || ((mQa2 != null && !mQa2.isEmpty()) || length != 0)) {
                    if (length != 0) {
                        i2 = i4;
                        long j10 = this.p;
                        int i5 = this.q;
                        if (length <= i5 || aVarArr2[i5].a != j10) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && aVarArr2[i6].a != j10; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.q = i6;
                            this.p = aVarArr2[i6].a;
                            i5 = i6;
                        }
                        int i8 = i5;
                        z = false;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length) {
                                aVarArr = aVarArr2;
                                break;
                            } else if (!a()) {
                                a aVar = aVarArr2[i8];
                                Object obj2 = null;
                                while (!a()) {
                                    NQa<U> nQa = aVar.f;
                                    if (nQa == null) {
                                        aVarArr = aVarArr2;
                                        i3 = length;
                                    } else {
                                        i3 = length;
                                        Object obj3 = obj2;
                                        aVarArr = aVarArr2;
                                        long j11 = j8;
                                        while (true) {
                                            if (j3 == j8) {
                                                break;
                                            }
                                            try {
                                                Object poll2 = nQa.poll();
                                                if (poll2 == null) {
                                                    obj3 = poll2;
                                                    j8 = 0;
                                                    break;
                                                }
                                                abb.a(poll2);
                                                if (!a()) {
                                                    j3--;
                                                    j11++;
                                                    obj3 = poll2;
                                                    j8 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                _Pa.b(th2);
                                                aVar.dispose();
                                                this.j.a(th2);
                                                if (!this.e) {
                                                    this.n.cancel();
                                                }
                                                if (!a()) {
                                                    c(aVar);
                                                    i9++;
                                                    z = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j11 != j8) {
                                            j3 = !z2 ? this.m.addAndGet(-j11) : Long.MAX_VALUE;
                                            aVar.a(j11);
                                            j6 = 0;
                                        } else {
                                            j6 = j8;
                                        }
                                        if (!(j3 == j6 || obj3 == null)) {
                                            aVarArr2 = aVarArr;
                                            length = i3;
                                            obj2 = obj3;
                                            j8 = 0;
                                        }
                                    }
                                    boolean z4 = aVar.e;
                                    NQa<U> nQa2 = aVar.f;
                                    if (z4 && (nQa2 == null || nQa2.isEmpty())) {
                                        c(aVar);
                                        if (!a()) {
                                            j2++;
                                            z = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j3 == 0) {
                                        break;
                                    }
                                    int i10 = i8 + 1;
                                    i8 = i10 == i3 ? 0 : i10;
                                    i9++;
                                    aVarArr2 = aVarArr;
                                    length = i3;
                                    j8 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.q = i8;
                        this.p = aVarArr[i8].a;
                        j5 = j2;
                        j4 = 0;
                    } else {
                        i2 = i4;
                        j4 = 0;
                        j5 = j2;
                        z = false;
                    }
                    if (j5 != j4 && !this.k) {
                        this.n.a(j5);
                    }
                    if (z) {
                        i4 = i2;
                    } else {
                        i4 = addAndGet(-i2);
                        if (i4 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable a2 = this.j.a();
                    if (a2 != EUa.a) {
                        if (a2 == null) {
                            abb.onComplete();
                        } else {
                            abb.a(a2);
                        }
                    }
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public NQa<U> f() {
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
            return mQa;
        }

        public void onComplete() {
            if (!this.i) {
                this.i = true;
                d();
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            MQa<U> mQa = this.h;
            if (mQa != null) {
                mQa.clear();
            }
        }

        public void a(T t) {
            if (!this.i) {
                try {
                    Object apply = this.d.apply(t);
                    AQa.a(apply, "The mapper returned a null Publisher");
                    _Ab _ab = (_Ab) apply;
                    if (_ab instanceof Callable) {
                        try {
                            Object call = ((Callable) _ab).call();
                            if (call != null) {
                                c((U) call);
                            } else if (this.f != Integer.MAX_VALUE && !this.k) {
                                int i2 = this.r + 1;
                                this.r = i2;
                                int i3 = this.s;
                                if (i2 == i3) {
                                    this.r = 0;
                                    this.n.a((long) i3);
                                }
                            }
                        } catch (Throwable th) {
                            _Pa.b(th);
                            this.j.a(th);
                            d();
                        }
                    } else {
                        long j2 = this.o;
                        this.o = 1 + j2;
                        a aVar = new a(this, j2);
                        if (a(aVar)) {
                            _ab.a(aVar);
                        }
                    }
                } catch (Throwable th2) {
                    _Pa.b(th2);
                    this.n.cancel();
                    a(th2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void c(U u) {
            String str = "Scalar queue full?!";
            if (get() == 0 && compareAndSet(0, 1)) {
                long j2 = this.m.get();
                NQa nQa = this.h;
                if (j2 == 0 || (nQa != null && !nQa.isEmpty())) {
                    if (nQa == null) {
                        nQa = f();
                    }
                    if (!nQa.offer(u)) {
                        a((Throwable) new IllegalStateException(str));
                        return;
                    }
                } else {
                    this.c.a(u);
                    if (j2 != Long.MAX_VALUE) {
                        this.m.decrementAndGet();
                    }
                    if (this.f != Integer.MAX_VALUE && !this.k) {
                        int i2 = this.r + 1;
                        this.r = i2;
                        int i3 = this.s;
                        if (i2 == i3) {
                            this.r = 0;
                            this.n.a((long) i3);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!f().offer(u)) {
                a((Throwable) new IllegalStateException(str));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            e();
        }

        /* access modifiers changed from: 0000 */
        public boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.l.get();
                if (aVarArr == b) {
                    aVar.dispose();
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
        public void c() {
            a<?, ?>[] aVarArr = (a[]) this.l.get();
            a<?, ?>[] aVarArr2 = b;
            if (aVarArr != aVarArr2) {
                a<?, ?>[] aVarArr3 = (a[]) this.l.getAndSet(aVarArr2);
                if (aVarArr3 != b) {
                    for (a<?, ?> dispose : aVarArr3) {
                        dispose.dispose();
                    }
                    Throwable a2 = this.j.a();
                    if (a2 != null && a2 != EUa.a) {
                        WUa.b(a2);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(U u, a<T, U> aVar) {
            String str = "Inner queue full?!";
            if (get() != 0 || !compareAndSet(0, 1)) {
                NQa nQa = aVar.f;
                if (nQa == null) {
                    nQa = new YTa(this.g);
                    aVar.f = nQa;
                }
                if (!nQa.offer(u)) {
                    a((Throwable) new C5568aQa(str));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j2 = this.m.get();
                NQa<U> nQa2 = aVar.f;
                if (j2 == 0 || (nQa2 != null && !nQa2.isEmpty())) {
                    if (nQa2 == null) {
                        nQa2 = b(aVar);
                    }
                    if (!nQa2.offer(u)) {
                        a((Throwable) new C5568aQa(str));
                        return;
                    }
                } else {
                    this.c.a(u);
                    if (j2 != Long.MAX_VALUE) {
                        this.m.decrementAndGet();
                    }
                    aVar.a(1);
                }
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

        public void a(long j2) {
            if (C7605wUa.b(j2)) {
                C7812zUa.a(this.m, j2);
                d();
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a() {
            if (this.k) {
                b();
                return true;
            } else if (this.e || this.j.get() == null) {
                return false;
            } else {
                b();
                Throwable a2 = this.j.a();
                if (a2 != EUa.a) {
                    this.c.a(a2);
                }
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(a<T, U> aVar, Throwable th) {
            if (this.j.a(th)) {
                aVar.e = true;
                if (!this.e) {
                    this.n.cancel();
                    for (a dispose : (a[]) this.l.getAndSet(b)) {
                        dispose.dispose();
                    }
                }
                d();
                return;
            }
            WUa.b(th);
        }
    }

    public static <T, U> C7462uPa<T> a(C5551aBb<? super U> abb, C7118pQa<? super T, ? extends _Ab<? extends U>> pqa, boolean z, int i, int i2) {
        b bVar = new b(abb, pqa, z, i, i2);
        return bVar;
    }
}
