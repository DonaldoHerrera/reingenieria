package defpackage;

import java.util.NoSuchElementException;

/* renamed from: iTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableSingleSingle */
public final class C6643iTa<T> extends IPa<T> {
    final EPa<? extends T> a;
    final T b;

    /* renamed from: iTa$a */
    /* compiled from: ObservableSingleSingle */
    static final class a<T> implements GPa<T>, VPa {
        final KPa<? super T> a;
        final T b;
        VPa c;
        T d;
        boolean e;

        a(KPa<? super T> kPa, T t) {
            this.a = kPa;
            this.b = t;
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
                T t = this.d;
                this.d = null;
                if (t == null) {
                    t = this.b;
                }
                if (t != null) {
                    this.a.onSuccess(t);
                } else {
                    this.a.a((Throwable) new NoSuchElementException());
                }
            }
        }

        public boolean a() {
            return this.c.a();
        }

        public void a(T t) {
            if (!this.e) {
                if (this.d != null) {
                    this.e = true;
                    this.c.dispose();
                    this.a.a((Throwable) new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.d = t;
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

    public C6643iTa(EPa<? extends T> ePa, T t) {
        this.a = ePa;
        this.b = t;
    }

    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
