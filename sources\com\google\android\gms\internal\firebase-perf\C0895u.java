package com.google.android.gms.internal.firebase-perf;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.internal.firebase-perf.P.a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.firebase-perf.u reason: case insensitive filesystem */
public final class C0895u {
    @SuppressLint({"StaticFieldLeak"})
    private static final C0895u a = new C0895u();
    private final ScheduledExecutorService b;
    public final ConcurrentLinkedQueue<P> c;
    private final Runtime d;
    private ScheduledFuture e;
    private long f;

    private C0895u() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private final synchronized void b(long j) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new C0891t(this), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            String str = "FirebasePerformance";
            String str2 = "Unable to start collecting Memory Metrics: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public static C0895u e() {
        return a;
    }

    private final synchronized void f() {
        try {
            this.b.schedule(new C0903w(this), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            String str = "FirebasePerformance";
            String str2 = "Unable to collect Memory Metric: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    private final P g() {
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        a o = P.o();
        o.a(micros);
        o.a(C0848i.a(C.BYTES.a(this.d.totalMemory() - this.d.freeMemory())));
        return (P) o.b();
    }

    public final void a(long j) {
        if (j > 0) {
            if (this.e != null) {
                if (this.f != j) {
                    c();
                    b(j);
                }
                return;
            }
            b(j);
        }
    }

    public final void c() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
            this.f = -1;
        }
    }

    public final void d() {
        f();
    }

    private C0895u(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.e = null;
        this.f = -1;
        this.b = scheduledExecutorService;
        this.c = new ConcurrentLinkedQueue<>();
        this.d = runtime;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Boolean a() throws Exception {
        return Boolean.valueOf(this.c.add(g()));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void b() {
        this.c.add(g());
    }
}
