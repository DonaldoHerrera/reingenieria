package com.soundcloud.android.tracks;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.comments.Y;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d.e.k;
import com.soundcloud.android.foundation.events.C3702d.e.l;
import com.soundcloud.android.foundation.events.C3702d.e.n;
import com.soundcloud.android.foundation.events.C3702d.e.o;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.h;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.m;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.likes.C3986j;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.stations.Ga;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: com.soundcloud.android.tracks.na reason: case insensitive filesystem */
/* compiled from: TrackItemMenuPresenter */
public class C6188na implements b {
    private final a a;
    private final Ca b;
    private final Context c;
    private final C5327TLa d;
    private final C3983h e;
    private final C1997DR f;
    private final Lca g;
    private final C4909Fra h;
    private final F i;
    private final Ga j;
    private final C2526g k;
    private final C3814lca l;
    private final Db m;
    private final C3700b n;
    private final C4655rja o;
    private final C4425ta p;
    private final Na q;
    private C6185ma r;
    private PromotedSourceInfo s;
    private C3508cda t;
    private C3508cda u;
    private VPa v = WPa.a();
    private boolean w;
    private C3710l x;
    private C5512Zta y = C5512Zta.a.a();
    private WeakReference<C0370l> z;

    C6188na(a aVar, Ca ca, C5327TLa tLa, Context context, C3983h hVar, C1997DR dr, C4909Fra fra, F f2, Lca lca, Ga ga, C2526g gVar, C3814lca lca2, Db db, C3700b bVar, C4655rja rja, C4425ta taVar, Na na) {
        this.a = aVar;
        this.b = ca;
        this.d = tLa;
        this.c = context;
        this.e = hVar;
        this.f = dr;
        this.h = fra;
        this.i = f2;
        this.j = ga;
        this.g = lca;
        this.k = gVar;
        this.l = lca2;
        this.m = db;
        this.n = bVar;
        this.o = rja;
        this.p = taVar;
        this.q = na;
    }

    @SuppressLint({"CheckResult"})
    private void d() {
        this.d.a(C3876taa.d).a(Iaa.a).f().c((C6776kQa<? super T>) new C6157d<Object>(this, this.r.a()));
        this.d.c(C3876taa.f, Haa.a());
    }

    private void e() {
        C0370l lVar = (C0370l) this.z.get();
        if (lVar != null) {
            C4875Eoa.b.a(this.r.a(), this.r.B()).a(lVar);
        }
    }

    public void a(FragmentActivity fragmentActivity, View view, C6185ma maVar, C3710l lVar) {
        a(fragmentActivity, view, maVar, lVar, C5512Zta.a.a());
    }

    public void b(FragmentActivity fragmentActivity, View view, C6185ma maVar) {
        a(fragmentActivity, view, maVar, C3710l.a(this.i.b()));
    }

    public /* synthetic */ void c(C3508cda cda, Iaa iaa) throws Exception {
        this.j.a(cda, K.d(cda, this.x));
    }

    public void onDismiss() {
        this.v.dispose();
        this.v = WPa.b();
        this.r = null;
        this.w = false;
    }

    private void c() {
        boolean z2 = !this.r.p();
        this.f.a(this.r.a(), z2).a(RPa.a()).d((C6776kQa<? super T>) new C6163f<Object>(this));
        b(z2);
    }

    public void a(FragmentActivity fragmentActivity, View view, C6185ma maVar, C3710l lVar, C5512Zta zta) {
        if (maVar.n()) {
            C3508cda cda = C3508cda.a;
            a(fragmentActivity, view, maVar, cda, cda, PromotedSourceInfo.a(maVar.a(), maVar.t()), lVar, zta);
            return;
        }
        C3508cda cda2 = C3508cda.a;
        a(fragmentActivity, view, maVar, cda2, cda2, null, lVar, zta);
    }

    private void b(Ma ma, C4772BJa bJa) {
        bJa.b(i.share, ma.f());
    }

    @SuppressLint({"CheckResult"})
    private void b(C3508cda cda) {
        this.d.a(C3876taa.d).a(Iaa.a).f().c((C6776kQa<? super T>) new C6154c<Object>(this, cda));
        this.d.c(C3876taa.f, Haa.a());
    }

    public void a(FragmentActivity fragmentActivity, View view, C6185ma maVar, C3508cda cda, C3508cda cda2, PromotedSourceInfo promotedSourceInfo, C3710l lVar, C5512Zta zta) {
        if (!this.w) {
            lVar.a(true);
            this.z = new WeakReference<>(fragmentActivity.getSupportFragmentManager());
            this.r = maVar;
            this.s = promotedSourceInfo;
            this.t = cda;
            this.u = cda2;
            this.x = lVar;
            this.y = zta;
            this.w = true;
            a(fragmentActivity, view);
        }
    }

    private boolean c(C3508cda cda) {
        return cda != null && !cda.equals(C3508cda.a) && this.k.b(cda);
    }

