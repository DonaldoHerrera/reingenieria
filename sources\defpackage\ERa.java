package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ERa reason: default package */
/* compiled from: MaybeDelayWithCompletable */
public final class ERa<T> extends C7531vPa<T> {
    final C7669xPa<T> a;
    final C7255rPa b;

    /* renamed from: ERa$a */
    /* compiled from: MaybeDelayWithCompletable */
    static final class a<T> implements C7600wPa<T> {
        final AtomicReference<VPa> a;
        final C7600wPa<? super T> b;

        a(AtomicReference<VPa> atomicReference, C7600wPa<? super T> wpa) {
            this.a = atomicReference;
            this.b = wpa;
        }

        public void a(VPa vPa) {
            C7463uQa.a(this.a, vPa);
        }

        public void onComplete() {
            this.b.onComplete();
        }

        public void onSuccess(T t) {
            this.b.onSuccess(t);
        }

        public void a(Throwable th) {
            this.b.a(th);
        }
    }

    /* renamed from: ERa$b */
    /* compiled from: MaybeDelayWithCompletable */
    static final class b<T> extends AtomicReference<VPa> implements C7117pPa, VPa {
        final C7600wPa<? super T> a;
        final C7669xPa<T> b;

        b(C7600wPa<? super T> wpa, C7669xPa<T> xpa) {
            this.a = wpa;
            this.b = xpa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            this.b.a(new a(this, this.a));
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public ERa(C7669xPa<T> xpa, C7255rPa rpa) {
        this.a = xpa;
        this.b = rpa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.b.a(new b(wpa, this.a));
    }
}
