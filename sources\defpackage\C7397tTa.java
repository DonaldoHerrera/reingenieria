package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableZip */
public final class C7397tTa<T, R> extends APa<R> {
    final EPa<? extends T>[] a;
    final Iterable<? extends EPa<? extends T>> b;
    final C7118pQa<? super Object[], ? extends R> c;
    final int d;
    final boolean e;

    /* renamed from: tTa$a */
    /* compiled from: ObservableZip */
    static final class a<T, R> extends AtomicInteger implements VPa {
        final GPa<? super R> a;
        final C7118pQa<? super Object[], ? extends R> b;
        final b<T, R>[] c;
        final T[] d;
        final boolean e;
        volatile boolean f;

        a(GPa<? super R> gPa, C7118pQa<? super Object[], ? extends R> pqa, int i, boolean z) {
            this.a = gPa;
            this.b = pqa;
            this.c = new b[i];
            this.d = new Object[i];
            this.e = z;
        }

        public void a(EPa<? extends T>[] ePaArr, int i) {
            b<T, R>[] bVarArr = this.c;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new b<>(this, i);
            }
            lazySet(0);
            this.a.a((VPa) this);
            for (int i3 = 0; i3 < length && !this.f; i3++) {
                ePaArr[i3].a(bVarArr[i3]);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            d();
            c();
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            for (b<T, R> a2 : this.c) {
                a2.a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            for (b<T, R> bVar : this.c) {
                bVar.b.clear();
            }
        }

        public void dispose() {
            if (!this.f) {
                this.f = true;
                c();
                if (getAndIncrement() == 0) {
                    d();
                }
            }
        }

        public void e() {
            if (getAndIncrement() == 0) {
                b<T, R>[] bVarArr = this.c;
                GPa<? super R> gPa = this.a;
                T[] tArr = this.d;
                boolean z = this.e;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (b<T, R> bVar : bVarArr) {
                        if (tArr[i3] == null) {
                            boolean z2 = bVar.c;
                            T poll = bVar.b.poll();
                            boolean z3 = poll == null;
                            if (!a(z2, z3, gPa, z, bVar)) {
                                if (!z3) {
                                    tArr[i3] = poll;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (bVar.c && !z) {
                            Throwable th = bVar.d;
                            if (th != null) {
                                this.f = true;
                                b();
                                gPa.a(th);
                                return;
                            }
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            Object apply = this.b.apply(tArr.clone());
                            AQa.a(apply, "The zipper returned a null value");
                            gPa.a(apply);
                            Arrays.fill(tArr, null);
                        } catch (Throwable th2) {
                            _Pa.b(th2);
                            b();
                            gPa.a(th2);
                            return;
                        }
                    }
                }
            }
        }

        public boolean a() {
            return this.f;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(boolean z, boolean z2, GPa<? super R> gPa, boolean z3, b<?, ?> bVar) {
            if (this.f) {
                b();
                return true;
            }
            if (z) {
                if (!z3) {
                    Throwable th = bVar.d;
                    if (th != null) {
                        this.f = true;
                        b();
                        gPa.a(th);
                        return true;
                    } else if (z2) {
                        this.f = true;
                        b();
                        gPa.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = bVar.d;
                    this.f = true;
                    b();
                    if (th2 != null) {
                        gPa.a(th2);
                    } else {
                        gPa.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: tTa$b */
    /* compiled from: ObservableZip */
    static final class b<T, R> implements GPa<T> {
        final a<T, R> a;
        final ZTa<T> b;
        volatile boolean c;
        Throwable d;
        final AtomicReference<VPa> e = new AtomicReference<>();

        b(a<T, R> aVar, int i) {
            this.a = aVar;
            this.b = new ZTa<>(i);
        }

        public void a(VPa vPa) {
            C7463uQa.c(this.e, vPa);
        }

        public void onComplete() {
            this.c = true;
            this.a.e();
        }

        public void a(T t) {
            this.b.offer(t);
            this.a.e();
        }

        public void a(Throwable th) {
            this.d = th;
            this.c = true;
            this.a.e();
        }

        public void a() {
            C7463uQa.a(this.e);
        }
    }

    public C7397tTa(EPa<? extends T>[] ePaArr, Iterable<? extends EPa<? extends T>> iterable, C7118pQa<? super Object[], ? extends R> pqa, int i, boolean z) {
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
        if (i == 0) {
            C7532vQa.a(gPa);
        } else {
            new a(gPa, this.c, i, this.e).a(ePaArr, this.d);
        }
    }
}
