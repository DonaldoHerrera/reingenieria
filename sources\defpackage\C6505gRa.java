package defpackage;

import java.util.concurrent.Callable;

/* renamed from: gRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableFromCallable */
public final class C6505gRa extends C6979nPa {
    final Callable<?> a;

    public C6505gRa(Callable<?> callable) {
        this.a = callable;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        VPa b = WPa.b();
        ppa.a(b);
        try {
            this.a.call();
            if (!b.a()) {
                ppa.onComplete();
            }
        } catch (Throwable th) {
            _Pa.b(th);
            if (!b.a()) {
                ppa.a(th);
            } else {
                WUa.b(th);
            }
        }
    }
}
