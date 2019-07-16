package defpackage;

/* renamed from: dca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueCleanupHelper_Factory */
public final class C3750dca implements C4961HMa<C3507cca> {
    private final C7054oVa<C3846pca> a;

    public C3750dca(C7054oVa<C3846pca> ova) {
        this.a = ova;
    }

    public static C3750dca a(C7054oVa<C3846pca> ova) {
        return new C3750dca(ova);
    }

    public C3507cca get() {
        return new C3507cca((C3846pca) this.a.get());
    }
}
