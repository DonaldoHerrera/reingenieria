package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.Checkable;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.cast.C2728b;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.collections.data.J;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.playback.Ic;
import com.soundcloud.android.playback.ui.view.MiniplayerProgressView;
import com.soundcloud.android.playback.ui.view.PlayerTrackArtworkView;
import com.soundcloud.android.playback.ui.view.PlayerUpsellView;
import com.soundcloud.android.playback.ui.view.TimestampView;
import com.soundcloud.android.playback.ui.view.c;
import com.soundcloud.android.playback.ui.view.n;
import com.soundcloud.android.player.ui.waveform.WaveformView;
import com.soundcloud.android.player.ui.waveform.h;
import com.soundcloud.android.player.ui.waveform.h.b;
import com.soundcloud.android.tracks.C6158da;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Va;
import com.soundcloud.android.view.JaggedTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: TrackPagePresenter */
class mc implements Cb<Pb>, OnClickListener {
    private final Yb A = new Yb();
    private final C5630bKa a;
    private final C2436_U b;
    private final dc c;
    private final C4454gb d;
    private final Iea e;
    private final b f;
    private final com.soundcloud.android.playback.ui.C4492tb.a g;
    private final com.soundcloud.android.playback.ui.Ab.a h;
    private final a i;
    private final c j;
    private final b k;
    private final Za l;
    private final Va m;
    private final C2732f n;
    /* access modifiers changed from: private */
    public final C2728b o;
    private final Resources p;
    private final Tb q;
    /* access modifiers changed from: private */
    public final Ic r;
    private final Va s;
    private final qc t;
    private final C2526g u;
    private final Ona v;
    private final C4412qb w;
    private final com.soundcloud.android.properties.a x;
    /* access modifiers changed from: private */
    public Long y = Long.valueOf(0);
    private VPa z = C4881Eua.b();

    /* compiled from: TrackPagePresenter */
    static class a {
        private static final Predicate<View> a = C4471ma.a;
        gc A;
        C4492tb B;
        Ab[] C;
        C2259RJ D;
        Ya E;
        Ua F;
        n G;
        View H;
        PlayPauseButton I;
        TextView J;
        TextView K;
        ImageButton L;
        MiniplayerProgressView M;
        Iterable<View> N;
        Iterable<View> O;
        Iterable<View> P;
        Iterable<View> Q;
        Iterable<View> R;
        Iterable<View> S;
        Iterable<View> T;
        Iterable<View> U;
        Iterable<View> V;
        Iterable<Hna> W;
        C4928GKa<String> X;
        VPa Y = C4881Eua.b();
        VPa Z = C4881Eua.b();
        C2350WH<Ina> aa = C2332VH.s();
        JaggedTextView b;
        C2350WH<Boolean> ba = C2332VH.s();
        JaggedTextView c;
        C2350WH<_Xa<Long, Kna>> ca = C2332VH.s();
        JaggedTextView d;
        C2350WH<Mna> da = C2314UH.f(Mna.NONE);
        TimestampView e;
        C2350WH<Float> ea = C2314UH.f(Float.valueOf(0.0f));
        ViewGroup f;
        PlayerTrackArtworkView g;
        View h;
        ToggleButton i;
        MediaRouteButton j;
        View k;
        View l;
        View m;
        View n;
        View o;
        View p;
        View q;
        PlayerUpsellView r;
        View s;
        View t;
        View u;
        View v;
        View w;
        View x;
        View y;
        h z;

        a() {
        }

        static /* synthetic */ boolean a(View view) {
            return view != null;
        }

        /* access modifiers changed from: private */
        public boolean c() {
            return this.o != null;
        }

        /* access modifiers changed from: private */
        public boolean b() {
            return this.n != null;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            ArrayList a2 = C2063HD.a((E[]) new View[]{this.b, this.c, this.d, this.q, this.j, this.n, this.o, this.p, this.m, this.r, this.y, this.x, this.w});
            ArrayList a3 = C2063HD.a((E[]) new View[]{this.p, this.e, this.f});
            ArrayList a4 = C2063HD.a((E[]) new View[]{this.p, this.e, this.m, this.f});
            ImageButton imageButton = this.L;
            ArrayList a5 = C2063HD.a((E[]) new View[]{this.g, this.q, this.m, this.p, this.H, this.I, this.r.getUpsellButton(), this.x, imageButton, this.w, imageButton});
            View view = this.v;
            ArrayList a6 = C2063HD.a((E[]) new View[]{this.l, this.k, this.i, this.b, this.c, this.e, this.x, view, this.f, view, this.w});
            this.N = Arrays.asList(new View[]{this.b, this.c, this.d, this.l, this.e, this.u, this.r, this.y, this.f});
            this.O = Collections.singletonList(this.u);
            this.P = Arrays.asList(new View[]{this.b, this.c, this.d, this.l, this.u});
            this.V = Collections.singletonList(this.s);
            this.Q = C1943BD.b(a2, a);
            this.R = C1943BD.b(a3, a);
            this.S = C1943BD.b(a4, a);
            this.U = C1943BD.b(a5, a);
            this.T = C1943BD.b(a6, a);
            this.W = C2063HD.a((E[]) new Hna[]{this.G, this.z, this.B, this.e, this.A, this.M});
        }
    }

