package defpackage;

/* renamed from: hHa reason: default package and case insensitive filesystem */
/* compiled from: DefaultErrorReporter_Factory */
public final class C6563hHa implements C4961HMa<C6495gHa> {
    private final C7054oVa<C7385tHa> a;
    private final C7054oVa<C6336dua> b;

    public C6563hHa(C7054oVa<C7385tHa> ova, C7054oVa<C6336dua> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6563hHa a(C7054oVa<C7385tHa> ova, C7054oVa<C6336dua> ova2) {
        return new C6563hHa(ova, ova2);
    }

    public C6495gHa get() {
        return new C6495gHa((C7385tHa) this.a.get(), (C6336dua) this.b.get());
    }
}
