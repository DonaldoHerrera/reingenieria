package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.Constants;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadFactoryWrapper implements ThreadFactory {
    private String source;

    public ThreadFactoryWrapper(String str) {
        this.source = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setPriority(9);
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.THREAD_PREFIX);
        sb.append(newThread.getName());
        sb.append("-");
        sb.append(this.source);
        newThread.setName(sb.toString());
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable th) {
                AdjustFactory.getLogger().error("Thread [%s] with error [%s]", thread.getName(), th.getMessage());
            }
        });
        return newThread;
    }
}