    mc(C5630bKa bka, C2436_U _u, dc dcVar, C4454gb gbVar, Iea iea, b bVar, com.soundcloud.android.playback.ui.C4492tb.a aVar, com.soundcloud.android.playback.ui.Ab.a aVar2, a aVar3, c cVar, b bVar2, Za za, Va va, C2732f fVar, C2728b bVar3, Resources resources, Tb tb, Ic ic, qc qcVar, Va va2, C2526g gVar, Ona ona, C4412qb qbVar, com.soundcloud.android.properties.a aVar4) {
        this.a = bka;
        this.b = _u;
        this.c = dcVar;
        this.d = gbVar;
        this.e = iea;
        this.f = bVar;
        this.g = aVar;
        this.h = aVar2;
        this.i = aVar3;
        this.j = cVar;
        this.k = bVar2;
        this.l = za;
        this.m = va;
        this.n = fVar;
        this.o = bVar3;
        this.p = resources;
        this.q = tb;
        this.r = ic;
        this.t = qcVar;
        this.s = va2;
        this.u = gVar;
        this.v = ona;
        this.w = qbVar;
        this.x = aVar4;
    }

    private void d(a aVar, boolean z2) {
        View view = aVar.p;
        if (view != null) {
            view.setEnabled(z2);
        }
        PlayPauseButton playPauseButton = aVar.I;
        if (playPauseButton != null) {
            playPauseButton.setEnabled(z2);
        }
    }

    private void l(View view) {
        view.setAlpha(0.3f);
        view.setEnabled(false);
    }

    private void m(View view) {
        view.setAlpha(1.0f);
        view.setEnabled(true);
    }

    private a n(View view) {
        return (a) view.getTag();
    }

    /* access modifiers changed from: private */
    public void o(View view) {
        view.setVisibility(8);
    }

    private boolean p(View view) {
        return ((Checkable) view).isChecked();
    }

    /* access modifiers changed from: private */
    public void q(View view) {
        a((C3508cda) view.getTag(i.track_urn), p(view), K.h.FULLSCREEN);
    }

