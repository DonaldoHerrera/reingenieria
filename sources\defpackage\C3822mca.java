package defpackage;

/* renamed from: mca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueManager_Factory */
public final class C3822mca implements C4961HMa<C3814lca> {
    private final C7054oVa<C3830nca> a;
    private final C7054oVa<C3469VY> b;
    private final C7054oVa<C3790ica> c;
    private final C7054oVa<HPa> d;
    private final C7054oVa<HPa> e;

    public C3822mca(C7054oVa<C3830nca> ova, C7054oVa<C3469VY> ova2, C7054oVa<C3790ica> ova3, C7054oVa<HPa> ova4, C7054oVa<HPa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C3822mca a(C7054oVa<C3830nca> ova, C7054oVa<C3469VY> ova2, C7054oVa<C3790ica> ova3, C7054oVa<HPa> ova4, C7054oVa<HPa> ova5) {
        C3822mca mca = new C3822mca(ova, ova2, ova3, ova4, ova5);
        return mca;
    }

    public C3814lca get() {
        C3814lca lca = new C3814lca((C3830nca) this.a.get(), (C3469VY) this.b.get(), (C3790ica) this.c.get(), (HPa) this.d.get(), (HPa) this.e.get());
        return lca;
    }
}
