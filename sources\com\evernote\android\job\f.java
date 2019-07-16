package com.evernote.android.job;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: JobConfig */
class f implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger();

    f() {
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("AndroidJob-");
        sb.append(this.a.incrementAndGet());
        Thread thread = new Thread(runnable, sb.toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
