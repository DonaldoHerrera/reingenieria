package defpackage;

/* renamed from: dBa reason: default package and case insensitive filesystem */
/* compiled from: MeSyncerProvider_Factory */
public final class C6282dBa implements C4961HMa<C5686cBa> {
    private final C7054oVa<C5618bBa> a;

    public C6282dBa(C7054oVa<C5618bBa> ova) {
        this.a = ova;
    }

    public static C6282dBa a(C7054oVa<C5618bBa> ova) {
        return new C6282dBa(ova);
    }

    public C5686cBa get() {
        return new C5686cBa(this.a);
    }
}
