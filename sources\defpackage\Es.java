package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: Es reason: default package */
public interface Es {
    ExecutorService a(ThreadFactory threadFactory, int i);

    ScheduledExecutorService a(int i, ThreadFactory threadFactory, int i2);
}
