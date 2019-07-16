package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ZRa reason: default package */
/* compiled from: MaybeSwitchIfEmptySingle */
public final class ZRa<T> extends IPa<T> implements EQa<T> {
    final C7669xPa<T> a;
    final MPa<? extends T> b;

    /* renamed from: ZRa$a */
    /* compiled from: MaybeSwitchIfEmptySingle */
    static final class a<T> extends AtomicReference<VPa> implements C7600wPa<T>, VPa {
        final KPa<? super T> a;
        final MPa<? extends T> b;

        /* renamed from: ZRa$a$a reason: collision with other inner class name */
        /* compiled from: MaybeSwitchIfEmptySingle */
        static final class C0160a<T> implements KPa<T> {
            final KPa<? super T> a;
            final AtomicReference<VPa> b;

            C0160a(KPa<? super T> kPa, AtomicReference<VPa> atomicReference) {
                this.a = kPa;
                this.b = atomicReference;
            }

            public void a(VPa vPa) {
                C7463uQa.c(this.b, vPa);
            }

            public void onSuccess(T t) {
                this.a.onSuccess(t);
            }

            public void a(Throwable th) {
                this.a.a(th);
            }
        }

        a(KPa<? super T> kPa, MPa<? extends T> mPa) {
            this.a = kPa;
            this.b = mPa;
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
                this.b.a(new C0160a(this.a, this));
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

    public ZRa(C7669xPa<T> xpa, MPa<? extends T> mPa) {
        this.a = xpa;
        this.b = mPa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
