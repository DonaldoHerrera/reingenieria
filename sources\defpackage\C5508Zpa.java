package defpackage;

/* renamed from: Zpa reason: default package and case insensitive filesystem */
/* compiled from: LoadPlaylistTracksCommand_Factory */
public final class C5508Zpa implements C4961HMa<C5479Ypa> {
    private final C7054oVa<C5500ZKa> a;

    public C5508Zpa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C5508Zpa a(C7054oVa<C5500ZKa> ova) {
        return new C5508Zpa(ova);
    }

    public C5479Ypa get() {
        return new C5479Ypa((C5500ZKa) this.a.get());
    }
}
