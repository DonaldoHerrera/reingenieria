package defpackage;

/* renamed from: Eza reason: default package and case insensitive filesystem */
/* compiled from: ActivitiesSyncer_ActivitiesSyncerFactory_Factory */
public final class C4886Eza implements C4961HMa<a> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<C5255Qza> b;
    private final C7054oVa<C5195Oza> c;
    private final C7054oVa<C5622bDa> d;

    public C4886Eza(C7054oVa<dfa> ova, C7054oVa<C5255Qza> ova2, C7054oVa<C5195Oza> ova3, C7054oVa<C5622bDa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C4886Eza a(C7054oVa<dfa> ova, C7054oVa<C5255Qza> ova2, C7054oVa<C5195Oza> ova3, C7054oVa<C5622bDa> ova4) {
        return new C4886Eza(ova, ova2, ova3, ova4);
    }

    public a get() {
        return new a((dfa) this.a.get(), (C5255Qza) this.b.get(), (C5195Oza) this.c.get(), (C5622bDa) this.d.get());
    }
}
