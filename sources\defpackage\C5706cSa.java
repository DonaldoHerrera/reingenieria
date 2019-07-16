package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cSa reason: default package and case insensitive filesystem */
/* compiled from: CompletableAndThenObservable */
public final class C5706cSa<R> extends APa<R> {
    final C7255rPa a;
    final EPa<? extends R> b;

    /* renamed from: cSa$a */
    /* compiled from: CompletableAndThenObservable */
    static final class a<R> extends AtomicReference<VPa> implements GPa<R>, C7117pPa, VPa {
        final GPa<? super R> a;
        EPa<? extends R> b;

        a(GPa<? super R> gPa, EPa<? extends R> ePa) {
            this.b = ePa;
            this.a = gPa;
        }

        public void a(R r) {
            this.a.a(r);
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            EPa<? extends R> ePa = this.b;
            if (ePa == null) {
                this.a.onComplete();
                return;
            }
            this.b = null;
            ePa.a(this);
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

    public C5706cSa(C7255rPa rpa, EPa<? extends R> ePa) {
        this.a = rpa;
        this.b = ePa;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super R> gPa) {
        a aVar = new a(gPa, this.b);
        gPa.a((VPa) aVar);
        this.a.a(aVar);
    }
}
