package defpackage;

/* renamed from: BTa reason: default package */
/* compiled from: SingleDoOnEvent */
public final class BTa<T> extends IPa<T> {
    final MPa<T> a;
    final C6436fQa<? super T, ? super Throwable> b;

    /* renamed from: BTa$a */
    /* compiled from: SingleDoOnEvent */
    final class a implements KPa<T> {
        private final KPa<? super T> a;

        a(KPa<? super T> kPa) {
            this.a = kPa;
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }

        public void onSuccess(T t) {
            try {
                BTa.this.b.accept(t, null);
                this.a.onSuccess(t);
            } catch (Throwable th) {
                _Pa.b(th);
                this.a.a(th);
            }
        }

        public void a(Throwable th) {
            try {
                BTa.this.b.accept(null, th);
            } catch (Throwable th2) {
                _Pa.b(th2);
                th = new ZPa(th, th2);
            }
            this.a.a(th);
        }
    }

    public BTa(MPa<T> mPa, C6436fQa<? super T, ? super Throwable> fqa) {
        this.a = mPa;
        this.b = fqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa));
    }
}
