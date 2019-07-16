package com.soundcloud.android.accounts;

import com.soundcloud.android.ads.data.t;
import com.soundcloud.android.collection.C2746fa;
import com.soundcloud.android.collection.playhistory.va;
import com.soundcloud.android.collection.recentlyplayed.Ga;
import com.soundcloud.android.comments.C2878cb;
import com.soundcloud.android.deeplinks.i;
import com.soundcloud.android.features.record.ba;
import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4165se;
import com.soundcloud.android.settings.notifications.p;
import com.soundcloud.android.settings.streamingquality.e;
import com.soundcloud.android.stations.ic;
import com.soundcloud.android.stream.C6115ya;
import com.soundcloud.android.sync.G;

/* renamed from: com.soundcloud.android.accounts.e reason: case insensitive filesystem */
/* compiled from: AccountCleanupAction_Factory */
public final class C2524e implements C4961HMa<C2523d> {
    private final C7054oVa<C4165se> A;
    private final C7054oVa<C3898wY> B;
    private final C7054oVa<C4797CDa> C;
    private final C7054oVa<C6830lDa> D;
    private final C7054oVa<C5630bKa> E;
    private final C7054oVa<C3814lca> F;
    private final C7054oVa<C3989m> G;
    private final C7054oVa<C5252Qwa> H;
    private final C7054oVa<HPa> I;
    private final C7054oVa<t> J;
    private final C7054oVa<C2436_U> K;
    private final C7054oVa<Cba> a;
    private final C7054oVa<C4942Gta> b;
    private final C7054oVa<ba> c;
    private final C7054oVa<C2380XU> d;
    private final C7054oVa<C3218qP> e;
    private final C7054oVa<C4088fe> f;
    private final C7054oVa<e> g;
    private final C7054oVa<C2137KU> h;
    private final C7054oVa<C3177oM> i;
    private final C7054oVa<C7250rKa> j;
    private final C7054oVa<G> k;
    private final C7054oVa<C1960BU> l;
    private final C7054oVa<C4888FBa> m;
    private final C7054oVa<C0514cT> n;
    private final C7054oVa<ic> o;
    private final C7054oVa<C2746fa> p;
    private final C7054oVa<C6115ya> q;
    private final C7054oVa<C2325UT> r;
    private final C7054oVa<p> s;
    private final C7054oVa<va> t;
    private final C7054oVa<Ga> u;
    private final C7054oVa<C3856qea> v;
    private final C7054oVa<C3302uT> w;
    private final C7054oVa<C2878cb> x;
    private final C7054oVa<Tea> y;
    private final C7054oVa<i> z;

    public C2524e(C7054oVa<Cba> ova, C7054oVa<C4942Gta> ova2, C7054oVa<ba> ova3, C7054oVa<C2380XU> ova4, C7054oVa<C3218qP> ova5, C7054oVa<C4088fe> ova6, C7054oVa<e> ova7, C7054oVa<C2137KU> ova8, C7054oVa<C3177oM> ova9, C7054oVa<C7250rKa> ova10, C7054oVa<G> ova11, C7054oVa<C1960BU> ova12, C7054oVa<C4888FBa> ova13, C7054oVa<C0514cT> ova14, C7054oVa<ic> ova15, C7054oVa<C2746fa> ova16, C7054oVa<C6115ya> ova17, C7054oVa<C2325UT> ova18, C7054oVa<p> ova19, C7054oVa<va> ova20, C7054oVa<Ga> ova21, C7054oVa<C3856qea> ova22, C7054oVa<C3302uT> ova23, C7054oVa<C2878cb> ova24, C7054oVa<Tea> ova25, C7054oVa<i> ova26, C7054oVa<C4165se> ova27, C7054oVa<C3898wY> ova28, C7054oVa<C4797CDa> ova29, C7054oVa<C6830lDa> ova30, C7054oVa<C5630bKa> ova31, C7054oVa<C3814lca> ova32, C7054oVa<C3989m> ova33, C7054oVa<C5252Qwa> ova34, C7054oVa<HPa> ova35, C7054oVa<t> ova36, C7054oVa<C2436_U> ova37) {
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
        this.l = ova12;
        this.m = ova13;
        this.n = ova14;
        this.o = ova15;
        this.p = ova16;
        this.q = ova17;
        this.r = ova18;
        this.s = ova19;
        this.t = ova20;
        this.u = ova21;
        this.v = ova22;
        this.w = ova23;
        this.x = ova24;
        this.y = ova25;
        this.z = ova26;
        this.A = ova27;
        this.B = ova28;
        this.C = ova29;
        this.D = ova30;
        this.E = ova31;
        this.F = ova32;
        this.G = ova33;
        this.H = ova34;
        this.I = ova35;
        this.J = ova36;
        this.K = ova37;
    }

