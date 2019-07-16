package defpackage;

import java.util.NoSuchElementException;

/* renamed from: aSa reason: default package and case insensitive filesystem */
/* compiled from: MaybeToSingle */
public final class C5570aSa<T> extends IPa<T> implements EQa<T> {
    final C7669xPa<T> a;
    final T b;

    /* renamed from: aSa$a */
    /* compiled from: MaybeToSingle */
    static final class a<T> implements C7600wPa<T>, VPa {
        final KPa<? super T> a;
        final T b;
        VPa c;

        a(KPa<? super T> kPa, T t) {
            this.a = kPa;
            this.b = t;
        }

        public boolean a() {
            return this.c.a();
        }

        public void dispose() {
            this.c.dispose();
            this.c = C7463uQa.DISPOSED;
        }

        public void onComplete() {
            this.c = C7463uQa.DISPOSED;
            T t = this.b;
            if (t != null) {
                this.a.onSuccess(t);
            } else {
                this.a.a((Throwable) new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        public void onSuccess(T t) {
            this.c = C7463uQa.DISPOSED;
            this.a.onSuccess(t);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.c = C7463uQa.DISPOSED;
            this.a.a(th);
        }
    }

    public C5570aSa(C7669xPa<T> xpa, T t) {
        this.a = xpa;
        this.b = t;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
