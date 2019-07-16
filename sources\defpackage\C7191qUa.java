package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qUa reason: default package and case insensitive filesystem */
/* compiled from: StrictSubscriber */
public class C7191qUa<T> extends AtomicInteger implements C7462uPa<T>, C5619bBb {
    final C5551aBb<? super T> a;
    final C7743yUa b = new C7743yUa();
    final AtomicLong c = new AtomicLong();
    final AtomicReference<C5619bBb> d = new AtomicReference<>();
    final AtomicBoolean e = new AtomicBoolean();
    volatile boolean f;

    public C7191qUa(C5551aBb<? super T> abb) {
        this.a = abb;
    }

    public void a(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder sb = new StringBuilder();
            sb.append("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            a((Throwable) new IllegalArgumentException(sb.toString()));
            return;
        }
        C7605wUa.a(this.d, this.c, j);
    }

    public void cancel() {
        if (!this.f) {
            C7605wUa.a(this.d);
        }
    }

    public void onComplete() {
        this.f = true;
        FUa.a(this.a, this, this.b);
    }

    public void a(C5619bBb bbb) {
        if (this.e.compareAndSet(false, true)) {
            this.a.a((C5619bBb) this);
            C7605wUa.a(this.d, this.c, bbb);
            return;
        }
        bbb.cancel();
        cancel();
        a((Throwable) new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void a(T t) {
        FUa.a(this.a, t, (AtomicInteger) this, this.b);
    }

    public void a(Throwable th) {
        this.f = true;
        FUa.a(this.a, th, (AtomicInteger) this, this.b);
    }
}
