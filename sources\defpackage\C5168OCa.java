package defpackage;

/* renamed from: OCa reason: default package and case insensitive filesystem */
/* compiled from: SoundStreamReplaceTransactionFactory_Factory */
public final class C5168OCa implements C4961HMa<C5138NCa> {
    private final C7054oVa<C3800jea> a;
    private final C7054oVa<C3768fea> b;
    private final C7054oVa<C6332dsa> c;

    public C5168OCa(C7054oVa<C3800jea> ova, C7054oVa<C3768fea> ova2, C7054oVa<C6332dsa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5168OCa a(C7054oVa<C3800jea> ova, C7054oVa<C3768fea> ova2, C7054oVa<C6332dsa> ova3) {
        return new C5168OCa(ova, ova2, ova3);
    }

    public C5138NCa get() {
        return new C5138NCa(this.a, this.b, this.c);
    }
}
