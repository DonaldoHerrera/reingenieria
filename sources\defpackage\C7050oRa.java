package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableSubscribeOn */
public final class C7050oRa extends C6979nPa {
    final C7255rPa a;
    final HPa b;

    /* renamed from: oRa$a */
    /* compiled from: CompletableSubscribeOn */
    static final class a extends AtomicReference<VPa> implements C7117pPa, VPa, Runnable {
        final C7117pPa a;
        final C7739yQa b = new C7739yQa();
        final C7255rPa c;

        a(C7117pPa ppa, C7255rPa rpa) {
            this.a = ppa;
            this.c = rpa;
        }

        public void a(VPa vPa) {
            C7463uQa.c(this, vPa);
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
            this.b.dispose();
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void run() {
            this.c.a(this);
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public C7050oRa(C7255rPa rpa, HPa hPa) {
        this.a = rpa;
        this.b = hPa;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        a aVar = new a(ppa, this.a);
        ppa.a((VPa) aVar);
        aVar.b.a(this.b.a(aVar));
    }
}
