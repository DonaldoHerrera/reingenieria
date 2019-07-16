package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.playback.Db;
import com.soundcloud.android.sync.ca;
import com.soundcloud.android.tracks.Ca;

/* compiled from: PlayHistoryOperations_Factory */
public final class ja implements C4961HMa<Z> {
    private final C7054oVa<Db> a;
    private final C7054oVa<va> b;
    private final C7054oVa<HPa> c;
    private final C7054oVa<ca> d;
    private final C7054oVa<C2783k> e;
    private final C7054oVa<C3760eea> f;
    private final C7054oVa<Ca> g;
    private final C7054oVa<Ica> h;

    public ja(C7054oVa<Db> ova, C7054oVa<va> ova2, C7054oVa<HPa> ova3, C7054oVa<ca> ova4, C7054oVa<C2783k> ova5, C7054oVa<C3760eea> ova6, C7054oVa<Ca> ova7, C7054oVa<Ica> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static ja a(C7054oVa<Db> ova, C7054oVa<va> ova2, C7054oVa<HPa> ova3, C7054oVa<ca> ova4, C7054oVa<C2783k> ova5, C7054oVa<C3760eea> ova6, C7054oVa<Ca> ova7, C7054oVa<Ica> ova8) {
        ja jaVar = new ja(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return jaVar;
    }

    public Z get() {
        Z z = new Z((Db) this.a.get(), (va) this.b.get(), (HPa) this.c.get(), (ca) this.d.get(), (C2783k) this.e.get(), (C3760eea) this.f.get(), (Ca) this.g.get(), (Ica) this.h.get());
        return z;
    }
}
