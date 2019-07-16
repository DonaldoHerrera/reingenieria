package defpackage;

import com.google.firebase.perf.metrics.Trace;

/* renamed from: xO reason: default package and case insensitive filesystem */
/* compiled from: PerformanceReporter.kt */
public final class C3357xO implements C2074HO {
    private final Trace a;

    public C3357xO(Trace trace) {
        C7471uYa.b(trace, "firebaseTrace");
        this.a = trace;
    }

    public void a(String str, long j) {
        C7471uYa.b(str, "label");
        this.a.incrementMetric(str, j);
    }

    public void b(String str, long j) {
        C7471uYa.b(str, "label");
        this.a.putAttribute(str, String.valueOf(j));
    }

    public void start() {
        this.a.start();
    }

    public void stop() {
        this.a.stop();
    }
}
