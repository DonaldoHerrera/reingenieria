package defpackage;

/* renamed from: nTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableTake */
public final class C6983nTa<T> extends C6642iSa<T, T> {
    final long b;

    /* renamed from: nTa$a */
    /* compiled from: ObservableTake */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        boolean b;
        VPa c;
        long d;

        a(GPa<? super T> gPa, long j) {
            this.a = gPa;
            this.d = j;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                if (this.d == 0) {
                    this.b = true;
                    vPa.dispose();
                    C7532vQa.a(this.a);
                    return;
                }
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.c.dispose();
        }

        public void onComplete() {
            if (!this.b) {
                this.b = true;
                this.c.dispose();
                this.a.onComplete();
            }
        }

        public void a(T t) {
            if (!this.b) {
                long j = this.d;
                this.d = j - 1;
                if (j > 0) {
                    boolean z = this.d == 0;
                    this.a.a(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public void a(Throwable th) {
            if (this.b) {
                WUa.b(th);
                return;
            }
            this.b = true;
            this.c.dispose();
            this.a.a(th);
        }

        public boolean a() {
            return this.c.a();
        }
    }

    public C6983nTa(EPa<T> ePa, long j) {
        super(ePa);
        this.b = j;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b));
    }
}
