package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aUa reason: default package and case insensitive filesystem */
/* compiled from: ComputationScheduler */
public final class C5572aUa extends HPa implements C6916mUa {
    static final b b = new b(0, c);
    static final C6644iUa c = new C6644iUa("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
    static final int d = a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    static final c e = new c(new C6644iUa("RxComputationShutdown"));
    final ThreadFactory f;
    final AtomicReference<b> g;

    /* renamed from: aUa$a */
    /* compiled from: ComputationScheduler */
    static final class a extends defpackage.HPa.c {
        private final C7601wQa a = new C7601wQa();
        private final UPa b = new UPa();
        private final C7601wQa c = new C7601wQa();
        private final c d;
        volatile boolean e;

        a(c cVar) {
            this.d = cVar;
            this.c.b(this.a);
            this.c.b(this.b);
        }

        public boolean a() {
            return this.e;
        }

        public void dispose() {
            if (!this.e) {
                this.e = true;
                this.c.dispose();
            }
        }

        public VPa a(Runnable runnable) {
            if (this.e) {
                return C7532vQa.INSTANCE;
            }
            return this.d.a(runnable, 0, TimeUnit.MILLISECONDS, this.a);
        }

        public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.e) {
                return C7532vQa.INSTANCE;
            }
            return this.d.a(runnable, j, timeUnit, this.b);
        }
    }

    /* renamed from: aUa$b */
    /* compiled from: ComputationScheduler */
    static final class b implements C6916mUa {
        final int a;
        final c[] b;
        long c;

        b(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.a;
            if (i == 0) {
                return C5572aUa.e;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public void b() {
            for (c dispose : this.b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: aUa$c */
    /* compiled from: ComputationScheduler */
    static final class c extends C6508gUa {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        e.dispose();
        b.b();
    }

    public C5572aUa() {
        this(c);
    }

    static int a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    public defpackage.HPa.c a() {
        return new a(((b) this.g.get()).a());
    }

    public void b() {
        b bVar = new b(d, this.f);
        if (!this.g.compareAndSet(b, bVar)) {
            bVar.b();
        }
    }

    public C5572aUa(ThreadFactory threadFactory) {
        this.f = threadFactory;
        this.g = new AtomicReference<>(b);
        b();
    }

    public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((b) this.g.get()).a().b(runnable, j, timeUnit);
    }

    public VPa a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((b) this.g.get()).a().b(runnable, j, j2, timeUnit);
    }
}
