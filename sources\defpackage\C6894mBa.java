package defpackage;

/* renamed from: mBa reason: default package and case insensitive filesystem */
/* compiled from: DirtyPlaylistsCleanupHelper_Factory */
public final class C6894mBa implements C4961HMa<C6826lBa> {
    private final C7054oVa<C5363Upa> a;
    private final C7054oVa<C7031oBa> b;

    public C6894mBa(C7054oVa<C5363Upa> ova, C7054oVa<C7031oBa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6894mBa a(C7054oVa<C5363Upa> ova, C7054oVa<C7031oBa> ova2) {
        return new C6894mBa(ova, ova2);
    }

    public C6826lBa get() {
        return new C6826lBa((C5363Upa) this.a.get(), (C7031oBa) this.b.get());
    }
}
