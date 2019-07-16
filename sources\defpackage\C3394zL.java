package defpackage;

import java.util.List;

/* renamed from: zL reason: default package and case insensitive filesystem */
/* compiled from: BaseAnalyticsProviderHolder.kt */
public final class C3394zL {
    private final C2013EN a;
    private final C2112JO b;
    private final C2260RK c;

    public C3394zL(C2013EN en, C2112JO jo, C2260RK rk) {
        C7471uYa.b(en, "eventLoggerAnalyticsProvider");
        C7471uYa.b(jo, "promotedAnalyticsProvider");
        C7471uYa.b(rk, "adErrorsAnalyticsProvider");
        this.a = en;
        this.b = jo;
        this.c = rk;
    }

    public final List<C2109JL> a() {
        return C6918mWa.b((Object[]) new C2109JL[]{this.a, this.b, this.c});
    }
}
