package defpackage;

/* renamed from: fTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableScan */
public final class C6439fTa<T> extends C6642iSa<T, T> {
    final C6504gQa<T, T, T> b;

    /* renamed from: fTa$a */
    /* compiled from: ObservableScan */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        final C6504gQa<T, T, T> b;
        VPa c;
        T d;
        boolean e;

        a(GPa<? super T> gPa, C6504gQa<T, T, T> gqa) {
            this.a = gPa;
            this.b = gqa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.c.dispose();
        }

        public void onComplete() {
            if (!this.e) {
                this.e = true;
                this.a.onComplete();
            }
        }

        public boolean a() {
            return this.c.a();
        }

        public void a(T t) {
            if (!this.e) {
                GPa<? super T> gPa = this.a;
                T t2 = this.d;
                if (t2 == null) {
                    this.d = t;
                    gPa.a(t);
                } else {
                    try {
                        T apply = this.b.apply(t2, t);
                        AQa.a(apply, "The value returned by the accumulator is null");
                        this.d = apply;
                        gPa.a(apply);
                    } catch (Throwable th) {
                        _Pa.b(th);
                        this.c.dispose();
                        a(th);
                    }
                }
            }
        }

        public void a(Throwable th) {
            if (this.e) {
                WUa.b(th);
                return;
            }
            this.e = true;
            this.a.a(th);
        }
    }

    public C6439fTa(EPa<T> ePa, C6504gQa<T, T, T> gqa) {
        super(ePa);
        this.b = gqa;
    }

    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