    public static C2524e a(C7054oVa<Cba> ova, C7054oVa<C4942Gta> ova2, C7054oVa<ba> ova3, C7054oVa<C2380XU> ova4, C7054oVa<C3218qP> ova5, C7054oVa<C4088fe> ova6, C7054oVa<e> ova7, C7054oVa<C2137KU> ova8, C7054oVa<C3177oM> ova9, C7054oVa<C7250rKa> ova10, C7054oVa<G> ova11, C7054oVa<C1960BU> ova12, C7054oVa<C4888FBa> ova13, C7054oVa<C0514cT> ova14, C7054oVa<ic> ova15, C7054oVa<C2746fa> ova16, C7054oVa<C6115ya> ova17, C7054oVa<C2325UT> ova18, C7054oVa<p> ova19, C7054oVa<va> ova20, C7054oVa<Ga> ova21, C7054oVa<C3856qea> ova22, C7054oVa<C3302uT> ova23, C7054oVa<C2878cb> ova24, C7054oVa<Tea> ova25, C7054oVa<i> ova26, C7054oVa<C4165se> ova27, C7054oVa<C3898wY> ova28, C7054oVa<C4797CDa> ova29, C7054oVa<C6830lDa> ova30, C7054oVa<C5630bKa> ova31, C7054oVa<C3814lca> ova32, C7054oVa<C3989m> ova33, C7054oVa<C5252Qwa> ova34, C7054oVa<HPa> ova35, C7054oVa<t> ova36, C7054oVa<C2436_U> ova37) {
        C2524e eVar = new C2524e(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12, ova13, ova14, ova15, ova16, ova17, ova18, ova19, ova20, ova21, ova22, ova23, ova24, ova25, ova26, ova27, ova28, ova29, ova30, ova31, ova32, ova33, ova34, ova35, ova36, ova37);
        return eVar;
    }

    public C2523d get() {
        C2523d dVar = new C2523d((Cba) this.a.get(), (C4942Gta) this.b.get(), (ba) this.c.get(), (C2380XU) this.d.get(), (C3218qP) this.e.get(), (C4088fe) this.f.get(), (e) this.g.get(), (C2137KU) this.h.get(), (C3177oM) this.i.get(), (C7250rKa) this.j.get(), (G) this.k.get(), (C1960BU) this.l.get(), (C4888FBa) this.m.get(), (C0514cT) this.n.get(), (ic) this.o.get(), (C2746fa) this.p.get(), (C6115ya) this.q.get(), (C2325UT) this.r.get(), (p) this.s.get(), (va) this.t.get(), (Ga) this.u.get(), (C3856qea) this.v.get(), (C3302uT) this.w.get(), (C2878cb) this.x.get(), (Tea) this.y.get(), (i) this.z.get(), (C4165se) this.A.get(), (C3898wY) this.B.get(), (C4797CDa) this.C.get(), (C6830lDa) this.D.get(), (C5630bKa) this.E.get(), (C3814lca) this.F.get(), (C3989m) this.G.get(), (C5252Qwa) this.H.get(), (HPa) this.I.get(), (t) this.J.get(), (C2436_U) this.K.get());
        return dVar;
    }
}
