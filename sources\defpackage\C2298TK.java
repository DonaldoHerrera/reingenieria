package defpackage;

/* renamed from: TK reason: default package and case insensitive filesystem */
/* compiled from: AdErrorsAnalyticsProvider_Factory */
public final class C2298TK implements C4961HMa<C2260RK> {
    private final C7054oVa<C2428_L> a;
    private final C7054oVa<C3356xN> b;

    public C2298TK(C7054oVa<C2428_L> ova, C7054oVa<C3356xN> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2298TK a(C7054oVa<C2428_L> ova, C7054oVa<C3356xN> ova2) {
        return new C2298TK(ova, ova2);
    }

    public C2260RK get() {
        return new C2260RK((C2428_L) this.a.get(), (C3356xN) this.b.get());
    }
}
