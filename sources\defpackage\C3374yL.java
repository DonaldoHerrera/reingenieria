package defpackage;

/* renamed from: yL reason: default package and case insensitive filesystem */
/* compiled from: BaseAnalyticsModule_ProvideTrackingDatabaseFactory */
public final class C3374yL implements C4961HMa<C5500ZKa> {
    private final C3354xL a;
    private final C7054oVa<C1992DM> b;

    public C3374yL(C3354xL xLVar, C7054oVa<C1992DM> ova) {
        this.a = xLVar;
        this.b = ova;
    }

    public static C3374yL a(C3354xL xLVar, C7054oVa<C1992DM> ova) {
        return new C3374yL(xLVar, ova);
    }

    public static C5500ZKa a(C3354xL xLVar, Object obj) {
        C5500ZKa a2 = xLVar.a((C1992DM) obj);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C5500ZKa get() {
        return a(this.a, this.b.get());
    }
}
