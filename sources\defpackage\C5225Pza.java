package defpackage;

/* renamed from: Pza reason: default package and case insensitive filesystem */
/* compiled from: ReplaceActivitiesCommand_Factory */
public final class C5225Pza implements C4961HMa<C5195Oza> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C3800jea> b;
    private final C7054oVa<C3768fea> c;
    private final C7054oVa<C6332dsa> d;
    private final C7054oVa<C3382yT> e;

    public C5225Pza(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2, C7054oVa<C3768fea> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<C3382yT> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C5225Pza a(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2, C7054oVa<C3768fea> ova3, C7054oVa<C6332dsa> ova4, C7054oVa<C3382yT> ova5) {
        C5225Pza pza = new C5225Pza(ova, ova2, ova3, ova4, ova5);
        return pza;
    }

    public C5195Oza get() {
        C5195Oza oza = new C5195Oza((C5500ZKa) this.a.get(), (C3800jea) this.b.get(), (C3768fea) this.c.get(), (C6332dsa) this.d.get(), (C3382yT) this.e.get());
        return oza;
    }
}
