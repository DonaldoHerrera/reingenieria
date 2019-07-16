package defpackage;

import java.util.NoSuchElementException;

/* renamed from: SSa reason: default package */
/* compiled from: ObservableLastSingle */
public final class SSa<T> extends IPa<T> {
    final EPa<T> a;
    final T b;

    /* renamed from: SSa$a */
    /* compiled from: ObservableLastSingle */
    static final class a<T> implements GPa<T>, VPa {
        final KPa<? super T> a;
        final T b;
        VPa c;
        T d;

        a(KPa<? super T> kPa, T t) {
            this.a = kPa;
            this.b = t;
        }

        public boolean a() {
            return this.c == C7463uQa.DISPOSED;
        }

        public void dispose() {
            this.c.dispose();
            this.c = C7463uQa.DISPOSED;
        }

        public void onComplete() {
            this.c = C7463uQa.DISPOSED;
            T t = this.d;
            if (t != null) {
                this.d = null;
                this.a.onSuccess(t);
                return;
            }
            T t2 = this.b;
            if (t2 != null) {
                this.a.onSuccess(t2);
            } else {
                this.a.a((Throwable) new NoSuchElementException());
            }
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void a(T t) {
            this.d = t;
        }

        public void a(Throwable th) {
            this.c = C7463uQa.DISPOSED;
            this.d = null;
            this.a.a(th);
        }
    }

    public SSa(EPa<T> ePa, T t) {
        this.a = ePa;
        this.b = t;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
