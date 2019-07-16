package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: MRa reason: default package */
/* compiled from: MaybeFlatMapSingleElement */
public final class MRa<T, R> extends C7531vPa<R> {
    final C7669xPa<T> a;
    final C7118pQa<? super T, ? extends MPa<? extends R>> b;

    /* renamed from: MRa$a */
    /* compiled from: MaybeFlatMapSingleElement */
    static final class a<T, R> extends AtomicReference<VPa> implements C7600wPa<T>, VPa {
        final C7600wPa<? super R> a;
        final C7118pQa<? super T, ? extends MPa<? extends R>> b;

        a(C7600wPa<? super R> wpa, C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
            this.a = wpa;
            this.b = pqa;
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.b.apply(t);
                AQa.a(apply, "The mapper returned a null SingleSource");
                ((MPa) apply).a(new b(this, this.a));
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

    /* renamed from: MRa$b */
    /* compiled from: MaybeFlatMapSingleElement */
    static final class b<R> implements KPa<R> {
        final AtomicReference<VPa> a;
        final C7600wPa<? super R> b;

        b(AtomicReference<VPa> atomicReference, C7600wPa<? super R> wpa) {
            this.a = atomicReference;
            this.b = wpa;
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

    public MRa(C7669xPa<T> xpa, C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
        this.a = xpa;
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super R> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
