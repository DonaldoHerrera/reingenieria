package defpackage;

/* renamed from: MTa reason: default package */
/* compiled from: SingleMap */
public final class MTa<T, R> extends IPa<R> {
    final MPa<? extends T> a;
    final C7118pQa<? super T, ? extends R> b;

    /* renamed from: MTa$a */
    /* compiled from: SingleMap */
    static final class a<T, R> implements KPa<T> {
        final KPa<? super R> a;
        final C7118pQa<? super T, ? extends R> b;

        a(KPa<? super R> kPa, C7118pQa<? super T, ? extends R> pqa) {
            this.a = kPa;
            this.b = pqa;
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.b.apply(t);
                AQa.a(apply, "The mapper function returned a null value.");
                this.a.onSuccess(apply);
            } catch (Throwable th) {
                _Pa.b(th);
                a(th);
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public MTa(MPa<? extends T> mPa, C7118pQa<? super T, ? extends R> pqa) {
        this.a = mPa;
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super R> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
