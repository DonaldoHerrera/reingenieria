package defpackage;

import android.content.res.Resources;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.events.A;
import com.soundcloud.android.foundation.events.B;
import com.soundcloud.android.foundation.events.C3704f;
import com.soundcloud.android.foundation.events.C3713o;
import com.soundcloud.android.foundation.events.E;
import com.soundcloud.android.foundation.events.G;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.a;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.foundation.events.z;
import com.soundcloud.android.foundation.playqueue.m;
import com.soundcloud.android.ia.j;
import com.soundcloud.android.playback.C4298dd;
import com.soundcloud.android.tracks.C6185ma;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: KN reason: default package and case insensitive filesystem */
/* compiled from: EventLoggerV1JsonDataBuilder */
public class C2130KN {
    private final int a;
    private final C6699jHa b;
    private final C6834lGa c;
    private final C2526g d;
    private final C2436_U e;
    private final C2137KU f;
    private final Nea g;
    private final C5628bIa h;

    C2130KN(Resources resources, C6699jHa jha, C6834lGa lga, C2526g gVar, Nea nea, C2436_U _u, C2137KU ku, C5628bIa bia) {
        this.c = lga;
        this.d = gVar;
        this.e = _u;
        this.f = ku;
        this.a = resources.getInteger(j.app_id);
        this.b = jha;
        this.g = nea;
        this.h = bia;
    }

    private C2073HN b(G g2) {
        C2073HN a2 = a("click", (J) g2);
        if (g2.h() != null) {
            a2.j(g2.h().a());
        }
        if (g2.i() != null) {
            a2.k(g2.i().toString());
        }
        if (g2.j() != null) {
            a2.m(g2.j().a());
        }
        if (g2.l() != null) {
            a2.L(g2.l());
        }
        if (g2.m() != null) {
            a2.ba(g2.m());
        }
        if (g2.p() != null) {
            a2.ca(g2.p());
        }
        if (g2.o() != null) {
            a2.Y(g2.o().toString());
        }
        if (g2.n() != null) {
            a2.g(g2.n().intValue());
        }
        if (g2.k() != null) {
            a2.d(g2.k().intValue());
        }
        return a2;
    }

    private C2073HN c(K k) {
        C3704f q = k.q();
        v J = k.J();
        C3508cda N = k.N();
        C3508cda e2 = e(k);
        C2073HN s = a("item_interaction", (J) k).s(k.f());
        if (k.n() != null) {
            s.a(k.n().a());
            if (k.n().equals(a.NAVIGATION) && k.I() != null) {
                s.E(k.I());
            }
        }
        if (e2 != null) {
            s.D(e2.toString());
        }
        if (k.M() != null) {
            s.L(k.M());
        }
        if (N != null && !N.equals(C3508cda.a)) {
            s.M(N.toString());
        }
        if (q != null && q.a(J)) {
            s.a(q.c(), q.b());
        }
        if (J != null) {
            s.G(J.a());
            s.e(J.b());
        }
        if (k.V() != null) {
            s.Y(k.V().toString());
        }
        if (k.U() != null) {
            s.g(k.U().intValue());
        }
        return s;
    }

    private C2073HN d(K k) {
        C2073HN b2 = b(k);
        if (k.u() != null) {
            b2.m(k.u());
            b2.ea(k.u());
        }
        return b2;
    }

    private C3508cda e(K k) {
        if (k.t() != null) {
            return k.t();
        }
        return k.H();
    }

    /* access modifiers changed from: 0000 */
    public String a(Taa taa) {
        return b(a("click", taa.e()).s(taa.f()).j("ad::start_session").p(taa.i()).d(taa.h().toString()).L(taa.k().a()).I(taa.j()));
    }

    /* access modifiers changed from: 0000 */
    public String a(Faa faa) {
        return b(b(faa));
    }

    /* access modifiers changed from: 0000 */
    public String a(Saa saa) {
        C2073HN b2 = a("list_view_interaction", (J) saa).s(saa.f()).L(saa.n().a()).a(saa.h().a()).b(saa.i());
        if (!saa.k().isEmpty()) {
            b2.a("earliest_item", saa.j());
        }
        if (!saa.m().isEmpty()) {
            b2.a("latest_item", saa.l());
        }
        return b(b2);
    }

