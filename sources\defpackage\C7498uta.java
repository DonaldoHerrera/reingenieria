package defpackage;

/* renamed from: uta reason: default package and case insensitive filesystem */
/* compiled from: StorePoliciesCommand_Factory */
public final class C7498uta implements C4961HMa<C7429tta> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C5694cGa> b;

    public C7498uta(C7054oVa<C5500ZKa> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C7498uta a(C7054oVa<C5500ZKa> ova, C7054oVa<C5694cGa> ova2) {
        return new C7498uta(ova, ova2);
    }

    public static C7429tta a(C5500ZKa zKa, C5694cGa cga) {
        return new C7429tta(zKa, cga);
    }

    public C7429tta get() {
        return new C7429tta((C5500ZKa) this.a.get(), (C5694cGa) this.b.get());
    }
}
