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

/* renamed from: com.soundcloud.android.accounts.d reason: case insensitive filesystem */
/* compiled from: AccountCleanupAction */
class C2523d implements C6368eQa {
    private final C5630bKa A;
    private final C3814lca B;
    private final C3989m C;
    private final HPa D;
    private final C5252Qwa E;
    private final C3177oM F;
    private final C7250rKa G;
    private final C2137KU H;
    private final t I;
    private final C2436_U J;
    private final Cba a;
    private final C4942Gta b;
    private final ba c;
    private final C2380XU d;
    private final C3218qP e;
    private final C4088fe f;
    private final e g;
    private final G h;
    private final C4888FBa i;
    private final C0514cT j;
    private final ic k;
    private final C2746fa l;
    private final C6115ya m;
    private final C2325UT n;
    private final p o;
    private final va p;
    private final Ga q;
    private final C3856qea r;
    private final C3302uT s;
    private final C2878cb t;
    private final Tea u;
    private final i v;
    private final C4165se w;
    private final C3898wY x;
    private final C4797CDa y;
    private final C6830lDa z;

    C2523d(Cba cba, C4942Gta gta, ba baVar, C2380XU xu, C3218qP qPVar, C4088fe feVar, e eVar, C2137KU ku, C3177oM oMVar, C7250rKa rka, G g2, C1960BU bu, C4888FBa fBa, C0514cT cTVar, ic icVar, C2746fa faVar, C6115ya yaVar, C2325UT ut, p pVar, va vaVar, Ga ga, C3856qea qea, C3302uT uTVar, C2878cb cbVar, Tea tea, i iVar, C4165se seVar, C3898wY wYVar, C4797CDa cDa, C6830lDa lda, C5630bKa bka, C3814lca lca, C3989m mVar, C5252Qwa qwa, HPa hPa, t tVar, C2436_U _u) {
        this.a = cba;
        this.b = gta;
        this.c = baVar;
        this.d = xu;
        this.e = qPVar;
        this.H = ku;
        this.G = rka;
        this.F = oMVar;
        this.f = feVar;
        this.g = eVar;
        this.h = g2;
        this.i = fBa;
        this.j = cTVar;
        this.k = icVar;
        this.l = faVar;
        this.m = yaVar;
        this.n = ut;
        this.o = pVar;
        this.p = vaVar;
        this.q = ga;
        this.r = qea;
        this.s = uTVar;
        this.t = cbVar;
        this.u = tea;
        this.v = iVar;
        this.w = seVar;
        this.x = wYVar;
        this.y = cDa;
        this.z = lda;
        this.A = bka;
        this.B = lca;
        this.C = mVar;
        this.D = hPa;
        this.E = qwa;
        this.I = tVar;
        this.J = _u;
    }

    private void a(C6368eQa eqa) {
        C6979nPa.b(eqa).b(this.D).c(new C4943Gua());
    }

    private void b() {
        try {
            this.b.a();
            this.j.a(_ea.SoundStream);
            this.j.a(_ea.Activities);
            this.s.a();
            this.j.a(_ea.PromotedTracks);
            this.A.a();
            this.j.a(f.c);
            this.i.a(null);
            this.C.e();
        } catch (C5529_Ka e2) {
            SDb.a("AccountCleanup").a((Throwable) e2, "Could not clear collections ", new Object[0]);
        }
    }

    public void run() {
        SDb.a("AccountCleanup").a("Purging user data...", new Object[0]);
        b();
        this.e.a();
        this.a.a();
        this.f.b();
        this.G.clear();
        this.H.clear();
        this.F.a();
        this.g.a();
        this.w.h();
        this.d.a();
        this.h.a();
        this.J.i();
        this.c.n();
        this.k.a();
        this.l.a();
        this.m.a();
        this.n.b();
        this.o.b();
        this.p.a();
        this.q.a();
        this.r.b();
        this.v.b();
        this.x.a();
        this.y.a();
        this.z.a();
        this.t.a();
        this.E.a();
        a();
        C3814lca lca = this.B;
        lca.getClass();
        a(new C2520a(lca));
        this.u.a();
    }

    private void a() {
        this.I.a().c();
    }
}
