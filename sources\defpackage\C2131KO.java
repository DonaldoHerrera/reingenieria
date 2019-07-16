package defpackage;

/* renamed from: KO reason: default package and case insensitive filesystem */
/* compiled from: PromotedAnalyticsProvider_Factory */
public final class C2131KO implements C4961HMa<C2112JO> {
    private final C7054oVa<C2428_L> a;

    public C2131KO(C7054oVa<C2428_L> ova) {
        this.a = ova;
    }

    public static C2131KO a(C7054oVa<C2428_L> ova) {
        return new C2131KO(ova);
    }

    public C2112JO get() {
        return new C2112JO((C2428_L) this.a.get());
    }
}
