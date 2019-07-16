package defpackage;

/* renamed from: Rpa reason: default package and case insensitive filesystem */
/* compiled from: EditPlaylistCommand_Factory */
public final class C5275Rpa implements C4961HMa<C5245Qpa> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C5694cGa> b;

    public C5275Rpa(C7054oVa<C5500ZKa> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5275Rpa a(C7054oVa<C5500ZKa> ova, C7054oVa<C5694cGa> ova2) {
        return new C5275Rpa(ova, ova2);
    }

    public static C5245Qpa a(C5500ZKa zKa, C5694cGa cga) {
        return new C5245Qpa(zKa, cga);
    }

    public C5245Qpa get() {
        return new C5245Qpa((C5500ZKa) this.a.get(), (C5694cGa) this.b.get());
    }
}
