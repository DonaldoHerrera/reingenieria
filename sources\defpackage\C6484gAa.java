package defpackage;

/* renamed from: gAa reason: default package and case insensitive filesystem */
/* compiled from: FetchPlaylistsCommand_Factory */
public final class C6484gAa implements C4961HMa<C6416fAa> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<HPa> b;

    public C6484gAa(C7054oVa<dfa> ova, C7054oVa<HPa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6484gAa a(C7054oVa<dfa> ova, C7054oVa<HPa> ova2) {
        return new C6484gAa(ova, ova2);
    }

    public C6416fAa get() {
        return new C6416fAa((dfa) this.a.get(), (HPa) this.b.get());
    }
}
