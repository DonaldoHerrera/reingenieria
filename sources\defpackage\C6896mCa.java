package defpackage;

/* renamed from: mCa reason: default package and case insensitive filesystem */
/* compiled from: PostsSyncModule_ProvideFetchPlaylistPostsCommandFactory */
public final class C6896mCa implements C4961HMa<C6352eCa> {
    private final C7054oVa<dfa> a;

    public C6896mCa(C7054oVa<dfa> ova) {
        this.a = ova;
    }

    public static C6896mCa a(C7054oVa<dfa> ova) {
        return new C6896mCa(ova);
    }

    public static C6352eCa a(dfa dfa) {
        C6352eCa a2 = C6828lCa.a(dfa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C6352eCa get() {
        return a((dfa) this.a.get());
    }
}
