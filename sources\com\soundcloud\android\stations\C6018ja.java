package com.soundcloud.android.stations;

import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.la;

/* renamed from: com.soundcloud.android.stations.ja reason: case insensitive filesystem */
/* compiled from: DefaultStationsRepository_Factory */
public final class C6018ja implements C4961HMa<T> {
    private final C7054oVa<kc> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<Vb> c;
    private final C7054oVa<C3768fea> d;
    private final C7054oVa<la> e;
    private final C7054oVa<T> f;
    private final C7054oVa<ca> g;
    private final C7054oVa<C3469VY> h;

    public C6018ja(C7054oVa<kc> ova, C7054oVa<HPa> ova2, C7054oVa<Vb> ova3, C7054oVa<C3768fea> ova4, C7054oVa<la> ova5, C7054oVa<T> ova6, C7054oVa<ca> ova7, C7054oVa<C3469VY> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static C6018ja a(C7054oVa<kc> ova, C7054oVa<HPa> ova2, C7054oVa<Vb> ova3, C7054oVa<C3768fea> ova4, C7054oVa<la> ova5, C7054oVa<T> ova6, C7054oVa<ca> ova7, C7054oVa<C3469VY> ova8) {
        C6018ja jaVar = new C6018ja(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return jaVar;
    }

    public T get() {
        T t = new T((kc) this.a.get(), (HPa) this.b.get(), (Vb) this.c.get(), (C3768fea) this.d.get(), (la) this.e.get(), (T) this.f.get(), (ca) this.g.get(), (C3469VY) this.h.get());
        return t;
    }
}
