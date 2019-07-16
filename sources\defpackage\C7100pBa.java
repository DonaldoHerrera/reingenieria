package defpackage;

/* renamed from: pBa reason: default package and case insensitive filesystem */
/* compiled from: LoadLocalPlaylistsCommand_Factory */
public final class C7100pBa implements C4961HMa<C7031oBa> {
    private final C7054oVa<C5500ZKa> a;

    public C7100pBa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C7100pBa a(C7054oVa<C5500ZKa> ova) {
        return new C7100pBa(ova);
    }

    public static C7031oBa a(C5500ZKa zKa) {
        return new C7031oBa(zKa);
    }

    public C7031oBa get() {
        return new C7031oBa((C5500ZKa) this.a.get());
    }
}
