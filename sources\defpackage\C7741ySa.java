package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ySa reason: default package and case insensitive filesystem */
/* compiled from: ObservableElementAtSingle */
public final class C7741ySa<T> extends IPa<T> implements DQa<T> {
    final EPa<T> a;
    final long b;
    final T c;

    /* renamed from: ySa$a */
    /* compiled from: ObservableElementAtSingle */
    static final class a<T> implements GPa<T>, VPa {
        final KPa<? super T> a;
        final long b;
        final T c;
        VPa d;
        long e;
        boolean f;

        a(KPa<? super T> kPa, long j, T t) {
            this.a = kPa;
            this.b = j;
            this.c = t;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.d, vPa)) {
                this.d = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.d.dispose();
        }

        public void onComplete() {
            if (!this.f) {
                this.f = true;
                T t = this.c;
                if (t != null) {
                    this.a.onSuccess(t);
                } else {
                    this.a.a((Throwable) new NoSuchElementException());
                }
            }
        }

        public boolean a() {
            return this.d.a();
        }

        public void a(T t) {
            if (!this.f) {
                long j = this.e;
                if (j == this.b) {
                    this.f = true;
                    this.d.dispose();
                    this.a.onSuccess(t);
                    return;
                }
                this.e = j + 1;
            }
        }

        public void a(Throwable th) {
            if (this.f) {
                WUa.b(th);
                return;
            }
            this.f = true;
            this.a.a(th);
        }
    }

    public C7741ySa(EPa<T> ePa, long j, T t) {
        this.a = ePa;
        this.b = j;
        this.c = t;
    }

    public APa<T> a() {
        C7603wSa wsa = new C7603wSa(this.a, this.b, this.c, true);
        return WUa.a((APa<T>) wsa);
    }

    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b, this.c));
    }
}
