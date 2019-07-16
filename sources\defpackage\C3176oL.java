package defpackage;

/* renamed from: oL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvidePrivacySettingsFactory */
public final class C3176oL implements C4961HMa<C7319sKa> {
    private final C7054oVa<C3177oM> a;

    public C3176oL(C7054oVa<C3177oM> ova) {
        this.a = ova;
    }

    public static C3176oL a(C7054oVa<C3177oM> ova) {
        return new C3176oL(ova);
    }

    public static C7319sKa a(C3177oM oMVar) {
        C7319sKa a2 = C2995fL.a(oMVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7319sKa get() {
        return a((C3177oM) this.a.get());
    }
}
