package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableCombineLatest */
public final class C6914mSa<T, R> extends APa<R> {
    final EPa<? extends T>[] a;
    final Iterable<? extends EPa<? extends T>> b;
    final C7118pQa<? super Object[], ? extends R> c;
    final int d;
    final boolean e;

    /* renamed from: mSa$a */
    /* compiled from: ObservableCombineLatest */
    static final class a<T, R> extends AtomicReference<VPa> implements GPa<T> {
        final b<T, R> a;
        final int b;

        a(b<T, R> bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public void a(VPa vPa) {
            C7463uQa.c(this, vPa);
        }

        public void onComplete() {
            this.a.a(this.b);
        }

        public void a(T t) {
            this.a.a(this.b, t);
        }

        public void a(Throwable th) {
            this.a.a(this.b, th);
        }

        public void a() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }
    }

    /* renamed from: mSa$b */
    /* compiled from: ObservableCombineLatest */
    static final class b<T, R> extends AtomicInteger implements VPa {
        final GPa<? super R> a;
        final C7118pQa<? super Object[], ? extends R> b;
        final a<T, R>[] c;
        Object[] d;
        final ZTa<Object[]> e;
        final boolean f;
        volatile boolean g;
        volatile boolean h;
        final C7743yUa i = new C7743yUa();
        int j;
        int k;

        b(GPa<? super R> gPa, C7118pQa<? super Object[], ? extends R> pqa, int i2, int i3, boolean z) {
            this.a = gPa;
            this.b = pqa;
            this.f = z;
            this.d = new Object[i2];
            a<T, R>[] aVarArr = new a[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                aVarArr[i4] = new a<>(this, i4);
            }
            this.c = aVarArr;
            this.e = new ZTa<>(i3);
        }

        public void a(EPa<? extends T>[] ePaArr) {
            a<T, R>[] aVarArr = this.c;
            int length = aVarArr.length;
            this.a.a((VPa) this);
            for (int i2 = 0; i2 < length && !this.h && !this.g; i2++) {
                ePaArr[i2].a(aVarArr[i2]);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            for (a<T, R> a2 : this.c) {
                a2.a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            if (getAndIncrement() == 0) {
                ZTa<Object[]> zTa = this.e;
                GPa<? super R> gPa = this.a;
                boolean z = this.f;
                int i2 = 1;
                while (!this.g) {
                    if (z || this.i.get() == null) {
                        boolean z2 = this.h;
                        Object[] objArr = (Object[]) zTa.poll();
                        boolean z3 = objArr == null;
                        if (z2 && z3) {
                            a(zTa);
                            Throwable a2 = this.i.a();
                            if (a2 == null) {
                                gPa.onComplete();
                            } else {
                                gPa.a(a2);
                            }
                            return;
                        } else if (z3) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            try {
                                Object apply = this.b.apply(objArr);
                                AQa.a(apply, "The combiner returned a null value");
                                gPa.a(apply);
                            } catch (Throwable th) {
                                _Pa.b(th);
                                this.i.a(th);
                                b();
                                a(zTa);
                                gPa.a(this.i.a());
                                return;
                            }
                        }
                    } else {
                        b();
                        a(zTa);
                        gPa.a(this.i.a());
                        return;
                    }
                }
                a(zTa);
            }
        }

        public void dispose() {
            if (!this.g) {
                this.g = true;
                b();
                if (getAndIncrement() == 0) {
                    a(this.e);
                }
            }
        }

        public boolean a() {
            return this.g;
        }

        /* access modifiers changed from: 0000 */
        public void a(ZTa<?> zTa) {
            synchronized (this) {
                this.d = null;
            }
            zTa.clear();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            return;
         */
        public void a(int i2, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.d;
                if (objArr != null) {
                    Object obj = objArr[i2];
                    int i3 = this.j;
                    if (obj == null) {
                        i3++;
                        this.j = i3;
                    }
                    objArr[i2] = t;
                    if (i3 == objArr.length) {
                        this.e.offer(objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        public void a(int i2, Throwable th) {
            boolean z;
            if (this.i.a(th)) {
                if (this.f) {
                    synchronized (this) {
                        Object[] objArr = this.d;
                        if (objArr != null) {
                            z = objArr[i2] == null;
                            if (!z) {
                                int i3 = this.k + 1;
                                this.k = i3;
                            }
                            this.h = true;
                        } else {
                            return;
                        }
                    }
                } else {
                    z = true;
                }
                if (z) {
                    b();
                }
                c();
            } else {
                WUa.b(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        public void a(int i2) {
            synchronized (this) {
                Object[] objArr = this.d;
                if (objArr != null) {
                    boolean z = objArr[i2] == null;
                    if (!z) {
                        int i3 = this.k + 1;
                        this.k = i3;
                    }
                    this.h = true;
                }
            }
        }
    }

    public C6914mSa(EPa<? extends T>[] ePaArr, Iterable<? extends EPa<? extends T>> iterable, C7118pQa<? super Object[], ? extends R> pqa, int i, boolean z) {
        this.a = ePaArr;
        this.b = iterable;
        this.c = pqa;
        this.d = i;
        this.e = z;
    }

    public void b(GPa<? super R> gPa) {
        int i;
        EPa<? extends T>[] ePaArr = this.a;
        if (ePaArr == null) {
            ePaArr = new APa[8];
            i = 0;
            for (EPa<? extends T> ePa : this.b) {
                if (i == ePaArr.length) {
                    EPa<? extends T>[] ePaArr2 = new EPa[((i >> 2) + i)];
                    System.arraycopy(ePaArr, 0, ePaArr2, 0, i);
                    ePaArr = ePaArr2;
                }
                int i2 = i + 1;
                ePaArr[i] = ePa;
                i = i2;
            }
        } else {
            i = ePaArr.length;
        }
        int i3 = i;
        if (i3 == 0) {
            C7532vQa.a(gPa);
            return;
        }
        b bVar = new b(gPa, this.c, i3, this.d, this.e);
        bVar.a(ePaArr);
    }
}
