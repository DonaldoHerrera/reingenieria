package defpackage;

/* renamed from: yCa reason: default package and case insensitive filesystem */
/* compiled from: TrackPostsSyncProvider_Factory */
public final class C7723yCa implements C4961HMa<C7654xCa> {
    private final C7054oVa<C7309sCa> a;

    public C7723yCa(C7054oVa<C7309sCa> ova) {
        this.a = ova;
    }

    public static C7723yCa a(C7054oVa<C7309sCa> ova) {
        return new C7723yCa(ova);
    }

    public C7654xCa get() {
        return new C7654xCa(this.a);
    }
}
