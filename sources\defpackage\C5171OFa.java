package defpackage;

/* renamed from: OFa reason: default package and case insensitive filesystem */
/* compiled from: UserItemRepository_Factory */
public final class C5171OFa implements C4961HMa<C5141NFa> {
    private final C7054oVa<C3792iea> a;
    private final C7054oVa<C3360xR> b;
    private final C7054oVa<C5425Wta> c;

    public C5171OFa(C7054oVa<C3792iea> ova, C7054oVa<C3360xR> ova2, C7054oVa<C5425Wta> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5171OFa a(C7054oVa<C3792iea> ova, C7054oVa<C3360xR> ova2, C7054oVa<C5425Wta> ova3) {
        return new C5171OFa(ova, ova2, ova3);
    }

    public C5141NFa get() {
        return new C5141NFa((C3792iea) this.a.get(), (C3360xR) this.b.get(), (C5425Wta) this.c.get());
    }
}
