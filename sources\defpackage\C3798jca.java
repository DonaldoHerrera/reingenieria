package defpackage;

/* renamed from: jca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueItemVerifier_Factory */
public final class C3798jca implements C4961HMa<C3790ica> {
    private final C7054oVa<C6834lGa> a;
    private final C7054oVa<C3815lda> b;

    public C3798jca(C7054oVa<C6834lGa> ova, C7054oVa<C3815lda> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3798jca a(C7054oVa<C6834lGa> ova, C7054oVa<C3815lda> ova2) {
        return new C3798jca(ova, ova2);
    }

    public C3790ica get() {
        return new C3790ica((C6834lGa) this.a.get(), (C3815lda) this.b.get());
    }
}
