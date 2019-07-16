package defpackage;

/* renamed from: uV reason: default package and case insensitive filesystem */
/* compiled from: CryptoOperations_Factory */
public final class C3304uV implements C4961HMa<C3284tV> {
    private final C7054oVa<C2001DV> a;
    private final C7054oVa<C1961BV> b;
    private final C7054oVa<C3404zV> c;
    private final C7054oVa<HPa> d;
    private final C7054oVa<C3469VY> e;

    public C3304uV(C7054oVa<C2001DV> ova, C7054oVa<C1961BV> ova2, C7054oVa<C3404zV> ova3, C7054oVa<HPa> ova4, C7054oVa<C3469VY> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C3304uV a(C7054oVa<C2001DV> ova, C7054oVa<C1961BV> ova2, C7054oVa<C3404zV> ova3, C7054oVa<HPa> ova4, C7054oVa<C3469VY> ova5) {
        C3304uV uVVar = new C3304uV(ova, ova2, ova3, ova4, ova5);
        return uVVar;
    }

    public static C3284tV a(Object obj, C1961BV bv, C3404zV zVVar, HPa hPa, C3469VY vy) {
        C3284tV tVVar = new C3284tV((C2001DV) obj, bv, zVVar, hPa, vy);
        return tVVar;
    }

    public C3284tV get() {
        C3284tV tVVar = new C3284tV((C2001DV) this.a.get(), (C1961BV) this.b.get(), (C3404zV) this.c.get(), (HPa) this.d.get(), (C3469VY) this.e.get());
        return tVVar;
    }
}
