package defpackage;

/* renamed from: _Ra reason: default package */
/* compiled from: MaybeToObservable */
public final class _Ra<T> extends APa<T> implements EQa<T> {
    final C7669xPa<T> a;

    /* renamed from: _Ra$a */
    /* compiled from: MaybeToObservable */
    static final class a<T> extends UQa<T> implements C7600wPa<T> {
        VPa c;

        a(GPa<? super T> gPa) {
            super(gPa);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            super.dispose();
            this.c.dispose();
        }

        public void onComplete() {
            b();
        }

        public void onSuccess(T t) {
            b(t);
        }

        public void a(Throwable th) {
            b(th);
        }
    }

    public _Ra(C7669xPa<T> xpa) {
        this.a = xpa;
    }

    public static <T> C7600wPa<T> d(GPa<? super T> gPa) {
        return new a(gPa);
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.a.a(d(gPa));
    }
}
