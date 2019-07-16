package defpackage;

/* renamed from: CR reason: default package and case insensitive filesystem */
/* compiled from: MyFollowingsSyncProvider_Factory */
public final class C1977CR implements C4961HMa<C1957BR> {
    private final C7054oVa<C5518Zza> a;
    private final C7054oVa<Cba> b;

    public C1977CR(C7054oVa<C5518Zza> ova, C7054oVa<Cba> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C1977CR a(C7054oVa<C5518Zza> ova, C7054oVa<Cba> ova2) {
        return new C1977CR(ova, ova2);
    }

    public C1957BR get() {
        return new C1957BR(this.a, (Cba) this.b.get());
    }
}
