package defpackage;

/* renamed from: FN reason: default package and case insensitive filesystem */
/* compiled from: EventLoggerAnalyticsProvider_Factory */
public final class C2033FN implements C4961HMa<C2013EN> {
    private final C7054oVa<C2428_L> a;
    private final C7054oVa<C2130KN> b;
    private final C7054oVa<C1953BN> c;
    private final C7054oVa<C7648wza<Boolean>> d;
    private final C7054oVa<C7648wza<Boolean>> e;
    private final C7054oVa<C7648wza<Boolean>> f;

    public C2033FN(C7054oVa<C2428_L> ova, C7054oVa<C2130KN> ova2, C7054oVa<C1953BN> ova3, C7054oVa<C7648wza<Boolean>> ova4, C7054oVa<C7648wza<Boolean>> ova5, C7054oVa<C7648wza<Boolean>> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static C2033FN a(C7054oVa<C2428_L> ova, C7054oVa<C2130KN> ova2, C7054oVa<C1953BN> ova3, C7054oVa<C7648wza<Boolean>> ova4, C7054oVa<C7648wza<Boolean>> ova5, C7054oVa<C7648wza<Boolean>> ova6) {
        C2033FN fn = new C2033FN(ova, ova2, ova3, ova4, ova5, ova6);
        return fn;
    }

    public C2013EN get() {
        C2013EN en = new C2013EN((C2428_L) this.a.get(), C4930GMa.a(this.b), (C1953BN) this.c.get(), (C7648wza) this.d.get(), (C7648wza) this.e.get(), (C7648wza) this.f.get());
        return en;
    }
}
