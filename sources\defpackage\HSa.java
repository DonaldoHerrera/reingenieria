package defpackage;

/* renamed from: HSa reason: default package */
/* compiled from: ObservableFlattenIterable */
public final class HSa<T, R> extends C6642iSa<T, R> {
    final C7118pQa<? super T, ? extends Iterable<? extends R>> b;

    /* renamed from: HSa$a */
    /* compiled from: ObservableFlattenIterable */
    static final class a<T, R> implements GPa<T>, VPa {
        final GPa<? super R> a;
        final C7118pQa<? super T, ? extends Iterable<? extends R>> b;
        VPa c;

        a(GPa<? super R> gPa, C7118pQa<? super T, ? extends Iterable<? extends R>> pqa) {
            this.a = gPa;
            this.b = pqa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.c.dispose();
            this.c = C7463uQa.DISPOSED;
        }

        public void onComplete() {
            VPa vPa = this.c;
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (vPa != uqa) {
                this.c = uqa;
                this.a.onComplete();
            }
        }

        public void a(T t) {
            if (this.c != C7463uQa.DISPOSED) {
                try {
                    GPa<? super R> gPa = this.a;
                    for (Object next : (Iterable) this.b.apply(t)) {
                        try {
                            try {
                                AQa.a(next, "The iterator returned a null value");
                                gPa.a(next);
                            } catch (Throwable th) {
                                _Pa.b(th);
                                this.c.dispose();
                                a(th);
                            }
                        } catch (Throwable th2) {
                            _Pa.b(th2);
                            this.c.dispose();
                            a(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    _Pa.b(th3);
                    this.c.dispose();
                    a(th3);
                }
            }
        }

        public void a(Throwable th) {
            VPa vPa = this.c;
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (vPa == uqa) {
                WUa.b(th);
                return;
            }
            this.c = uqa;
            this.a.a(th);
        }

        public boolean a() {
            return this.c.a();
        }
    }

    public HSa(EPa<T> ePa, C7118pQa<? super T, ? extends Iterable<? extends R>> pqa) {
        super(ePa);
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super R> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
