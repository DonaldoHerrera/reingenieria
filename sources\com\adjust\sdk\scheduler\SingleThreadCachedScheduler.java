package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingleThreadCachedScheduler implements ThreadScheduler {
    /* access modifiers changed from: private */
    public boolean isTeardown = false;
    /* access modifiers changed from: private */
    public boolean isThreadProcessing = false;
    /* access modifiers changed from: private */
    public final List<Runnable> queue = new ArrayList();
    private ThreadPoolExecutor threadPoolExecutor;

    public SingleThreadCachedScheduler(final String str) {
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryWrapper(str), new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
        this.threadPoolExecutor = threadPoolExecutor2;
    }

    private void processQueue(final Runnable runnable) {
        this.threadPoolExecutor.submit(new Runnable() {
            public void run() {
                Runnable runnable;
                SingleThreadCachedScheduler.this.tryExecuteRunnable(runnable);
                while (true) {
                    synchronized (SingleThreadCachedScheduler.this.queue) {
                        if (!SingleThreadCachedScheduler.this.isTeardown) {
                            if (SingleThreadCachedScheduler.this.queue.isEmpty()) {
                                SingleThreadCachedScheduler.this.isThreadProcessing = false;
                                return;
                            } else {
                                runnable = (Runnable) SingleThreadCachedScheduler.this.queue.get(0);
                                SingleThreadCachedScheduler.this.queue.remove(0);
                            }
                        } else {
                            return;
                        }
                    }
                    SingleThreadCachedScheduler.this.tryExecuteRunnable(runnable);
                }
                while (true) {
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void tryExecuteRunnable(Runnable runnable) {
        try {
            if (!this.isTeardown) {
                runnable.run();
            }
        } catch (Throwable th) {
            AdjustFactory.getLogger().warn("Execution failed: %s", th.getMessage());
        }
    }

    public void schedule(final Runnable runnable, final long j) {
        synchronized (this.queue) {
            if (!this.isTeardown) {
                this.threadPoolExecutor.submit(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(j);
                        } catch (InterruptedException e) {
                            AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
                        }
                        SingleThreadCachedScheduler.this.submit(runnable);
                    }
                });
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    public void submit(Runnable runnable) {
        synchronized (this.queue) {
            if (!this.isTeardown) {
                if (!this.isThreadProcessing) {
                    this.isThreadProcessing = true;
                    processQueue(runnable);
                } else {
                    this.queue.add(runnable);
                }
            }
        }
    }

    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}
