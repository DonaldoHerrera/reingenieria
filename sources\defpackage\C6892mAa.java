package defpackage;

/* renamed from: mAa reason: default package and case insensitive filesystem */
/* compiled from: FetchUsersCommand_Factory */
public final class C6892mAa implements C4961HMa<C6824lAa> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<HPa> b;

    public C6892mAa(C7054oVa<dfa> ova, C7054oVa<HPa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6892mAa a(C7054oVa<dfa> ova, C7054oVa<HPa> ova2) {
        return new C6892mAa(ova, ova2);
    }

    public C6824lAa get() {
        return new C6824lAa((dfa) this.a.get(), (HPa) this.b.get());
    }
}
