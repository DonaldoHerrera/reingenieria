package defpackage;

/* renamed from: WAa reason: default package and case insensitive filesystem */
/* compiled from: EntitySyncModule_ProvideUsersSyncJobFactory */
public final class C5403WAa implements C4961HMa<C5256RAa> {
    private final C7054oVa<C6824lAa> a;
    private final C7054oVa<C3800jea> b;
    private final C7054oVa<C7305sAa> c;

    public C5403WAa(C7054oVa<C6824lAa> ova, C7054oVa<C3800jea> ova2, C7054oVa<C7305sAa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5403WAa a(C7054oVa<C6824lAa> ova, C7054oVa<C3800jea> ova2, C7054oVa<C7305sAa> ova3) {
        return new C5403WAa(ova, ova2, ova3);
    }

    public static C5256RAa a(C6824lAa laa, C3800jea jea, C7305sAa saa) {
        C5256RAa a2 = C5316TAa.a(laa, jea, saa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C5256RAa get() {
        return a((C6824lAa) this.a.get(), (C3800jea) this.b.get(), (C7305sAa) this.c.get());
    }
}
