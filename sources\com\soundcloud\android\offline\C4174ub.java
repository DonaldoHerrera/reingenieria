package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.ub reason: case insensitive filesystem */
/* compiled from: ClearOfflineContentCommand_Factory */
public final class C4174ub implements C4961HMa<C4168tb> {
    private final C7054oVa<Vb> a;
    private final C7054oVa<C4088fe> b;
    private final C7054oVa<Se> c;
    private final C7054oVa<Gd> d;
    private final C7054oVa<De> e;

    public C4174ub(C7054oVa<Vb> ova, C7054oVa<C4088fe> ova2, C7054oVa<Se> ova3, C7054oVa<Gd> ova4, C7054oVa<De> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C4174ub a(C7054oVa<Vb> ova, C7054oVa<C4088fe> ova2, C7054oVa<Se> ova3, C7054oVa<Gd> ova4, C7054oVa<De> ova5) {
        C4174ub ubVar = new C4174ub(ova, ova2, ova3, ova4, ova5);
        return ubVar;
    }

    public C4168tb get() {
        C4168tb tbVar = new C4168tb((Vb) this.a.get(), (C4088fe) this.b.get(), (Se) this.c.get(), (Gd) this.d.get(), (De) this.e.get());
        return tbVar;
    }
}
