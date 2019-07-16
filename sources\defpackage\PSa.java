package defpackage;

/* renamed from: PSa reason: default package */
/* compiled from: ObservableIgnoreElementsCompletable */
public final class PSa<T> extends C6979nPa implements DQa<T> {
    final EPa<T> a;

    /* renamed from: PSa$a */
    /* compiled from: ObservableIgnoreElementsCompletable */
    static final class a<T> implements GPa<T>, VPa {
        final C7117pPa a;
        VPa b;

        a(C7117pPa ppa) {
            this.a = ppa;
        }

        public void a(VPa vPa) {
            this.b = vPa;
            this.a.a((VPa) this);
        }

        public void a(T t) {
        }

        public void dispose() {
            this.b.dispose();
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return this.b.a();
        }
    }

    public PSa(EPa<T> ePa) {
        this.a = ePa;
    }

    public APa<T> a() {
        return WUa.a((APa<T>) new OSa<T>(this.a));
    }

    public void b(C7117pPa ppa) {
        this.a.a(new a(ppa));
    }
}
