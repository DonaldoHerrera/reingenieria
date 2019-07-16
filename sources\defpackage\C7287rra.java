package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.collection.Da;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d.e.C0099e;
import com.soundcloud.android.foundation.events.C3702d.e.f;
import com.soundcloud.android.foundation.events.C3702d.e.h;
import com.soundcloud.android.foundation.events.C3702d.e.i;
import com.soundcloud.android.foundation.events.C3708j;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.likes.C3986j;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.playback.playqueue.C4403wa;
import com.soundcloud.android.settings.C5987t;

/* renamed from: rra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItemMenuPresenter */
public class C7287rra implements a {
    private final Context a;
    private final Fda b;
    private final C3983h c;
    private final C1997DR d;
    private final Lca e;
    private final F f;
    private final C2436_U g;
    private final C4197yd h;
    private final C4655rja i;
    private final C4403wa j;
    private final C3700b k;
    private final C7494ura l;
    private final C2526g m;
    private final C5425Wta n;
    private final C4088fe o;
    private VPa p = C4881Eua.b();
    private C4928GKa<C3710l> q;
    private C3508cda r;
    private C4928GKa<PromotedSourceInfo> s;
    private C3708j t;
    private C7425tra u;
    private boolean v;
    private C5512Zta w;

    public C7287rra(Context context, Fda fda, C3983h hVar, C1997DR dr, Lca lca, F f2, C2436_U _u, C4197yd ydVar, C4655rja rja, C4403wa waVar, C3700b bVar, C7494ura ura, C2526g gVar, C5425Wta wta, C4088fe feVar) {
        this.a = context;
        this.b = fda;
        this.c = hVar;
        this.d = dr;
        this.e = lca;
        this.f = f2;
        this.g = _u;
        this.h = ydVar;
        this.i = rja;
        this.j = waVar;
        this.k = bVar;
        this.l = ura;
        this.m = gVar;
        this.n = wta;
        this.o = feVar;
    }

    private C4928GKa<PromotedSourceInfo> d(C3863rda rda) {
        if (rda.n()) {
            return C4928GKa.c(PromotedSourceInfo.a(rda.a(), rda.t()));
        }
        return C4928GKa.a();
    }

    public void a(View view, C3863rda rda) {
        a(view, rda, null, C5512Zta.a.a());
    }

    public void b(Context context, C3863rda rda) {
        if (this.o.k()) {
            b(rda);
        } else {
            C5987t.a(d(context));
        }
    }

    public void c(Context context) {
        C5000Ipa.a(d(context), this.r);
    }

    public void onDismiss() {
        this.p.dispose();
        this.p = WPa.b();
        this.v = false;
    }

    private void c() {
        this.c.a(this.r, true).a(RPa.a()).a((C6368eQa) new C7419toa(this)).a((C7117pPa) new C3986j(this.a, true));
    }

    public void a(View view, C3508cda cda) {
        if (!this.v) {
            this.q = C4928GKa.a();
            this.u = this.l.a((a) this, view);
            this.r = cda;
            this.s = C4928GKa.a();
            this.t = C3708j.a();
            this.w = C5512Zta.a.a();
            b(cda);
            this.v = true;
        }
    }

    private void b(C3863rda rda) {
        if (rda.o() || c(rda)) {
            d();
        } else {
            c();
        }
        this.k.a((J) C3924zaa.a(this.f.a(), this.r, (PromotedSourceInfo) this.s.d()));
    }

    private static C0370l d(Context context) {
        return C6768kIa.a(context).getSupportFragmentManager();
    }

    /* access modifiers changed from: private */
    public void d() {
        this.h.b(this.r).a((C7117pPa) new C4943Gua());
    }

    private boolean c(C3863rda rda) {
        return this.m.b(rda.e());
    }

    private C3710l b() {
        C3710l lVar;
        if (this.q.c()) {
            lVar = (C3710l) this.q.b();
        } else {
            lVar = C3710l.a(this.f.b());
        }
        lVar.a(true);
        return lVar;
    }

    public void a(View view, C3863rda rda, C3710l lVar, C5512Zta zta) {
        if (!this.v) {
            this.q = C4928GKa.b(lVar);
            this.u = this.l.a((a) this, view);
            this.r = rda.a();
            this.s = d(rda);
            this.t = C5672bua.b(rda);
            this.w = zta;
            b(this.r);
            this.v = true;
        }
    }

    public void b(Context context) {
        this.i.a(C4621nja.a(C3920yea.OFFLINE));
        this.k.a((J) Waa.a(this.f.a(), this.r));
    }

    private void b(C3508cda cda) {
        this.p.dispose();
        C7531vPa a2 = Nda.a(this.b.a(cda, a.SYNC_MISSING)).a(RPa.a());
        C5190Oua a3 = C5190Oua.a(new C7488uoa(this));
        a2.c(a3);
        this.p = a3;
    }

    public void a(C3508cda cda) {
        this.i.a(C4621nja.c(cda));
    }

    public void a() {
        this.j.a(this.r);
        this.k.a((J) K.a(this.r, this.f.a(), b()));
    }

    public void a(Context context) {
        Da.a(d(context), this.r, (PromotedSourceInfo) this.s.d());
    }

    public void a(C3863rda rda) {
        boolean z = !rda.o();
        this.c.a(this.r, z).a(RPa.a()).a((C7117pPa) new C3986j(this.a, z));
        this.k.a(z ? C0099e.c : h.c);
        this.k.a((J) K.a(z, this.r, b(), (PromotedSourceInfo) this.s.d(), this.t, K.h.OTHER));
        if (a(z, rda)) {
            this.h.c(this.r).a((C7117pPa) new C4943Gua());
        }
    }

    public void a(boolean z) {
        this.d.a(this.r, z).a(RPa.a()).d((C6776kQa<? super T>) new C7557voa<Object>(this));
        this.k.a(z ? f.c : i.c);
        this.k.a((J) K.a(z, this.r, b(), (PromotedSourceInfo) this.s.d(), this.t));
    }

    public /* synthetic */ void a(C2037FR fr) throws Exception {
        Toast.makeText(this.a, fr.a(), 0).show();
    }

    public void a(Context context, C3863rda rda) {
        this.e.a(context, C5672bua.a(rda, b(), (PromotedSourceInfo) this.s.d()));
    }

    private boolean a(boolean z, C3863rda rda) {
        return this.g.l() && !z && !c(rda);
    }

    public /* synthetic */ void a(Eda eda) throws Exception {
        this.u.a(this.n.a(eda), this.w);
    }
}
