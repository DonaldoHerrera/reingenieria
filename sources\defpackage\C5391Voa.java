package defpackage;

/* renamed from: Voa reason: default package and case insensitive filesystem */
/* compiled from: AddTracksToPlaylistCommand_Factory */
public final class C5391Voa implements C4961HMa<C5362Uoa> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C5694cGa> b;
    private final C7054oVa<C5421Wpa> c;
    private final C7054oVa<C5305Spa> d;

    public C5391Voa(C7054oVa<C5500ZKa> ova, C7054oVa<C5694cGa> ova2, C7054oVa<C5421Wpa> ova3, C7054oVa<C5305Spa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C5391Voa a(C7054oVa<C5500ZKa> ova, C7054oVa<C5694cGa> ova2, C7054oVa<C5421Wpa> ova3, C7054oVa<C5305Spa> ova4) {
        return new C5391Voa(ova, ova2, ova3, ova4);
    }

    public C5362Uoa get() {
        return new C5362Uoa((C5500ZKa) this.a.get(), (C5694cGa) this.b.get(), (C5421Wpa) this.c.get(), (C5305Spa) this.d.get());
    }
}
