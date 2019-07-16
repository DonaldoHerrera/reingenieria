package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.Function;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.comments.Y;
import com.soundcloud.android.deeplinks.b;
import com.soundcloud.android.deeplinks.c;
import com.soundcloud.android.deeplinks.e;
import com.soundcloud.android.deeplinks.k;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.b.a;
import com.soundcloud.android.foundation.events.C3713o;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.playqueue.m;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.onboarding.auth.ia;
import com.soundcloud.android.payments.Fa;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.stations.lc;
import java.util.Collections;

/* renamed from: gia reason: default package and case insensitive filesystem */
/* compiled from: RealNavigationResolver */
public class C4564gia implements C4597kja {
    private final Context a;
    private final Bja b;
    private final C2526g c;
    private final Db d;
    private final C3814lca e;
    private final C2436_U f;
    private final c g;
    private final ia h;
    private final C4565gja i;
    private final lc j;
    private final j k;
    private final C3700b l;
    private final C4088fe m;
    private final Ica n;
    private final HPa o;
    private final C3137mV p;

    C4564gia(Context context, Bja bja, C4565gja gja, C2526g gVar, Db db, C3814lca lca, C2436_U _u, c cVar, ia iaVar, lc lcVar, j jVar, C3700b bVar, C4088fe feVar, Ica ica, C3137mV mVVar, HPa hPa) {
        this.a = context;
        this.b = bja;
        this.c = gVar;
        this.d = db;
        this.e = lca;
        this.f = _u;
        this.g = cVar;
        this.h = iaVar;
        this.i = gja;
        this.j = lcVar;
        this.k = jVar;
        this.l = bVar;
        this.m = feVar;
        this.n = ica;
        this.p = mVVar;
        this.o = hPa;
    }

