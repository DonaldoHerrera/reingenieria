package defpackage;

/* renamed from: dW reason: default package and case insensitive filesystem */
/* compiled from: StoreUsersCommand_Factory */
public final class C1226dW implements C4961HMa<C0515cW> {
    private final C7054oVa<C5500ZKa> a;

    public C1226dW(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C1226dW a(C7054oVa<C5500ZKa> ova) {
        return new C1226dW(ova);
    }

    public C0515cW get() {
        return new C0515cW((C5500ZKa) this.a.get());
    }
}
