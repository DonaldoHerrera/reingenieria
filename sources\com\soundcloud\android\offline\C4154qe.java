package com.soundcloud.android.offline;

import android.content.res.Resources;
import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.offline.qe reason: case insensitive filesystem */
/* compiled from: OfflineTrackAssetDownloader_Factory */
public final class C4154qe implements C4961HMa<C4148pe> {
    private final C7054oVa<N> a;
    private final C7054oVa<Resources> b;
    private final C7054oVa<C5412WJa> c;
    private final C7054oVa<C6838lKa> d;
    private final C7054oVa<C6970nGa> e;
    private final C7054oVa<C3469VY> f;
    private final C7054oVa<Qb> g;

    public C4154qe(C7054oVa<N> ova, C7054oVa<Resources> ova2, C7054oVa<C5412WJa> ova3, C7054oVa<C6838lKa> ova4, C7054oVa<C6970nGa> ova5, C7054oVa<C3469VY> ova6, C7054oVa<Qb> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static C4154qe a(C7054oVa<N> ova, C7054oVa<Resources> ova2, C7054oVa<C5412WJa> ova3, C7054oVa<C6838lKa> ova4, C7054oVa<C6970nGa> ova5, C7054oVa<C3469VY> ova6, C7054oVa<Qb> ova7) {
        C4154qe qeVar = new C4154qe(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return qeVar;
    }

    public C4148pe get() {
        C4148pe peVar = new C4148pe((N) this.a.get(), (Resources) this.b.get(), (C5412WJa) this.c.get(), (C6838lKa) this.d.get(), (C6970nGa) this.e.get(), (C3469VY) this.f.get(), (Qb) this.g.get());
        return peVar;
    }
}
