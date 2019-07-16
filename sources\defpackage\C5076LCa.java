package defpackage;

/* renamed from: LCa reason: default package and case insensitive filesystem */
/* compiled from: SoundStreamInsertTransactionFactory_Factory */
public final class C5076LCa implements C4961HMa<C5045KCa> {
    private final C7054oVa<C3800jea> a;
    private final C7054oVa<C3768fea> b;
    private final C7054oVa<C6332dsa> c;

    public C5076LCa(C7054oVa<C3800jea> ova, C7054oVa<C3768fea> ova2, C7054oVa<C6332dsa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5076LCa a(C7054oVa<C3800jea> ova, C7054oVa<C3768fea> ova2, C7054oVa<C6332dsa> ova3) {
        return new C5076LCa(ova, ova2, ova3);
    }

    public C5045KCa get() {
        return new C5045KCa(this.a, this.b, this.c);
    }
}
