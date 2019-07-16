package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: RQa reason: default package */
/* compiled from: BlockingMultiObserver */
public final class RQa<T> extends CountDownLatch implements KPa<T>, C7117pPa, C7600wPa<T> {
    T a;
    Throwable b;
    VPa c;
    volatile boolean d;

    public RQa() {
        super(1);
    }

    public void a(VPa vPa) {
        this.c = vPa;
        if (this.d) {
            vPa.dispose();
        }
    }

    public Throwable b() {
        if (getCount() != 0) {
            try {
                AUa.a();
                await();
            } catch (InterruptedException e) {
                c();
                return e;
            }
        }
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.d = true;
        VPa vPa = this.c;
        if (vPa != null) {
            vPa.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onSuccess(T t) {
        this.a = t;
        countDown();
    }

    public void a(Throwable th) {
        this.b = th;
        countDown();
    }

    public T a() {
        if (getCount() != 0) {
            try {
                AUa.a();
                await();
            } catch (InterruptedException e) {
                c();
                throw EUa.a((Throwable) e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw EUa.a(th);
    }

    public T a(T t) {
        if (getCount() != 0) {
            try {
                AUa.a();
                await();
            } catch (InterruptedException e) {
                c();
                throw EUa.a((Throwable) e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            T t2 = this.a;
            return t2 != null ? t2 : t;
        }
        throw EUa.a(th);
    }
}
