package defpackage;

/* renamed from: XL reason: default package and case insensitive filesystem */
/* compiled from: DefaultTrackingApiFactory_Factory */
public final class C2372XL implements C4961HMa<C2354WL> {
    private final C7054oVa<C7440tyb> a;
    private final C7054oVa<C3395zM> b;
    private final C7054oVa<C3469VY> c;
    private final C7054oVa<C1971CL> d;
    private final C7054oVa<String> e;
    private final C7054oVa<Integer> f;
    private final C7054oVa<C7648wza<Boolean>> g;

    public C2372XL(C7054oVa<C7440tyb> ova, C7054oVa<C3395zM> ova2, C7054oVa<C3469VY> ova3, C7054oVa<C1971CL> ova4, C7054oVa<String> ova5, C7054oVa<Integer> ova6, C7054oVa<C7648wza<Boolean>> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static C2372XL a(C7054oVa<C7440tyb> ova, C7054oVa<C3395zM> ova2, C7054oVa<C3469VY> ova3, C7054oVa<C1971CL> ova4, C7054oVa<String> ova5, C7054oVa<Integer> ova6, C7054oVa<C7648wza<Boolean>> ova7) {
        C2372XL xl = new C2372XL(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return xl;
    }

    public C2354WL get() {
        C2354WL wl = new C2354WL(C4930GMa.a(this.a), (C3395zM) this.b.get(), (C3469VY) this.c.get(), (C1971CL) this.d.get(), (String) this.e.get(), ((Integer) this.f.get()).intValue(), (C7648wza) this.g.get());
        return wl;
    }
}
