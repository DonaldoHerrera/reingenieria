package defpackage;

/* renamed from: qca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueStorage_Factory */
public final class C3854qca implements C4961HMa<C3846pca> {
    private final C7054oVa<C3758eca> a;

    public C3854qca(C7054oVa<C3758eca> ova) {
        this.a = ova;
    }

    public static C3854qca a(C7054oVa<C3758eca> ova) {
        return new C3854qca(ova);
    }

    public static C3846pca a(C3758eca eca) {
        return new C3846pca(eca);
    }

    public C3846pca get() {
        return new C3846pca((C3758eca) this.a.get());
    }
}
