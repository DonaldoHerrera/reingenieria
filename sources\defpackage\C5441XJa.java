package defpackage;

/* renamed from: XJa reason: default package and case insensitive filesystem */
/* compiled from: WaveformFetchCommand_Factory */
public final class C5441XJa implements C4961HMa<C5412WJa> {
    private final C7054oVa<C5470YJa> a;
    private final C7054oVa<C6634iKa> b;

    public C5441XJa(C7054oVa<C5470YJa> ova, C7054oVa<C6634iKa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5441XJa a(C7054oVa<C5470YJa> ova, C7054oVa<C6634iKa> ova2) {
        return new C5441XJa(ova, ova2);
    }

    public C5412WJa get() {
        return new C5412WJa((C5470YJa) this.a.get(), (C6634iKa) this.b.get());
    }
}
