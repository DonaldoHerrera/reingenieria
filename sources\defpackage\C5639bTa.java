package defpackage;

/* renamed from: bTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableReduceSeedSingle */
public final class C5639bTa<T, R> extends IPa<R> {
    final EPa<T> a;
    final R b;
    final C6504gQa<R, ? super T, R> c;

    /* renamed from: bTa$a */
    /* compiled from: ObservableReduceSeedSingle */
    static final class a<T, R> implements GPa<T>, VPa {
        final KPa<? super R> a;
        final C6504gQa<R, ? super T, R> b;
        R c;
        VPa d;

        a(KPa<? super R> kPa, C6504gQa<R, ? super T, R> gqa, R r) {
            this.a = kPa;
            this.c = r;
            this.b = gqa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.d, vPa)) {
                this.d = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.d.dispose();
        }

        public void onComplete() {
            R r = this.c;
            if (r != null) {
                this.c = null;
                this.a.onSuccess(r);
            }
        }

        public void a(T t) {
            R r = this.c;
            if (r != null) {
                try {
                    R apply = this.b.apply(r, t);
                    AQa.a(apply, "The reducer returned a null value");
                    this.c = apply;
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.d.dispose();
                    a(th);
                }
            }
        }

        public void a(Throwable th) {
            if (this.c != null) {
                this.c = null;
                this.a.a(th);
                return;
            }
            WUa.b(th);
        }

        public boolean a() {
            return this.d.a();
        }
    }

    public C5639bTa(EPa<T> ePa, R r, C6504gQa<R, ? super T, R> gqa) {
        this.a = ePa;
        this.b = r;
        this.c = gqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super R> kPa) {
        this.a.a(new a(kPa, this.c, this.b));
    }
}
