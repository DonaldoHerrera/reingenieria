package defpackage;

/* renamed from: kT reason: default package and case insensitive filesystem */
/* compiled from: StorePlaylistsCommand_Factory */
public final class C1440kT implements C4961HMa<C1409jT> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C3800jea> b;

    public C1440kT(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C1440kT a(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2) {
        return new C1440kT(ova, ova2);
    }

    public C1409jT get() {
        return new C1409jT((C5500ZKa) this.a.get(), (C3800jea) this.b.get());
    }
}
