package defpackage;

/* renamed from: VRa reason: default package */
/* compiled from: MaybeOnErrorComplete */
public final class VRa<T> extends BRa<T, T> {
    final C7256rQa<? super Throwable> b;

    /* renamed from: VRa$a */
    /* compiled from: MaybeOnErrorComplete */
    static final class a<T> implements C7600wPa<T>, VPa {
        final C7600wPa<? super T> a;
        final C7256rQa<? super Throwable> b;
        VPa c;

        a(C7600wPa<? super T> wpa, C7256rQa<? super Throwable> rqa) {
            this.a = wpa;
            this.b = rqa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.c.dispose();
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        public void a(Throwable th) {
            try {
                if (this.b.test(th)) {
                    this.a.onComplete();
                } else {
                    this.a.a(th);
                }
            } catch (Throwable th2) {
                _Pa.b(th2);
                this.a.a((Throwable) new ZPa(th, th2));
            }
        }

        public boolean a() {
            return this.c.a();
        }
    }

    public VRa(C7669xPa<T> xpa, C7256rQa<? super Throwable> rqa) {
        super(xpa);
        this.b = rqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
