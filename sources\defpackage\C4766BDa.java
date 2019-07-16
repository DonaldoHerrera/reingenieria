package defpackage;

/* renamed from: BDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsRepository_Factory */
public final class C4766BDa implements C4961HMa<C4735ADa> {
    private final C7054oVa<C4797CDa> a;
    private final C7054oVa<C6830lDa> b;
    private final C7054oVa<C3760eea> c;
    private final C7054oVa<HPa> d;

    public C4766BDa(C7054oVa<C4797CDa> ova, C7054oVa<C6830lDa> ova2, C7054oVa<C3760eea> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C4766BDa a(C7054oVa<C4797CDa> ova, C7054oVa<C6830lDa> ova2, C7054oVa<C3760eea> ova3, C7054oVa<HPa> ova4) {
        return new C4766BDa(ova, ova2, ova3, ova4);
    }

    public C4735ADa get() {
        return new C4735ADa((C4797CDa) this.a.get(), (C6830lDa) this.b.get(), (C3760eea) this.c.get(), (HPa) this.d.get());
    }
}
