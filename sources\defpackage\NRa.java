package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: NRa reason: default package */
/* compiled from: MaybeFlatten */
public final class NRa<T, R> extends BRa<T, R> {
    final C7118pQa<? super T, ? extends C7669xPa<? extends R>> b;

    /* renamed from: NRa$a */
    /* compiled from: MaybeFlatten */
    static final class a<T, R> extends AtomicReference<VPa> implements C7600wPa<T>, VPa {
        final C7600wPa<? super R> a;
        final C7118pQa<? super T, ? extends C7669xPa<? extends R>> b;
        VPa c;

        /* renamed from: NRa$a$a reason: collision with other inner class name */
        /* compiled from: MaybeFlatten */
        final class C0149a implements C7600wPa<R> {
            C0149a() {
            }

            public void a(VPa vPa) {
                C7463uQa.c(a.this, vPa);
            }

            public void onComplete() {
                a.this.a.onComplete();
            }

            public void onSuccess(R r) {
                a.this.a.onSuccess(r);
            }

            public void a(Throwable th) {
                a.this.a.a(th);
            }
        }

        a(C7600wPa<? super R> wpa, C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa) {
            this.a = wpa;
            this.b = pqa;
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
            this.c.dispose();
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.b.apply(t);
                AQa.a(apply, "The mapper returned a null MaybeSource");
                C7669xPa xpa = (C7669xPa) apply;
                if (!a()) {
                    xpa.a(new C0149a());
                }
            } catch (Exception e) {
                _Pa.b(e);
                this.a.a((Throwable) e);
            }
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.c, vPa)) {
                this.c = vPa;
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public NRa(C7669xPa<T> xpa, C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa) {
        super(xpa);
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super R> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
