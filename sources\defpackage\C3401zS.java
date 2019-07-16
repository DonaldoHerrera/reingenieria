package defpackage;

import android.content.Context;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.cast.r;
import com.soundcloud.android.cast.t;
import com.soundcloud.android.playback.C4350oa;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.players.l;

/* renamed from: zS reason: default package and case insensitive filesystem */
/* compiled from: CastPlayback_Factory */
public final class C3401zS implements C4961HMa<C3381yS> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C4695vna> b;
    private final C7054oVa<C3281tS> c;
    private final C7054oVa<C3814lca> d;
    private final C7054oVa<C4350oa> e;
    private final C7054oVa<r> f;
    private final C7054oVa<t> g;
    private final C7054oVa<Na> h;
    private final C7054oVa<d> i;
    private final C7054oVa<C5327TLa> j;
    private final C7054oVa<l> k;

    public C3401zS(C7054oVa<Context> ova, C7054oVa<C4695vna> ova2, C7054oVa<C3281tS> ova3, C7054oVa<C3814lca> ova4, C7054oVa<C4350oa> ova5, C7054oVa<r> ova6, C7054oVa<t> ova7, C7054oVa<Na> ova8, C7054oVa<d> ova9, C7054oVa<C5327TLa> ova10, C7054oVa<l> ova11) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
        this.j = ova10;
        this.k = ova11;
    }

    public static C3401zS a(C7054oVa<Context> ova, C7054oVa<C4695vna> ova2, C7054oVa<C3281tS> ova3, C7054oVa<C3814lca> ova4, C7054oVa<C4350oa> ova5, C7054oVa<r> ova6, C7054oVa<t> ova7, C7054oVa<Na> ova8, C7054oVa<d> ova9, C7054oVa<C5327TLa> ova10, C7054oVa<l> ova11) {
        C3401zS zSVar = new C3401zS(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11);
        return zSVar;
    }

    public C3381yS get() {
        C3381yS ySVar = new C3381yS((Context) this.a.get(), (C4695vna) this.b.get(), (C3281tS) this.c.get(), (C3814lca) this.d.get(), (C4350oa) this.e.get(), (r) this.f.get(), (t) this.g.get(), (Na) this.h.get(), (d) this.i.get(), (C5327TLa) this.j.get(), (l) this.k.get());
        return ySVar;
    }
}
