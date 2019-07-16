package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableCreate */
public final class C5705cRa extends C6979nPa {
    final C7186qPa a;

    /* renamed from: cRa$a */
    /* compiled from: CompletableCreate */
    static final class a extends AtomicReference<VPa> implements C7048oPa, VPa {
        final C7117pPa a;

        a(C7117pPa ppa) {
            this.a = ppa;
        }

        public void a(Throwable th) {
            if (!b(th)) {
                WUa.b(th);
            }
        }

        public boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (obj != uqa) {
                VPa vPa = (VPa) getAndSet(uqa);
                if (vPa != C7463uQa.DISPOSED) {
                    try {
                        this.a.a(th);
                        return true;
                    } finally {
                        if (vPa != null) {
                            vPa.dispose();
                        }
                    }
                }
            }
            return false;
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            Object obj = get();
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (obj != uqa) {
                VPa vPa = (VPa) getAndSet(uqa);
                if (vPa != C7463uQa.DISPOSED) {
                    try {
                        this.a.onComplete();
                    } finally {
                        if (vPa != null) {
                            vPa.dispose();
                        }
                    }
                }
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{a.class.getSimpleName(), super.toString()});
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public C5705cRa(C7186qPa qpa) {
        this.a = qpa;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        a aVar = new a(ppa);
        ppa.a((VPa) aVar);
        try {
            this.a.a(aVar);
        } catch (Throwable th) {
            _Pa.b(th);
            aVar.a(th);
        }
    }
}
