package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oUa reason: default package and case insensitive filesystem */
/* compiled from: SingleScheduler */
public final class C7053oUa extends HPa {
    static final C6644iUa b = new C6644iUa("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    static final ScheduledExecutorService c = Executors.newScheduledThreadPool(0);
    final ThreadFactory d;
    final AtomicReference<ScheduledExecutorService> e;

    /* renamed from: oUa$a */
    /* compiled from: SingleScheduler */
    static final class a extends c {
        final ScheduledExecutorService a;
        final UPa b = new UPa();
        volatile boolean c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.a = scheduledExecutorService;
        }

        public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.c) {
                return C7532vQa.INSTANCE;
            }
            C6848lUa lua = new C6848lUa(WUa.a(runnable), this.b);
            this.b.b(lua);
            if (j <= 0) {
                try {
                    future = this.a.submit(lua);
                } catch (RejectedExecutionException e) {
                    dispose();
                    WUa.b((Throwable) e);
                    return C7532vQa.INSTANCE;
                }
            } else {
                future = this.a.schedule(lua, j, timeUnit);
            }
            lua.a(future);
            return lua;
        }

        public void dispose() {
            if (!this.c) {
                this.c = true;
                this.b.dispose();
            }
        }

        public boolean a() {
            return this.c;
        }
    }

    static {
        c.shutdown();
    }

    public C7053oUa() {
        this(b);
    }

    static ScheduledExecutorService a(ThreadFactory threadFactory) {
        return C6984nUa.a(threadFactory);
    }

    public C7053oUa(ThreadFactory threadFactory) {
        this.e = new AtomicReference<>();
        this.d = threadFactory;
        this.e.lazySet(a(threadFactory));
    }

    public c a() {
        return new a((ScheduledExecutorService) this.e.get());
    }

    public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C6780kUa kua = new C6780kUa(WUa.a(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.e.get()).submit(kua);
            } catch (RejectedExecutionException e2) {
                WUa.b((Throwable) e2);
                return C7532vQa.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.e.get()).schedule(kua, j, timeUnit);
        }
        kua.a(future);
        return kua;
    }

    public VPa a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a2 = WUa.a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.get();
            C6304dUa dua = new C6304dUa(a2, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(dua);
                } catch (RejectedExecutionException e2) {
                    WUa.b((Throwable) e2);
                    return C7532vQa.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(dua, j, timeUnit);
            }
            dua.a(future);
            return dua;
        }
        C6712jUa jua = new C6712jUa(a2);
        try {
            jua.a(((ScheduledExecutorService) this.e.get()).scheduleAtFixedRate(jua, j, j2, timeUnit));
            return jua;
        } catch (RejectedExecutionException e3) {
            WUa.b((Throwable) e3);
            return C7532vQa.INSTANCE;
        }
    }
}
