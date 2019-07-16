package defpackage;

/* renamed from: iU reason: default package and case insensitive filesystem */
/* compiled from: ForceUpdateHandler_Factory */
public final class C3060iU implements C4961HMa<C3041hU> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C5467YGa> b;
    private final C7054oVa<C6699jHa> c;
    private final C7054oVa<C2343VT> d;

    public C3060iU(C7054oVa<C5327TLa> ova, C7054oVa<C5467YGa> ova2, C7054oVa<C6699jHa> ova3, C7054oVa<C2343VT> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3060iU a(C7054oVa<C5327TLa> ova, C7054oVa<C5467YGa> ova2, C7054oVa<C6699jHa> ova3, C7054oVa<C2343VT> ova4) {
        return new C3060iU(ova, ova2, ova3, ova4);
    }

    public C3041hU get() {
        return new C3041hU((C5327TLa) this.a.get(), (C5467YGa) this.b.get(), (C6699jHa) this.c.get(), (C2343VT) this.d.get());
    }
}
