package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: oSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableConcatMapEager */
public final class C7051oSa<T, R> extends C6642iSa<T, R> {
    final C7118pQa<? super T, ? extends EPa<? extends R>> b;
    final DUa c;
    final int d;
    final int e;

    /* renamed from: oSa$a */
    /* compiled from: ObservableConcatMapEager */
    static final class a<T, R> extends AtomicInteger implements GPa<T>, VPa, YQa<R> {
        final GPa<? super R> a;
        final C7118pQa<? super T, ? extends EPa<? extends R>> b;
        final int c;
        final int d;
        final DUa e;
        final C7743yUa f = new C7743yUa();
        final ArrayDeque<XQa<R>> g = new ArrayDeque<>();
        NQa<T> h;
        VPa i;
        volatile boolean j;
        int k;
        volatile boolean l;
        XQa<R> m;
        int n;

        a(GPa<? super R> gPa, C7118pQa<? super T, ? extends EPa<? extends R>> pqa, int i2, int i3, DUa dUa) {
            this.a = gPa;
            this.b = pqa;
            this.c = i2;
            this.d = i3;
            this.e = dUa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.i, vPa)) {
                this.i = vPa;
                if (vPa instanceof IQa) {
                    IQa iQa = (IQa) vPa;
                    int a2 = iQa.a(3);
                    if (a2 == 1) {
                        this.k = a2;
                        this.h = iQa;
                        this.j = true;
                        this.a.a((VPa) this);
                        b();
                        return;
                    } else if (a2 == 2) {
                        this.k = a2;
                        this.h = iQa;
                        this.a.a((VPa) this);
                        return;
                    }
                }
                this.h = new ZTa(this.d);
                this.a.a((VPa) this);
            }
        }

        public void b() {
            if (getAndIncrement() == 0) {
                NQa<T> nQa = this.h;
                ArrayDeque<XQa<R>> arrayDeque = this.g;
                GPa<? super R> gPa = this.a;
                DUa dUa = this.e;
                int i2 = 1;
                while (true) {
                    int i3 = this.n;
                    while (true) {
                        if (i3 == this.c) {
                            break;
                        } else if (this.l) {
                            nQa.clear();
                            c();
                            return;
                        } else if (dUa != DUa.IMMEDIATE || ((Throwable) this.f.get()) == null) {
                            try {
                                Object poll = nQa.poll();
                                if (poll == null) {
                                    break;
                                }
                                Object apply = this.b.apply(poll);
                                AQa.a(apply, "The mapper returned a null ObservableSource");
                                EPa ePa = (EPa) apply;
                                XQa xQa = new XQa(this, this.d);
                                arrayDeque.offer(xQa);
                                ePa.a(xQa);
                                i3++;
                            } catch (Throwable th) {
                                _Pa.b(th);
                                this.i.dispose();
                                nQa.clear();
                                c();
                                this.f.a(th);
                                gPa.a(this.f.a());
                                return;
                            }
                        } else {
                            nQa.clear();
                            c();
                            gPa.a(this.f.a());
                            return;
                        }
                    }
                    this.n = i3;
                    if (this.l) {
                        nQa.clear();
                        c();
                        return;
                    } else if (dUa != DUa.IMMEDIATE || ((Throwable) this.f.get()) == null) {
                        XQa<R> xQa2 = this.m;
                        if (xQa2 == null) {
                            if (dUa != DUa.BOUNDARY || ((Throwable) this.f.get()) == null) {
                                boolean z = this.j;
                                XQa<R> xQa3 = (XQa) arrayDeque.poll();
                                boolean z2 = xQa3 == null;
                                if (!z || !z2) {
                                    if (!z2) {
                                        this.m = xQa3;
                                    }
                                    xQa2 = xQa3;
                                } else {
                                    if (((Throwable) this.f.get()) != null) {
                                        nQa.clear();
                                        c();
                                        gPa.a(this.f.a());
                                    } else {
                                        gPa.onComplete();
                                    }
                                    return;
                                }
                            } else {
                                nQa.clear();
                                c();
                                gPa.a(this.f.a());
                                return;
                            }
                        }
                        if (xQa2 != null) {
                            NQa c2 = xQa2.c();
                            while (!this.l) {
                                boolean b2 = xQa2.b();
                                if (dUa != DUa.IMMEDIATE || ((Throwable) this.f.get()) == null) {
                                    try {
                                        Object poll2 = c2.poll();
                                        boolean z3 = poll2 == null;
                                        if (b2 && z3) {
                                            this.m = null;
                                            this.n--;
                                        } else if (!z3) {
                                            gPa.a(poll2);
                                        }
                                    } catch (Throwable th2) {
                                        _Pa.b(th2);
                                        this.f.a(th2);
                                        this.m = null;
                                        this.n--;
                                    }
                                } else {
                                    nQa.clear();
                                    c();
                                    gPa.a(this.f.a());
                                    return;
                                }
                            }
                            nQa.clear();
                            c();
                            return;
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        nQa.clear();
                        c();
                        gPa.a(this.f.a());
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            XQa<R> xQa = this.m;
            if (xQa != null) {
                xQa.dispose();
            }
            while (true) {
                XQa xQa2 = (XQa) this.g.poll();
                if (xQa2 != null) {
                    xQa2.dispose();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            if (getAndIncrement() == 0) {
                do {
                    this.h.clear();
                    c();
                } while (decrementAndGet() != 0);
            }
        }

        public void dispose() {
            if (!this.l) {
                this.l = true;
                this.i.dispose();
                d();
            }
        }

        public void onComplete() {
            this.j = true;
            b();
        }

        public void a(T t) {
            if (this.k == 0) {
                this.h.offer(t);
            }
            b();
        }

        public void a(Throwable th) {
            if (this.f.a(th)) {
                this.j = true;
                b();
                return;
            }
            WUa.b(th);
        }

        public boolean a() {
            return this.l;
        }

        public void a(XQa<R> xQa, R r) {
            xQa.c().offer(r);
            b();
        }

        public void a(XQa<R> xQa, Throwable th) {
            if (this.f.a(th)) {
                if (this.e == DUa.IMMEDIATE) {
                    this.i.dispose();
                }
                xQa.d();
                b();
                return;
            }
            WUa.b(th);
        }

        public void a(XQa<R> xQa) {
            xQa.d();
            b();
        }
    }

    public C7051oSa(EPa<T> ePa, C7118pQa<? super T, ? extends EPa<? extends R>> pqa, DUa dUa, int i, int i2) {
        super(ePa);
        this.b = pqa;
        this.c = dUa;
        this.d = i;
        this.e = i2;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super R> gPa) {
        EPa<T> ePa = this.a;
        a aVar = new a(gPa, this.b, this.d, this.e, this.c);
        ePa.a(aVar);
    }
}
