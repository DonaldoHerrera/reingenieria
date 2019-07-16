package defpackage;

/* renamed from: eL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsEngine_Factory */
public final class C2976eL implements C4961HMa<C2353WK> {
    private final C7054oVa<a> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C3469VY> c;

    public C2976eL(C7054oVa<a> ova, C7054oVa<HPa> ova2, C7054oVa<C3469VY> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2976eL a(C7054oVa<a> ova, C7054oVa<HPa> ova2, C7054oVa<C3469VY> ova3) {
        return new C2976eL(ova, ova2, ova3);
    }

    public C2353WK get() {
        return new C2353WK((a) this.a.get(), (HPa) this.b.get(), (C3469VY) this.c.get());
    }
}
