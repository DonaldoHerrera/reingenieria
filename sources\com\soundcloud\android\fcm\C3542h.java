package com.soundcloud.android.fcm;

/* renamed from: com.soundcloud.android.fcm.h reason: case insensitive filesystem */
/* compiled from: DefaultFcmMessageHandler_Factory */
public final class C3542h implements C4961HMa<C3541g> {
    private final C7054oVa<m> a;
    private final C7054oVa<C3469VY> b;
    private final C7054oVa<C3535a> c;
    private final C7054oVa<k> d;
    private final C7054oVa<C3537c> e;
    private final C7054oVa<z> f;
    private final C7054oVa<D> g;
    private final C7054oVa<C7181qKa> h;

    public C3542h(C7054oVa<m> ova, C7054oVa<C3469VY> ova2, C7054oVa<C3535a> ova3, C7054oVa<k> ova4, C7054oVa<C3537c> ova5, C7054oVa<z> ova6, C7054oVa<D> ova7, C7054oVa<C7181qKa> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static C3542h a(C7054oVa<m> ova, C7054oVa<C3469VY> ova2, C7054oVa<C3535a> ova3, C7054oVa<k> ova4, C7054oVa<C3537c> ova5, C7054oVa<z> ova6, C7054oVa<D> ova7, C7054oVa<C7181qKa> ova8) {
        C3542h hVar = new C3542h(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return hVar;
    }

    public C3541g get() {
        C3541g gVar = new C3541g((m) this.a.get(), (C3469VY) this.b.get(), (C3535a) this.c.get(), (k) this.d.get(), (C3537c) this.e.get(), (z) this.f.get(), (D) this.g.get(), (C7181qKa) this.h.get());
        return gVar;
    }
}
