package defpackage;

/* renamed from: uCa reason: default package and case insensitive filesystem */
/* compiled from: RemovePostsCommand_Factory */
public final class C7447uCa implements C4961HMa<C7378tCa> {
    private final C7054oVa<C5500ZKa> a;

    public C7447uCa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C7447uCa a(C7054oVa<C5500ZKa> ova) {
        return new C7447uCa(ova);
    }

    public C7378tCa get() {
        return new C7378tCa((C5500ZKa) this.a.get());
    }
}
