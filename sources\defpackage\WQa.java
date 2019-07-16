package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: WQa reason: default package */
/* compiled from: EmptyCompletableObserver */
public final class WQa extends AtomicReference<VPa> implements C7117pPa, VPa, PUa {
    public boolean a() {
        return get() == C7463uQa.DISPOSED;
    }

    public void dispose() {
        C7463uQa.a((AtomicReference<VPa>) this);
    }

    public void onComplete() {
        lazySet(C7463uQa.DISPOSED);
    }

    public void a(Throwable th) {
        lazySet(C7463uQa.DISPOSED);
        WUa.b((Throwable) new C5636bQa(th));
    }

    public void a(VPa vPa) {
        C7463uQa.c(this, vPa);
    }
}
