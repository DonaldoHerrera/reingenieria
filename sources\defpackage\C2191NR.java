package defpackage;

/* renamed from: NR reason: default package and case insensitive filesystem */
/* compiled from: RepostStorage_Factory */
public final class C2191NR implements C4961HMa<C2172MR> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C4898FLa> b;
    private final C7054oVa<C5694cGa> c;

    public C2191NR(C7054oVa<C5500ZKa> ova, C7054oVa<C4898FLa> ova2, C7054oVa<C5694cGa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2191NR a(C7054oVa<C5500ZKa> ova, C7054oVa<C4898FLa> ova2, C7054oVa<C5694cGa> ova3) {
        return new C2191NR(ova, ova2, ova3);
    }

    public static C2172MR a(C5500ZKa zKa, C4898FLa fLa, C5694cGa cga) {
        return new C2172MR(zKa, fLa, cga);
    }

    public C2172MR get() {
        return new C2172MR((C5500ZKa) this.a.get(), (C4898FLa) this.b.get(), (C5694cGa) this.c.get());
    }
}
