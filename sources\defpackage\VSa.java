package defpackage;

/* renamed from: VSa reason: default package */
/* compiled from: ObservableMaterialize */
public final class VSa<T> extends C6642iSa<T, C7738yPa<T>> {

    /* renamed from: VSa$a */
    /* compiled from: ObservableMaterialize */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super C7738yPa<T>> a;
        VPa b;

        a(GPa<? super C7738yPa<T>> gPa) {
            this.a = gPa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.b, vPa)) {
                this.b = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.b.dispose();
        }

        public void onComplete() {
            this.a.a(C7738yPa.a());
            this.a.onComplete();
        }

        public boolean a() {
            return this.b.a();
        }

        public void a(T t) {
            this.a.a(C7738yPa.a(t));
        }

        public void a(Throwable th) {
            this.a.a(C7738yPa.a(th));
            this.a.onComplete();
        }
    }

    public VSa(EPa<T> ePa) {
        super(ePa);
    }

    public void b(GPa<? super C7738yPa<T>> gPa) {
        this.a.a(new a(gPa));
    }
}