    private IPa<C4605lja> A(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.b(this.a, (C3508cda) nja.M().b()))).c((C6776kQa<? super T>) new Kha<Object>(this, nja));
    }

    private IPa<C4605lja> B(C4621nja nja) {
        if (!this.f.s()) {
            return E(nja);
        }
        return IPa.a(C4605lja.a(nja, Yha.a(this.a, C3920yea.GENERAL), Collections.singletonList(C4557fja.j(this.a)))).c((C6776kQa<? super T>) new Uga<Object>(this, nja));
    }

    private IPa<C4605lja> F(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.o(this.a))).c((C6776kQa<? super T>) new C4698wha<Object>(this, nja));
    }

    private IPa<C4605lja> G(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, new Intent((String) nja.d().b())));
    }

    private IPa<C4605lja> H(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.p(this.a))).c((C6776kQa<? super T>) new Iha<Object>(this, nja));
    }

    private IPa<C4605lja> O(C4621nja nja) {
        return P(nja).c((C6776kQa<? super T>) new Bha<Object>(this, nja));
    }

    private IPa<C4605lja> Q(C4621nja nja) {
        return e(nja, (C3508cda) nja.M().b());
    }

    private IPa<C4605lja> R(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.w(this.a))).c((C6776kQa<? super T>) new C4619nha<Object>(this, nja));
    }

    private IPa<C4605lja> U(C4621nja nja) {
        return f(nja, (C3508cda) nja.M().b());
    }

    private IPa<C4605lja> V(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, (C3508cda) nja.M().b(), nja.I(), nja.J()))).c((C6776kQa<? super T>) new C4587jha<Object>(this, nja));
    }

    private IPa<C4605lja> W(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.b(this.a, (C3508cda) nja.M().b(), nja.I(), nja.J()))).c((C6776kQa<? super T>) new Pha<Object>(this, nja));
    }

    private IPa<C4605lja> X(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.c(this.a, (C3508cda) nja.M().b(), nja.I(), nja.J()))).c((C6776kQa<? super T>) new Lha<Object>(this, nja));
    }

    private IPa<C4605lja> Y(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.d(this.a, (C3508cda) nja.M().b(), nja.I(), nja.J()))).c((C6776kQa<? super T>) new Lga<Object>(this, nja));
    }

    private IPa<C4605lja> Z(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.e(this.a, (C3508cda) nja.M().b(), nja.I(), nja.J()))).c((C6776kQa<? super T>) new C4715yga<Object>(this, nja));
    }

    private IPa<C4605lja> aa(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.f(this.a, (C3508cda) nja.M().b(), nja.I(), nja.J()))).c((C6776kQa<? super T>) new Hha<Object>(this, nja));
    }

    private IPa<C4605lja> d(C4621nja nja) {
        Context context = this.a;
        Y y = new Y((C3508cda) nja.M().b(), ((Long) nja.N().b()).longValue(), (String) nja.K().d(), ((Boolean) nja.x().b()).booleanValue());
        return IPa.a(C4605lja.a(nja, C4557fja.a(context, y))).c((C6776kQa<? super T>) new C4603lha<Object>(this, nja));
    }

    private IPa<C4605lja> da(C4621nja nja) {
        Intent intent = new Intent((String) nja.d().b());
        intent.putExtra("force_clear_stack", true);
        return IPa.a(C4605lja.a(nja, intent));
    }

    private IPa<C4605lja> ea(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, ((c) nja.z().b()).c(), nja.I()))).c((C6776kQa<? super T>) new Gga<Object>(this, nja));
    }

    private IPa<C4605lja> fa(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.A(this.a))).c((C6776kQa<? super T>) new Eha<Object>(this, nja));
    }

    private IPa<C4605lja> ga(C4621nja nja) throws k {
        C4928GKa L = nja.L();
        if (L.c()) {
            return a(nja, (C3508cda) nja.M().b(), ((f) L.b()).a());
        }
        C4928GKa a2 = this.j.a(((c) nja.z().b()).c());
        if (a2.c()) {
            return a(nja, (C3508cda) a2.b(), C4928GKa.a());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Station ");
        sb.append(((c) nja.z().b()).b());
        sb.append(" could not be resolved locally");
        throw new k(sb.toString());
    }

    private IPa<C4605lja> ha(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.b(nja.I()))).c((C6776kQa<? super T>) new C4555fha<Object>(this, nja));
    }

    private IPa<C4605lja> i(C4621nja nja) {
        String b2 = ((c) nja.z().b()).b();
        if (b2 != null) {
            return this.b.f(b2).a(this.o).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Tga<Object,Object>(this, nja));
        }
        throw new IllegalStateException("Covered by #resolve");
    }

    private IPa<C4605lja> ia(C4621nja nja) {
        if (this.f.d() || this.f.t()) {
            return IPa.a(C4605lja.a(nja, C4557fja.B(this.a))).c((C6776kQa<? super T>) new Fga<Object>(this, nja));
        }
        return E(nja);
    }

    private IPa<C4605lja> ja(C4621nja nja) {
        return g(nja, (C3508cda) nja.M().b());
    }

    private IPa<C4605lja> ka(C4621nja nja) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        StringBuilder sb = new StringBuilder();
        sb.append("package:");
        sb.append(this.a.getPackageName());
        intent.setData(Uri.parse(sb.toString()));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        return IPa.a(C4605lja.a(nja, intent));
    }

    private IPa<C4605lja> l(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a))).c((C6776kQa<? super T>) new C4679uga<Object>(this, nja));
    }

    private IPa<C4605lja> la(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, Yha.a(this.a, (C3920yea) nja.Q().b())));
    }

    private IPa<C4605lja> m(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(Uri.parse((String) nja.d().b())))).c((C6776kQa<? super T>) new Rha<Object>(this, nja));
    }

    private IPa<C4605lja> ma(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, Yha.a(this.a, (Bundle) nja.y().b()))).c((C6776kQa<? super T>) new Jha<Object>(this, nja));
    }

    private IPa<C4605lja> n(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.b(this.a))).c((C6776kQa<? super T>) new C4644qha<Object>(this, nja));
    }

    private IPa<C4605lja> na(C4621nja nja) {
        ra(nja);
        String b2 = ((c) nja.z().b()).b();
        if (b2 != null) {
            Uri parse = Uri.parse(b2);
            String str = (String) C4928GKa.b(parse.getAuthority()).d(parse.getPath());
            if (C7315sGa.a((CharSequence) str)) {
                return IPa.a(C4605lja.a(nja, C4557fja.a(str)));
            }
            return IPa.a(C4605lja.a(nja, C4557fja.b(((c) nja.z().b()).c())));
        }
        throw new IllegalArgumentException("Covered by #resolve");
    }

    private IPa<C4605lja> oa(C4621nja nja) {
        return this.n.b().e(new C4697wga(this, nja)).c((C6776kQa<? super T>) new Wga<Object>(this, nja));
    }

    private IPa<C4605lja> pa(C4621nja nja) {
        Uri uri;
        if (nja.z().c()) {
            uri = ((c) nja.z().b()).c();
        } else {
            uri = Uri.parse((String) nja.d().b());
        }
        if (Eja.b(this.a)) {
            return IPa.a(C4605lja.a(nja, Eja.a(this.a, uri))).c((C6776kQa<? super T>) new Sha<Object>(this, nja));
        }
        return a(nja, uri);
    }

    private IPa<C4605lja> q(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.d(this.a))).c((C6776kQa<? super T>) new Vga<Object>(this, nja));
    }

    private IPa<C4605lja> qa(C4621nja nja) {
        Uri uri;
        if (e.e(((c) nja.z().b()).c())) {
            uri = this.h.a(((c) nja.z().b()).c().getPath());
        } else {
            uri = this.h.a();
        }
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, uri))).c((C6776kQa<? super T>) new Sga<Object>(this, nja));
    }

    private void ra(C4621nja nja) {
        nja.H().a((C7733yKa<? super T>) new C4611mha<Object>(this, nja));
    }

    private IPa<C4605lja> t(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.f(this.a))).c((C6776kQa<? super T>) new Gha<Object>(this, nja));
    }

    private IPa<C4605lja> u(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(nja.I()))).c((C6776kQa<? super T>) new Bga<Object>(this, nja));
    }

    private IPa<C4605lja> x(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, (String) nja.d().b()))).c((C6776kQa<? super T>) new Rga<Object>(this, nja));
    }

    private IPa<C4605lja> y(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, (C3508cda) nja.M().b(), nja.J()))).c((C6776kQa<? super T>) new Aha<Object>(this, nja));
    }

    private IPa<C4605lja> z(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.b(this.a, (C3508cda) nja.M().b(), nja.J()))).c((C6776kQa<? super T>) new Cha<Object>(this, nja));
    }

    public /* synthetic */ void C(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void D(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
        b(nja.P());
    }

    public /* synthetic */ void E(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void I(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
        b(nja.P());
    }

    public /* synthetic */ void J(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void K(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void L(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void M(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void N(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void P(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void S(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void T(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
        b(nja.P());
    }

    public IPa<C4605lja> a(C4621nja nja) {
        if (!nja.z().c() || C5206PKa.c(((c) nja.z().b()).b())) {
            try {
                if (nja.c().c()) {
                    return a(nja, (e) nja.c().b());
                }
                return E(nja);
            } catch (k e2) {
                return a(e2, E(nja));
            }
        } else {
            Uri a2 = C5497ZHa.a(Uri.parse(((c) nja.z().b()).b()));
            C4621nja f2 = nja.f(a2.toString());
            try {
                if (this.i.a(((c) f2.z().b()).b())) {
                    return a(nja, f2);
                }
                if (this.i.b(((c) f2.z().b()).b())) {
                    return a(a2, f2);
                }
                return i(nja);
            } catch (k e3) {
                return a(e3, i(nja));
            }
        }
    }

    public /* synthetic */ void ba(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void c(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
        b(nja.P());
    }

    public /* synthetic */ void ca(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void e(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void f(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void g(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void h(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void j(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void k(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void o(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void p(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void r(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void s(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja.d(Yca.CONVERSION));
    }

    public /* synthetic */ void v(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void w(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    private IPa<C4605lja> C(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.i(this.a))).c((C6776kQa<? super T>) new C4689vha<Object>(this, nja));
    }

    private IPa<C4605lja> E(C4621nja nja) {
        return u(nja);
    }

    private IPa<C4605lja> J(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.D(this.a))).c((C6776kQa<? super T>) new C4571hha<Object>(this, nja));
    }

    private IPa<C4605lja> K(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.E(this.a))).c((C6776kQa<? super T>) new C4671tha<Object>(this, nja));
    }

    private IPa<C4605lja> L(C4621nja nja) {
        if (this.f.q().b()) {
            return E(nja).e(new Kga(this));
        }
        if (this.f.h()) {
            return IPa.a(C4605lja.a(nja, Yha.a(this.a, C2455aV.MID_TIER))).c((C6776kQa<? super T>) new Dga<Object>(this, nja));
        }
        return E(nja);
    }

    private IPa<C4605lja> M(C4621nja nja) {
        return IPa.a((LPa<T>) new Yga<T>(this, nja)).c((C6776kQa<? super T>) new Ega<Object>(this, nja));
    }

    private IPa<C4605lja> N(C4621nja nja) {
        if (this.f.l()) {
            return IPa.a((LPa<T>) new Fha<T>(this, nja));
        }
        return E(nja);
    }

    private IPa<C4605lja> P(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, nja.I(), Uri.parse(((c) nja.z().b()).b())))).e(new Qga(this));
    }

    private IPa<C4605lja> S(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.x(this.a))).c((C6776kQa<? super T>) new Zga<Object>(this, nja));
    }

    private IPa<C4605lja> b(C4621nja nja, Dja dja) {
        C4928GKa b2 = dja.c().b((Function<? super T, V>) Vha.a);
        C4621nja a2 = nja.a(((c) nja.z().b()).a().a(b2));
        if (k(a2)) {
            Exception exc = (Exception) dja.a().d(new k("Resolve with fallback"));
            StringBuilder sb = new StringBuilder();
            sb.append("Resolve uri ");
            sb.append(((c) nja.z().b()).b());
            sb.append(" with fallback ");
            sb.append((String) ((c) a2.z().b()).a().d());
            C7316sHa.a(sb.toString(), (Throwable) exc);
            return a(a2.f((String) ((c) a2.z().b()).a().b()).a(C4928GKa.a())).e(new Hga(this));
        }
        ra(a2);
        C4928GKa a3 = dja.a();
        if (a3.c() && !C7316sHa.h((Throwable) a3.b())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unable to load deeplink:");
            sb2.append(b2);
            C7316sHa.a(sb2.toString(), (Throwable) a3.b());
            g(a2);
        }
        return a(a2, p.error_unknown_navigation);
    }

    private IPa<C4605lja> ba(C4621nja nja) {
        return IPa.a((LPa<T>) new C4724zga<T>(this, nja)).c((C6776kQa<? super T>) new C4662sha<Object>(this, nja));
    }

    private IPa<C4605lja> ca(C4621nja nja) {
        return IPa.a(C4557fja.z(this.a)).e(new C3946aha(nja)).c((C6776kQa<? super T>) new C4595kha<Object>(this, nja));
    }

    private IPa<C4605lja> e(C4621nja nja, C3508cda cda) {
        return IPa.a(C4605lja.a(nja, Yha.a(this.a, cda, false, nja.I(), nja.J(), nja.E()))).c((C6776kQa<? super T>) new C4680uha<Object>(this, nja));
    }

    private IPa<C4605lja> f(C4621nja nja) {
        Context context = this.a;
        Y y = new Y((C3508cda) nja.M().b(), ((Long) nja.N().b()).longValue(), (String) nja.K().d(), false);
        return IPa.a(C4605lja.a(nja, C4557fja.b(context, y))).c((C6776kQa<? super T>) new Iga<Object>(this, nja));
    }

    private IPa<C4605lja> g(C4621nja nja, C3508cda cda) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, cda, nja.I()))).c((C6776kQa<? super T>) new Mha<Object>(this, nja));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public IPa<C4605lja> a(C4621nja nja, C3508cda cda) {
        if (a(nja.H())) {
            a();
        }
        return this.n.a().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3962cha<Object,Object>(this, nja, cda)).c((C6776kQa<? super T>) new Cga<Object>(this, nja, cda));
    }

    private IPa<C4605lja> j(C4621nja nja) {
        Uri parse = Uri.parse(((c) nja.z().b()).b());
        String queryParameter = parse.getQueryParameter("title");
        String queryParameter2 = parse.getQueryParameter("text");
        String queryParameter3 = parse.getQueryParameter("path");
        if (queryParameter.isEmpty() || queryParameter2.isEmpty() || queryParameter3.isEmpty()) {
            return E(nja);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(queryParameter2);
        sb.append(" ");
        sb.append(queryParameter3);
        String sb2 = sb.toString();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TITLE", queryParameter);
        intent.putExtra("android.intent.extra.SUBJECT", queryParameter);
        intent.putExtra("android.intent.extra.TEXT", sb2);
        intent.setType("message/rfc822");
        return IPa.a(C4605lja.a(nja, Intent.createChooser(intent, queryParameter)));
    }

    private boolean k(C4621nja nja) {
        return nja.z().c() && ((c) nja.z().b()).a().c() && !((String) ((c) nja.z().b()).a().b()).equals(((c) nja.z().b()).b());
    }

    private IPa<C4605lja> o(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.c(this.a))).c((C6776kQa<? super T>) new C4627oha<Object>(this, nja));
    }

    private IPa<C4605lja> p(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, (C3508cda) nja.M().b())));
    }

    private IPa<C4605lja> r(C4621nja nja) throws k {
        b bVar;
        C4928GKa a2 = nja.a();
        if (a2.c()) {
            bVar = (b) ((b) a2.b()).b().b();
        } else {
            bVar = this.g.a(((c) nja.z().b()).c());
        }
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, bVar))).c((C6776kQa<? super T>) new C4635pha<Object>(this, nja));
    }

    private IPa<C4605lja> s(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.b())).c((C6776kQa<? super T>) new Nha<Object>(this, nja));
    }

    private IPa<C4605lja> v(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.g(this.a))).c((C6776kQa<? super T>) new C4688vga<Object>(this, nja));
    }

    private IPa<C4605lja> w(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.h(this.a))).c((C6776kQa<? super T>) new Aga<Object>(this, nja));
    }

    public /* synthetic */ void Q(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void U(C4621nja nja, C4605lja lja) throws Exception {
        this.c.a();
        ra(nja);
    }

    private IPa<C4605lja> D(C4621nja nja) {
        if (C2455aV.HIGH_TIER == this.f.q()) {
            return E(nja).e(new Pga(this));
        }
        if (this.f.s()) {
            return IPa.a(C4605lja.a(nja, Yha.a(this.a, C2455aV.HIGH_TIER))).c((C6776kQa<? super T>) new C4716yha<Object>(this, nja));
        }
        return E(nja);
    }

    private IPa<C4605lja> I(C4621nja nja) {
        return IPa.a(C4557fja.q(this.a)).e(new Xga(nja)).c((C6776kQa<? super T>) new C4539dha<Object>(this, nja));
    }

    private IPa<C4605lja> T(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, Yha.b(this.a, (Bundle) nja.y().b()))).c((C6776kQa<? super T>) new Jga<Object>(this, nja));
    }

    private String c(C4621nja nja) {
        return Uri.parse(((c) nja.z().b()).b()).getLastPathSegment();
    }

    public /* synthetic */ void A(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja.d(Yca.CHECKOUT));
    }

    public /* synthetic */ void F(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void G(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja.d(Yca.CONVERSION));
    }

    public /* synthetic */ void H(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja.d(Yca.CONVERSION));
    }

    public /* synthetic */ void O(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void R(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void l(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void m(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void n(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void q(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void t(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void u(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja.d(Yca.CHECKOUT));
    }

    public /* synthetic */ void x(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    private void g(C4621nja nja) {
        nja.H().a((C7733yKa<? super T>) new C4579iha<Object>(this));
    }

    public /* synthetic */ void z(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void y(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    private void h(C4621nja nja) {
        nja.H().a((C7733yKa<? super T>) new _ga<Object>(this));
    }

    public /* synthetic */ void c(C4621nja nja, JPa jPa) throws Exception {
        if (a(this.a)) {
            jPa.onSuccess(C4605lja.a(nja, C4557fja.a(this.a, nja.G(), nja.I())));
        } else {
            jPa.onSuccess(C4605lja.a(nja, C4557fja.b(this.a, nja.G(), nja.I())));
        }
    }

    public /* synthetic */ void i(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    private IPa<C4605lja> i(C4621nja nja, C3508cda cda) {
        return c(nja, cda).a(this.o).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Tha<Object,Object>(this, nja));
    }

    public /* synthetic */ void B(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void W(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    private IPa<C4605lja> e(C4621nja nja) {
        if (!this.p.a(this.a)) {
            return x(C4621nja.b("com.soundcloud.creators"));
        }
        return IPa.a(C4605lja.a(nja, this.p.a(((c) nja.z().b()).c())));
    }

    public /* synthetic */ void V(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void X(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void Y(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja.d(Yca.CHECKOUT));
    }

    public /* synthetic */ void Z(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    public /* synthetic */ void aa(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    private IPa<C4605lja> f(C4621nja nja, C3508cda cda) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, cda, C4928GKa.c(nja.I()), nja.J(), nja.H().b((Function<? super T, V>) C4670tga.a)))).c((C6776kQa<? super T>) new C4547eha<Object>(this, nja));
    }

    public /* synthetic */ C4605lja c(C4605lja lja) throws Exception {
        return lja.a(this.a.getString(Fa.p.product_choice_error_already_subscribed));
    }

    public /* synthetic */ void d(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    private IPa<C4536zc> c(C4621nja nja, C3508cda cda) {
        if (nja.z().c()) {
            C4541dja dja = new C4541dja(((c) nja.z().b()).b());
            if (dja.c) {
                try {
                    return this.d.a(cda, nja.I(), dja.a());
                } catch (Exception e2) {
                    C7316sHa.a("Could not parse deeplink time", (Throwable) e2);
                }
            }
        }
        return this.d.a(cda, nja.I());
    }

    public /* synthetic */ C4605lja d(C4605lja lja) throws Exception {
        return lja.a(this.a.getString(Fa.p.product_choice_error_already_subscribed));
    }

    private IPa<C4605lja> d(C4621nja nja, C3508cda cda) {
        if (cda.x()) {
            return i(nja, cda);
        }
        if (cda.J()) {
            return f(nja, cda);
        }
        if (cda.u()) {
            return e(nja, cda);
        }
        if (cda.w()) {
            return g(nja, cda);
        }
        if (cda.f() || cda.y()) {
            return a(nja, cda, C4928GKa.a());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to navigate to unsupported urn: ");
        sb.append(cda);
        sb.append(" in version: ");
        sb.append(-1);
        C7316sHa.d(new IllegalArgumentException(sb.toString()));
        return IPa.f();
    }

    public /* synthetic */ C4605lja e(C4605lja lja) throws Exception {
        return lja.a(this.a.getString(p.error_toast_user_not_logged_in));
    }

    private IPa<C4605lja> a(k kVar, IPa<C4605lja> iPa) {
        if (this.k.i()) {
            return iPa.e(C4707xha.a);
        }
        C7316sHa.a("Local resolve failed", (Throwable) kVar);
        return iPa;
    }

    private void j(C4621nja nja, C3508cda cda) {
        nja.H().a((C7733yKa<? super T>) new C4725zha<Object>(this, nja, cda));
    }

    public /* synthetic */ C4605lja f(C4605lja lja) throws Exception {
        return lja.a(this.a.getString(Fa.p.product_choice_error_already_subscribed));
    }

    private IPa<C4605lja> a(Uri uri, C4621nja nja) {
        e b2 = e.b(uri);
        return a(b2, nja.H()).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Dha<Object,Object>(this, nja, b2));
    }

    public /* synthetic */ MPa a(C4621nja nja, e eVar, Boolean bool) throws Exception {
        return bool.booleanValue() ? O(nja) : a(nja, eVar);
    }

    private IPa<C4605lja> a(C4621nja nja, C4621nja nja2) throws k {
        return this.i.e(((c) nja2.z().b()).b()).a(this.o).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4653rha<Object,Object>(this, nja));
    }

    public /* synthetic */ void b(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
        b(nja.P());
    }

    private IPa<C4605lja> b(C4621nja nja) {
        return IPa.a(C4605lja.a(nja, C4557fja.e(this.a))).c((C6776kQa<? super T>) new Qha<Object>(this, nja));
    }

    /* access modifiers changed from: private */
    public IPa<C4605lja> a(Dja dja, C4621nja nja) {
        if (!dja.b() || !this.i.a((C3508cda) dja.d().b())) {
            return b(nja, dja);
        }
        return a(nja, (C3508cda) dja.d().b());
    }

    private IPa<C4605lja> b(C4621nja nja, String str) {
        return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, str, nja.I()))).c((C6776kQa<? super T>) new Nga<Object>(this, nja));
    }

    public /* synthetic */ C4605lja a(C4605lja lja) throws Exception {
        return this.k.i() ? lja.a("Retry resolve with fallback") : lja;
    }

    public /* synthetic */ C4605lja b(C4621nja nja, C3508cda cda) throws Exception {
        return C4605lja.a(nja, C4557fja.c(this.a, cda));
    }

    private IPa<C4605lja> a(C4621nja nja, e eVar) throws k {
        switch (C4556fia.a[eVar.ordinal()]) {
            case 1:
                return E(nja);
            case 2:
                return ha(nja);
            case 3:
                return ba(nja);
            case 4:
                return u(nja);
            case 5:
                return r(nja);
            case 6:
                return I(nja);
            case 7:
                return K(nja);
            case 8:
                return ga(nja);
            case 9:
                return ea(nja);
            case 10:
                return ca(nja);
            case 11:
                return da(nja);
            case 12:
                return G(nja);
            case 13:
                return pa(nja);
            case 14:
                return e(nja);
            case 15:
                return i(nja);
            case 16:
                return B(nja);
            case 17:
                return L(nja);
            case 18:
                return D(nja);
            case 19:
                return a(nja, C2455aV.MID_TIER);
            case 20:
                return a(nja, C2455aV.HIGH_TIER);
            case 21:
                return ma(nja);
            case 22:
                return T(nja);
            case 23:
                return N(nja);
            case 24:
                return ia(nja);
            case 25:
                return M(nja);
            case 26:
                return s(nja);
            case 27:
                return j(nja);
            case 28:
                return ka(nja);
            case 29:
                return qa(nja);
            case 30:
                return oa(nja);
            case 31:
                return na(nja);
            case 32:
                return l(nja);
            case 33:
                return y(nja);
            case 34:
                return z(nja);
            case 35:
                return A(nja);
            case 36:
                return S(nja);
            case 37:
                return m(nja);
            case 38:
                return d(nja);
            case 39:
                return b(nja);
            case 40:
                return f(nja);
            case 41:
                return U(nja);
            case 42:
                return Y(nja);
            case 43:
                return aa(nja);
            case 44:
                return W(nja);
            case 45:
                return V(nja);
            case 46:
                return X(nja);
            case 47:
                return Z(nja);
            case 48:
                return ja(nja);
            case 49:
                return b(nja, c(nja));
            case 50:
                return J(nja);
            case 51:
                return v(nja);
            case 52:
                return R(nja);
            case 53:
                return p(nja);
            case 54:
                return Q(nja);
            case 55:
                return C(nja);
            case 56:
                return F(nja);
            case 57:
                return q(nja);
            case 58:
                return x(nja);
            case 59:
                return la(nja);
            case 60:
                return fa(nja);
            case 61:
                return H(nja);
            case 62:
                return o(nja);
            case 63:
                return n(nja);
            case 64:
                return t(nja);
            case 65:
                return w(nja);
            default:
                return i(nja);
        }
    }

    public /* synthetic */ void b(C4621nja nja, JPa jPa) throws Exception {
        if (!nja.D().c() || !((e) nja.D().b()).a() || this.m.h()) {
            ra(nja.d(Yca.SETTINGS_OFFLINE));
            jPa.onSuccess(C4605lja.a(nja, C4557fja.t(this.a)));
            return;
        }
        ra(nja.d(Yca.SETTINGS_AUTOMATIC_SYNC_ONBOARDING));
        jPa.onSuccess(C4605lja.a(nja, C4557fja.u(this.a)));
    }

    public /* synthetic */ void b(String str) {
        this.l.a((C3702d) new a(str, true));
    }

    private void b(C4928GKa<K> gKa) {
        C3700b bVar = this.l;
        bVar.getClass();
        gKa.a((C7733yKa<? super T>) new Uha<Object>(bVar));
    }

    public /* synthetic */ void a(C4621nja nja, C4605lja lja) throws Exception {
        ra(nja);
    }

    private IPa<C4605lja> a(C4621nja nja, Uri uri) {
        return IPa.a(C4605lja.a(nja, C4557fja.c(this.a, uri))).c((C6776kQa<? super T>) new C3954bha<Object>(this, nja));
    }

    private IPa<C4605lja> a(C4621nja nja, C3508cda cda, C4928GKa<C3508cda> gKa) {
        return IPa.a(C4557fja.a(this.a, cda, gKa, nja.e().a(C4928GKa.c(m.DEEPLINK)))).e(new C4706xga(nja)).c((C6776kQa<? super T>) new Oga<Object>(this, nja));
    }

    private boolean a(Context context) {
        return androidx.core.content.a.a(context, "android.permission.RECORD_AUDIO") == 0;
    }

    private IPa<C4605lja> a(C4621nja nja, C2455aV aVVar) {
        if (this.f.q().b()) {
            return E(nja).e(new Mga(this));
        }
        if (this.f.h()) {
            return IPa.a(C4605lja.a(nja, Yha.b(this.a, aVVar), Collections.singletonList(C4557fja.j(this.a)))).c((C6776kQa<? super T>) new C4563gha<Object>(this, nja));
        }
        return B(nja);
    }

    public /* synthetic */ void a(C4621nja nja, JPa jPa) throws Exception {
        if (!nja.C().c() || !((d) nja.C().b()).a()) {
            jPa.onSuccess(C4605lja.a(nja, C4557fja.r(this.a)));
        } else {
            jPa.onSuccess(C4605lja.a(nja, C4557fja.s(this.a)));
        }
    }

    public /* synthetic */ MPa a(C4621nja nja, C3508cda cda, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return d(nja, cda);
        }
        return P(nja);
    }

    public /* synthetic */ void a(C4621nja nja, C3508cda cda, C4605lja lja) throws Exception {
        j(nja, cda);
        h(nja);
    }

    public /* synthetic */ MPa a(C4621nja nja, C4536zc zcVar) throws Exception {
        if (nja.I() != Yca.DEEPLINK) {
            return IPa.a(C4605lja.a(nja, zcVar));
        }
        if (zcVar.b()) {
            return IPa.a(C4605lja.a(nja, C4557fja.a(this.a, nja.I())));
        }
        return a(nja, p.error_loading_url);
    }

    private IPa<C4605lja> a(C4621nja nja, int i2) {
        if (nja.I() == Yca.DEEPLINK) {
            return IPa.a(C4605lja.a(nja, C4557fja.n(this.a)).a(this.a.getString(i2)));
        }
        return IPa.a(C4605lja.a(nja));
    }

    private boolean a(C4928GKa<String> gKa) {
        return C3235rM.GOOGLE_CRAWLER.a().equals(gKa.d());
    }

    private void a() {
        this.c.j();
        this.e.d();
    }

    private IPa<Boolean> a(e eVar, C4928GKa<String> gKa) {
        boolean a2 = eVar.a();
        Boolean valueOf = Boolean.valueOf(false);
        if (!a2 || eVar.b()) {
            return IPa.a(valueOf);
        }
        if (!a(gKa)) {
            return this.n.a().e(Oha.a);
        }
        a();
        return IPa.a(valueOf);
    }

    public /* synthetic */ void a(C4621nja nja, C3508cda cda, String str) {
        a(C3713o.a(nja.I(), str, cda));
    }

    public /* synthetic */ void a(C4621nja nja, String str) {
        a(C3713o.a(nja.I(), str));
    }

    public /* synthetic */ void a(String str) {
        this.l.a((C3702d) new a(str, false));
    }

    private void a(C3713o oVar) {
        this.l.a((J) oVar);
    }
}
