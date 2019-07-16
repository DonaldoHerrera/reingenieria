package defpackage;

/* renamed from: oCa reason: default package and case insensitive filesystem */
/* compiled from: PostsSyncModule_ProvideLoadLocalPlaylistPostsCommandFactory */
public final class C7033oCa implements C4961HMa<C6556hCa> {
    private final C7054oVa<C5500ZKa> a;

    public C7033oCa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C7033oCa a(C7054oVa<C5500ZKa> ova) {
        return new C7033oCa(ova);
    }

    public static C6556hCa a(C5500ZKa zKa) {
        C6556hCa a2 = C6828lCa.a(zKa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C6556hCa get() {
        return a((C5500ZKa) this.a.get());
    }
}
