package defpackage;

/* renamed from: Rza reason: default package and case insensitive filesystem */
/* compiled from: StoreActivitiesCommand_Factory */
public final class C5285Rza implements C4961HMa<C5255Qza> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C3800jea> b;
    private final C7054oVa<C3768fea> c;
    private final C7054oVa<C6332dsa> d;
    private final C7054oVa<C3382yT> e;

    public C5285Rza(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2, C7054oVa<C3768fea> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<C3382yT> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C5285Rza a(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2, C7054oVa<C3768fea> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<C3382yT> ova5) {
        C5285Rza rza = new C5285Rza(ova, ova2, ova3, ova4, ova5);
        return rza;
    }

    public C5255Qza get() {
        C5255Qza qza = new C5255Qza((C5500ZKa) this.a.get(), (C3800jea) this.b.get(), (C3768fea) this.c.get(), (C6332dsa) this.d.get(), (C3382yT) this.e.get());
        return qza;
    }
}
