package defpackage;

/* renamed from: Dba reason: default package */
/* compiled from: FollowingStorage_Factory */
public final class Dba implements C4961HMa<Cba> {
    private final C7054oVa<C3869sba> a;

    public Dba(C7054oVa<C3869sba> ova) {
        this.a = ova;
    }

    public static Dba a(C7054oVa<C3869sba> ova) {
        return new Dba(ova);
    }

    public Cba get() {
        return new Cba((C3869sba) this.a.get());
    }
}
