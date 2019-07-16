package defpackage;

/* renamed from: DL reason: default package and case insensitive filesystem */
/* compiled from: BatchTrackingApiFactory_Factory */
public final class C1991DL implements C4961HMa<C1971CL> {
    private final C7054oVa<C7440tyb> a;
    private final C7054oVa<b> b;
    private final C7054oVa<a> c;
    private final C7054oVa<C3469VY> d;

    public C1991DL(C7054oVa<C7440tyb> ova, C7054oVa<b> ova2, C7054oVa<a> ova3, C7054oVa<C3469VY> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C1991DL a(C7054oVa<C7440tyb> ova, C7054oVa<b> ova2, C7054oVa<a> ova3, C7054oVa<C3469VY> ova4) {
        return new C1991DL(ova, ova2, ova3, ova4);
    }

    public C1971CL get() {
        return new C1971CL(C4930GMa.a(this.a), (b) this.b.get(), (a) this.c.get(), (C3469VY) this.d.get());
    }
}
