package defpackage;

/* renamed from: FRa reason: default package */
/* compiled from: MaybeDoOnEvent */
public final class FRa<T> extends BRa<T, T> {
    final C6436fQa<? super T, ? super Throwable> b;

    /* renamed from: FRa$a */
    /* compiled from: MaybeDoOnEvent */
    static final class a<T> implements C7600wPa<T>, VPa {
        final C7600wPa<? super T> a;
        final C6436fQa<? super T, ? super Throwable> b;
        VPa c;

        a(C7600wPa<? super T> wpa, C6436fQa<? super T, ? super Throwable> fqa) {
            this.a = wpa;
            this.b = fqa;
        }

        public boolean a() {
            return this.c.a();
        }

        public void dispose() {
            this.c.dispose();
            this.c = C7463uQa.DISPOSED;
        }

        public void onComplete() {
            this.c = C7463uQa.DISPOSED;
            try {
                this.b.accept(null, null);
                this.a.onComplete();
            } catch (Throwable th) {
                _Pa.b(th);
                this.a.a(th);
            }
        }

        public void onSuccess(T t) {
            this.c = C7463uQa.DISPOSED;
            try {
                this.b.accept(t, null);
                this.a.onSuccess(t);
            } catch (Throwable th) {
                _Pa.b(th);
                this.a.a(th);
            }
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.c = C7463uQa.DISPOSED;
            try {
                this.b.accept(null, th);
            } catch (Throwable th2) {
                _Pa.b(th2);
                th = new ZPa(th, th2);
            }
            this.a.a(th);
        }
    }

    public FRa(C7669xPa<T> xpa, C6436fQa<? super T, ? super Throwable> fqa) {
        super(xpa);
        this.b = fqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
