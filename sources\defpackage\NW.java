package defpackage;

/* renamed from: NW reason: default package */
/* compiled from: UsersVault_Factory */
public final class NW implements C4961HMa<KW> {
    private final C7054oVa<LW> a;

    public NW(C7054oVa<LW> ova) {
        this.a = ova;
    }

    public static NW a(C7054oVa<LW> ova) {
        return new NW(ova);
    }

    public KW get() {
        return new KW((LW) this.a.get());
    }
}
