package defpackage;

/* renamed from: vT reason: default package and case insensitive filesystem */
/* compiled from: CommentsStorage_Factory */
public final class C3322vT implements C4961HMa<C3302uT> {
    private final C7054oVa<C5500ZKa> a;

    public C3322vT(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C3322vT a(C7054oVa<C5500ZKa> ova) {
        return new C3322vT(ova);
    }

    public C3302uT get() {
        return new C3302uT((C5500ZKa) this.a.get());
    }
}
