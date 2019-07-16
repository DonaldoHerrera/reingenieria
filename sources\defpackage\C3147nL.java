package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: nL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvidePerformanceMetricsEngineFactory */
public final class C3147nL implements C4961HMa<C2014EO> {
    private final C7054oVa<a> a;
    private final C7054oVa<C3277tO> b;
    private final C7054oVa<C1934AO> c;

    public C3147nL(C7054oVa<a> ova, C7054oVa<C3277tO> ova2, C7054oVa<C1934AO> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C3147nL a(C7054oVa<a> ova, C7054oVa<C3277tO> ova2, C7054oVa<C1934AO> ova3) {
        return new C3147nL(ova, ova2, ova3);
    }

    public static C2014EO a(a aVar, C4806CMa<C3277tO> cMa, C4806CMa<C1934AO> cMa2) {
        C2014EO a2 = C2995fL.a(aVar, cMa, cMa2);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2014EO get() {
        return a((a) this.a.get(), C4930GMa.a(this.b), C4930GMa.a(this.c));
    }
}
