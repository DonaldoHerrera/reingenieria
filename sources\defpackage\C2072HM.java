package defpackage;

/* renamed from: HM reason: default package and case insensitive filesystem */
/* compiled from: TrackingHandlerFactory_Factory */
public final class C2072HM implements C4961HMa<C2052GM> {
    private final C7054oVa<C6834lGa> a;
    private final C7054oVa<C2129KM> b;
    private final C7054oVa<C1952BM> c;
    private final C7054oVa<C3469VY> d;

    public C2072HM(C7054oVa<C6834lGa> ova, C7054oVa<C2129KM> ova2, C7054oVa<C1952BM> ova3, C7054oVa<C3469VY> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C2072HM a(C7054oVa<C6834lGa> ova, C7054oVa<C2129KM> ova2, C7054oVa<C1952BM> ova3, C7054oVa<C3469VY> ova4) {
        return new C2072HM(ova, ova2, ova3, ova4);
    }

    public C2052GM get() {
        return new C2052GM((C6834lGa) this.a.get(), (C2129KM) this.b.get(), (C1952BM) this.c.get(), (C3469VY) this.d.get());
    }
}
