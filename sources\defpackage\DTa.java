package defpackage;

/* renamed from: DTa reason: default package */
/* compiled from: SingleDoOnSuccess */
public final class DTa<T> extends IPa<T> {
    final MPa<T> a;
    final C6776kQa<? super T> b;

    /* renamed from: DTa$a */
    /* compiled from: SingleDoOnSuccess */
    final class a implements KPa<T> {
        final KPa<? super T> a;

        a(KPa<? super T> kPa) {
            this.a = kPa;
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }

        public void onSuccess(T t) {
            try {
                DTa.this.b.accept(t);
                this.a.onSuccess(t);
            } catch (Throwable th) {
                _Pa.b(th);
                this.a.a(th);
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public DTa(MPa<T> mPa, C6776kQa<? super T> kqa) {
        this.a = mPa;
        this.b = kqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa));
    }
}
