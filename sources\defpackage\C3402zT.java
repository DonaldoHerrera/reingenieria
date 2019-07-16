package defpackage;

/* renamed from: zT reason: default package and case insensitive filesystem */
/* compiled from: StoreCommentCommand_Factory */
public final class C3402zT implements C4961HMa<C3382yT> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C3800jea> b;

    public C3402zT(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3402zT a(C7054oVa<C5500ZKa> ova, C7054oVa<C3800jea> ova2) {
        return new C3402zT(ova, ova2);
    }

    public C3382yT get() {
        return new C3382yT((C5500ZKa) this.a.get(), (C3800jea) this.b.get());
    }
}
