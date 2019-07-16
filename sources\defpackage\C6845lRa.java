package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableObserveOn */
public final class C6845lRa extends C6979nPa {
    final C7255rPa a;
    final HPa b;

    /* renamed from: lRa$a */
    /* compiled from: CompletableObserveOn */
    static final class a extends AtomicReference<VPa> implements C7117pPa, VPa, Runnable {
        final C7117pPa a;
        final HPa b;
        Throwable c;

        a(C7117pPa ppa, HPa hPa) {
            this.a = ppa;
            this.b = hPa;
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            C7463uQa.a((AtomicReference<VPa>) this, this.b.a(this));
        }

        public void run() {
            Throwable th = this.c;
            if (th != null) {
                this.c = null;
                this.a.a(th);
                return;
            }
            this.a.onComplete();
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.c = th;
            C7463uQa.a((AtomicReference<VPa>) this, this.b.a(this));
        }
    }

    public C6845lRa(C7255rPa rpa, HPa hPa) {
        this.a = rpa;
        this.b = hPa;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        this.a.a(new a(ppa, this.b));
    }
}
