package defpackage;

/* renamed from: uL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsProviderFactory_Factory */
public final class C3294uL implements C4961HMa<C3274tL> {
    private final C7054oVa<C3214qL> a;
    private final C7054oVa<C2373XM> b;
    private final C7054oVa<C2205OM> c;
    private final C7054oVa<C3035hN> d;
    private final C7054oVa<C3256sN> e;
    private final C7054oVa<C3394zL> f;
    private final C7054oVa<C7319sKa> g;

    public C3294uL(C7054oVa<C3214qL> ova, C7054oVa<C2373XM> ova2, C7054oVa<C2205OM> ova3, C7054oVa<C3035hN> ova4, C7054oVa<C3256sN> ova5, C7054oVa<C3394zL> ova6, C7054oVa<C7319sKa> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static C3294uL a(C7054oVa<C3214qL> ova, C7054oVa<C2373XM> ova2, C7054oVa<C2205OM> ova3, C7054oVa<C3035hN> ova4, C7054oVa<C3256sN> ova5, C7054oVa<C3394zL> ova6, C7054oVa<C7319sKa> ova7) {
        C3294uL uLVar = new C3294uL(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return uLVar;
    }

    public C3274tL get() {
        C3274tL tLVar = new C3274tL((C3214qL) this.a.get(), this.b, C4930GMa.a(this.c), C4930GMa.a(this.d), C4930GMa.a(this.e), C4930GMa.a(this.f), (C7319sKa) this.g.get());
        return tLVar;
    }
}
