package defpackage;

/* renamed from: yta reason: default package and case insensitive filesystem */
/* compiled from: UpdatePoliciesCommand_Factory */
public final class C7774yta implements C4961HMa<C7636wta> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<C7429tta> b;
    private final C7054oVa<C5014JDa> c;
    private final C7054oVa<a> d;

    public C7774yta(C7054oVa<dfa> ova, C7054oVa<C7429tta> ova2, C7054oVa<C5014JDa> ova3, C7054oVa<a> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C7774yta a(C7054oVa<dfa> ova, C7054oVa<C7429tta> ova2, C7054oVa<C5014JDa> ova3, C7054oVa<a> ova4) {
        return new C7774yta(ova, ova2, ova3, ova4);
    }

    public static C7636wta a(dfa dfa, Object obj, C5014JDa jDa, a aVar) {
        return new C7636wta(dfa, (C7429tta) obj, jDa, aVar);
    }

    public C7636wta get() {
        return new C7636wta((dfa) this.a.get(), (C7429tta) this.b.get(), (C5014JDa) this.c.get(), (a) this.d.get());
    }
}
