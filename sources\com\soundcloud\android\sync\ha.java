package com.soundcloud.android.sync;

/* compiled from: SyncRequestFactory_Factory */
public final class ha implements C4961HMa<ga> {
    private final C7054oVa<oa> a;
    private final C7054oVa<A> b;
    private final C7054oVa<C6138v> c;
    private final C7054oVa<C5490ZAa> d;
    private final C7054oVa<C5287SBa> e;
    private final C7054oVa<C5327TLa> f;

    public ha(C7054oVa<oa> ova, C7054oVa<A> ova2, C7054oVa<C6138v> ova3, C7054oVa<C5490ZAa> ova4, C7054oVa<C5287SBa> ova5, C7054oVa<C5327TLa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static ha a(C7054oVa<oa> ova, C7054oVa<A> ova2, C7054oVa<C6138v> ova3, C7054oVa<C5490ZAa> ova4, C7054oVa<C5287SBa> ova5, C7054oVa<C5327TLa> ova6) {
        ha haVar = new ha(ova, ova2, ova3, ova4, ova5, ova6);
        return haVar;
    }

    public ga get() {
        ga gaVar = new ga((oa) this.a.get(), (A) this.b.get(), (C6138v) this.c.get(), (C5490ZAa) this.d.get(), (C5287SBa) this.e.get(), (C5327TLa) this.f.get());
        return gaVar;
    }
}
