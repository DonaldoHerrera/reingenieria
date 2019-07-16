package defpackage;

/* renamed from: nCa reason: default package and case insensitive filesystem */
/* compiled from: PostsSyncModule_ProvideFetchTrackPostsCommandFactory */
public final class C6964nCa implements C4961HMa<C6352eCa> {
    private final C7054oVa<dfa> a;

    public C6964nCa(C7054oVa<dfa> ova) {
        this.a = ova;
    }

    public static C6964nCa a(C7054oVa<dfa> ova) {
        return new C6964nCa(ova);
    }

    public static C6352eCa a(dfa dfa) {
        C6352eCa b = C6828lCa.b(dfa);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C6352eCa get() {
        return a((dfa) this.a.get());
    }
}
