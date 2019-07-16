package defpackage;

import com.google.firebase.perf.a;
import com.google.firebase.perf.metrics.Trace;
import com.soundcloud.android.foundation.events.u;

/* renamed from: IO reason: default package and case insensitive filesystem */
/* compiled from: TraceMetric */
class C2093IO {
    static final C2093IO a = new C2093IO(C4928GKa.a());
    private final C4928GKa<Trace> b;

    private C2093IO(C4928GKa<Trace> gKa) {
        this.b = gKa;
    }

    static C2093IO a(u uVar) {
        a b2 = a.b();
        if (b2 == null || !b2.c()) {
            return a;
        }
        return new C2093IO(C4928GKa.c(b2.a(uVar.toString())));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (this.b.c()) {
            ((Trace) this.b.b()).start();
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.b.c()) {
            ((Trace) this.b.b()).stop();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return !this.b.c();
    }
}
