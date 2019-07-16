package defpackage;

/* renamed from: TO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideApiClientRxFactory */
public final class C2302TO implements C4961HMa<efa> {
    private final C7054oVa<dfa> a;

    public C2302TO(C7054oVa<dfa> ova) {
        this.a = ova;
    }

    public static C2302TO a(C7054oVa<dfa> ova) {
        return new C2302TO(ova);
    }

    public static efa a(dfa dfa) {
        efa a2 = C2264RO.a(dfa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public efa get() {
        return a((dfa) this.a.get());
    }
}
