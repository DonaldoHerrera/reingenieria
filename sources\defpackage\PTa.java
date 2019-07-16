package defpackage;

/* renamed from: PTa reason: default package */
/* compiled from: SingleOnErrorReturn */
public final class PTa<T> extends IPa<T> {
    final MPa<? extends T> a;
    final C7118pQa<? super Throwable, ? extends T> b;
    final T c;

    /* renamed from: PTa$a */
    /* compiled from: SingleOnErrorReturn */
    final class a implements KPa<T> {
        private final KPa<? super T> a;

        a(KPa<? super T> kPa) {
            this.a = kPa;
        }

        public void a(Throwable th) {
            T t;
            PTa pTa = PTa.this;
            C7118pQa<? super Throwable, ? extends T> pqa = pTa.b;
            if (pqa != null) {
                try {
                    t = pqa.apply(th);
                } catch (Throwable th2) {
                    _Pa.b(th2);
                    this.a.a((Throwable) new ZPa(th, th2));
                    return;
                }
            } else {
                t = pTa.c;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.a.a((Throwable) nullPointerException);
                return;
            }
            this.a.onSuccess(t);
        }

        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }
    }

    public PTa(MPa<? extends T> mPa, C7118pQa<? super Throwable, ? extends T> pqa, T t) {
        this.a = mPa;
        this.b = pqa;
        this.c = t;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa));
    }
}
