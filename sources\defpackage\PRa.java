package defpackage;

/* renamed from: PRa reason: default package */
/* compiled from: MaybeFromSingle */
public final class PRa<T> extends C7531vPa<T> implements HQa<T> {
    final MPa<T> a;

    /* renamed from: PRa$a */
    /* compiled from: MaybeFromSingle */
    static final class a<T> implements KPa<T>, VPa {
        final C7600wPa<? super T> a;
        VPa b;

        a(C7600wPa<? super T> wpa) {
            this.a = wpa;
        }

        public boolean a() {
            return this.b.a();
        }

        public void dispose() {
            this.b.dispose();
            this.b = C7463uQa.DISPOSED;
        }

        public void onSuccess(T t) {
            this.b = C7463uQa.DISPOSED;
            this.a.onSuccess(t);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.b, vPa)) {
                this.b = vPa;
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.b = C7463uQa.DISPOSED;
            this.a.a(th);
        }
    }

    public PRa(MPa<T> mPa) {
        this.a = mPa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa));
    }
}
