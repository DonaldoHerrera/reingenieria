package defpackage;

/* renamed from: pCa reason: default package and case insensitive filesystem */
/* compiled from: PostsSyncModule_ProvideLoadLocalTrackPostsCommandFactory */
public final class C7102pCa implements C4961HMa<C6556hCa> {
    private final C7054oVa<C5500ZKa> a;

    public C7102pCa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C7102pCa a(C7054oVa<C5500ZKa> ova) {
        return new C7102pCa(ova);
    }

    public static C6556hCa a(C5500ZKa zKa) {
        C6556hCa b = C6828lCa.b(zKa);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C6556hCa get() {
        return a((C5500ZKa) this.a.get());
    }
}
