package defpackage;

/* renamed from: Roa reason: default package and case insensitive filesystem */
/* compiled from: AddToPlaylistPresenter_Factory */
public final class C5274Roa implements C4961HMa<C5244Qoa> {
    private final C7054oVa<HPa> a;
    private final C7054oVa<C4909Fra> b;
    private final C7054oVa<C2436_U> c;
    private final C7054oVa<C5606ava> d;

    public C5274Roa(C7054oVa<HPa> ova, C7054oVa<C4909Fra> ova2, C7054oVa<C2436_U> ova3, C7054oVa<C5606ava> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C5274Roa a(C7054oVa<HPa> ova, C7054oVa<C4909Fra> ova2, C7054oVa<C2436_U> ova3, C7054oVa<C5606ava> ova4) {
        return new C5274Roa(ova, ova2, ova3, ova4);
    }

    public C5244Qoa get() {
        return new C5244Qoa((HPa) this.a.get(), (C4909Fra) this.b.get(), (C2436_U) this.c.get(), (C5606ava) this.d.get());
    }
}
