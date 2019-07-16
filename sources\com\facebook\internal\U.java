package com.facebook.internal;

import java.util.concurrent.Callable;

/* compiled from: LockOnGetVariable */
class U implements Callable<Void> {
    final /* synthetic */ Callable a;
    final /* synthetic */ V b;

    U(V v, Callable callable) {
        this.b = v;
        this.a = callable;
    }

    /* JADX INFO: finally extract failed */
    public Void call() throws Exception {
        try {
            this.b.a = this.a.call();
            this.b.b.countDown();
            return null;
        } catch (Throwable th) {
            this.b.b.countDown();
            throw th;
        }
    }
}
