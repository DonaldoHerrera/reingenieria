package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: tL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsProviderFactory.kt */
public class C3274tL {
    private final C3214qL a;
    private final C7054oVa<C2373XM> b;
    private final C4806CMa<C2205OM> c;
    private final C4806CMa<C3035hN> d;
    private final C4806CMa<C3256sN> e;
    private final C4806CMa<C3394zL> f;
    private final C7319sKa g;

    public C3274tL(C3214qL qLVar, C7054oVa<C2373XM> ova, C4806CMa<C2205OM> cMa, C4806CMa<C3035hN> cMa2, C4806CMa<C3256sN> cMa3, C4806CMa<C3394zL> cMa4, C7319sKa ska) {
        C7471uYa.b(qLVar, "analyticsProperties");
        C7471uYa.b(ova, "appboyAnalyticsProvider");
        C7471uYa.b(cMa, "lazyAdjustAnalyticsProvider");
        C7471uYa.b(cMa2, "lazyComScoreAnalyticsProvider");
        C7471uYa.b(cMa3, "lazyFabricAnalyticsProvider");
        C7471uYa.b(cMa4, "baseProviders");
        C7471uYa.b(ska, "privacySettings");
        this.a = qLVar;
        this.b = ova;
        this.c = cMa;
        this.d = cMa2;
        this.e = cMa3;
        this.f = cMa4;
        this.g = ska;
    }

    private List<C3254sL> b() {
        ArrayList arrayList = new ArrayList();
        if (this.g.a()) {
            Object obj = this.c.get();
            C7471uYa.a(obj, "lazyAdjustAnalyticsProvider.get()");
            arrayList.add(obj);
            Object obj2 = this.e.get();
            C7471uYa.a(obj2, "lazyFabricAnalyticsProvider.get()");
            arrayList.add(obj2);
            Object obj3 = this.b.get();
            C7471uYa.a(obj3, "appboyAnalyticsProvider.get()");
            arrayList.add(obj3);
            C3035hN hNVar = (C3035hN) this.d.get();
            if (hNVar != null) {
                arrayList.add(hNVar);
            }
        }
        return arrayList;
    }

    public List<C3254sL> a() {
        if (!this.a.a()) {
            return C6918mWa.a();
        }
        return C7676xWa.c((Collection) ((C3394zL) this.f.get()).a(), (Iterable) b());
    }
}
