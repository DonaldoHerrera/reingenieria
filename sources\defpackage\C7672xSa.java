package defpackage;

/* renamed from: xSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableElementAtMaybe */
public final class C7672xSa<T> extends C7531vPa<T> implements DQa<T> {
    final EPa<T> a;
    final long b;

    /* renamed from: xSa$a */
    /* compiled from: ObservableElementAtMaybe */
    static final class a<T> implements GPa<T>, VPa {
        final C7600wPa<? super T> a;
        final long b;
        VPa c;
        long d;
        boolean e;

        a(C7600wPa<? super T> wpa, long j) {
            this.a = wpa;
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
            if (!this.e) {
                this.e = true;
                this.a.onComplete();
            }
        }

        public boolean a() {
            return this.c.a();
        }

        public void a(T t) {
            if (!this.e) {
                long j = this.d;
                if (j == this.b) {
                    this.e = true;
                    this.c.dispose();
                    this.a.onSuccess(t);
                    return;
                }
                this.d = j + 1;
            }
        }

        public void a(Throwable th) {
            if (this.e) {
                WUa.b(th);
                return;
            }
            this.e = true;
            this.a.a(th);
        }
    }

    public C7672xSa(EPa<T> ePa, long j) {
        this.a = ePa;
        this.b = j;
    }

    public APa<T> a() {
        C7603wSa wsa = new C7603wSa(this.a, this.b, null, false);
        return WUa.a((APa<T>) wsa);
    }

    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
