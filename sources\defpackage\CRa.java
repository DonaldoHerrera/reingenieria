package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: CRa reason: default package */
/* compiled from: MaybeCallbackObserver */
public final class CRa<T> extends AtomicReference<VPa> implements C7600wPa<T>, VPa, PUa {
    final C6776kQa<? super T> a;
    final C6776kQa<? super Throwable> b;
    final C6368eQa c;

    public CRa(C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa) {
        this.a = kqa;
        this.b = kqa2;
        this.c = eqa;
    }

    public boolean a() {
        return C7463uQa.a((VPa) get());
    }

    public void dispose() {
        C7463uQa.a((AtomicReference<VPa>) this);
    }

    public void onComplete() {
        lazySet(C7463uQa.DISPOSED);
        try {
            this.c.run();
        } catch (Throwable th) {
            _Pa.b(th);
            WUa.b(th);
        }
    }

    public void onSuccess(T t) {
        lazySet(C7463uQa.DISPOSED);
        try {
            this.a.accept(t);
        } catch (Throwable th) {
            _Pa.b(th);
            WUa.b(th);
        }
    }

    public void a(VPa vPa) {
        C7463uQa.c(this, vPa);
    }

    public void a(Throwable th) {
        lazySet(C7463uQa.DISPOSED);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            _Pa.b(th2);
            WUa.b((Throwable) new ZPa(th, th2));
        }
    }
}
