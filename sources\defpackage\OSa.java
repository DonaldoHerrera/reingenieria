package defpackage;

/* renamed from: OSa reason: default package */
/* compiled from: ObservableIgnoreElements */
public final class OSa<T> extends C6642iSa<T, T> {

    /* renamed from: OSa$a */
    /* compiled from: ObservableIgnoreElements */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        VPa b;

        a(GPa<? super T> gPa) {
            this.a = gPa;
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

    public OSa(EPa<T> ePa) {
        super(ePa);
    }

    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa));
    }
}