    private void r(View view) {
        a aVar = new a();
        aVar.b = (JaggedTextView) view.findViewById(i.track_page_title);
        aVar.c = (JaggedTextView) view.findViewById(i.track_page_user);
        aVar.d = (JaggedTextView) view.findViewById(i.track_page_context);
        aVar.g = (PlayerTrackArtworkView) view.findViewById(i.track_page_artwork);
        aVar.h = view.findViewById(i.artwork_overlay_dark);
        aVar.e = (TimestampView) view.findViewById(i.timestamp);
        aVar.i = (ToggleButton) view.findViewById(i.track_page_like);
        aVar.k = view.findViewById(i.track_page_more);
        aVar.l = view.findViewById(i.player_expanded_top_bar);
        aVar.m = view.findViewById(i.player_bottom_close);
        aVar.n = view.findViewById(i.player_next);
        aVar.o = view.findViewById(i.player_previous);
        aVar.p = view.findViewById(i.player_play);
        aVar.s = view.findViewById(i.profile_link);
        aVar.v = view.findViewById(i.track_page_share);
        aVar.w = view.findViewById(i.track_page_comment);
        aVar.f = (ViewGroup) view.findViewById(i.scrub_comment_holder);
        aVar.G = this.j.a(aVar.f);
        aVar.x = view.findViewById(i.play_queue_button);
        aVar.r = (PlayerUpsellView) view.findViewById(i.upsell_container);
        aVar.y = view.findViewById(i.top_gradient);
        aVar.j = (MediaRouteButton) view.findViewById(i.media_route_button);
        aVar.H = view.findViewById(i.footer_controls);
        C5172OGa.a(aVar.H, p.accessibility_open_player);
        aVar.I = (PlayPauseButton) view.findViewById(i.footer_play_pause);
        aVar.J = (TextView) view.findViewById(i.footer_title);
        aVar.K = (TextView) view.findViewById(i.footer_user);
        aVar.L = (ImageButton) view.findViewById(i.footer_like_button);
        aVar.M = (MiniplayerProgressView) view.findViewById(i.player_footer_progress);
        aVar.D = this.k.a(view, c(aVar));
        aVar.z = this.f.a((WaveformView) view.findViewById(i.track_page_waveform), new C4477oa(this));
        aVar.C = new Ab[]{this.h.a(aVar.h), this.h.a(aVar.g.findViewById(i.artwork_overlay_image))};
        aVar.B = this.g.a(aVar.g);
        aVar.z.a((d) aVar.e);
        aVar.z.a((d) aVar.M);
        aVar.z.a(f(aVar));
        aVar.A = this.i.a(aVar.k);
        aVar.t = view.findViewById(i.play_controls);
        aVar.q = view.findViewById(i.player_close_indicator);
        aVar.u = view.findViewById(i.interstitial_holder);
        for (Ab a2 : aVar.C) {
            aVar.z.a((d) a2);
        }
        aVar.z.a((d) aVar.A);
        aVar.z.a((d) new kc(this));
        aVar.k.setOnClickListener(new C4465ka(this, aVar));
        C4453ga gaVar = new C4453ga(aVar);
        C4456ha haVar = new C4456ha(aVar);
        aVar.v.setOnClickListener(gaVar);
        aVar.s.setOnClickListener(haVar);
        aVar.i.setOnClickListener(new C4444da(this));
        aVar.a();
        view.setTag(aVar);
        aVar.E = this.l.a(view);
        aVar.F = this.m.a(view);
    }

    private void s(View view) {
        view.setVisibility(0);
    }

    public void c(View view) {
        n(view).z.e();
    }

    public void e(View view) {
        a(n(view));
    }

    public void f(View view) {
        a n2 = n(view);
        b(n2);
        a(n2, true);
    }

    public View g(View view) {
        a n2 = n(view);
        String str = "";
        n2.c.setText(str);
        n2.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        n2.b.setText(str);
        n2.X = C4928GKa.a();
        o(n2.d);
        n2.i.setChecked(false);
        n2.i.setEnabled(true);
        n2.K.setText(str);
        n2.J.setText(str);
        n2.L.setSelected(false);
        n2.e.setPreview(false);
        o(n2.e);
        n2.E.a();
        n2.F.a();
        n2.z.a();
        n2.G.a();
        o(n2.r);
        n2.Y.dispose();
        return view;
    }

    public void h(View view) {
        a n2 = n(view);
        if (this.n.e()) {
            o(n2.x);
        } else {
            s(n2.x);
        }
    }

    public void i(View view) {
        this.e.a(Dea.a().a("play_queue").a(n(view).x).b(p.play_queue_introductory_overlay_title).a(p.play_queue_introductory_overlay_description).a());
    }

    public boolean j(View view) {
        return view.getTag() instanceof a;
    }

    /* access modifiers changed from: 0000 */
    public void k(View view) {
        a n2 = n(view);
        n2.da.accept(Mna.NONE);
        n2.A.a();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == i.footer_play_pause) {
            this.c.b();
        } else if (id == i.player_play || id == i.track_page_artwork) {
            this.c.d();
        } else if (id == i.footer_controls) {
            this.c.a();
        } else if (id == i.player_close_indicator || id == i.player_bottom_close) {
            this.c.c();
        } else if (id == i.upsell_button) {
            this.c.a((C3508cda) view.getTag());
        } else if (id == i.play_queue_button) {
            this.c.f();
        } else if (id == i.footer_like_button) {
            a((ImageButton) view);
        } else if (id == i.track_page_comment) {
            this.c.a((C3508cda) view.getTag(i.track_urn), this.y, (C4928GKa) view.getTag(i.secret_token));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected view ID: ");
            sb.append(this.p.getResourceName(view.getId()));
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public void e(a aVar, boolean z2) {
        aVar.b.a(z2);
        aVar.c.a(z2);
        aVar.e.a(z2);
        aVar.d.a(z2);
    }

    private int b() {
        return this.b.k() ? p.playback_upsell_button_trial : p.playback_upsell_button;
    }

    /* access modifiers changed from: private */
    public void c(a aVar, boolean z2) {
        for (Ab a2 : aVar.C) {
            a2.a(z2);
        }
    }

    private void b(a aVar, Pb pb) {
        if (pb.t()) {
            aVar.F.b();
        }
    }

    private d f(a aVar) {
        return new jc(this, aVar);
    }

    private AlphaAnimation d(a aVar) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration((long) this.p.getInteger(17694720));
        alphaAnimation.setAnimationListener(new ic(this, aVar));
        return alphaAnimation;
    }

