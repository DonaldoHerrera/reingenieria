package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hh reason: default package and case insensitive filesystem */
/* compiled from: BackgroundManager */
class C1357hh {
    private final ScheduledExecutorService a;
    private final List<a> b = new ArrayList();
    private volatile boolean c = true;
    final AtomicReference<ScheduledFuture<?>> d = new AtomicReference<>();
    boolean e = true;

    /* renamed from: hh$a */
    /* compiled from: BackgroundManager */
    public interface a {
        void a();
    }

    public C1357hh(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public void c() {
        for (a a2 : this.b) {
            a2.a();
        }
    }

    public void b() {
        this.e = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void a(a aVar) {
        this.b.add(aVar);
    }

    public void a() {
        if (this.c && !this.e) {
            this.e = true;
            try {
                this.d.compareAndSet(null, this.a.schedule(new C1326gh(this), 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e2) {
                C5328TMa.e().a("Answers", "Failed to schedule background detector", e2);
            }
        }
    }
}
