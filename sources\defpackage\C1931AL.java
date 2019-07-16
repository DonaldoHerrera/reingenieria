package defpackage;

/* renamed from: AL reason: default package and case insensitive filesystem */
/* compiled from: BaseAnalyticsProviderHolder_Factory */
public final class C1931AL implements C4961HMa<C3394zL> {
    private final C7054oVa<C2013EN> a;
    private final C7054oVa<C2112JO> b;
    private final C7054oVa<C2260RK> c;

    public C1931AL(C7054oVa<C2013EN> ova, C7054oVa<C2112JO> ova2, C7054oVa<C2260RK> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C1931AL a(C7054oVa<C2013EN> ova, C7054oVa<C2112JO> ova2, C7054oVa<C2260RK> ova3) {
        return new C1931AL(ova, ova2, ova3);
    }

    public C3394zL get() {
        return new C3394zL((C2013EN) this.a.get(), (C2112JO) this.b.get(), (C2260RK) this.c.get());
    }
}
