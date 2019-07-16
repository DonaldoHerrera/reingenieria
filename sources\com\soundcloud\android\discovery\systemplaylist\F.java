package com.soundcloud.android.discovery.systemplaylist;

/* compiled from: SystemPlaylistOperations_Factory */
public final class F implements C4961HMa<E> {
    private final C7054oVa<efa> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C3898wY> c;
    private final C7054oVa<C3874tY> d;
    private final C7054oVa<C3760eea> e;
    private final C7054oVa<C3768fea> f;

    public F(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<C3898wY> ova3, C7054oVa<C3874tY> ova4, C7054oVa<C3760eea> ova5, C7054oVa<C3768fea> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static F a(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<C3898wY> ova3, C7054oVa<C3874tY> ova4, C7054oVa<C3760eea> ova5, C7054oVa<C3768fea> ova6) {
        F f2 = new F(ova, ova2, ova3, ova4, ova5, ova6);
        return f2;
    }

    public E get() {
        E e2 = new E((efa) this.a.get(), (HPa) this.b.get(), (C3898wY) this.c.get(), (C3874tY) this.d.get(), (C3760eea) this.e.get(), (C3768fea) this.f.get());
        return e2;
    }
}
