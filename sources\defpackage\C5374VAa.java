package defpackage;

/* renamed from: VAa reason: default package and case insensitive filesystem */
/* compiled from: EntitySyncModule_ProvideTrackSyncJobFactory */
public final class C5374VAa implements C4961HMa<C5256RAa> {
    private final C7054oVa<C6620iAa> a;
    private final C7054oVa<C3768fea> b;
    private final C7054oVa<C7098pAa> c;

    public C5374VAa(C7054oVa<C6620iAa> ova, C7054oVa<C3768fea> ova2, C7054oVa<C7098pAa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5374VAa a(C7054oVa<C6620iAa> ova, C7054oVa<C3768fea> ova2, C7054oVa<C7098pAa> ova3) {
        return new C5374VAa(ova, ova2, ova3);
    }

    public static C5256RAa a(C6620iAa iaa, C3768fea fea, C7098pAa paa) {
        C5256RAa a2 = C5316TAa.a(iaa, fea, paa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C5256RAa get() {
        return a((C6620iAa) this.a.get(), (C3768fea) this.b.get(), (C7098pAa) this.c.get());
    }
}
