package defpackage;

/* renamed from: JW reason: default package */
/* compiled from: UserStorage_Factory */
public final class JW implements C4961HMa<C1472lW> {
    private final C7054oVa<C4898FLa> a;
    private final C7054oVa<C0515cW> b;

    public JW(C7054oVa<C4898FLa> ova, C7054oVa<C0515cW> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static JW a(C7054oVa<C4898FLa> ova, C7054oVa<C0515cW> ova2) {
        return new JW(ova, ova2);
    }

    public C1472lW get() {
        return new C1472lW((C4898FLa) this.a.get(), (C0515cW) this.b.get());
    }
}
