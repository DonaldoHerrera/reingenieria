package defpackage;

/* renamed from: bN reason: default package and case insensitive filesystem */
/* compiled from: AppboyEventHandler_Factory */
public final class C2467bN implements C4961HMa<C2448aN> {
    private final C7054oVa<C1956BQ> a;
    private final C7054oVa<C2486cN> b;

    public C2467bN(C7054oVa<C1956BQ> ova, C7054oVa<C2486cN> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2467bN a(C7054oVa<C1956BQ> ova, C7054oVa<C2486cN> ova2) {
        return new C2467bN(ova, ova2);
    }

    public C2448aN get() {
        return new C2448aN((C1956BQ) this.a.get(), (C2486cN) this.b.get());
    }
}
