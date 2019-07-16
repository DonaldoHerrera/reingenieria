package defpackage;

/* renamed from: ATa reason: default package */
/* compiled from: SingleDoOnError */
public final class ATa<T> extends IPa<T> {
    final MPa<T> a;
    final C6776kQa<? super Throwable> b;

    /* renamed from: ATa$a */
    /* compiled from: SingleDoOnError */
    final class a implements KPa<T> {
        private final KPa<? super T> a;

        a(KPa<? super T> kPa) {
            this.a = kPa;
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }

        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        public void a(Throwable th) {
            try {
                ATa.this.b.accept(th);
            } catch (Throwable th2) {
                _Pa.b(th2);
                th = new ZPa(th, th2);
            }
            this.a.a(th);
        }
    }

    public ATa(MPa<T> mPa, C6776kQa<? super Throwable> kqa) {
        this.a = mPa;
        this.b = kqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa));
    }
}
