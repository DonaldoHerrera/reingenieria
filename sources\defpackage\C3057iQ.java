package defpackage;

/* renamed from: iQ reason: default package and case insensitive filesystem */
/* compiled from: DownloadRequestHelper_Factory */
public final class C3057iQ implements C4961HMa<C3038hQ> {
    private final C7054oVa<C6699jHa> a;
    private final C7054oVa<C2322UP> b;

    public C3057iQ(C7054oVa<C6699jHa> ova, C7054oVa<C2322UP> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3057iQ a(C7054oVa<C6699jHa> ova, C7054oVa<C2322UP> ova2) {
        return new C3057iQ(ova, ova2);
    }

    public C3038hQ get() {
        return new C3038hQ((C6699jHa) this.a.get(), (C2322UP) this.b.get());
    }
}
