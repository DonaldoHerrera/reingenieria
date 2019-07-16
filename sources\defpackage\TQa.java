package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: TQa reason: default package */
/* compiled from: ConsumerSingleObserver */
public final class TQa<T> extends AtomicReference<VPa> implements KPa<T>, VPa, PUa {
    final C6776kQa<? super T> a;
    final C6776kQa<? super Throwable> b;

    public TQa(C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2) {
        this.a = kqa;
        this.b = kqa2;
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

    public void dispose() {
        C7463uQa.a((AtomicReference<VPa>) this);
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

    public boolean a() {
        return get() == C7463uQa.DISPOSED;
    }
}
