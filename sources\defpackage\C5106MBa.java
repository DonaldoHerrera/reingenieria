package defpackage;

/* renamed from: MBa reason: default package and case insensitive filesystem */
/* compiled from: ReplacePlaylistTracksCommand_Factory */
public final class C5106MBa implements C4961HMa<C5075LBa> {
    private final C7054oVa<C5500ZKa> a;

    public C5106MBa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C5106MBa a(C7054oVa<C5500ZKa> ova) {
        return new C5106MBa(ova);
    }

    public C5075LBa get() {
        return new C5075LBa((C5500ZKa) this.a.get());
    }
}
