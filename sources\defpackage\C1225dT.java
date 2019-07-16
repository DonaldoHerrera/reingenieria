package defpackage;

/* renamed from: dT reason: default package and case insensitive filesystem */
/* compiled from: ClearTableCommand_Factory */
public final class C1225dT implements C4961HMa<C0514cT> {
    private final C7054oVa<C5500ZKa> a;

    public C1225dT(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C1225dT a(C7054oVa<C5500ZKa> ova) {
        return new C1225dT(ova);
    }

    public static C0514cT a(C5500ZKa zKa) {
        return new C0514cT(zKa);
    }

    public C0514cT get() {
        return new C0514cT((C5500ZKa) this.a.get());
    }
}
