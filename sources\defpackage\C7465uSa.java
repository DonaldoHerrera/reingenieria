package defpackage;

/* renamed from: uSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableDoOnEach */
public final class C7465uSa<T> extends C6642iSa<T, T> {
    final C6776kQa<? super T> b;
    final C6776kQa<? super Throwable> c;
    final C6368eQa d;
    final C6368eQa e;

    /* renamed from: uSa$a */
    /* compiled from: ObservableDoOnEach */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        final C6776kQa<? super T> b;
        final C6776kQa<? super Throwable> c;
        final C6368eQa d;
        final C6368eQa e;
        VPa f;
        boolean g;

        a(GPa<? super T> gPa, C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa, C6368eQa eqa2) {
            this.a = gPa;
            this.b = kqa;
            this.c = kqa2;
            this.d = eqa;
            this.e = eqa2;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.f, vPa)) {
                this.f = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.f.dispose();
        }

        public void onComplete() {
            if (!this.g) {
                try {
                    this.d.run();
                    this.g = true;
                    this.a.onComplete();
                    try {
                        this.e.run();
                    } catch (Throwable th) {
                        _Pa.b(th);
                        WUa.b(th);
                    }
                } catch (Throwable th2) {
                    _Pa.b(th2);
                    a(th2);
                }
            }
        }

        public boolean a() {
            return this.f.a();
        }

        public void a(T t) {
            if (!this.g) {
                try {
                    this.b.accept(t);
                    this.a.a(t);
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.f.dispose();
                    a(th);
                }
            }
        }

        public void a(Throwable th) {
            if (this.g) {
                WUa.b(th);
                return;
            }
            this.g = true;
            try {
                this.c.accept(th);
            } catch (Throwable th2) {
                _Pa.b(th2);
                th = new ZPa(th, th2);
            }
            this.a.a(th);
            try {
                this.e.run();
            } catch (Throwable th3) {
                _Pa.b(th3);
                WUa.b(th3);
            }
        }
    }

    public C7465uSa(EPa<T> ePa, C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa, C6368eQa eqa2) {
        super(ePa);
        this.b = kqa;
        this.c = kqa2;
        this.d = eqa;
        this.e = eqa2;
    }

    public void b(GPa<? super T> gPa) {
        EPa<T> ePa = this.a;
        a aVar = new a(gPa, this.b, this.c, this.d, this.e);
        ePa.a(aVar);
    }
}
