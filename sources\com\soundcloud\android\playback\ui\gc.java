package com.soundcloud.android.playback.ui;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.FragmentActivity;
import com.google.common.base.Function;
import com.soundcloud.android.comments.Y;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d.e;
import com.soundcloud.android.foundation.events.C3702d.e.o;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.foundation.playqueue.m;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.properties.m.l;
import com.soundcloud.android.trackinfo.f;
import com.soundcloud.android.tracks.C6170ha;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ma;
import com.soundcloud.android.tracks.Na;
import java.util.concurrent.TimeUnit;

/* compiled from: TrackPageMenuController */
public class gc implements Hna, d, defpackage.C4772BJa.b {
    private final FragmentActivity a;
    private final C4772BJa b;
    private final C3814lca c;
    private final C1997DR d;
    private final C5327TLa e;
    private final Lca f;
    private final String g;
    /* access modifiers changed from: private */
    public final C2014EO h;
    /* access modifiers changed from: private */
    public final C4655rja i;
    private final C3700b j;
    private final Na k;
    private final com.soundcloud.android.properties.a l;
    private Pb m;
    private Ma n;
    private Nna o;
    private long p;

    /* compiled from: TrackPageMenuController */
    static class a {
        private final C3814lca a;
        private final C1997DR b;
        private final defpackage.C4772BJa.a c;
        private final Na d;
        private final C5327TLa e;
        private final Lca f;
        private final C2014EO g;
        private final C4655rja h;
        private final C3700b i;
        private final com.soundcloud.android.properties.a j;

        a(C3814lca lca, C1997DR dr, defpackage.C4772BJa.a aVar, Na na, C5327TLa tLa, Lca lca2, C2014EO eo, C4655rja rja, C3700b bVar, com.soundcloud.android.properties.a aVar2) {
            this.a = lca;
            this.b = dr;
            this.c = aVar;
            this.d = na;
            this.e = tLa;
            this.f = lca2;
            this.g = eo;
            this.h = rja;
            this.i = bVar;
            this.j = aVar2;
        }

        /* access modifiers changed from: 0000 */
        public gc a(View view) {
            gc gcVar = new gc(this.a, this.b, C6768kIa.c(view), this.c.a(C6768kIa.c(view), view), this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            return gcVar;
        }
    }

    /* compiled from: TrackPageMenuController */
    private class b extends C5005Iua<Iaa> {
        private final Pb d;

        b(Pb pb) {
            this.d = pb;
        }

        /* renamed from: a */
        public void onSuccess(Iaa iaa) {
            C4621nja nja;
            super.onSuccess(iaa);
            C3508cda e2 = C3508cda.e(this.d.a().c());
            gc.this.h.a(u.LOAD_STATION);
            if (this.d.q()) {
                nja = C4621nja.b(e2, C4928GKa.a(), C4928GKa.c(m.STATIONS), C4928GKa.a());
            } else {
                nja = C4621nja.b(e2, C4928GKa.c(this.d.a()), C4928GKa.c(m.STATIONS), C4928GKa.a());
            }
            gc.this.i.a(nja);
        }
    }

    private C3710l e() {
        return C3710l.a("new", true);
    }

    private void f() {
        this.e.a(C3876taa.d).a(Iaa.a).f().a((C7600wPa<? super T>) new b<Object>(this.m));
        this.e.c(C3876taa.f, Haa.a());
    }

    private void g() {
        this.b.b(ia.m.player_page_actions);
        this.b.b((defpackage.C4772BJa.b) this);
    }

    public void a(Mna mna) {
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        C3508cda o2 = this.m.o();
        this.j.a((J) K.b(o2, C3710l.a(Yca.PLAYER_MAIN)));
        this.e.a(C3876taa.d).a(Iaa.a).f().a((C7600wPa<? super T>) C5190Oua.a(new C4441ca(this, o2)));
        this.e.c(C3876taa.f, Haa.a());
    }

    public void d() {
        if (this.m != Pb.b) {
            this.b.a(i.start_station).setTitle(this.a.getText(p.stations_open_station));
            this.b.a(i.start_station, this.n.g() && C4739AHa.a((Context) this.a));
            C4772BJa bJa = this.b;
            int i2 = i.comment;
            bJa.a(i2, bJa.a(i2).getTitle());
            this.b.b();
        }
    }

    public void onDismiss() {
    }

    public void setState(Nna nna) {
        this.o = nna;
        a(this.o.c().e());
    }

