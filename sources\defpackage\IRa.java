package defpackage;

/* renamed from: IRa reason: default package */
/* compiled from: MaybeFilter */
public final class IRa<T> extends BRa<T, T> {
    final C7256rQa<? super T> b;

    /* renamed from: IRa$a */
    /* compiled from: MaybeFilter */
    static final class a<T> implements C7600wPa<T>, VPa {
        final C7600wPa<? super T> a;
        final C7256rQa<? super T> b;
        VPa c;

        a(C7600wPa<? super T> wpa, C7256rQa<? super T> rqa) {
            this.a = wpa;
            this.b = rqa;
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
                if (this.b.test(t)) {
                    this.a.onSuccess(t);
                } else {
                    this.a.onComplete();
                }
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

    public IRa(C7669xPa<T> xpa, C7256rQa<? super T> rqa) {
        super(xpa);
        this.b = rqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
