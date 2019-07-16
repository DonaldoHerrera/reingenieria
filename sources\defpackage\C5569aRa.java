package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableAndThenCompletable */
public final class C5569aRa extends C6979nPa {
    final C7255rPa a;
    final C7255rPa b;

    /* renamed from: aRa$a */
    /* compiled from: CompletableAndThenCompletable */
    static final class a implements C7117pPa {
        final AtomicReference<VPa> a;
        final C7117pPa b;

        public a(AtomicReference<VPa> atomicReference, C7117pPa ppa) {
            this.a = atomicReference;
            this.b = ppa;
        }

        public void a(VPa vPa) {
            C7463uQa.a(this.a, vPa);
        }

        public void onComplete() {
            this.b.onComplete();
        }

        public void a(Throwable th) {
            this.b.a(th);
        }
    }

    /* renamed from: aRa$b */
    /* compiled from: CompletableAndThenCompletable */
    static final class b extends AtomicReference<VPa> implements C7117pPa, VPa {
        final C7117pPa a;
        final C7255rPa b;

        b(C7117pPa ppa, C7255rPa rpa) {
            this.a = ppa;
            this.b = rpa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            this.b.a(new a(this, this.a));
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public C5569aRa(C7255rPa rpa, C7255rPa rpa2) {
        this.a = rpa;
        this.b = rpa2;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        this.a.a(new b(ppa, this.b));
    }
}
