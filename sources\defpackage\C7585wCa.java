package defpackage;

/* renamed from: wCa reason: default package and case insensitive filesystem */
/* compiled from: StorePostsCommand_Factory */
public final class C7585wCa implements C4961HMa<C7516vCa> {
    private final C7054oVa<C5500ZKa> a;

    public C7585wCa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C7585wCa a(C7054oVa<C5500ZKa> ova) {
        return new C7585wCa(ova);
    }

    public C7516vCa get() {
        return new C7516vCa((C5500ZKa) this.a.get());
    }
}
