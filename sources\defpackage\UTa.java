package defpackage;

/* renamed from: UTa reason: default package */
/* compiled from: SingleToFlowable */
public final class UTa<T> extends C7393tPa<T> {
    final MPa<? extends T> b;

    /* renamed from: UTa$a */
    /* compiled from: SingleToFlowable */
    static final class a<T> extends C7398tUa<T> implements KPa<T> {
        VPa c;

        a(C5551aBb<? super T> abb) {
            super(abb);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((C5619bBb) this);
            }
        }

        public void cancel() {
            super.cancel();
            this.c.dispose();
        }

        public void onSuccess(T t) {
            c(t);
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public UTa(MPa<? extends T> mPa) {
        this.b = mPa;
    }

    public void b(C5551aBb<? super T> abb) {
        this.b.a(new a(abb));
    }
}
