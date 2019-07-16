package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: FTa reason: default package */
/* compiled from: SingleFlatMap */
public final class FTa<T, R> extends IPa<R> {
    final MPa<? extends T> a;
    final C7118pQa<? super T, ? extends MPa<? extends R>> b;

    /* renamed from: FTa$a */
    /* compiled from: SingleFlatMap */
    static final class a<T, R> extends AtomicReference<VPa> implements KPa<T>, VPa {
        final KPa<? super R> a;
        final C7118pQa<? super T, ? extends MPa<? extends R>> b;

        /* renamed from: FTa$a$a reason: collision with other inner class name */
        /* compiled from: SingleFlatMap */
        static final class C0146a<R> implements KPa<R> {
            final AtomicReference<VPa> a;
            final KPa<? super R> b;

            C0146a(AtomicReference<VPa> atomicReference, KPa<? super R> kPa) {
                this.a = atomicReference;
                this.b = kPa;
            }

            public void a(VPa vPa) {
                C7463uQa.a(this.a, vPa);
            }

            public void onSuccess(R r) {
                this.b.onSuccess(r);
            }

            public void a(Throwable th) {
                this.b.a(th);
            }
        }

        a(KPa<? super R> kPa, C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
            this.a = kPa;
            this.b = pqa;
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.b.apply(t);
                AQa.a(apply, "The single returned by the mapper is null");
                MPa mPa = (MPa) apply;
                if (!a()) {
                    mPa.a(new C0146a(this, this.a));
                }
            } catch (Throwable th) {
                _Pa.b(th);
                this.a.a(th);
            }
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

    public FTa(MPa<? extends T> mPa, C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
        this.b = pqa;
        this.a = mPa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super R> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
