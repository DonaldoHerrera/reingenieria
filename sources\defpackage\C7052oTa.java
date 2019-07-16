package defpackage;

/* renamed from: oTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableTakeUntilPredicate */
public final class C7052oTa<T> extends C6642iSa<T, T> {
    final C7256rQa<? super T> b;

    /* renamed from: oTa$a */
    /* compiled from: ObservableTakeUntilPredicate */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        final C7256rQa<? super T> b;
        VPa c;
        boolean d;

        a(GPa<? super T> gPa, C7256rQa<? super T> rqa) {
            this.a = gPa;
            this.b = rqa;
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
            if (!this.d) {
                this.d = true;
                this.a.onComplete();
            }
        }

        public boolean a() {
            return this.c.a();
        }

        public void a(T t) {
            if (!this.d) {
                this.a.a(t);
                try {
                    if (this.b.test(t)) {
                        this.d = true;
                        this.c.dispose();
                        this.a.onComplete();
                    }
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.c.dispose();
                    a(th);
                }
            }
        }

        public void a(Throwable th) {
            if (!this.d) {
                this.d = true;
                this.a.a(th);
                return;
            }
            WUa.b(th);
        }
    }

    public C7052oTa(EPa<T> ePa, C7256rQa<? super T> rqa) {
        super(ePa);
        this.b = rqa;
    }

    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
