package defpackage;

/* renamed from: qba reason: default package and case insensitive filesystem */
/* compiled from: FollowingCleanupHelper_Factory */
public final class C3853qba implements C4961HMa<C3845pba> {
    private final C7054oVa<Cba> a;

    public C3853qba(C7054oVa<Cba> ova) {
        this.a = ova;
    }

    public static C3853qba a(C7054oVa<Cba> ova) {
        return new C3853qba(ova);
    }

    public C3845pba get() {
        return new C3845pba((Cba) this.a.get());
    }
}
