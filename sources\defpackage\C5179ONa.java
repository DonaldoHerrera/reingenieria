package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ONa reason: default package and case insensitive filesystem */
/* compiled from: AsyncTask */
class C5179ONa implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    C5179ONa() {
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncTask #");
        sb.append(this.a.getAndIncrement());
        return new Thread(runnable, sb.toString());
    }
}
