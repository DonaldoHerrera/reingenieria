package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ZQa reason: default package */
/* compiled from: LambdaObserver */
public final class ZQa<T> extends AtomicReference<VPa> implements GPa<T>, VPa, PUa {
    final C6776kQa<? super T> a;
    final C6776kQa<? super Throwable> b;
    final C6368eQa c;
    final C6776kQa<? super VPa> d;

    public ZQa(C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa, C6776kQa<? super VPa> kqa3) {
        this.a = kqa;
        this.b = kqa2;
        this.c = eqa;
        this.d = kqa3;
    }

    public void a(VPa vPa) {
        if (C7463uQa.c(this, vPa)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                _Pa.b(th);
                vPa.dispose();
                a(th);
            }
        }
    }

    public void dispose() {
        C7463uQa.a((AtomicReference<VPa>) this);
    }

    public void onComplete() {
        if (!a()) {
            lazySet(C7463uQa.DISPOSED);
            try {
                this.c.run();
            } catch (Throwable th) {
                _Pa.b(th);
                WUa.b(th);
            }
        }
    }

    public void a(T t) {
        if (!a()) {
            try {
                this.a.accept(t);
            } catch (Throwable th) {
                _Pa.b(th);
                ((VPa) get()).dispose();
                a(th);
            }
        }
    }

    public void a(Throwable th) {
        if (!a()) {
            lazySet(C7463uQa.DISPOSED);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                _Pa.b(th2);
                WUa.b((Throwable) new ZPa(th, th2));
            }
        } else {
            WUa.b(th);
        }
    }

    public boolean a() {
        return get() == C7463uQa.DISPOSED;
    }
}
