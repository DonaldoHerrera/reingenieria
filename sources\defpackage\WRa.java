package defpackage;

/* renamed from: WRa reason: default package */
/* compiled from: MaybePeek */
public final class WRa<T> extends BRa<T, T> {
    final C6776kQa<? super VPa> b;
    final C6776kQa<? super T> c;
    final C6776kQa<? super Throwable> d;
    final C6368eQa e;
    final C6368eQa f;
    final C6368eQa g;

    /* renamed from: WRa$a */
    /* compiled from: MaybePeek */
    static final class a<T> implements C7600wPa<T>, VPa {
        final C7600wPa<? super T> a;
        final WRa<T> b;
        VPa c;

        a(C7600wPa<? super T> wpa, WRa<T> wRa) {
            this.a = wpa;
            this.b = wRa;
        }

        public boolean a() {
            return this.c.a();
        }

        /* access modifiers changed from: 0000 */
        public void b(Throwable th) {
            try {
                this.b.d.accept(th);
            } catch (Throwable th2) {
                _Pa.b(th2);
                th = new ZPa(th, th2);
            }
            this.c = C7463uQa.DISPOSED;
            this.a.a(th);
            b();
        }

        public void dispose() {
            try {
                this.b.g.run();
            } catch (Throwable th) {
                _Pa.b(th);
                WUa.b(th);
            }
            this.c.dispose();
            this.c = C7463uQa.DISPOSED;
        }

        public void onComplete() {
            if (this.c != C7463uQa.DISPOSED) {
                try {
                    this.b.e.run();
                    this.c = C7463uQa.DISPOSED;
                    this.a.onComplete();
                    b();
                } catch (Throwable th) {
                    _Pa.b(th);
                    b(th);
                }
            }
        }

        public void onSuccess(T t) {
            if (this.c != C7463uQa.DISPOSED) {
                try {
                    this.b.c.accept(t);
                    this.c = C7463uQa.DISPOSED;
                    this.a.onSuccess(t);
                    b();
                } catch (Throwable th) {
                    _Pa.b(th);
                    b(th);
                }
            }
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                try {
                    this.b.b.accept(vPa);
                    this.c = vPa;
                    this.a.a((VPa) this);
                } catch (Throwable th) {
                    _Pa.b(th);
                    vPa.dispose();
                    this.c = C7463uQa.DISPOSED;
                    C7532vQa.a(th, this.a);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            try {
                this.b.f.run();
            } catch (Throwable th) {
                _Pa.b(th);
                WUa.b(th);
            }
        }

        public void a(Throwable th) {
            if (this.c == C7463uQa.DISPOSED) {
                WUa.b(th);
            } else {
                b(th);
            }
        }
    }

    public WRa(C7669xPa<T> xpa, C6776kQa<? super VPa> kqa, C6776kQa<? super T> kqa2, C6776kQa<? super Throwable> kqa3, C6368eQa eqa, C6368eQa eqa2, C6368eQa eqa3) {
        super(xpa);
        this.b = kqa;
        this.c = kqa2;
        this.d = kqa3;
        this.e = eqa;
        this.f = eqa2;
        this.g = eqa3;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa, this));
    }
}
