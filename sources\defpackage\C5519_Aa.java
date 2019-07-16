package defpackage;

/* renamed from: _Aa reason: default package and case insensitive filesystem */
/* compiled from: EntitySyncRequestFactory_Factory */
public final class C5519_Aa implements C4961HMa<C5490ZAa> {
    private final C7054oVa<C5256RAa> a;
    private final C7054oVa<C5256RAa> b;
    private final C7054oVa<C5256RAa> c;

    public C5519_Aa(C7054oVa<C5256RAa> ova, C7054oVa<C5256RAa> ova2, C7054oVa<C5256RAa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5519_Aa a(C7054oVa<C5256RAa> ova, C7054oVa<C5256RAa> ova2, C7054oVa<C5256RAa> ova3) {
        return new C5519_Aa(ova, ova2, ova3);
    }

    public C5490ZAa get() {
        return new C5490ZAa(this.a, this.b, this.c);
    }
}
