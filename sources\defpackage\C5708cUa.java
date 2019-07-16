package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cUa reason: default package and case insensitive filesystem */
/* compiled from: ExecutorScheduler */
public final class C5708cUa extends HPa {
    static final HPa b = C6645iVa.c();
    final boolean c;
    final Executor d;

    /* renamed from: cUa$a */
    /* compiled from: ExecutorScheduler */
    final class a implements Runnable {
        private final b a;

        a(b bVar) {
            this.a = bVar;
        }

        public void run() {
            b bVar = this.a;
            bVar.b.a(C5708cUa.this.a(bVar));
        }
    }

    /* renamed from: cUa$b */
    /* compiled from: ExecutorScheduler */
    static final class b extends AtomicReference<Runnable> implements Runnable, VPa, C6577hVa {
        final C7739yQa a = new C7739yQa();
        final C7739yQa b = new C7739yQa();

        b(Runnable runnable) {
            super(runnable);
        }

        public boolean a() {
            return get() == null;
        }

        public void dispose() {
            if (getAndSet(null) != null) {
                this.a.dispose();
                this.b.dispose();
            }
        }

        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.a.lazySet(C7463uQa.DISPOSED);
                    this.b.lazySet(C7463uQa.DISPOSED);
                }
            }
        }
    }

    /* renamed from: cUa$c */
    /* compiled from: ExecutorScheduler */
    public static final class c extends defpackage.HPa.c implements Runnable {
        final boolean a;
        final Executor b;
        final XTa<Runnable> c;
        volatile boolean d;
        final AtomicInteger e = new AtomicInteger();
        final UPa f = new UPa();

        /* renamed from: cUa$c$a */
        /* compiled from: ExecutorScheduler */
        static final class a extends AtomicBoolean implements Runnable, VPa {
            final Runnable a;

            a(Runnable runnable) {
                this.a = runnable;
            }

            public boolean a() {
                return get();
            }

            public void dispose() {
                lazySet(true);
            }

            public void run() {
                if (!get()) {
                    try {
                        this.a.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }
        }

        /* renamed from: cUa$c$b */
        /* compiled from: ExecutorScheduler */
        static final class b extends AtomicInteger implements Runnable, VPa {
            final Runnable a;
            final C7394tQa b;
            volatile Thread c;

            b(Runnable runnable, C7394tQa tqa) {
                this.a = runnable;
                this.b = tqa;
            }

            public boolean a() {
                return get() >= 2;
            }

            /* access modifiers changed from: 0000 */
            public void b() {
                C7394tQa tqa = this.b;
                if (tqa != null) {
                    tqa.c(this);
                }
            }

            public void dispose() {
                while (true) {
                    int i = get();
                    if (i < 2) {
                        if (i == 0) {
                            if (compareAndSet(0, 4)) {
                                b();
                                return;
                            }
                        } else if (compareAndSet(1, 3)) {
                            Thread thread = this.c;
                            if (thread != null) {
                                thread.interrupt();
                                this.c = null;
                            }
                            set(4);
                            b();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            public void run() {
                if (get() == 0) {
                    this.c = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.a.run();
                            this.c = null;
                            if (compareAndSet(1, 2)) {
                                b();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.c = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                b();
                            }
                            throw th;
                        }
                    } else {
                        this.c = null;
                    }
                }
            }
        }

        /* renamed from: cUa$c$c reason: collision with other inner class name */
        /* compiled from: ExecutorScheduler */
        final class C0166c implements Runnable {
            private final C7739yQa a;
            private final Runnable b;

            C0166c(C7739yQa yqa, Runnable runnable) {
                this.a = yqa;
                this.b = runnable;
            }

            public void run() {
                this.a.a(c.this.a(this.b));
            }
        }

        public c(Executor executor, boolean z) {
            this.b = executor;
            this.c = new XTa<>();
            this.a = z;
        }

        public VPa a(Runnable runnable) {
            VPa vPa;
            if (this.d) {
                return C7532vQa.INSTANCE;
            }
            Runnable a2 = WUa.a(runnable);
            if (this.a) {
                vPa = new b(a2, this.f);
                this.f.b(vPa);
            } else {
                vPa = new a(a2);
            }
            this.c.offer(vPa);
            if (this.e.getAndIncrement() == 0) {
                try {
                    this.b.execute(this);
                } catch (RejectedExecutionException e2) {
                    this.d = true;
                    this.c.clear();
                    WUa.b((Throwable) e2);
                    return C7532vQa.INSTANCE;
                }
            }
            return vPa;
        }

        public void dispose() {
            if (!this.d) {
                this.d = true;
                this.f.dispose();
                if (this.e.getAndIncrement() == 0) {
                    this.c.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            r1 = r3.e.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r3.d == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0.clear();
         */
        public void run() {
            XTa<Runnable> xTa = this.c;
            int i = 1;
            while (!this.d) {
                while (true) {
                    Runnable runnable = (Runnable) xTa.poll();
                    if (runnable == null) {
                        break;
                    }
                    runnable.run();
                    if (this.d) {
                        xTa.clear();
                        return;
                    }
                }
            }
            xTa.clear();
        }

        public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return a(runnable);
            }
            if (this.d) {
                return C7532vQa.INSTANCE;
            }
            C7739yQa yqa = new C7739yQa();
            C7739yQa yqa2 = new C7739yQa(yqa);
            C6848lUa lua = new C6848lUa(new C0166c(yqa2, WUa.a(runnable)), this.f);
            this.f.b(lua);
            Executor executor = this.b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    lua.a(((ScheduledExecutorService) executor).schedule(lua, j, timeUnit));
                } catch (RejectedExecutionException e2) {
                    this.d = true;
                    WUa.b((Throwable) e2);
                    return C7532vQa.INSTANCE;
                }
            } else {
                lua.a(new C5640bUa(C5708cUa.b.a(lua, j, timeUnit)));
            }
            yqa.a(lua);
            return yqa2;
        }

        public boolean a() {
            return this.d;
        }
    }

    public C5708cUa(Executor executor, boolean z) {
        this.d = executor;
        this.c = z;
    }

    public defpackage.HPa.c a() {
        return new c(this.d, this.c);
    }

    public VPa a(Runnable runnable) {
        Runnable a2 = WUa.a(runnable);
        try {
            if (this.d instanceof ExecutorService) {
                C6780kUa kua = new C6780kUa(a2);
                kua.a(((ExecutorService) this.d).submit(kua));
                return kua;
            } else if (this.c) {
                b bVar = new b(a2, null);
                this.d.execute(bVar);
                return bVar;
            } else {
                a aVar = new a(a2);
                this.d.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e) {
            WUa.b((Throwable) e);
            return C7532vQa.INSTANCE;
        }
    }

    public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable a2 = WUa.a(runnable);
        if (this.d instanceof ScheduledExecutorService) {
            try {
                C6780kUa kua = new C6780kUa(a2);
                kua.a(((ScheduledExecutorService) this.d).schedule(kua, j, timeUnit));
                return kua;
            } catch (RejectedExecutionException e) {
                WUa.b((Throwable) e);
                return C7532vQa.INSTANCE;
            }
        } else {
            b bVar = new b(a2);
            bVar.a.a(b.a(new a(bVar), j, timeUnit));
            return bVar;
        }
    }

    public VPa a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.d instanceof ScheduledExecutorService)) {
            return super.a(runnable, j, j2, timeUnit);
        }
        try {
            C6712jUa jua = new C6712jUa(WUa.a(runnable));
            jua.a(((ScheduledExecutorService) this.d).scheduleAtFixedRate(jua, j, j2, timeUnit));
            return jua;
        } catch (RejectedExecutionException e) {
            WUa.b((Throwable) e);
            return C7532vQa.INSTANCE;
        }
    }
}
