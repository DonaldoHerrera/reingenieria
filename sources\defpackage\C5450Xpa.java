package defpackage;

/* renamed from: Xpa reason: default package and case insensitive filesystem */
/* compiled from: LoadPlaylistTrackUrnsCommand_Factory */
public final class C5450Xpa implements C4961HMa<C5421Wpa> {
    private final C7054oVa<C5500ZKa> a;

    public C5450Xpa(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C5450Xpa a(C7054oVa<C5500ZKa> ova) {
        return new C5450Xpa(ova);
    }

    public C5421Wpa get() {
        return new C5421Wpa((C5500ZKa) this.a.get());
    }
}
