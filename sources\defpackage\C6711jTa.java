package defpackage;

/* renamed from: jTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableSkip */
public final class C6711jTa<T> extends C6642iSa<T, T> {
    final long b;

    /* renamed from: jTa$a */
    /* compiled from: ObservableSkip */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        long b;
        VPa c;

        a(GPa<? super T> gPa, long j) {
            this.a = gPa;
            this.b = j;
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

        public void a(T t) {
            long j = this.b;
            if (j != 0) {
                this.b = j - 1;
            } else {
                this.a.a(t);
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return this.c.a();
        }
    }

    public C6711jTa(EPa<T> ePa, long j) {
        super(ePa);
        this.b = j;
    }

    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
