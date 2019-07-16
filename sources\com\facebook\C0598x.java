package com.facebook;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.x reason: case insensitive filesystem */
/* compiled from: FacebookSdk */
class C0598x implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);

    C0598x() {
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("FacebookSdk #");
        sb.append(this.a.incrementAndGet());
        return new Thread(runnable, sb.toString());
    }
}
