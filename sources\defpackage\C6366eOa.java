package defpackage;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: eOa reason: default package and case insensitive filesystem */
/* compiled from: PriorityThreadPoolExecutor */
public class C6366eOa extends ThreadPoolExecutor {
    private static final int a = Runtime.getRuntime().availableProcessors();
    private static final int b;
    private static final int c;

    /* renamed from: eOa$a */
    /* compiled from: PriorityThreadPoolExecutor */
    protected static final class a implements ThreadFactory {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.a);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int i = a;
        b = i + 1;
        c = (i * 2) + 1;
    }

    <T extends Runnable & C5387VNa & C6434fOa & C5702cOa> C6366eOa(int i, int i2, long j, TimeUnit timeUnit, C5416WNa<T> wNa, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, wNa, threadFactory);
        prestartAllCoreThreads();
    }

    public static <T extends Runnable & C5387VNa & C6434fOa & C5702cOa> C6366eOa a(int i, int i2) {
        C6366eOa eoa = new C6366eOa(i, i2, 1, TimeUnit.SECONDS, new C5416WNa(), new a(10));
        return eoa;
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        C6434fOa foa = (C6434fOa) runnable;
        foa.a(true);
        foa.a(th);
        getQueue().c();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (C6298dOa.b(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C5634bOa(runnable, t);
    }

    public static C6366eOa a() {
        return a(b, c);
    }

    public C5416WNa getQueue() {
        return (C5416WNa) super.getQueue();
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C5634bOa(callable);
    }
}
