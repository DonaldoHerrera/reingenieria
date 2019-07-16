package defpackage;

/* renamed from: Vpa reason: default package and case insensitive filesystem */
/* compiled from: LoadPlaylistPendingRemovalCommand_Factory */
public final class C5392Vpa implements C4961HMa<C5363Upa> {
    private final C7054oVa<C5500ZKa> a;

    public C5392Vpa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C5392Vpa a(C7054oVa<C5500ZKa> ova) {
        return new C5392Vpa(ova);
    }

    public C5363Upa get() {
        return new C5363Upa((C5500ZKa) this.a.get());
    }
}
