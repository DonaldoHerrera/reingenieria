package defpackage;

/* renamed from: IW reason: default package */
/* compiled from: UserStorageWriter_Factory */
public final class IW implements C4961HMa<HW> {
    private final C7054oVa<C1472lW> a;
    private final C7054oVa<WV> b;
    private final C7054oVa<C4643qga> c;
    private final C7054oVa<HPa> d;

    public IW(C7054oVa<C1472lW> ova, C7054oVa<WV> ova2, C7054oVa<C4643qga> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static IW a(C7054oVa<C1472lW> ova, C7054oVa<WV> ova2, C7054oVa<C4643qga> ova3, C7054oVa<HPa> ova4) {
        return new IW(ova, ova2, ova3, ova4);
    }

    public HW get() {
        return new HW((C1472lW) this.a.get(), (WV) this.b.get(), (C4643qga) this.c.get(), (HPa) this.d.get());
    }
}