    private void d(C3508cda cda) {
        String a2 = this.i.a();
        if (this.l.x()) {
            IPa b2 = this.m.b(Collections.singletonList(cda), 0, PlaySessionSource.a(a2));
            C4425ta taVar = this.p;
            taVar.getClass();
            b2.d((C6776kQa<? super T>) new C6148a<Object>(taVar));
        } else {
            this.l.b(cda);
        }
        this.n.a((J) K.a(cda, a2, this.x));
    }

    public /* synthetic */ void b(C3508cda cda, Iaa iaa) throws Exception {
        this.o.a(C4621nja.b(new Y(cda), this.x));
    }

    private void b(boolean z2) {
        this.n.a(z2 ? l.c : o.c);
        this.n.a((J) K.a(z2, this.r.a(), this.x, a(), C5672bua.b(this.r)));
    }

    private void a(View view) {
        Ma a2 = this.q.a(this.r);
        C4772BJa a3 = this.a.a(view.getContext(), view);
        a3.b(m.track_item_actions);
        a3.b((b) this);
        a3.a((b) this);
        a3.b(i.add_to_playlist, a2.b());
        a3.b(i.remove_from_playlist, c(this.u));
        a3.b(i.go_to_artist, this.y.a());
        a(a2, view.getContext(), a3);
        b(a2, a3);
        a(a2, a3);
        a(this.r, a3, view.getContext());
        a(a2, this.r, a3);
        a3.b();
    }

    private void b() {
        boolean z2 = !this.r.o();
        this.e.a(this.r.a(), z2).a(RPa.a()).a((C7117pPa) new C3986j(this.c, z2));
        a(z2);
    }

    private void a(Ma ma, Context context, C4772BJa bJa) {
        bJa.a(i.start_station).setTitle(context.getText(p.stations_open_station));
        bJa.a(i.start_station, ma.g() && C4739AHa.a(context));
    }

    private void a(Ma ma, C4772BJa bJa) {
        bJa.a(i.play_next, ma.d());
    }

    private void a(C6185ma maVar, C4772BJa bJa, Context context) {
        bJa.a(i.add_to_likes, (CharSequence) context.getString(maVar.o() ? p.btn_unlike : p.btn_like));
        bJa.a(i.add_to_likes, !maVar.m());
    }

    private void a(Ma ma, C6185ma maVar, C4772BJa bJa) {
        bJa.b(i.toggle_repost, ma.a());
        bJa.a(i.toggle_repost).setTitle(maVar.p() ? p.unpost : p.repost);
    }

    private void a(FragmentActivity fragmentActivity, View view) {
        this.v.dispose();
        C7531vPa a2 = this.b.c(this.r.a()).a((C7669xPa<? extends T>) C7531vPa.c(this.r)).a(RPa.a());
        C5190Oua a3 = C5190Oua.a(new C6166g(this, fragmentActivity, view));
        a2.c(a3);
        this.v = a3;
    }

    public /* synthetic */ void a(FragmentActivity fragmentActivity, View view, C6185ma maVar) throws Exception {
        this.r = maVar;
        if (!fragmentActivity.isFinishing()) {
            a(view);
        }
    }

    public boolean a(MenuItem menuItem, Context context) {
        if (!this.w) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == i.add_to_likes) {
            b();
            return true;
        } else if (itemId == i.share) {
            a(context);
            return true;
        } else if (itemId == i.toggle_repost) {
            c();
            return true;
        } else if (itemId == i.add_to_playlist) {
            e();
            return true;
        } else if (itemId == i.remove_from_playlist) {
            if (c(this.u)) {
                this.h.a(this.t, this.r.a()).a(RPa.a()).a((KPa<? super T>) new C5068Kua<Object>());
                return true;
            }
            throw new IllegalStateException("Cannot remove from someone else's playlist");
        } else if (itemId == i.start_station) {
            d();
            return true;
        } else if (itemId == i.play_next) {
            d(this.r.a());
            return true;
        } else if (itemId == i.go_to_artist) {
            a(this.r.e());
            return true;
        } else if (itemId != i.go_to_comments) {
            return false;
        } else {
            b(this.r.a());
            return true;
        }
    }

    @SuppressLint({"CheckResult"})
    private void a(C3508cda cda) {
        this.d.a(C3876taa.d).a(Iaa.a).f().c((C6776kQa<? super T>) new C6160e<Object>(this, cda));
        this.d.c(C3876taa.f, Haa.a());
    }

    public /* synthetic */ void a(C3508cda cda, Iaa iaa) throws Exception {
        this.o.a(C4621nja.c(cda));
    }

    private void a(Context context) {
        this.g.a(context, C5672bua.a(this.r, this.x, a()));
    }

    private void a(boolean z2) {
        this.n.a(z2 ? k.c : n.c);
        this.n.a((J) K.a(z2, this.r.a(), this.x, a(), C5672bua.b(this.r), h.OTHER));
    }

    public /* synthetic */ void a(C2037FR fr) throws Exception {
        Toast.makeText(this.c, fr.a(), 0).show();
    }

    private PromotedSourceInfo a() {
        return this.s;
    }
}
