package defpackage;

/* renamed from: PM reason: default package and case insensitive filesystem */
/* compiled from: AdjustAnalyticsProvider_Factory */
public final class C2224PM implements C4961HMa<C2205OM> {
    private final C7054oVa<C2243QM> a;

    public C2224PM(C7054oVa<C2243QM> ova) {
        this.a = ova;
    }

    public static C2224PM a(C7054oVa<C2243QM> ova) {
        return new C2224PM(ova);
    }

    public C2205OM get() {
        return new C2205OM((C2243QM) this.a.get());
    }
}
