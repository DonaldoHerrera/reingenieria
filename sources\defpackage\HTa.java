package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: HTa reason: default package */
/* compiled from: SingleFlatMapMaybe */
public final class HTa<T, R> extends C7531vPa<R> {
    final MPa<? extends T> a;
    final C7118pQa<? super T, ? extends C7669xPa<? extends R>> b;

    /* renamed from: HTa$a */
    /* compiled from: SingleFlatMapMaybe */
    static final class a<R> implements C7600wPa<R> {
        final AtomicReference<VPa> a;
        final C7600wPa<? super R> b;

        a(AtomicReference<VPa> atomicReference, C7600wPa<? super R> wpa) {
            this.a = atomicReference;
            this.b = wpa;
        }

        public void a(VPa vPa) {
            C7463uQa.a(this.a, vPa);
        }

        public void onComplete() {
            this.b.onComplete();
        }

        public void onSuccess(R r) {
            this.b.onSuccess(r);
        }

        public void a(Throwable th) {
            this.b.a(th);
        }
    }

    /* renamed from: HTa$b */
    /* compiled from: SingleFlatMapMaybe */
    static final class b<T, R> extends AtomicReference<VPa> implements KPa<T>, VPa {
        final C7600wPa<? super R> a;
        final C7118pQa<? super T, ? extends C7669xPa<? extends R>> b;

        b(C7600wPa<? super R> wpa, C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa) {
            this.a = wpa;
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
                AQa.a(apply, "The mapper returned a null MaybeSource");
                C7669xPa xpa = (C7669xPa) apply;
                if (!a()) {
                    xpa.a(new a(this, this.a));
                }
            } catch (Throwable th) {
                _Pa.b(th);
                a(th);
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

    public HTa(MPa<? extends T> mPa, C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa) {
        this.b = pqa;
        this.a = mPa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super R> wpa) {
        this.a.a(new b(wpa, this.b));
    }
}
