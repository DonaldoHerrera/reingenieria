package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: gUa reason: default package and case insensitive filesystem */
/* compiled from: NewThreadWorker */
public class C6508gUa extends c implements VPa {
    private final ScheduledExecutorService a;
    volatile boolean b;

    public C6508gUa(ThreadFactory threadFactory) {
        this.a = C6984nUa.a(threadFactory);
    }

    public VPa a(Runnable runnable) {
        return a(runnable, 0, null);
    }

    public VPa b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C6780kUa kua = new C6780kUa(WUa.a(runnable));
        if (j <= 0) {
            try {
                future = this.a.submit(kua);
            } catch (RejectedExecutionException e) {
                WUa.b((Throwable) e);
                return C7532vQa.INSTANCE;
            }
        } else {
            future = this.a.schedule(kua, j, timeUnit);
        }
        kua.a(future);
        return kua;
    }

    public void dispose() {
        if (!this.b) {
            this.b = true;
            this.a.shutdownNow();
        }
    }

    public VPa a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.b) {
            return C7532vQa.INSTANCE;
        }
        return a(runnable, j, timeUnit, null);
    }

    public C6848lUa a(Runnable runnable, long j, TimeUnit timeUnit, C7394tQa tqa) {
        Future future;
        C6848lUa lua = new C6848lUa(WUa.a(runnable), tqa);
        if (tqa != null && !tqa.b(lua)) {
            return lua;
        }
        if (j <= 0) {
            try {
                future = this.a.submit(lua);
            } catch (RejectedExecutionException e) {
                if (tqa != null) {
                    tqa.a(lua);
                }
                WUa.b((Throwable) e);
            }
        } else {
            future = this.a.schedule(lua, j, timeUnit);
        }
        lua.a(future);
        return lua;
    }

    public VPa b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a2 = WUa.a(runnable);
        if (j2 <= 0) {
            C6304dUa dua = new C6304dUa(a2, this.a);
            if (j <= 0) {
                try {
                    future = this.a.submit(dua);
                } catch (RejectedExecutionException e) {
                    WUa.b((Throwable) e);
                    return C7532vQa.INSTANCE;
                }
            } else {
                future = this.a.schedule(dua, j, timeUnit);
            }
            dua.a(future);
            return dua;
        }
        C6712jUa jua = new C6712jUa(a2);
        try {
            jua.a(this.a.scheduleAtFixedRate(jua, j, j2, timeUnit));
            return jua;
        } catch (RejectedExecutionException e2) {
            WUa.b((Throwable) e2);
            return C7532vQa.INSTANCE;
        }
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        if (!this.b) {
            this.b = true;
            this.a.shutdown();
        }
    }
}
