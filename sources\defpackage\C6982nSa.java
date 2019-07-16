package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableConcatMap */
public final class C6982nSa<T, U> extends C6642iSa<T, U> {
    final C7118pQa<? super T, ? extends EPa<? extends U>> b;
    final int c;
    final DUa d;

    /* renamed from: nSa$a */
    /* compiled from: ObservableConcatMap */
    static final class a<T, R> extends AtomicInteger implements GPa<T>, VPa {
        final GPa<? super R> a;
        final C7118pQa<? super T, ? extends EPa<? extends R>> b;
        final int c;
        final C7743yUa d = new C7743yUa();
        final C0183a<R> e;
        final boolean f;
        NQa<T> g;
        VPa h;
        volatile boolean i;
        volatile boolean j;
        volatile boolean k;
        int l;

        /* renamed from: nSa$a$a reason: collision with other inner class name */
        /* compiled from: ObservableConcatMap */
        static final class C0183a<R> extends AtomicReference<VPa> implements GPa<R> {
            final GPa<? super R> a;
            final a<?, R> b;

            C0183a(GPa<? super R> gPa, a<?, R> aVar) {
                this.a = gPa;
                this.b = aVar;
            }

            public void a(VPa vPa) {
                C7463uQa.a((AtomicReference<VPa>) this, vPa);
            }

            public void onComplete() {
                a<?, R> aVar = this.b;
                aVar.i = false;
                aVar.b();
            }

            public void a(R r) {
                this.a.a(r);
            }

            public void a(Throwable th) {
                a<?, R> aVar = this.b;
                if (aVar.d.a(th)) {
                    if (!aVar.f) {
                        aVar.h.dispose();
                    }
                    aVar.i = false;
                    aVar.b();
                    return;
                }
                WUa.b(th);
            }

            /* access modifiers changed from: 0000 */
            public void a() {
                C7463uQa.a((AtomicReference<VPa>) this);
            }
        }

