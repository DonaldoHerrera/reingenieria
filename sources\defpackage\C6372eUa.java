package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eUa reason: default package and case insensitive filesystem */
/* compiled from: IoScheduler */
public final class C6372eUa extends HPa {
    static final C6644iUa b;
    static final C6644iUa c;
    private static final long d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private static final TimeUnit e = TimeUnit.SECONDS;
    static final c f = new c(new C6644iUa("RxCachedThreadSchedulerShutdown"));
    static final a g = new a(0, null, b);
    final ThreadFactory h;
    final AtomicReference<a> i;

    /* renamed from: eUa$a */
    /* compiled from: IoScheduler */
    static final class a implements Runnable {
        private final long a;
        private final ConcurrentLinkedQueue<c> b;
        final UPa c;
        private final ScheduledExecutorService d;
        private final Future<?> e;
        private final ThreadFactory f;

        a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future<?> future;
            this.a = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new UPa();
            this.f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C6372eUa.c);
                long j2 = this.a;
                future = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.d = scheduledExecutorService;
            this.e = future;
        }

        /* access modifiers changed from: 0000 */
        public void a(c cVar) {
            cVar.a(c() + this.a);
            this.b.offer(cVar);
        }

        /* access modifiers changed from: 0000 */
        public c b() {
            if (this.c.a()) {
                return C6372eUa.f;
            }
            while (!this.b.isEmpty()) {
                c cVar = (c) this.b.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            c cVar2 = new c(this.f);
            this.c.b(cVar2);
            return cVar2;
        }

        /* access modifiers changed from: 0000 */
        public long c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            this.c.dispose();
            Future<?> future = this.e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            a();
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            if (!this.b.isEmpty()) {
                long c2 = c();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.c() > c2) {
                        return;
                    }
                    if (this.b.remove(cVar)) {
                        this.c.a((VPa) cVar);
                    }
                }
            }
        }
    }

    /* renamed from: eUa$b */
    /* compiled from: IoScheduler */
    static final class b extends defpackage.HPa.c {
        private final UPa a;
        private final a b;
        private final c c;
        final AtomicBoolean d = new AtomicBoolean();

        b(a aVar) {
            this.b = aVar;
            this.a = new UPa();
            this.c = aVar.b();
        }

        public boolean a() {
            return this.d.get();
        }

        public void dispose() {
            if (this.d.compareAndSet(false, true)) {
                this.a.dispose();
                this.b.a(this.c);
            }
        }

        public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.a.a()) {
                return C7532vQa.INSTANCE;
            }
            return this.c.a(runnable, j, timeUnit, this.a);
        }
    }

    /* renamed from: eUa$c */
    /* compiled from: IoScheduler */
    static final class c extends C6508gUa {
        private long c = 0;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        public void a(long j) {
            this.c = j;
        }

        public long c() {
            return this.c;
        }
    }

    static {
        f.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        b = new C6644iUa("RxCachedThreadScheduler", max);
        c = new C6644iUa("RxCachedWorkerPoolEvictor", max);
        g.d();
    }

    public C6372eUa() {
        this(b);
    }

    public defpackage.HPa.c a() {
        return new b((a) this.i.get());
    }

    public void b() {
        a aVar = new a(d, e, this.h);
        if (!this.i.compareAndSet(g, aVar)) {
            aVar.d();
        }
    }

    public C6372eUa(ThreadFactory threadFactory) {
        this.h = threadFactory;
        this.i = new AtomicReference<>(g);
        b();
    }
}
