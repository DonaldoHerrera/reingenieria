package com.facebook.internal;

import com.facebook.B;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* compiled from: LockOnGetVariable */
public class V<T> {
    /* access modifiers changed from: private */
    public T a;
    /* access modifiers changed from: private */
    public CountDownLatch b = new CountDownLatch(1);

    public V(Callable<T> callable) {
        B.m().execute(new FutureTask(new U(this, callable)));
    }

    private void b() {
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public T a() {
        b();
        return this.a;
    }
}