        a(GPa<? super R> gPa, C7118pQa<? super T, ? extends EPa<? extends R>> pqa, int i2, boolean z) {
            this.a = gPa;
            this.b = pqa;
            this.c = i2;
            this.f = z;
            this.e = new C0183a<>(gPa, this);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.h, vPa)) {
                this.h = vPa;
                if (vPa instanceof IQa) {
                    IQa iQa = (IQa) vPa;
                    int a2 = iQa.a(3);
                    if (a2 == 1) {
                        this.l = a2;
                        this.g = iQa;
                        this.j = true;
                        this.a.a((VPa) this);
                        b();
                        return;
                    } else if (a2 == 2) {
                        this.l = a2;
                        this.g = iQa;
                        this.a.a((VPa) this);
                        return;
                    }
                }
                this.g = new ZTa(this.c);
                this.a.a((VPa) this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            if (getAndIncrement() == 0) {
                GPa<? super R> gPa = this.a;
                NQa<T> nQa = this.g;
                C7743yUa yua = this.d;
                while (true) {
                    if (!this.i) {
                        if (this.k) {
                            nQa.clear();
                            return;
                        } else if (this.f || ((Throwable) yua.get()) == null) {
                            boolean z = this.j;
                            try {
                                Object poll = nQa.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.k = true;
                                    Throwable a2 = yua.a();
                                    if (a2 != null) {
                                        gPa.a(a2);
                                    } else {
                                        gPa.onComplete();
                                    }
                                    return;
                                } else if (!z2) {
                                    try {
                                        Object apply = this.b.apply(poll);
                                        AQa.a(apply, "The mapper returned a null ObservableSource");
                                        EPa ePa = (EPa) apply;
                                        if (ePa instanceof Callable) {
                                            try {
                                                Object call = ((Callable) ePa).call();
                                                if (call != null && !this.k) {
                                                    gPa.a(call);
                                                }
                                            } catch (Throwable th) {
                                                _Pa.b(th);
                                                yua.a(th);
                                            }
                                        } else {
                                            this.i = true;
                                            ePa.a(this.e);
                                        }
                                    } catch (Throwable th2) {
                                        _Pa.b(th2);
                                        this.k = true;
                                        this.h.dispose();
                                        nQa.clear();
                                        yua.a(th2);
                                        gPa.a(yua.a());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                _Pa.b(th3);
                                this.k = true;
                                this.h.dispose();
                                yua.a(th3);
                                gPa.a(yua.a());
                                return;
                            }
                        } else {
                            nQa.clear();
                            this.k = true;
                            gPa.a(yua.a());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.k = true;
            this.h.dispose();
            this.e.a();
        }

        public void onComplete() {
            this.j = true;
            b();
        }

        public void a(T t) {
            if (this.l == 0) {
                this.g.offer(t);
            }
            b();
        }

        public void a(Throwable th) {
            if (this.d.a(th)) {
                this.j = true;
                b();
                return;
            }
            WUa.b(th);
        }

        public boolean a() {
            return this.k;
        }
    }

    /* renamed from: nSa$b */
    /* compiled from: ObservableConcatMap */
    static final class b<T, U> extends AtomicInteger implements GPa<T>, VPa {
        final GPa<? super U> a;
        final C7118pQa<? super T, ? extends EPa<? extends U>> b;
        final a<U> c;
        final int d;
        NQa<T> e;
        VPa f;
        volatile boolean g;
        volatile boolean h;
        volatile boolean i;
        int j;

        /* renamed from: nSa$b$a */
        /* compiled from: ObservableConcatMap */
        static final class a<U> extends AtomicReference<VPa> implements GPa<U> {
            final GPa<? super U> a;
            final b<?, ?> b;

            a(GPa<? super U> gPa, b<?, ?> bVar) {
                this.a = gPa;
                this.b = bVar;
            }

            public void a(VPa vPa) {
                C7463uQa.a((AtomicReference<VPa>) this, vPa);
            }

            public void onComplete() {
                this.b.c();
            }

            public void a(U u) {
                this.a.a(u);
            }

            public void a(Throwable th) {
                this.b.dispose();
                this.a.a(th);
            }

            /* access modifiers changed from: 0000 */
            public void a() {
                C7463uQa.a((AtomicReference<VPa>) this);
            }
        }

        b(GPa<? super U> gPa, C7118pQa<? super T, ? extends EPa<? extends U>> pqa, int i2) {
            this.a = gPa;
            this.b = pqa;
            this.d = i2;
            this.c = new a<>(gPa, this);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.f, vPa)) {
                this.f = vPa;
                if (vPa instanceof IQa) {
                    IQa iQa = (IQa) vPa;
                    int a2 = iQa.a(3);
                    if (a2 == 1) {
                        this.j = a2;
                        this.e = iQa;
                        this.i = true;
                        this.a.a((VPa) this);
                        b();
                        return;
                    } else if (a2 == 2) {
                        this.j = a2;
                        this.e = iQa;
                        this.a.a((VPa) this);
                        return;
                    }
                }
                this.e = new ZTa(this.d);
                this.a.a((VPa) this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            if (getAndIncrement() == 0) {
                while (!this.h) {
                    if (!this.g) {
                        boolean z = this.i;
                        try {
                            Object poll = this.e.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.h = true;
                                this.a.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.b.apply(poll);
                                    AQa.a(apply, "The mapper returned a null ObservableSource");
                                    EPa ePa = (EPa) apply;
                                    this.g = true;
                                    ePa.a(this.c);
                                } catch (Throwable th) {
                                    _Pa.b(th);
                                    dispose();
                                    this.e.clear();
                                    this.a.a(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            _Pa.b(th2);
                            dispose();
                            this.e.clear();
                            this.a.a(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.e.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            this.g = false;
            b();
        }

        public void dispose() {
            this.h = true;
            this.c.a();
            this.f.dispose();
            if (getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        public void onComplete() {
            if (!this.i) {
                this.i = true;
                b();
            }
        }

        public void a(T t) {
            if (!this.i) {
                if (this.j == 0) {
                    this.e.offer(t);
                }
                b();
            }
        }

        public void a(Throwable th) {
            if (this.i) {
                WUa.b(th);
                return;
            }
            this.i = true;
            dispose();
            this.a.a(th);
        }

        public boolean a() {
            return this.h;
        }
    }

    public C6982nSa(EPa<T> ePa, C7118pQa<? super T, ? extends EPa<? extends U>> pqa, int i, DUa dUa) {
        super(ePa);
        this.b = pqa;
        this.d = dUa;
        this.c = Math.max(8, i);
    }

    public void b(GPa<? super U> gPa) {
        if (!C6371eTa.a(this.a, gPa, this.b)) {
            DUa dUa = this.d;
            if (dUa == DUa.IMMEDIATE) {
                this.a.a(new b(new UUa(gPa), this.b, this.c));
            } else {
                this.a.a(new a(gPa, this.b, this.c, dUa == DUa.END));
            }
        }
    }
}
