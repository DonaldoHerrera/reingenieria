package defpackage;

/* renamed from: CW reason: default package */
/* compiled from: UserStorageReader_Factory */
public final class CW implements C4961HMa<BW> {
    private final C7054oVa<C1472lW> a;

    public CW(C7054oVa<C1472lW> ova) {
        this.a = ova;
    }

    public static CW a(C7054oVa<C1472lW> ova) {
        return new CW(ova);
    }

    public BW get() {
        return new BW((C1472lW) this.a.get());
    }
}
