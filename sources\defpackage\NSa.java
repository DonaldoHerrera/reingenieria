package defpackage;

/* renamed from: NSa reason: default package */
/* compiled from: ObservableHide */
public final class NSa<T> extends C6642iSa<T, T> {

    /* renamed from: NSa$a */
    /* compiled from: ObservableHide */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        VPa b;

        a(GPa<? super T> gPa) {
            this.a = gPa;
        }

        public boolean a() {
            return this.b.a();
        }

        public void dispose() {
            this.b.dispose();
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.b, vPa)) {
                this.b = vPa;
                this.a.a((VPa) this);
            }
        }

        public void a(T t) {
            this.a.a(t);
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public NSa(EPa<T> ePa) {
        super(ePa);
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa));
    }
}
