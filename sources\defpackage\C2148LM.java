package defpackage;

/* renamed from: LM reason: default package and case insensitive filesystem */
/* compiled from: TrackingStorage_Factory */
public final class C2148LM implements C4961HMa<C2129KM> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C6834lGa> b;

    public C2148LM(C7054oVa<C5500ZKa> ova, C7054oVa<C6834lGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2148LM a(C7054oVa<C5500ZKa> ova, C7054oVa<C6834lGa> ova2) {
        return new C2148LM(ova, ova2);
    }

    public C2129KM get() {
        return new C2129KM((C5500ZKa) this.a.get(), (C6834lGa) this.b.get());
    }
}
