package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: XQa reason: default package */
/* compiled from: InnerQueuedObserver */
public final class XQa<T> extends AtomicReference<VPa> implements GPa<T>, VPa {
    final YQa<T> a;
    final int b;
    NQa<T> c;
    volatile boolean d;
    int e;

    public XQa(YQa<T> yQa, int i) {
        this.a = yQa;
        this.b = i;
    }

    public void a(VPa vPa) {
        if (C7463uQa.c(this, vPa)) {
            if (vPa instanceof IQa) {
                IQa iQa = (IQa) vPa;
                int a2 = iQa.a(3);
                if (a2 == 1) {
                    this.e = a2;
                    this.c = iQa;
                    this.d = true;
                    this.a.a(this);
                    return;
                } else if (a2 == 2) {
                    this.e = a2;
                    this.c = iQa;
                    return;
                }
            }
            this.c = JUa.a(-this.b);
        }
    }

    public boolean b() {
        return this.d;
    }

    public NQa<T> c() {
        return this.c;
    }

    public void d() {
        this.d = true;
    }

    public void dispose() {
        C7463uQa.a((AtomicReference<VPa>) this);
    }

    public void onComplete() {
        this.a.a(this);
    }

    public void a(T t) {
        if (this.e == 0) {
            this.a.a(this, t);
        } else {
            this.a.b();
        }
    }

    public void a(Throwable th) {
        this.a.a(this, th);
    }

    public boolean a() {
        return C7463uQa.a((VPa) get());
    }
}
