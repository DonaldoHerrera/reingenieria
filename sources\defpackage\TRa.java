package defpackage;

/* renamed from: TRa reason: default package */
/* compiled from: MaybeMap */
public final class TRa<T, R> extends BRa<T, R> {
    final C7118pQa<? super T, ? extends R> b;

    /* renamed from: TRa$a */
    /* compiled from: MaybeMap */
    static final class a<T, R> implements C7600wPa<T>, VPa {
        final C7600wPa<? super R> a;
        final C7118pQa<? super T, ? extends R> b;
        VPa c;

        a(C7600wPa<? super R> wpa, C7118pQa<? super T, ? extends R> pqa) {
            this.a = wpa;
            this.b = pqa;
        }

        public boolean a() {
            return this.c.a();
        }

        public void dispose() {
            VPa vPa = this.c;
            this.c = C7463uQa.DISPOSED;
            vPa.dispose();
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.b.apply(t);
                AQa.a(apply, "The mapper returned a null item");
                this.a.onSuccess(apply);
            } catch (Throwable th) {
                _Pa.b(th);
                this.a.a(th);
            }
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public TRa(C7669xPa<T> xpa, C7118pQa<? super T, ? extends R> pqa) {
        super(xpa);
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super R> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
