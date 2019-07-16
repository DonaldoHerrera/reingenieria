package defpackage;

/* renamed from: XSa reason: default package */
/* compiled from: ObservableObserveOn */
public final class XSa<T> extends C6642iSa<T, T> {
    final HPa b;
    final boolean c;
    final int d;

    /* renamed from: XSa$a */
    /* compiled from: ObservableObserveOn */
    static final class a<T> extends PQa<T> implements GPa<T>, Runnable {
        final GPa<? super T> a;
        final c b;
        final boolean c;
        final int d;
        NQa<T> e;
        VPa f;
        Throwable g;
        volatile boolean h;
        volatile boolean i;
        int j;
        boolean k;

        a(GPa<? super T> gPa, c cVar, boolean z, int i2) {
            this.a = gPa;
            this.b = cVar;
            this.c = z;
            this.d = i2;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.f, vPa)) {
                this.f = vPa;
                if (vPa instanceof IQa) {
                    IQa iQa = (IQa) vPa;
                    int a2 = iQa.a(7);
                    if (a2 == 1) {
                        this.j = a2;
                        this.e = iQa;
                        this.h = true;
                        this.a.a((VPa) this);
                        d();
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
            int i2 = 1;
            while (!this.i) {
                boolean z = this.h;
                Throwable th = this.g;
                if (this.c || !z || th == null) {
                    this.a.a(null);
                    if (z) {
                        this.i = true;
                        Throwable th2 = this.g;
                        if (th2 != null) {
                            this.a.a(th2);
                        } else {
                            this.a.onComplete();
                        }
                        this.b.dispose();
                        return;
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    this.i = true;
                    this.a.a(th);
                    this.b.dispose();
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            NQa<T> nQa = this.e;
            GPa<? super T> gPa = this.a;
            int i2 = 1;
            while (!a(this.h, nQa.isEmpty(), gPa)) {
                while (true) {
                    boolean z = this.h;
                    try {
                        Object poll = nQa.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, gPa)) {
                            if (z2) {
                                i2 = addAndGet(-i2);
                                if (i2 == 0) {
                                    return;
                                }
                            } else {
                                gPa.a(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        _Pa.b(th);
                        this.i = true;
                        this.f.dispose();
                        nQa.clear();
                        gPa.a(th);
                        this.b.dispose();
                        return;
                    }
                }
            }
        }

        public void clear() {
            this.e.clear();
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            if (getAndIncrement() == 0) {
                this.b.a((Runnable) this);
            }
        }

        public void dispose() {
            if (!this.i) {
                this.i = true;
                this.f.dispose();
                this.b.dispose();
                if (getAndIncrement() == 0) {
                    this.e.clear();
                }
            }
        }

        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        public void onComplete() {
            if (!this.h) {
                this.h = true;
                d();
            }
        }

        public T poll() throws Exception {
            return this.e.poll();
        }

        public void run() {
            if (this.k) {
                b();
            } else {
                c();
            }
        }

        public void a(T t) {
            if (!this.h) {
                if (this.j != 2) {
                    this.e.offer(t);
                }
                d();
            }
        }

        public void a(Throwable th) {
            if (this.h) {
                WUa.b(th);
                return;
            }
            this.g = th;
            this.h = true;
            d();
        }

        public boolean a() {
            return this.i;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(boolean z, boolean z2, GPa<? super T> gPa) {
            if (this.i) {
                this.e.clear();
                return true;
            }
            if (z) {
                Throwable th = this.g;
                if (this.c) {
                    if (z2) {
                        this.i = true;
                        if (th != null) {
                            gPa.a(th);
                        } else {
                            gPa.onComplete();
                        }
                        this.b.dispose();
                        return true;
                    }
                } else if (th != null) {
                    this.i = true;
                    this.e.clear();
                    gPa.a(th);
                    this.b.dispose();
                    return true;
                } else if (z2) {
                    this.i = true;
                    gPa.onComplete();
                    this.b.dispose();
                    return true;
                }
            }
            return false;
        }

        public int a(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.k = true;
            return 2;
        }
    }

    public XSa(EPa<T> ePa, HPa hPa, boolean z, int i) {
        super(ePa);
        this.b = hPa;
        this.c = z;
        this.d = i;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        HPa hPa = this.b;
        if (hPa instanceof C7122pUa) {
            this.a.a(gPa);
            return;
        }
        this.a.a(new a(gPa, hPa.a(), this.c, this.d));
    }
}
