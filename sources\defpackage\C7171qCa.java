package defpackage;

/* renamed from: qCa reason: default package and case insensitive filesystem */
/* compiled from: PostsSyncModule_ProvideMyPlaylistPostsSyncerFactory */
public final class C7171qCa implements C4961HMa<C7309sCa> {
    private final C7054oVa<C6556hCa> a;
    private final C7054oVa<C6352eCa> b;
    private final C7054oVa<C7516vCa> c;
    private final C7054oVa<C7378tCa> d;
    private final C7054oVa<C6416fAa> e;
    private final C7054oVa<Hda> f;
    private final C7054oVa<C5327TLa> g;

    public C7171qCa(C7054oVa<C6556hCa> ova, C7054oVa<C6352eCa> ova2, C7054oVa<C7516vCa> ova3, C7054oVa<C7378tCa> ova4, C7054oVa<C6416fAa> ova5, C7054oVa<Hda> ova6, C7054oVa<C5327TLa> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static C7171qCa a(C7054oVa<C6556hCa> ova, C7054oVa<C6352eCa> ova2, C7054oVa<C7516vCa> ova3, C7054oVa<C7378tCa> ova4, C7054oVa<C6416fAa> ova5, C7054oVa<Hda> ova6, C7054oVa<C5327TLa> ova7) {
        C7171qCa qca = new C7171qCa(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return qca;
    }

    public static C7309sCa a(C6556hCa hca, Object obj, C7516vCa vca, Object obj2, C6416fAa faa, Hda hda, C5327TLa tLa) {
        C7309sCa a2 = C6828lCa.a(hca, (C6352eCa) obj, vca, (C7378tCa) obj2, faa, hda, tLa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7309sCa get() {
        return a((C6556hCa) this.a.get(), this.b.get(), (C7516vCa) this.c.get(), this.d.get(), (C6416fAa) this.e.get(), (Hda) this.f.get(), (C5327TLa) this.g.get());
    }
}
