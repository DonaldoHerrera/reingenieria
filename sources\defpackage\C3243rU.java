package defpackage;

/* renamed from: rU reason: default package and case insensitive filesystem */
/* compiled from: PlanChangeDetector_Factory */
public final class C3243rU implements C4961HMa<C3223qU> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C2436_U> b;
    private final C7054oVa<C3184oU> c;

    public C3243rU(C7054oVa<C5327TLa> ova, C7054oVa<C2436_U> ova2, C7054oVa<C3184oU> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C3243rU a(C7054oVa<C5327TLa> ova, C7054oVa<C2436_U> ova2, C7054oVa<C3184oU> ova3) {
        return new C3243rU(ova, ova2, ova3);
    }

    public static C3223qU a(C5327TLa tLa, C2436_U _u, C3184oU oUVar) {
        return new C3223qU(tLa, _u, oUVar);
    }

    public C3223qU get() {
        return new C3223qU((C5327TLa) this.a.get(), (C2436_U) this.b.get(), (C3184oU) this.c.get());
    }
}
