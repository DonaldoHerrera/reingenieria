package com.soundcloud.android.playback;

import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.Vd;

/* compiled from: PlaybackItemOperations_Factory */
public final class Sb implements C4961HMa<Qb> {
    private final C7054oVa<C3760eea> a;
    private final C7054oVa<Vd> b;
    private final C7054oVa<Ub> c;
    private final C7054oVa<C4088fe> d;
    private final C7054oVa<C5052KJa> e;

    public Sb(C7054oVa<C3760eea> ova, C7054oVa<Vd> ova2, C7054oVa<Ub> ova3, C7054oVa<C4088fe> ova4, C7054oVa<C5052KJa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static Sb a(C7054oVa<C3760eea> ova, C7054oVa<Vd> ova2, C7054oVa<Ub> ova3, C7054oVa<C4088fe> ova4, C7054oVa<C5052KJa> ova5) {
        Sb sb = new Sb(ova, ova2, ova3, ova4, ova5);
        return sb;
    }

    public Qb get() {
        Qb qb = new Qb((C3760eea) this.a.get(), (Vd) this.b.get(), (Ub) this.c.get(), (C4088fe) this.d.get(), (C5052KJa) this.e.get());
        return qb;
    }
}
