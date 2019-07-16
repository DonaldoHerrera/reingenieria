package defpackage;

/* renamed from: aTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableReduceMaybe */
public final class C5571aTa<T> extends C7531vPa<T> {
    final EPa<T> a;
    final C6504gQa<T, T, T> b;

    /* renamed from: aTa$a */
    /* compiled from: ObservableReduceMaybe */
    static final class a<T> implements GPa<T>, VPa {
        final C7600wPa<? super T> a;
        final C6504gQa<T, T, T> b;
        boolean c;
        T d;
        VPa e;

        a(C7600wPa<? super T> wpa, C6504gQa<T, T, T> gqa) {
            this.a = wpa;
            this.b = gqa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.e, vPa)) {
                this.e = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.e.dispose();
        }

        public void onComplete() {
            if (!this.c) {
                this.c = true;
                T t = this.d;
                this.d = null;
                if (t != null) {
                    this.a.onSuccess(t);
                } else {
                    this.a.onComplete();
                }
            }
        }

        public void a(T t) {
            if (!this.c) {
                T t2 = this.d;
                if (t2 == null) {
                    this.d = t;
                    return;
                }
                try {
                    T apply = this.b.apply(t2, t);
                    AQa.a(apply, "The reducer returned a null value");
                    this.d = apply;
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.e.dispose();
                    a(th);
                }
            }
        }

        public void a(Throwable th) {
            if (this.c) {
                WUa.b(th);
                return;
            }
            this.c = true;
            this.d = null;
            this.a.a(th);
        }

        public boolean a() {
            return this.e.a();
        }
    }

    public C5571aTa(EPa<T> ePa, C6504gQa<T, T, T> gqa) {
        this.a = ePa;
        this.b = gqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
