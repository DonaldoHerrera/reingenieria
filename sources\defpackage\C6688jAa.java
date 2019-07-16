package defpackage;

/* renamed from: jAa reason: default package and case insensitive filesystem */
/* compiled from: FetchTracksCommand_Factory */
public final class C6688jAa implements C4961HMa<C6620iAa> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<HPa> b;

    public C6688jAa(C7054oVa<dfa> ova, C7054oVa<HPa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6688jAa a(C7054oVa<dfa> ova, C7054oVa<HPa> ova2) {
        return new C6688jAa(ova, ova2);
    }

    public C6620iAa get() {
        return new C6620iAa((dfa) this.a.get(), (HPa) this.b.get());
    }
}
