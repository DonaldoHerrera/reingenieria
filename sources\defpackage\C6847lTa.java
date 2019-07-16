package defpackage;

/* renamed from: lTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableSwitchIfEmpty */
public final class C6847lTa<T> extends C6642iSa<T, T> {
    final EPa<? extends T> b;

    /* renamed from: lTa$a */
    /* compiled from: ObservableSwitchIfEmpty */
    static final class a<T> implements GPa<T> {
        final GPa<? super T> a;
        final EPa<? extends T> b;
        final C7739yQa c = new C7739yQa();
        boolean d = true;

        a(GPa<? super T> gPa, EPa<? extends T> ePa) {
            this.a = gPa;
            this.b = ePa;
        }

        public void a(VPa vPa) {
            this.c.b(vPa);
        }

        public void onComplete() {
            if (this.d) {
                this.d = false;
                this.b.a(this);
                return;
            }
            this.a.onComplete();
        }

        public void a(T t) {
            if (this.d) {
                this.d = false;
            }
            this.a.a(t);
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public C6847lTa(EPa<T> ePa, EPa<? extends T> ePa2) {
        super(ePa);
        this.b = ePa2;
    }

    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this.b);
        gPa.a((VPa) aVar.c);
        this.a.a(aVar);
    }
}
