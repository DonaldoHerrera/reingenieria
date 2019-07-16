package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jd reason: default package and case insensitive filesystem */
/* compiled from: ModernAsyncTask */
class C1414jd implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    C1414jd() {
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("ModernAsyncTask #");
        sb.append(this.a.getAndIncrement());
        return new Thread(runnable, sb.toString());
    }
}
