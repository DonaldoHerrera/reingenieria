package defpackage;

/* renamed from: rJ reason: default package and case insensitive filesystem */
/* compiled from: OMStorage_Factory */
public final class C3232rJ implements C4961HMa<C3193pJ> {
    private final C7054oVa<C6494gGa> a;

    public C3232rJ(C7054oVa<C6494gGa> ova) {
        this.a = ova;
    }

    public static C3232rJ a(C7054oVa<C6494gGa> ova) {
        return new C3232rJ(ova);
    }

    public C3193pJ get() {
        return new C3193pJ((C6494gGa) this.a.get());
    }
}
