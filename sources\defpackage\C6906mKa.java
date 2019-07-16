package defpackage;

/* renamed from: mKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformStorage_Factory */
public final class C6906mKa implements C4961HMa<C6838lKa> {
    private final C7054oVa<C7321sMa<C5325TJa>> a;
    private final C7054oVa<C3469VY> b;

    public C6906mKa(C7054oVa<C7321sMa<C5325TJa>> ova, C7054oVa<C3469VY> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6906mKa a(C7054oVa<C7321sMa<C5325TJa>> ova, C7054oVa<C3469VY> ova2) {
        return new C6906mKa(ova, ova2);
    }

    public C6838lKa get() {
        return new C6838lKa((C7321sMa) this.a.get(), (C3469VY) this.b.get());
    }
}
