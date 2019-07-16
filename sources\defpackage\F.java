package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: F reason: default package */
/* compiled from: DefaultTaskExecutor */
class F implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(0);
    final /* synthetic */ G b;

    F(G g) {
        this.b = g;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
        return thread;
    }
}
