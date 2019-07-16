package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: LRa reason: default package */
/* compiled from: MaybeFlatMapSingle */
public final class LRa<T, R> extends IPa<R> {
    final C7669xPa<T> a;
    final C7118pQa<? super T, ? extends MPa<? extends R>> b;

    /* renamed from: LRa$a */
    /* compiled from: MaybeFlatMapSingle */
    static final class a<T, R> extends AtomicReference<VPa> implements C7600wPa<T>, VPa {
        final KPa<? super R> a;
        final C7118pQa<? super T, ? extends MPa<? extends R>> b;

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

        public void onComplete() {
            this.a.a((Throwable) new NoSuchElementException());
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.b.apply(t);
                AQa.a(apply, "The mapper returned a null SingleSource");
                MPa mPa = (MPa) apply;
                if (!a()) {
                    mPa.a(new b(this, this.a));
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

    /* renamed from: LRa$b */
    /* compiled from: MaybeFlatMapSingle */
    static final class b<R> implements KPa<R> {
        final AtomicReference<VPa> a;
        final KPa<? super R> b;

        b(AtomicReference<VPa> atomicReference, KPa<? super R> kPa) {
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

    public LRa(C7669xPa<T> xpa, C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
        this.a = xpa;
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super R> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
