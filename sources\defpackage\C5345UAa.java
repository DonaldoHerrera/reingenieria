package defpackage;

/* renamed from: UAa reason: default package and case insensitive filesystem */
/* compiled from: EntitySyncModule_ProvidePlaylistSyncJobFactory */
public final class C5345UAa implements C4961HMa<C5256RAa> {
    private final C7054oVa<C6416fAa> a;
    private final C7054oVa<Hda> b;
    private final C7054oVa<C6960nAa> c;

    public C5345UAa(C7054oVa<C6416fAa> ova, C7054oVa<Hda> ova2, C7054oVa<C6960nAa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C5345UAa a(C7054oVa<C6416fAa> ova, C7054oVa<Hda> ova2, C7054oVa<C6960nAa> ova3) {
        return new C5345UAa(ova, ova2, ova3);
    }

    public static C5256RAa a(C6416fAa faa, Hda hda, C6960nAa naa) {
        C5256RAa a2 = C5316TAa.a(faa, hda, naa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C5256RAa get() {
        return a((C6416fAa) this.a.get(), (Hda) this.b.get(), (C6960nAa) this.c.get());
    }
}
