package defpackage;

/* renamed from: RRa reason: default package */
/* compiled from: MaybeIgnoreElementCompletable */
public final class RRa<T> extends C6979nPa implements CQa<T> {
    final C7669xPa<T> a;

    /* renamed from: RRa$a */
    /* compiled from: MaybeIgnoreElementCompletable */
    static final class a<T> implements C7600wPa<T>, VPa {
        final C7117pPa a;
        VPa b;

        a(C7117pPa ppa) {
            this.a = ppa;
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

    public RRa(C7669xPa<T> xpa) {
        this.a = xpa;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        this.a.a(new a(ppa));
    }

    public C7531vPa<T> b() {
        return WUa.a((C7531vPa<T>) new QRa<T>(this.a));
    }
}
