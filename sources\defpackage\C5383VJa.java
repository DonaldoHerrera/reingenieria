package defpackage;

/* renamed from: VJa reason: default package and case insensitive filesystem */
/* compiled from: WaveformCacheSerializer_Factory */
public final class C5383VJa implements C4961HMa<C5354UJa> {
    private final C7054oVa<Nea> a;
    private final C7054oVa<C3469VY> b;

    public C5383VJa(C7054oVa<Nea> ova, C7054oVa<C3469VY> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5383VJa a(C7054oVa<Nea> ova, C7054oVa<C3469VY> ova2) {
        return new C5383VJa(ova, ova2);
    }

    public C5354UJa get() {
        return new C5354UJa(C4930GMa.a(this.a), (C3469VY) this.b.get());
    }
}