    private gc(C3814lca lca, C1997DR dr, FragmentActivity fragmentActivity, C4772BJa bJa, Na na, C5327TLa tLa, Lca lca2, C2014EO eo, C4655rja rja, C3700b bVar, com.soundcloud.android.properties.a aVar) {
        this.m = Pb.b;
        this.n = Ma.a;
        this.c = lca;
        this.d = dr;
        this.a = fragmentActivity;
        this.b = bJa;
        this.k = na;
        this.e = tLa;
        this.f = lca2;
        this.h = eo;
        this.j = bVar;
        this.l = aVar;
        this.g = this.a.getString(p.comment_at_time);
        this.i = rja;
        g();
    }

    public void a(float f2, float f3) {
        a((long) (f3 * ((float) this.m.g())));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.m.l().a((C7733yKa<? super T>) new C4438ba<Object>(this));
    }

    private void a(long j2) {
        this.p = j2;
        if (this.n.c()) {
            String a2 = C7315sGa.a(j2, TimeUnit.MILLISECONDS);
            this.b.a(i.comment, (CharSequence) String.format(this.g, new Object[]{a2}));
        }
    }

    private void b(Pb pb) {
        C4875Eoa.b.a(pb.a(), pb.getTitle()).a(this.a.getSupportFragmentManager());
    }

    public boolean a(MenuItem menuItem, Context context) {
        int itemId = menuItem.getItemId();
        if (itemId == i.share) {
            a(context);
            return true;
        } else if (itemId == i.repost) {
            a(true, this.m.a(), context);
            return true;
        } else if (itemId == i.unpost) {
            a(false, this.m.a(), context);
            return true;
        } else if (itemId == i.info) {
            String str = "info_dialog";
            if (this.l.a((defpackage.C3821mba.a) l.a)) {
                C5232QGa.a((C0361c) f.a(this.m.a(), Long.valueOf(this.p)), this.a.getSupportFragmentManager(), str);
            } else {
                C5232QGa.a((C0361c) C6170ha.a(this.m.a(), Long.valueOf(this.p)), this.a.getSupportFragmentManager(), str);
            }
            return true;
        } else if (itemId == i.comment) {
            b();
            return true;
        } else if (itemId == i.add_to_playlist) {
            b(this.m);
            return true;
        } else if (itemId == i.start_station) {
            f();
            return true;
        } else if (itemId != i.go_to_artist) {
            return false;
        } else {
            c();
            return true;
        }
    }

    public /* synthetic */ void a(C3508cda cda, Iaa iaa) throws Exception {
        this.i.a(C4621nja.c(cda));
    }

    /* access modifiers changed from: 0000 */
    public void a(Context context) {
        C3508cda a2 = this.m.a();
        if (this.m.l().c()) {
            this.f.a(context, C5672bua.a((C3855qda) this.m.l().b(), a(a2), this.c.a(a2)));
        }
    }

    public /* synthetic */ void a(C6185ma maVar) {
        this.i.a(C4621nja.a(Y.a(maVar.a(), this.p, maVar.A()), e()));
    }

    private void a(boolean z, C3508cda cda, Context context) {
        this.d.a(cda, z).a(RPa.a()).d((C6776kQa<? super T>) new C4435aa<Object>(context));
        this.j.a(z ? e.l.c : o.c);
        this.j.a((J) K.a(z, cda, a(cda), this.c.a(cda), Qb.a(this.m)));
    }

    private C3710l a(C3508cda cda) {
        return C3710l.a(cda, Yca.PLAYER_MAIN.a(), this.c.l(), true);
    }

    public void a(Pb pb) {
        this.m = pb;
        C4928GKa l2 = pb.l();
        Na na = this.k;
        na.getClass();
        this.n = (Ma) l2.b((Function<? super T, V>) new C4497va<Object,V>(na)).d(Ma.a);
        this.b.b(i.unpost, this.n.h());
        this.b.b(i.repost, this.n.e());
        this.b.a(i.share, this.n.f());
        this.b.a(i.add_to_playlist, this.n.b());
        this.b.b(i.comment, this.n.c());
        Nna nna = this.o;
        a(nna == null ? 0 : nna.c().e());
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.n = this.n.a(z);
        this.b.b(i.unpost, this.n.h());
        this.b.b(i.repost, this.n.e());
    }

    public void a() {
        this.b.a();
    }
}
