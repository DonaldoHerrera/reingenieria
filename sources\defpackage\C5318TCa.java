package defpackage;

/* renamed from: TCa reason: default package and case insensitive filesystem */
/* compiled from: StoreSoundStreamCommand_Factory */
public final class C5318TCa implements C4961HMa<C5288SCa> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C5045KCa> b;

    public C5318TCa(C7054oVa<C5500ZKa> ova, C7054oVa<C5045KCa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5318TCa a(C7054oVa<C5500ZKa> ova, C7054oVa<C5045KCa> ova2) {
        return new C5318TCa(ova, ova2);
    }

    public C5288SCa get() {
        return new C5288SCa((C5500ZKa) this.a.get(), (C5045KCa) this.b.get());
    }
}
