package defpackage;

import com.google.firebase.perf.a;
import com.google.firebase.perf.metrics.Trace;

/* renamed from: wO reason: default package and case insensitive filesystem */
/* compiled from: PerformanceReporter.kt */
public final class C3337wO implements C2034FO {
    public static final C3337wO a = new C3337wO();

    private C3337wO() {
    }

    public C2074HO a(String str) {
        C7471uYa.b(str, "name");
        Trace a2 = a.b().a(str);
        C7471uYa.a((Object) a2, "FirebasePerformance.getI…          .newTrace(name)");
        return new C3357xO(a2);
    }
}
