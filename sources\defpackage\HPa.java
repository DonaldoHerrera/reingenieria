package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: HPa reason: default package */
/* compiled from: Scheduler */
public abstract class HPa {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: HPa$a */
    /* compiled from: Scheduler */
    static final class a implements VPa, Runnable, C6577hVa {
        final Runnable a;
        final c b;
        Thread c;

        a(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        public boolean a() {
            return this.b.a();
        }

        public void dispose() {
            if (this.c == Thread.currentThread()) {
                c cVar = this.b;
                if (cVar instanceof C6508gUa) {
                    ((C6508gUa) cVar).b();
                    return;
                }
            }
            this.b.dispose();
        }

        public void run() {
            this.c = Thread.currentThread();
            try {
                this.a.run();
            } finally {
                dispose();
                this.c = null;
            }
        }
    }

    /* renamed from: HPa$b */
    /* compiled from: Scheduler */
    static final class b implements VPa, Runnable, C6577hVa {
        final Runnable a;
        final c b;
        volatile boolean c;

        b(Runnable runnable, c cVar) {
            this.a = runnable;
            this.b = cVar;
        }

        public boolean a() {
            return this.c;
        }

        public void dispose() {
            this.c = true;
            this.b.dispose();
        }

        public void run() {
            if (!this.c) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.b.dispose();
                    throw EUa.a(th);
                }
            }
        }
    }

    /* renamed from: HPa$c */
    /* compiled from: Scheduler */
    public static abstract class c implements VPa {

        /* renamed from: HPa$c$a */
        /* compiled from: Scheduler */
        final class a implements Runnable, C6577hVa {
            final Runnable a;
            final C7739yQa b;
            final long c;
            long d;
            long e;
            long f;

            a(long j, Runnable runnable, long j2, C7739yQa yqa, long j3) {
                this.a = runnable;
                this.b = yqa;
                this.c = j3;
                this.e = j2;
                this.f = j;
            }

            public void run() {
                long j;
                this.a.run();
                if (!this.b.a()) {
                    long a2 = c.this.a(TimeUnit.NANOSECONDS);
                    long j2 = HPa.a;
                    long j3 = a2 + j2;
                    long j4 = this.e;
                    if (j3 >= j4) {
                        long j5 = this.c;
                        if (a2 < j4 + j5 + j2) {
                            long j6 = this.f;
                            long j7 = this.d + 1;
                            this.d = j7;
                            j = j6 + (j7 * j5);
                            this.e = a2;
                            this.b.a(c.this.a(this, j - a2, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j8 = this.c;
                    long j9 = a2 + j8;
                    long j10 = this.d + 1;
                    this.d = j10;
                    this.f = j9 - (j8 * j10);
                    j = j9;
                    this.e = a2;
                    this.b.a(c.this.a(this, j - a2, TimeUnit.NANOSECONDS));
                }
            }
        }

        public VPa a(Runnable runnable) {
            return a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public abstract VPa a(Runnable runnable, long j, TimeUnit timeUnit);

        public VPa a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C7739yQa yqa = new C7739yQa();
            C7739yQa yqa2 = new C7739yQa(yqa);
            Runnable a2 = WUa.a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a3 = a(TimeUnit.NANOSECONDS);
            C7739yQa yqa3 = yqa;
            a aVar = r0;
            a aVar2 = new a(a3 + timeUnit2.toNanos(j3), a2, a3, yqa2, nanos);
            VPa a4 = a(aVar, j3, timeUnit2);
            if (a4 == C7532vQa.INSTANCE) {
                return a4;
            }
            yqa3.a(a4);
            return yqa2;
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public abstract c a();

    public VPa a(Runnable runnable) {
        return a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
        c a2 = a();
        a aVar = new a(WUa.a(runnable), a2);
        a2.a(aVar, j, timeUnit);
        return aVar;
    }

    public VPa a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        c a2 = a();
        b bVar = new b(WUa.a(runnable), a2);
        VPa a3 = a2.a(bVar, j, j2, timeUnit);
        return a3 == C7532vQa.INSTANCE ? a3 : bVar;
    }
}
