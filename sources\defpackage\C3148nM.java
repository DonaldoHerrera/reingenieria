package defpackage;

/* renamed from: nM reason: default package and case insensitive filesystem */
/* compiled from: PrivacySettingsOperations_Factory */
public final class C3148nM implements C4961HMa<C3129mM> {
    private final C7054oVa<C3177oM> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<efa> c;
    private final C7054oVa<C2248QR> d;

    public C3148nM(C7054oVa<C3177oM> ova, C7054oVa<HPa> ova2, C7054oVa<efa> ova3, C7054oVa<C2248QR> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3148nM a(C7054oVa<C3177oM> ova, C7054oVa<HPa> ova2, C7054oVa<efa> ova3, C7054oVa<C2248QR> ova4) {
        return new C3148nM(ova, ova2, ova3, ova4);
    }

    public C3129mM get() {
        return new C3129mM((C3177oM) this.a.get(), (HPa) this.b.get(), (efa) this.c.get(), (C2248QR) this.d.get());
    }
}
