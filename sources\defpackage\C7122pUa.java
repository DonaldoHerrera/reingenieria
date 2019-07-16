package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pUa reason: default package and case insensitive filesystem */
/* compiled from: TrampolineScheduler */
public final class C7122pUa extends HPa {
    private static final C7122pUa b = new C7122pUa();

    /* renamed from: pUa$a */
    /* compiled from: TrampolineScheduler */
    static final class a implements Runnable {
        private final Runnable a;
        private final c b;
        private final long c;

        a(Runnable runnable, c cVar, long j) {
            this.a = runnable;
            this.b = cVar;
            this.c = j;
        }

        public void run() {
            if (!this.b.d) {
                long a2 = this.b.a(TimeUnit.MILLISECONDS);
                long j = this.c;
                if (j > a2) {
                    try {
                        Thread.sleep(j - a2);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        WUa.b((Throwable) e);
                        return;
                    }
                }
                if (!this.b.d) {
                    this.a.run();
                }
            }
        }
    }

    /* renamed from: pUa$b */
    /* compiled from: TrampolineScheduler */
    static final class b implements Comparable<b> {
        final Runnable a;
        final long b;
        final int c;
        volatile boolean d;

        b(Runnable runnable, Long l, int i) {
            this.a = runnable;
            this.b = l.longValue();
            this.c = i;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            int a2 = AQa.a(this.b, bVar.b);
            return a2 == 0 ? AQa.a(this.c, bVar.c) : a2;
        }
    }

    /* renamed from: pUa$c */
    /* compiled from: TrampolineScheduler */
    static final class c extends defpackage.HPa.c implements VPa {
        final PriorityBlockingQueue<b> a = new PriorityBlockingQueue<>();
        private final AtomicInteger b = new AtomicInteger();
        final AtomicInteger c = new AtomicInteger();
        volatile boolean d;

        /* renamed from: pUa$c$a */
        /* compiled from: TrampolineScheduler */
        final class a implements Runnable {
            final b a;

            a(b bVar) {
                this.a = bVar;
            }

            public void run() {
                b bVar = this.a;
                bVar.d = true;
                c.this.a.remove(bVar);
            }
        }

        c() {
        }

        public VPa a(Runnable runnable) {
            return a(runnable, a(TimeUnit.MILLISECONDS));
        }

        public void dispose() {
            this.d = true;
        }

        public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a2 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return a(new a(runnable, this, a2), a2);
        }

        /* access modifiers changed from: 0000 */
        public VPa a(Runnable runnable, long j) {
            if (this.d) {
                return C7532vQa.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.a.add(bVar);
            if (this.b.getAndIncrement() != 0) {
                return WPa.a((Runnable) new a(bVar));
            }
            int i = 1;
            while (!this.d) {
                b bVar2 = (b) this.a.poll();
                if (bVar2 == null) {
                    i = this.b.addAndGet(-i);
                    if (i == 0) {
                        return C7532vQa.INSTANCE;
                    }
                } else if (!bVar2.d) {
                    bVar2.a.run();
                }
            }
            this.a.clear();
            return C7532vQa.INSTANCE;
        }

        public boolean a() {
            return this.d;
        }
    }

    C7122pUa() {
    }

    public static C7122pUa b() {
        return b;
    }

    public defpackage.HPa.c a() {
        return new c();
    }

    public VPa a(Runnable runnable) {
        WUa.a(runnable).run();
        return C7532vQa.INSTANCE;
    }

    public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            WUa.a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            WUa.b((Throwable) e);
        }
        return C7532vQa.INSTANCE;
    }
}
