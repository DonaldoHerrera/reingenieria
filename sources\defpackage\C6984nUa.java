package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nUa reason: default package and case insensitive filesystem */
/* compiled from: SchedulerPoolFactory */
public final class C6984nUa {
    public static final boolean a;
    public static final int b;
    static final AtomicReference<ScheduledExecutorService> c = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> d = new ConcurrentHashMap();

    /* renamed from: nUa$a */
    /* compiled from: SchedulerPoolFactory */
    static final class a {
        boolean a;
        int b;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public void a(Properties properties) {
            String str = "rx2.purge-enabled";
            if (properties.containsKey(str)) {
                this.a = Boolean.parseBoolean(properties.getProperty(str));
            } else {
                this.a = true;
            }
            if (this.a) {
                String str2 = "rx2.purge-period-seconds";
                if (properties.containsKey(str2)) {
                    try {
                        this.b = Integer.parseInt(properties.getProperty(str2));
                        return;
                    } catch (NumberFormatException unused) {
                        this.b = 1;
                        return;
                    }
                }
            }
            this.b = 1;
        }
    }

    /* renamed from: nUa$b */
    /* compiled from: SchedulerPoolFactory */
    static final class b implements Runnable {
        b() {
        }

        public void run() {
            Iterator it = new ArrayList(C6984nUa.d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C6984nUa.d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.a(properties);
        a = aVar.a;
        b = aVar.b;
        a();
    }

    public static void a() {
        a(a);
    }

    static void a(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C6644iUa("RxSchedulerPurge"));
                    if (c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        b bVar = new b();
                        int i = b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        a(a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static void a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
