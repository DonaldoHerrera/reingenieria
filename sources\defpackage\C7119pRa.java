package defpackage;

/* renamed from: pRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableToObservable */
public final class C7119pRa<T> extends APa<T> {
    final C7255rPa a;

    /* renamed from: pRa$a */
    /* compiled from: CompletableToObservable */
    static final class a extends QQa<Void> implements C7117pPa {
        final GPa<?> a;
        VPa b;

        a(GPa<?> gPa) {
            this.a = gPa;
        }

        public int a(int i) {
            return i & 2;
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public void clear() {
        }

        public void dispose() {
            this.b.dispose();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public Void poll() throws Exception {
            return null;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.b, vPa)) {
                this.b = vPa;
                this.a.a((VPa) this);
            }
        }

        public boolean a() {
            return this.b.a();
        }
    }

    public C7119pRa(C7255rPa rpa) {
        this.a = rpa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa));
    }
}
