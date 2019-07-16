package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hSa reason: default package and case insensitive filesystem */
/* compiled from: SingleFlatMapObservable */
public final class C6574hSa<T, R> extends APa<R> {
    final MPa<T> a;
    final C7118pQa<? super T, ? extends EPa<? extends R>> b;

    /* renamed from: hSa$a */
    /* compiled from: SingleFlatMapObservable */
    static final class a<T, R> extends AtomicReference<VPa> implements GPa<R>, KPa<T>, VPa {
        final GPa<? super R> a;
        final C7118pQa<? super T, ? extends EPa<? extends R>> b;

        a(GPa<? super R> gPa, C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
            this.a = gPa;
            this.b = pqa;
        }

        public void a(R r) {
            this.a.a(r);
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
                AQa.a(apply, "The mapper returned a null Publisher");
                ((EPa) apply).a(this);
            } catch (Throwable th) {
                _Pa.b(th);
                this.a.a(th);
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void a(VPa vPa) {
            C7463uQa.a((AtomicReference<VPa>) this, vPa);
        }
    }

    public C6574hSa(MPa<T> mPa, C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
        this.a = mPa;
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super R> gPa) {
        a aVar = new a(gPa, this.b);
        gPa.a((VPa) aVar);
        this.a.a(aVar);
    }
}
