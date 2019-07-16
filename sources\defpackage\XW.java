package defpackage;

/* renamed from: XW reason: default package */
/* compiled from: VaultUserRepository_Factory */
public final class XW implements C4961HMa<WW> {
    private final C7054oVa<KW> a;
    private final C7054oVa<C1472lW> b;

    public XW(C7054oVa<KW> ova, C7054oVa<C1472lW> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static XW a(C7054oVa<KW> ova, C7054oVa<C1472lW> ova2) {
        return new XW(ova, ova2);
    }

    public WW get() {
        return new WW((KW) this.a.get(), (C1472lW) this.b.get());
    }
}
