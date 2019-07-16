package defpackage;

/* renamed from: VTa reason: default package */
/* compiled from: SingleToObservable */
public final class VTa<T> extends APa<T> {
    final MPa<? extends T> a;

    /* renamed from: VTa$a */
    /* compiled from: SingleToObservable */
    static final class a<T> extends UQa<T> implements KPa<T> {
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

        public void onSuccess(T t) {
            b(t);
        }

        public void a(Throwable th) {
            b(th);
        }
    }

    public VTa(MPa<? extends T> mPa) {
        this.a = mPa;
    }

    public static <T> KPa<T> d(GPa<? super T> gPa) {
        return new a(gPa);
    }

    public void b(GPa<? super T> gPa) {
        this.a.a(d(gPa));
    }
}
