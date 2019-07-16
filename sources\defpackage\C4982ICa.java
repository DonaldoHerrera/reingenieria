package defpackage;

/* renamed from: ICa reason: default package and case insensitive filesystem */
/* compiled from: ReplaceSoundStreamCommand_Factory */
public final class C4982ICa implements C4961HMa<C4951HCa> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C5138NCa> b;

    public C4982ICa(C7054oVa<C5500ZKa> ova, C7054oVa<C5138NCa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4982ICa a(C7054oVa<C5500ZKa> ova, C7054oVa<C5138NCa> ova2) {
        return new C4982ICa(ova, ova2);
    }

    public C4951HCa get() {
        return new C4951HCa((C5500ZKa) this.a.get(), (C5138NCa) this.b.get());
    }
}