    private C2073HN b(K k) {
        C2073HN a2 = a("click", (J) k);
        if (k.r() != null) {
            a2.i(k.r().a());
        }
        if (k.M() != null) {
            a2.L(k.M());
        }
        if (k.p() != null) {
            a2.d(k.p());
        }
        if (k.L() != null) {
            a2.I(k.L());
        }
        if (k.K() != null) {
            a2.J(k.K().b());
        }
        if (k.X() != null) {
            a2.q(k.X().a());
        }
        if (k.T() != null) {
            a2.V(k.T().b());
        }
        if (e(k) != null) {
            a2.k(e(k).toString());
        }
        if (k.u() != null) {
            a2.m(k.u());
        }
        if (k.v() != null) {
            a2.a(k.v());
        }
        if (k.w() != null) {
            a2.n(k.w().b());
        }
        if (k.y() != null) {
            a2.p(k.y().a());
        }
        if (k.z() != null) {
            a2.p(k.z().b());
        }
        if (k.U() != null) {
            a2.g(k.U().intValue());
        }
        if (k.x() != null && !k.x().equals(C3508cda.a)) {
            a2.o(k.x().b());
        }
        if (k.V() != null && !k.V().equals(C3508cda.a)) {
            a2.Y(k.V().b());
        }
        if (k.N() != null && !k.N().equals(C3508cda.a)) {
            a2.M(k.N().b());
        }
        if (k.Y() != null && k.Y().booleanValue()) {
            a2.b(true);
        }
        if (k.O() != null) {
            a2.l(k.O());
        }
        if (k.C() != null) {
            a2.p(k.C());
        }
        if (k.B() != null) {
            a2.j(k.B());
        }
        if (k.s() != null) {
            a2.j(k.s().a());
        }
        if (k.A() != null) {
            a2.r(k.A());
        }
        if (k.W() != null) {
            a2.da(k.W().a());
        }
        if (k.S() != null) {
            a2.P(k.S().a());
        }
        if (k.F() != null) {
            a2.a(k.F());
        }
        if (k.E() != null) {
            a2.a(k.E());
        }
        if (k.D() != null) {
            a2.t(k.D().a());
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public String a(c cVar) {
        return b(a((C3437KZ) cVar));
    }

    /* access modifiers changed from: 0000 */
    public String a(d dVar) {
        C2073HN a2 = a((C3437KZ) dVar);
        a2.a(true);
        a2.f(a(dVar.m().a()));
        return b(a2);
    }

    /* access modifiers changed from: 0000 */
    public String a(b bVar) {
        C2073HN a2 = a((C3437KZ) bVar);
        a2.a(false);
        return b(a2);
    }

    private C2073HN a(C3437KZ kz) {
        C2073HN e2 = a("ad_request", (J) kz).s(kz.f()).g(kz.k()).c(kz.i()).e(kz.h());
        if (kz.j() != null) {
            e2.J(kz.j().toString());
        }
        return e2;
    }

    /* access modifiers changed from: 0000 */
    public String a(Paa paa) {
        return b(a("impression", paa.e()).s(paa.f()).B(paa.h()).d(paa.k().toString()).L(Paa.a).I(paa.j()));
    }

    /* access modifiers changed from: 0000 */
    public String a(C3916yaa yaa) {
        return b(a("impression", yaa.e()).s(yaa.f()).B("app_install").d(yaa.h().toString()).L(C3916yaa.a).c(yaa.i()).I("mobile_inlay"));
    }

    /* access modifiers changed from: 0000 */
    public String a(C3410BZ bz) {
        C2073HN b2 = a("ad_delivery", (J) bz).s(bz.f()).c(bz.h()).g(bz.m()).c(bz.j()).b(bz.i().toString());
        if (bz.k().c()) {
            b2.J(((C3508cda) bz.k().b()).toString());
        }
        return b(b2);
    }

    /* access modifiers changed from: 0000 */
    public String a(C3434JZ jz) {
        C2073HN I = a(jz.l(), (J) jz).d(jz.j().toString()).L(jz.o()).I(jz.n().a());
        if (jz.m() != null) {
            I.J(jz.m().toString());
        }
        if (jz.k() != null) {
            I.j(jz.k());
        }
        if (jz.q()) {
            I.B(((C0073d) jz).t().a());
        }
        return b(I);
    }

    /* access modifiers changed from: 0000 */
    public String a(C3425GZ gz) {
        C2073HN J = a(gz.m().a(), (J) gz).d(gz.i().toString()).b(gz.h()).J(gz.p().toString());
        if (gz.r().c()) {
            J.L((String) gz.r().b());
        }
        if (gz.n().c()) {
            J.B(((c) gz.n().b()).a());
        }
        if (gz.o().c()) {
            J.C(((C3508cda) gz.o().b()).toString());
        }
        if (gz.j().c()) {
            J.j((String) gz.j().b());
        }
        if (gz.k().c()) {
            J.k(((C3508cda) gz.k().b()).toString());
        }
        if (gz.l().c()) {
            J.p((String) gz.l().b());
        }
        if (gz.q().c()) {
            J.I(((c) gz.q().b()).a());
        }
        return b(J);
    }

    private C2073HN b(Faa faa) {
        Gaa k = faa.k();
        C6185ma j = k.j();
        C3508cda a2 = j.a();
        C2073HN H = a("audio", (J) faa).a(faa.d()).L(k.k().b()).a(k.g()).b(j.g()).e(a2).f(j.e()).s(k.c()).f(k.m()).a(this.e.q()).ha(a(k.k())).Q(k.e()).H(j.R());
        if (faa.o()) {
            a(H, (a) faa);
        }
        if (faa.p()) {
            H.Z(((d) faa).q());
        }
        if (faa.n()) {
            H.h(k.b());
        }
        if (faa.m()) {
            H.O(k.d());
        }
        if (k.h() != null) {
            H.W(k.h());
        }
        if (j.T() != null) {
            H.T(j.T());
        }
        if (k.a() != null) {
            H.g(k.a().a());
        }
        if (k.f() != null) {
            H.U(k.f());
        }
        if (k.i() != null) {
            H.X(k.i());
        }
        if (k.k().c() != C3508cda.a) {
            H.M(k.k().c().toString());
        }
        a(H, k.k(), a2);
        return H;
    }

    /* access modifiers changed from: 0000 */
    public String a(C3506cba cba) {
        return b(a("impression", (J) cba).a(cba.i()).L(cba.m()).B(cba.j().a()).J(cba.n()).I(cba.l().a()).b(cba.h()));
    }

    /* access modifiers changed from: 0000 */
    public String a(C3892vaa vaa) {
        return b(a("impression", vaa.e()).a(C4928GKa.c(vaa.i())).L(vaa.m()).B(vaa.j()).J(vaa.k().b()).I(vaa.l().a()));
    }

    /* access modifiers changed from: 0000 */
    public String a(Qaa qaa) {
        C2073HN I = a(qaa.n().a(), (J) qaa).d(qaa.h()).L(qaa.p()).I(qaa.o());
        if (qaa.q().c()) {
            I.V(((C3508cda) qaa.q().b()).toString());
        }
        if (qaa.j().c()) {
            I.k(((C3508cda) qaa.j().b()).toString());
        }
        if (qaa.k().c()) {
            I.p(((C3508cda) qaa.k().b()).toString());
        }
        if (qaa.i().c()) {
            I.j((String) qaa.i().b());
        }
        if (qaa.m().c()) {
            I.C(((C3508cda) qaa.m().b()).toString());
        }
        if (qaa.l().c()) {
            I.B(((b) qaa.l().b()).a());
        }
        if (qaa.r().c()) {
            I.g(((Integer) qaa.r().b()).intValue());
        }
        return b(I);
    }

    private String b(C2073HN hn) {
        try {
            return this.g.a(hn);
        } catch (Lea e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private C3508cda b() {
        return this.d.c();
    }

    /* access modifiers changed from: 0000 */
    public String a(A a2) {
        C2073HN a3 = a("audio_performance", a2.g());
        if (a2.a() != null) {
            a3.g(a2.a().a());
        }
        if (a2.b() != null) {
            a3.u(a2.b().a());
        }
        if (a2.e() != null) {
            a3.W(a2.e());
        }
        if (a2.d() != null) {
            a3.U(a2.d());
        }
        if (a2.f() != null) {
            a3.X(a2.f());
        }
        for (Entry entry : a2.c().entrySet()) {
            a3.a((String) entry.getKey(), entry.getValue());
        }
        return b(a3);
    }

    /* access modifiers changed from: 0000 */
    public String a(z zVar) {
        C2073HN v = a("audio_error", zVar.k()).K(this.b.j()).Q(zVar.e()).ia(zVar.c()).v(zVar.b());
        if (zVar.g() != null) {
            v.S(zVar.g());
        }
        if (zVar.f() != null) {
            v.R(zVar.f());
        }
        if (zVar.a() != null) {
            v.g(zVar.a().a());
        }
        if (zVar.d() != null) {
            v.u(zVar.d().a());
        }
        if (zVar.i() != null) {
            v.W(zVar.i());
        }
        if (zVar.h() != null) {
            v.U(zVar.h());
        }
        if (zVar.j() != null) {
            v.X(zVar.j());
        }
        return b(v);
    }

    /* access modifiers changed from: 0000 */
    public String a(C3713o oVar) {
        C2073HN aa = a("foreground", (J) oVar).L(oVar.h()).aa(oVar.j());
        if (oVar.i() != null) {
            aa.M(oVar.i().toString());
        }
        return b(aa);
    }

    /* access modifiers changed from: 0000 */
    public String a(C3440LZ lz) {
        C2073HN b2 = a(lz.k(), (J) lz).d(lz.i().toString()).I(lz.n().a()).L(lz.o()).a(lz.q()).s(lz.j()).ha(lz.B().a()).Q(lz.p()).b(lz.A());
        b2.a(lz.h().a());
        if (lz.s().c()) {
            b2.W((String) lz.s().b());
        }
        if (lz.m().c()) {
            b2.J(((C3508cda) lz.m().b()).toString());
        }
        if (lz.z().c()) {
            b2.Z(((C4298dd.a) lz.z().b()).a());
        }
        if (lz.w().c()) {
            b2.ea((String) lz.w().b());
        }
        if (lz.y().c()) {
            b2.ga((String) lz.y().b());
        }
        if (lz.l().c() && !((C3508cda) lz.l().b()).g()) {
            b2.b((C3508cda) lz.l().b());
            if (lz.r().c()) {
                b2.f(((Integer) lz.r().b()).intValue());
            }
        }
        if (lz.v().c()) {
            b2.d((C3508cda) lz.v().b());
        }
        if (lz.u().c()) {
            b2.Y(((C3508cda) lz.u().b()).toString());
        }
        if (lz.t().c()) {
            b2.g(((Integer) lz.t().b()).intValue());
        }
        if (lz.x().c()) {
            b2.fa(((C3508cda) lz.x().b()).toString());
        }
        return b(b2);
    }

    /* access modifiers changed from: 0000 */
    public String a(E e2) {
        try {
            C2073HN L = a("pageview", (J) e2).L(e2.k());
            if (e2.j() != null) {
                L.Y(e2.j().toString());
            }
            if (e2.h() != null) {
                L.M(e2.h().toString());
            }
            if (e2.i() != null) {
                L.N(e2.i());
            }
            if (e2.l() != null) {
                L.ea(e2.l());
            }
            return this.g.a(L);
        } catch (Lea e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    /* access modifiers changed from: 0000 */
    public String a(C3428HZ hz) {
        C2073HN z = a("rich_media_stream_error", (J) hz).F(hz.l()).v(hz.i()).z(hz.k());
        if (hz.h() != null) {
            z.a(hz.h().intValue());
        }
        if (hz.j() != null) {
            z.y(hz.j());
        }
        if (hz.n() != null) {
            z.W(hz.n());
        }
        if (hz.m() != null) {
            z.Q(hz.m());
        }
        return b(z);
    }

    /* access modifiers changed from: 0000 */
    public String a(Waa waa) {
        C2073HN a2 = a(waa.l().a(), (J) waa);
        if (waa.X().c()) {
            a2.L((String) waa.X().b());
        }
        if (waa.Y().c()) {
            a2.M((String) waa.Y().b());
        }
        if (waa.j().c()) {
            a2.j(((d) waa.j().b()).a());
        }
        if (waa.i().c()) {
            a2.i(((c) waa.i().b()).a());
        }
        if (waa.k().c()) {
            a2.k((String) waa.k().b());
        }
        if (waa.U().c()) {
            a2.B(((f) waa.U().b()).a());
        }
        if (waa.T().c()) {
            a2.A((String) waa.T().b());
        }
        if (waa.V().c()) {
            a2.C((String) waa.V().b());
        }
        return b(a2);
    }

    /* access modifiers changed from: 0000 */
    public String a(K k) {
        switch (C2111JN.a[k.Z().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                return b(b(k));
            case 37:
            case 38:
            case 39:
                return b(d(k));
            case 40:
                return b(c(k));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected UIEvent type: ");
                sb.append(k);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public String a(G g2) {
        return b(b(g2));
    }

    /* access modifiers changed from: 0000 */
    public String a(C3924zaa zaa) {
        C2073HN a2 = a(zaa.l().a(), (J) zaa);
        if (zaa.v().c()) {
            a2.L((String) zaa.v().b());
        }
        if (zaa.i().c()) {
            a2.i((String) zaa.i().b());
        }
        if (zaa.q().c()) {
            a2.A((String) zaa.q().b());
        }
        if (zaa.j().c()) {
            a2.j(((c) zaa.j().b()).a());
        }
        if (zaa.k().c()) {
            a2.k(((C3508cda) zaa.k().b()).toString());
        }
        if (zaa.r().c()) {
            a2.B(((c) zaa.r().b()).a());
        }
        if (zaa.h().c()) {
            a2.d((String) zaa.h().b());
        }
        if (zaa.t().c()) {
            a2.I(((C3676c.a) zaa.t().b()).a());
        }
        if (zaa.w().c()) {
            a2.V(((C3508cda) zaa.w().b()).toString());
        }
        return b(a2);
    }

    /* access modifiers changed from: 0000 */
    public String a(Aaa aaa) {
        return b(a("offline_sync", (J) aaa).w(aaa.i().a()).e(aaa.l()).f(aaa.k()).d(aaa.h()).e(aaa.j()));
    }

    /* access modifiers changed from: 0000 */
    public String a(C3860raa raa) {
        C2073HN L = a("click", (J) raa).j(raa.i().a()).L(raa.k());
        if (raa.l().c()) {
            L.m(((m) raa.l().b()).a());
        }
        if (raa.j().c()) {
            L.k((String) raa.j().b());
        }
        if (raa.h().c()) {
            L.i((String) raa.h().b());
        }
        if (raa.m().c()) {
            L.p(((d) raa.m().b()).a());
        }
        return b(L);
    }

    /* access modifiers changed from: 0000 */
    public String a(C3908xaa xaa) {
        C2073HN B = a("impression", xaa.e()).L(xaa.k()).A(xaa.i()).B(xaa.j());
        C4928GKa l = xaa.l();
        B.getClass();
        l.a((C7733yKa<? super T>) new C1933AN<Object>(B));
        return b(B);
    }

    /* access modifiers changed from: 0000 */
    public String a(Vaa vaa) {
        return b(a(vaa.j(), vaa.e()).L(vaa.m()).B(vaa.l()).M(vaa.n().b()));
    }

    private String a(HashMap<String, Object> hashMap) {
        try {
            return this.g.a(hashMap);
        } catch (Lea e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private C2073HN a(String str, J j) {
        return a(str, j.e());
    }

    private C2073HN a(String str, long j) {
        String str2 = str;
        C2073HN hn = new C2073HN(str2, "v1.27.23", this.a, a(), b(), j, this.c.b().a(), String.valueOf(this.b.b()), this.h);
        a(hn);
        return hn;
    }

    private void a(C2073HN hn) {
        this.f.a().a((C7733yKa<? super T>) new C3396zN<Object>(hn));
    }

    private String a() {
        return this.b.i();
    }

    private String a(I i) {
        return (i.u() ? K.j.MANUAL : K.j.AUTO).a();
    }

    private C2073HN a(C2073HN hn, a aVar) {
        hn.d(aVar.q());
        hn.I(aVar.r());
        if (aVar.t() != null) {
            hn.V(aVar.t().toString());
        }
        return hn;
    }

    private C2073HN a(C2073HN hn, I i, C3508cda cda) {
        if (i.o()) {
            hn.ea(i.j());
            hn.ga(i.k());
        }
        if (i.p() && !i.a().g()) {
            hn.b(i.a());
            hn.M(i.a().toString());
            hn.f(i.e());
        }
        if (i.t() && !i.a().g()) {
            hn.c(i.a());
            hn.f(i.e());
        }
        if (i.n()) {
            hn.d(i.h());
        }
        if (i.r()) {
            SearchQuerySourceInfo i2 = i.i();
            hn.Y(i2.e().toString());
            hn.g(C7248rIa.a(i2, cda));
        }
        if (i.s()) {
            hn.fa(i.a().toString());
            if (!i.l().a().equals(C3508cda.a)) {
                hn.Y(i.l().a().toString());
            }
        }
        if (i.m()) {
            B g2 = i.g();
            hn.Y(g2.b().toString());
            hn.g(g2.a());
        }
        return hn;
    }
}
