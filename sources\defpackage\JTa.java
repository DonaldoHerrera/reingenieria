package defpackage;

/* renamed from: JTa reason: default package */
/* compiled from: SingleHide */
public final class JTa<T> extends IPa<T> {
    final MPa<? extends T> a;

    /* renamed from: JTa$a */
    /* compiled from: SingleHide */
    static final class a<T> implements KPa<T>, VPa {
        final KPa<? super T> a;
        VPa b;

        a(KPa<? super T> kPa) {
            this.a = kPa;
        }

        public boolean a() {
            return this.b.a();
        }

        public void dispose() {
            this.b.dispose();
        }

        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.b, vPa)) {
                this.b = vPa;
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public JTa(MPa<? extends T> mPa) {
        this.a = mPa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa));
    }
}
