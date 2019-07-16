package defpackage;

/* renamed from: QRa reason: default package */
/* compiled from: MaybeIgnoreElement */
public final class QRa<T> extends BRa<T, T> {

    /* renamed from: QRa$a */
    /* compiled from: MaybeIgnoreElement */
    static final class a<T> implements C7600wPa<T>, VPa {
        final C7600wPa<? super T> a;
        VPa b;

        a(C7600wPa<? super T> wpa) {
            this.a = wpa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.b, vPa)) {
                this.b = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.b.dispose();
            this.b = C7463uQa.DISPOSED;
        }

        public void onComplete() {
            this.b = C7463uQa.DISPOSED;
            this.a.onComplete();
        }

        public void onSuccess(T t) {
            this.b = C7463uQa.DISPOSED;
            this.a.onComplete();
        }

        public void a(Throwable th) {
            this.b = C7463uQa.DISPOSED;
            this.a.a(th);
        }

        public boolean a() {
            return this.b.a();
        }
    }

    public QRa(C7669xPa<T> xpa) {
        super(xpa);
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa));
    }
}
