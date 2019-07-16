package defpackage;

/* renamed from: nT reason: default package and case insensitive filesystem */
/* compiled from: StoreTracksCommand_Factory */
public final class C1533nT implements C4961HMa<C1502mT> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C3800jea> b;

    public C1533nT(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C1533nT a(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2) {
        return new C1533nT(ova, ova2);
    }

    public C1502mT get() {
        return new C1502mT((C5500ZKa) this.a.get(), (C3800jea) this.b.get());
    }
}
