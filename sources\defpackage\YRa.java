package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: YRa reason: default package */
/* compiled from: MaybeSwitchIfEmpty */
public final class YRa<T> extends BRa<T, T> {
    final C7669xPa<? extends T> b;

    /* renamed from: YRa$a */
    /* compiled from: MaybeSwitchIfEmpty */
    static final class a<T> extends AtomicReference<VPa> implements C7600wPa<T>, VPa {
        final C7600wPa<? super T> a;
        final C7669xPa<? extends T> b;

        /* renamed from: YRa$a$a reason: collision with other inner class name */
        /* compiled from: MaybeSwitchIfEmpty */
        static final class C0158a<T> implements C7600wPa<T> {
            final C7600wPa<? super T> a;
            final AtomicReference<VPa> b;

            C0158a(C7600wPa<? super T> wpa, AtomicReference<VPa> atomicReference) {
                this.a = wpa;
                this.b = atomicReference;
            }

            public void a(VPa vPa) {
                C7463uQa.c(this.b, vPa);
            }

            public void onComplete() {
                this.a.onComplete();
            }

            public void onSuccess(T t) {
                this.a.onSuccess(t);
            }

            public void a(Throwable th) {
                this.a.a(th);
            }
        }

        a(C7600wPa<? super T> wpa, C7669xPa<? extends T> xpa) {
            this.a = wpa;
            this.b = xpa;
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            VPa vPa = (VPa) get();
            if (vPa != C7463uQa.DISPOSED && compareAndSet(vPa, null)) {
                this.b.a(new C0158a(this.a, this));
            }
        }

        public void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public YRa(C7669xPa<T> xpa, C7669xPa<? extends T> xpa2) {
        super(xpa);
        this.b = xpa2;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
