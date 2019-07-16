package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: kv reason: default package and case insensitive filesystem */
final class C1463kv<TResult> implements Qy, Sy, Ty<TResult> {
    private final CountDownLatch a;

    private C1463kv() {
        this.a = new CountDownLatch(1);
    }

    public final void a(Exception exc) {
        this.a.countDown();
    }

    public final void onSuccess(TResult tresult) {
        this.a.countDown();
    }

    public final void a() {
        this.a.countDown();
    }

    public final boolean a(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(5, timeUnit);
    }
}
