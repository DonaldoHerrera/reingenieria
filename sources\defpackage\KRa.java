package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: KRa reason: default package */
/* compiled from: MaybeFlatMapCompletable */
public final class KRa<T> extends C6979nPa {
    final C7669xPa<T> a;
    final C7118pQa<? super T, ? extends C7255rPa> b;

    /* renamed from: KRa$a */
    /* compiled from: MaybeFlatMapCompletable */
    static final class a<T> extends AtomicReference<VPa> implements C7600wPa<T>, C7117pPa, VPa {
        final C7117pPa a;
        final C7118pQa<? super T, ? extends C7255rPa> b;

        a(C7117pPa ppa, C7118pQa<? super T, ? extends C7255rPa> pqa) {
            this.a = ppa;
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
                AQa.a(apply, "The mapper returned a null CompletableSource");
                C7255rPa rpa = (C7255rPa) apply;
                if (!a()) {
                    rpa.a(this);
                }
            } catch (Throwable th) {
                _Pa.b(th);
                a(th);
            }
        }

        public void a(VPa vPa) {
            C7463uQa.a((AtomicReference<VPa>) this, vPa);
        }

        public void a(Throwable th) {
            this.a.a(th);
        }
    }

    public KRa(C7669xPa<T> xpa, C7118pQa<? super T, ? extends C7255rPa> pqa) {
        this.a = xpa;
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        a aVar = new a(ppa, this.b);
        ppa.a((VPa) aVar);
        this.a.a(aVar);
    }
}
