package defpackage;

/* renamed from: hTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableSingleMaybe */
public final class C6575hTa<T> extends C7531vPa<T> {
    final EPa<T> a;

    /* renamed from: hTa$a */
    /* compiled from: ObservableSingleMaybe */
    static final class a<T> implements GPa<T>, VPa {
        final C7600wPa<? super T> a;
        VPa b;
        T c;
        boolean d;

        a(C7600wPa<? super T> wpa) {
            this.a = wpa;
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
            if (!this.d) {
                this.d = true;
                T t = this.c;
                this.c = null;
                if (t == null) {
                    this.a.onComplete();
                } else {
                    this.a.onSuccess(t);
                }
            }
        }

        public boolean a() {
            return this.b.a();
        }

        public void a(T t) {
            if (!this.d) {
                if (this.c != null) {
                    this.d = true;
                    this.b.dispose();
                    this.a.a((Throwable) new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.c = t;
            }
        }

        public void a(Throwable th) {
            if (this.d) {
                WUa.b(th);
                return;
            }
            this.d = true;
            this.a.a(th);
        }
    }

    public C6575hTa(EPa<T> ePa) {
        this.a = ePa;
    }

    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa));
    }
}
