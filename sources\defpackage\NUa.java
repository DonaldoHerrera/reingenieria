package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: NUa reason: default package */
/* compiled from: DisposableCompletableObserver */
public abstract class NUa implements C7117pPa, VPa {
    final AtomicReference<VPa> a = new AtomicReference<>();

    public final void a(VPa vPa) {
        if (CUa.a(this.a, vPa, getClass())) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final void dispose() {
        C7463uQa.a(this.a);
    }

    public final boolean a() {
        return this.a.get() == C7463uQa.DISPOSED;
    }
}
