package defpackage;

/* renamed from: UUa reason: default package */
/* compiled from: SerializedObserver */
public final class UUa<T> implements GPa<T>, VPa {
    final GPa<? super T> a;
    final boolean b;
    VPa c;
    boolean d;
    C7674xUa<Object> e;
    volatile boolean f;

    public UUa(GPa<? super T> gPa) {
        this(gPa, false);
    }

    public void a(VPa vPa) {
        if (C7463uQa.a(this.c, vPa)) {
            this.c = vPa;
            this.a.a((VPa) this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        C7674xUa<Object> xua;
        do {
            synchronized (this) {
                xua = this.e;
                if (xua == null) {
                    this.d = false;
                    return;
                }
                this.e = null;
            }
        } while (!xua.a(this.a));
    }

    public void dispose() {
        this.c.dispose();
    }

    public void onComplete() {
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    if (this.d) {
                        C7674xUa<Object> xua = this.e;
                        if (xua == null) {
                            xua = new C7674xUa<>(4);
                            this.e = xua;
                        }
                        xua.a(GUa.a());
                        return;
                    }
                    this.f = true;
                    this.d = true;
                    this.a.onComplete();
                }
            }
        }
    }

    public UUa(GPa<? super T> gPa, boolean z) {
        this.a = gPa;
        this.b = z;
    }

    public boolean a() {
        return this.c.a();
    }

    public void a(T t) {
        if (!this.f) {
            if (t == null) {
                this.c.dispose();
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f) {
                    if (this.d) {
                        C7674xUa<Object> xua = this.e;
                        if (xua == null) {
                            xua = new C7674xUa<>(4);
                            this.e = xua;
                        }
                        GUa.e(t);
                        xua.a(t);
                        return;
                    }
                    this.d = true;
                    this.a.a(t);
                    b();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        defpackage.WUa.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.a.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    public void a(Throwable th) {
        if (this.f) {
            WUa.b(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f) {
                if (this.d) {
                    this.f = true;
                    C7674xUa<Object> xua = this.e;
                    if (xua == null) {
                        xua = new C7674xUa<>(4);
                        this.e = xua;
                    }
                    Object a2 = GUa.a(th);
                    if (this.b) {
                        xua.a(a2);
                    } else {
                        xua.b(a2);
                    }
                } else {
                    this.f = true;
                    this.d = true;
                    z = false;
                }
            }
        }
    }
}
