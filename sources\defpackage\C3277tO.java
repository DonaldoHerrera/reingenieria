package defpackage;

import com.soundcloud.android.foundation.events.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tO reason: default package and case insensitive filesystem */
/* compiled from: DefaultPerformanceMetricsEngine.kt */
public class C3277tO implements C2014EO {
    private final ConcurrentHashMap<u, List<C1994DO>> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<u, C2093IO> b = new ConcurrentHashMap<>();

    private boolean c(u uVar) {
        return this.a.containsKey(uVar);
    }

    private void d(u uVar) {
        if (this.b.containsKey(uVar)) {
            C2093IO io = (C2093IO) this.b.get(uVar);
            if (io != null) {
                io.c();
            }
        }
    }

    private void e(C1994DO doR) {
        u c = doR.c();
        C7471uYa.a((Object) c, "performanceMetric.metricType()");
        b(c);
    }

    public void a(u uVar) {
        C7471uYa.b(uVar, C1325gg.TYPE);
        C1994DO a2 = C1994DO.a(uVar);
        C7471uYa.a((Object) a2, "PerformanceMetric.create(type)");
        a(a2);
    }

    public void b(C1994DO doR) {
        C7471uYa.b(doR, "performanceMetric");
        synchronized (this) {
            try {
                u c = doR.c();
                C7471uYa.a((Object) c, "performanceMetric.metricType()");
                if (c(c)) {
                    u c2 = doR.c();
                    c(doR);
                    C7471uYa.a((Object) c2, "metricType");
                    d(c2);
                    b(c2);
                    RVa rVa = RVa.a;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not currently measuring: ");
                    sb.append(doR.c().name());
                    throw new C1974CO(sb.toString());
                }
            } catch (Exception e) {
                SDb.a(e, C3297uO.a, new Object[0]);
            }
        }
    }

    private void c(C1994DO doR) {
        u c = doR.c();
        if (!this.a.containsKey(c)) {
            ConcurrentHashMap<u, List<C1994DO>> concurrentHashMap = this.a;
            C7471uYa.a((Object) c, "metricType");
            concurrentHashMap.put(c, new ArrayList());
        }
        List list = (List) this.a.get(c);
        if (list != null) {
            list.add(doR);
        }
    }

    public void a(C1994DO doR) {
        C7471uYa.b(doR, "performanceMetric");
        e(doR);
        c(doR);
        d(doR);
    }

    private void d(C1994DO doR) {
        ConcurrentHashMap<u, C2093IO> concurrentHashMap = this.b;
        u c = doR.c();
        C7471uYa.a((Object) c, "performanceMetric.metricType()");
        C2093IO e = doR.e();
        C7471uYa.a((Object) e, "performanceMetric.traceMetric()");
        concurrentHashMap.put(c, e);
    }

    public void b(u uVar) {
        C7471uYa.b(uVar, C1325gg.TYPE);
        this.a.remove(uVar);
        this.b.remove(uVar);
    }
}