    public /* synthetic */ void c(a aVar, View view) {
        a(aVar);
        aVar.A.d();
    }

    private void b(a aVar) {
        aVar.j.setVisibility(this.n.b() ? 0 : 8);
    }

    private Iterable<View> e(a aVar) {
        if (aVar.D.e()) {
            return aVar.O;
        }
        if (aVar.E.c()) {
            return aVar.P;
        }
        return aVar.N;
    }

    public View a(ViewGroup viewGroup, Xb xb) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.player_track_page, viewGroup, false);
        r(inflate);
        a(inflate, xb);
        return inflate;
    }

    private defpackage.C2259RJ.a c(a aVar) {
        return new lc(this, aVar);
    }

    public void b(View view, q qVar, boolean z2) {
        a(qVar, z2, n(view));
    }

    public void b(View view) {
        b(n(view), false);
        this.z.dispose();
    }

    public void d(View view) {
        a n2 = n(view);
        n2.z.f();
        this.o.a(n2.j);
    }

    private APa<Nna> a(a aVar, long j2) {
        return this.v.a(APa.b((EPa<? extends T>) aVar.aa, (EPa<? extends T>) aVar.ba.h(new C4483qa(j2))), (APa<_Xa<Long, Kna>>) aVar.ca, j2, (APa<Float>) aVar.ea, (APa<Mna>) aVar.da);
    }

    private void b(a aVar, boolean z2) {
        aVar.ba.accept(Boolean.valueOf(z2));
    }

    private void b(a aVar, C4431ub ubVar, boolean z2) {
        if (!z2 || !ubVar.l()) {
            aVar.E.b();
        } else {
            aVar.E.a(a(ubVar));
        }
    }

    static /* synthetic */ Ina a(long j2, Boolean bool) throws Exception {
        Ina ina = new Ina(Jna.IDLE, bool.booleanValue(), 0, j2, System.currentTimeMillis());
        return ina;
    }

    public void a(View view, Pb pb) {
        Pb pb2 = pb;
        String title = pb.getTitle();
        String n2 = pb.n();
        C3508cda a2 = pb.a();
        long g2 = pb.g();
        long k2 = pb.k();
        C4928GKa b2 = pb2.a.c() ? C4928GKa.b(((C6185ma) pb2.a.b()).A()) : C4928GKa.a();
        a n3 = n(view);
        n3.X = pb.m().b((Function<? super T, V>) C4487s.a);
        n3.Y.dispose();
        n3.Y = a(n3, g2).f((C6776kQa<? super T>) new C4468la<Object>(n3));
        n3.Z.dispose();
        n3.Z = n3.G.c().f((C6776kQa<? super T>) new C4459ia<Object>(this, a2, b2));
        n3.b.setText(title);
        a(pb2, n3);
        b(n3);
        a(n3, false);
        h(view);
        n3.G.b();
        this.z = n3.B.a(pb2, pb.s()).a((C7256rQa<? super T>) C4464k.a).f(C4485ra.a).c((C6776kQa<? super T>) new C4450fa<Object>(n3));
        n3.e.a(k2, g2);
        n3.A.a(pb2);
        n3.z.a(this.a.a(a2, pb.p()), pb.g(), pb.u());
        C4928GKa l2 = pb.l();
        Va va = this.s;
        va.getClass();
        n3.i.setTag(i.should_display_likes_count, (Boolean) l2.b((Function<? super T, V>) new C4503xa<Object,V>(va)).d(Boolean.valueOf(true)));
        a(n3.i, pb.j());
        boolean w2 = pb.w();
        n3.i.setChecked(w2);
        n3.i.setTag(i.track_urn, a2);
        n3.L.setSelected(w2);
        n3.L.setTag(i.track_urn, a2);
        if (pb.v()) {
            l(n3.i);
            l(n3.L);
        } else {
            m(n3.i);
            m(n3.L);
        }
        n3.v.setTag(a2);
        a(pb2, n3.v);
        s(n3.w);
        n3.w.setTag(i.track_urn, a2);
        n3.w.setTag(i.secret_token, b2);
        n3.w.setTag(i.timestamp, Long.valueOf(g2));
        n3.w.setTag(i.creator_urn_tag, pb.o());
        C5172OGa.a(n3.H);
        n3.H.setContentDescription(this.p.getString(p.accessibility_now_playing, new Object[]{title, n2}));
        n3.I.setPlayInfo(title);
        n3.K.setText(n2);
        n3.J.setText(title);
        n3.r.getUpsellButton().setTag(a2);
        a(pb2, a2, n3);
        a((OnClickListener) this, n3.U);
        if (pb.s()) {
            C4519wc h2 = pb.h();
            if (h2.f()) {
                g2 = h2.c();
            }
            n3.aa.accept(pb.i().a(h2.d(), g2, h2.b()));
            return;
        }
        b(n3, pb.i().p());
    }

    static /* synthetic */ void a(a aVar, Nna nna) throws Exception {
        for (Hna state : aVar.W) {
            state.setState(nna);
        }
    }

    public /* synthetic */ void a(C3508cda cda, C4928GKa gKa, C3799jda jda) throws Exception {
        this.c.a(cda, Long.valueOf(jda.a().d()), gKa);
    }

    public void a(View view, Set<C3799jda> set) {
        a n2 = n(view);
        n2.z.a(set);
        n2.G.a(set);
    }

    private void a(Pb pb, View view) {
        if (!pb.v() || pb.o().equals(this.u.c())) {
            m(view);
        } else {
            l(view);
        }
    }

    private void a(a aVar, C4519wc wcVar) {
        this.y = Long.valueOf(wcVar.d());
        aVar.ca.accept(new C4447ea(wcVar));
    }

    static /* synthetic */ Kna a(C4519wc wcVar, Long l2) {
        Kna kna = new Kna(wcVar.d(), wcVar.c(), l2.longValue(), wcVar.b());
        return kna;
    }

    private void a(Pb pb, a aVar) {
        JaggedTextView jaggedTextView = aVar.c;
        jaggedTextView.setText(pb.n());
        this.t.a(jaggedTextView, pb.r(), ia.h.pro_badge_inset);
        jaggedTextView.setVisibility(0);
        jaggedTextView.setEnabled(true);
    }

    private void a(ToggleButton toggleButton, int i2) {
        int i3 = ia.h.ic_player_liked;
        int i4 = ia.h.ic_player_like;
        Boolean bool = (Boolean) toggleButton.getTag(i.should_display_likes_count);
        if (bool != null && !bool.booleanValue()) {
            i2 = 0;
        }
        this.d.a(toggleButton, i2, i3, i4);
    }

    private void a(Pb pb, C3508cda cda, a aVar) {
        a(pb, aVar, this.b);
        d(aVar, !pb.t() && !pb.q());
        b(aVar, pb);
        a(aVar, pb);
        aVar.E.a(cda);
    }

    private void a(Pb pb, a aVar, C2436_U _u) {
        if (!pb.l().c() || !C6158da.b((C6185ma) pb.l().b())) {
            o(aVar.r);
        } else {
            a(aVar, _u);
        }
    }

    private void a(a aVar, C2436_U _u) {
        if (_u.s()) {
            aVar.r.a(b(), this.n.e());
            aVar.e.setPreview(true);
            return;
        }
        o(aVar.r);
        aVar.e.setPreview(false);
    }

    private void a(a aVar, Pb pb) {
        boolean q2 = pb.q();
        aVar.g.setEnabled(!q2);
        for (Ab b2 : aVar.C) {
            b2.b(q2);
        }
        if (q2) {
            aVar.E.a(a.BLOCKED);
        } else if (!aVar.E.c()) {
            aVar.e.setVisibility(0);
        }
    }

    private void a(a aVar, boolean z2) {
        if (this.n.e()) {
            JaggedTextView jaggedTextView = aVar.d;
            jaggedTextView.setText(jaggedTextView.getResources().getString(p.cast_casting_to_device, new Object[]{this.n.g()}));
            aVar.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            s(aVar.d);
            if (z2) {
                aVar.d.startAnimation(a());
            }
        } else if (aVar.X.c()) {
            aVar.d.setText((CharSequence) aVar.X.b());
            aVar.d.setCompoundDrawablesWithIntrinsicBounds(ia.h.ic_stations_player_context, 0, 0, 0);
            s(aVar.d);
        } else if (z2) {
            aVar.d.startAnimation(d(aVar));
        } else {
            o(aVar.d);
        }
    }

    private AlphaAnimation a() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration((long) this.p.getInteger(17694720));
        return alphaAnimation;
    }

    private void a(q qVar, boolean z2, a aVar) {
        if (z2 && aVar.r.getVisibility() == 0) {
            this.q.a(qVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, ca caVar) {
        n(view).D.b(caVar);
    }

    private void a(a aVar) {
        aVar.D.c();
    }

    public void a(View view, C4431ub ubVar, boolean z2, boolean z3, boolean z4) {
        a n2 = n(view);
        boolean p2 = ubVar.p();
        boolean z5 = false;
        n2.t.setVisibility(p2 ? 8 : 0);
        n2.I.setPlayState(p2);
        a(n2, ubVar, z2);
        TimestampView timestampView = n2.e;
        if (z2 && ubVar.f()) {
            z5 = true;
        }
        timestampView.setBufferingMode(z5);
        a(ubVar, z2, z3, z4, n2);
    }

    private void a(C4431ub ubVar, boolean z2, boolean z3, boolean z4, a aVar) {
        if (!z2) {
            return;
        }
        if (ubVar.j()) {
            aVar.D.a(z3, z4);
        } else if (ubVar.k() || ubVar.l()) {
            a(aVar);
        }
    }

    public void a(View view, com.soundcloud.android.foundation.events.C.a aVar) {
        a n2 = n(view);
        n2.A.a(aVar.c());
    }

    public void a(View view, J j2) {
        a n2 = n(view);
        n2.i.setChecked(j2.a());
        n2.L.setSelected(j2.a());
        C5172OGa.a((View) n2.L, j2.a() ? p.accessibility_unlike : p.accessibility_like);
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, int i2, int i3) {
        a n2 = n(view);
        int i4 = 4;
        if (n2.b()) {
            n2.n.setVisibility(i2 == i3 + -1 ? 4 : 0);
        }
        if (n2.c()) {
            View view2 = n2.o;
            if (i2 != 0) {
                i4 = 0;
            }
            view2.setVisibility(i4);
        }
    }

    private void a(ImageButton imageButton) {
        boolean z2 = !imageButton.isSelected();
        imageButton.setSelected(z2);
        a((C3508cda) imageButton.getTag(i.track_urn), z2, K.h.MINI);
    }

    private void a(C3508cda cda, boolean z2, K.h hVar) {
        if (cda != null) {
            this.c.a(z2, cda, hVar);
        }
    }

    private void a(a aVar, C4431ub ubVar, boolean z2) {
        if (z2) {
            aVar.aa.accept(ubVar.q());
        } else {
            b(aVar, ubVar.p());
        }
        b(aVar, ubVar, z2);
        for (Ab a2 : aVar.C) {
            a2.a(ubVar);
        }
        e(aVar, ubVar.p());
    }

    private a a(C4431ub ubVar) {
        return ubVar.o() ? a.UNPLAYABLE : a.FAILED;
    }

    public void a(View view, C4519wc wcVar) {
        if (!wcVar.g()) {
            a(n(view), wcVar);
        }
    }

    public void a(View view) {
        a(view, 0.0f);
        n(view).z.g();
        n(view).D.f();
    }

    public void a(View view, q qVar, boolean z2) {
        a(view, 1.0f);
        n(view).z.h();
        n(view).D.g();
        a(qVar, z2, n(view));
    }

    public void a(View view, float f2) {
        a n2 = n(view);
        this.A.a(f2, n2.H, e(n2), n2.V, n2.C);
        n2.z.a(f2);
        int i2 = 0;
        n(view).q.setVisibility(f2 > 0.0f ? 0 : 8);
        View view2 = n(view).H;
        if (f2 >= 1.0f) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        n(view).M.a(f2);
    }

    private void a(OnClickListener onClickListener, Iterable<View> iterable) {
        C6768kIa.a(iterable, (C7733yKa<View>) new C4474na<View>(onClickListener));
    }

    private void a(View view, Xb xb) {
        a n2 = n(view);
        C4480pa paVar = new C4480pa(xb);
        C4462ja jaVar = new C4462ja(xb);
        if (n2.b()) {
            n2.n.setOnClickListener(paVar);
        }
        if (n2.c()) {
            n2.o.setOnClickListener(jaVar);
        }
    }

    public /* synthetic */ RVa a(Long l2) {
        this.w.a(l2.longValue());
        return RVa.a;
    }
}
