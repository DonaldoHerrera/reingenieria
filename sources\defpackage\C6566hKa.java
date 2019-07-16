package defpackage;

/* renamed from: hKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformOperations_Factory */
public final class C6566hKa implements C4961HMa<C5630bKa> {
    private final C7054oVa<C5412WJa> a;
    private final C7054oVa<C6838lKa> b;
    private final C7054oVa<C6634iKa> c;
    private final C7054oVa<C6494gGa> d;
    private final C7054oVa<C3469VY> e;
    private final C7054oVa<HPa> f;

    public C6566hKa(C7054oVa<C5412WJa> ova, C7054oVa<C6838lKa> ova2, C7054oVa<C6634iKa> ova3, C7054oVa<C6494gGa> ova4, C7054oVa<C3469VY> ova5, C7054oVa<HPa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static C6566hKa a(C7054oVa<C5412WJa> ova, C7054oVa<C6838lKa> ova2, C7054oVa<C6634iKa> ova3, C7054oVa<C6494gGa> ova4, C7054oVa<C3469VY> ova5, C7054oVa<HPa> ova6) {
        C6566hKa hka = new C6566hKa(ova, ova2, ova3, ova4, ova5, ova6);
        return hka;
    }

    public C5630bKa get() {
        C5630bKa bka = new C5630bKa((C5412WJa) this.a.get(), (C6838lKa) this.b.get(), (C6634iKa) this.c.get(), (C6494gGa) this.d.get(), (C3469VY) this.e.get(), (HPa) this.f.get());
        return bka;
    }
}
