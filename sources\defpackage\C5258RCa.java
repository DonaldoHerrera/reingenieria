package defpackage;

/* renamed from: RCa reason: default package and case insensitive filesystem */
/* compiled from: SoundStreamSyncer_SoundStreamSyncerFactory_Factory */
public final class C5258RCa implements C4961HMa<a> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<C5288SCa> b;
    private final C7054oVa<C4951HCa> c;
    private final C7054oVa<C5622bDa> d;

    public C5258RCa(C7054oVa<dfa> ova, C7054oVa<C5288SCa> ova2, C7054oVa<C4951HCa> ova3, C7054oVa<C5622bDa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C5258RCa a(C7054oVa<dfa> ova, C7054oVa<C5288SCa> ova2, C7054oVa<C4951HCa> ova3, C7054oVa<C5622bDa> ova4) {
        return new C5258RCa(ova, ova2, ova3, ova4);
    }

    public a get() {
        return new a((dfa) this.a.get(), (C5288SCa) this.b.get(), (C4951HCa) this.c.get(), (C5622bDa) this.d.get());
    }
}
