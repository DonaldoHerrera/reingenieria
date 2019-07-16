package defpackage;

/* renamed from: jW reason: default package and case insensitive filesystem */
/* compiled from: UserNetworkFetcher_Factory */
public final class C1410jW implements C4961HMa<C1349hW> {
    private final C7054oVa<efa> a;
    private final C7054oVa<C4643qga> b;
    private final C7054oVa<HPa> c;

    public C1410jW(C7054oVa<efa> ova, C7054oVa<C4643qga> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C1410jW a(C7054oVa<efa> ova, C7054oVa<C4643qga> ova2, C7054oVa<HPa> ova3) {
        return new C1410jW(ova, ova2, ova3);
    }

    public C1349hW get() {
        return new C1349hW((efa) this.a.get(), (C4643qga) this.b.get(), (HPa) this.c.get());
    }
}
