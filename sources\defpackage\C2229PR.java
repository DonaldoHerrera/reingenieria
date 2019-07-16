package defpackage;

/* renamed from: PR reason: default package and case insensitive filesystem */
/* compiled from: RepostsStateProvider_Factory */
public final class C2229PR implements C4961HMa<C2210OR> {
    private final C7054oVa<C2172MR> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<HPa> c;

    public C2229PR(C7054oVa<C2172MR> ova, C7054oVa<C5327TLa> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2229PR a(C7054oVa<C2172MR> ova, C7054oVa<C5327TLa> ova2, C7054oVa<HPa> ova3) {
        return new C2229PR(ova, ova2, ova3);
    }

    public C2210OR get() {
        return new C2210OR((C2172MR) this.a.get(), (C5327TLa) this.b.get(), (HPa) this.c.get());
    }
}
