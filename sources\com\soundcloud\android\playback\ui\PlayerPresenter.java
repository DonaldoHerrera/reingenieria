package com.soundcloud.android.playback.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.A;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.Fragment;
import com.google.common.base.Predicate;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.p;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.main.ba;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.playback.playqueue.C4395sa;
import com.soundcloud.android.playback.playqueue.Ua;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.android.view.U;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

class PlayerPresenter extends SupportFragmentLightCycleDispatcher<PlayerFragment> {
    @LightCycle
    final PlayerPagerPresenter a;
    /* access modifiers changed from: private */
    public final C5327TLa b;
    private final C3700b c;
    private final C3814lca d;
    private final C4412qb e;
    /* access modifiers changed from: private */
    public final Na f;
    private final C4395sa g;
    private final r h;
    private final U i;
    private final ba j;
    private final Lb k;
    private final UPa l = new UPa();
    /* access modifiers changed from: private */
    public VPa m = C4881Eua.a();
    /* access modifiers changed from: private */
    public final Handler n;
    private boolean o;
    /* access modifiers changed from: private */
    public boolean p;
    /* access modifiers changed from: private */
    public boolean q;
    /* access modifiers changed from: private */
    public WeakReference<C0370l> r;
    private final C6776kQa<k> s = new Nb(this);

    public final class LightCycleBinder {
        public static void bind(PlayerPresenter playerPresenter) {
            playerPresenter.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) playerPresenter.a));
        }
    }

    private static final class a extends Handler {
        private final PlayerPresenter a;

        /* synthetic */ a(PlayerPresenter playerPresenter, Nb nb) {
            this(playerPresenter);
        }

        public void handleMessage(Message message) {
            this.a.E();
        }

        private a(PlayerPresenter playerPresenter) {
            this.a = playerPresenter;
        }
    }

    private final class b extends C5037Jua<Integer> {
        private b() {
        }

        /* synthetic */ b(PlayerPresenter playerPresenter, Nb nb) {
            this();
        }

        public void a(Integer num) {
            PlayerPresenter.this.n.removeMessages(0);
            PlayerPresenter.this.n.sendEmptyMessageDelayed(0, 350);
        }
    }

    private final class c extends C5037Jua<p> {
        private c() {
        }

        /* synthetic */ c(PlayerPresenter playerPresenter, Nb nb) {
            this();
        }

        public void a(p pVar) {
            if (pVar.g() && PlayerPresenter.this.f.d()) {
                return;
            }
            if (pVar.b() && PlayerPresenter.this.z()) {
                PlayerPresenter.this.q = true;
                PlayerPagerPresenter playerPagerPresenter = PlayerPresenter.this.a;
                playerPagerPresenter.a(playerPagerPresenter.x() + 1, true);
            } else if (!PlayerPresenter.this.q) {
                PlayerPresenter.this.B();
            }
        }
    }

    private final class d extends C5037Jua<Ua> {
        private d() {
        }

        /* synthetic */ d(PlayerPresenter playerPresenter, Nb nb) {
            this();
        }

        public void a(Ua ua) {
            if (PlayerPresenter.this.y()) {
                Fragment a = ((C0370l) PlayerPresenter.this.r.get()).a("play_queue");
                if (ua.d()) {
                    PlayerPresenter.this.p = true;
                    PlayerPresenter.this.a(a);
                } else if (ua.e()) {
                    PlayerPresenter.this.p = false;
                    PlayerPresenter.this.F();
                    PlayerPresenter.this.c(a);
                }
            }
        }
    }

    private final class e extends C5037Jua<Integer> {
        private e() {
        }

        /* synthetic */ e(PlayerPresenter playerPresenter, Nb nb) {
            this();
        }

        public void a(Integer num) {
            if (!PlayerPresenter.this.q) {
                return;
            }
            if (PlayerPresenter.this.f.d()) {
                PlayerPresenter.this.C();
            } else {
                PlayerPresenter.this.B();
            }
        }
    }

    private final class f extends C5037Jua<k> {
        private f() {
        }

        /* synthetic */ f(PlayerPresenter playerPresenter, Nb nb) {
            this();
        }

        public void a(k kVar) {
            PlayerPresenter.this.I();
        }
    }

    private class g extends C5037Jua<k> {
        private g() {
        }

        /* synthetic */ g(PlayerPresenter playerPresenter, Nb nb) {
            this();
        }

        public void a(k kVar) {
            PlayerPresenter.this.F();
        }
    }

    PlayerPresenter(PlayerPagerPresenter playerPagerPresenter, C5327TLa tLa, C3700b bVar, C3814lca lca, C4412qb qbVar, Lb lb, Na na, C4395sa saVar, r rVar, U u, ba baVar) {
        this.a = playerPagerPresenter;
        this.b = tLa;
        this.c = bVar;
        this.d = lca;
        this.e = qbVar;
        this.k = lb;
        this.f = na;
        this.g = saVar;
        this.h = rVar;
        this.i = u;
        this.n = new a(this, null);
        this.j = baVar;
    }

    private boolean A() {
        return this.f.d() && this.d.b(w());
    }

    /* access modifiers changed from: private */
    public void B() {
        D();
    }

    /* access modifiers changed from: private */
    public void C() {
        this.a.a((List<q>) C2063HD.a((E[]) new q[]{this.d.h()}), 0);
        this.a.a(0, false);
    }

    /* access modifiers changed from: private */
    public void D() {
        List a2 = this.d.a((Predicate<q>) N.a);
        int a3 = a(a2);
        this.a.a(a2, a3);
        this.a.a(a3, false);
        this.q = false;
    }

    /* access modifiers changed from: private */
    public void E() {
        if (this.o) {
            this.e.a(w());
        }
    }

    /* access modifiers changed from: private */
    public void F() {
        int x = x();
        boolean z = true;
        if (Math.abs(this.a.x() - x) > 1) {
            z = false;
        }
        this.a.a(x, z);
    }

    private void G() {
        APa a2 = this.k.a();
        this.l.b((VPa) a2.c(new e(this, null)));
        this.l.b((VPa) a2.d((C6776kQa<? super T>) new M<Object>(this)).a((C7256rQa<? super T>) new S<Object>(this)).c(new b(this, null)));
    }

    private void H() {
        this.l.b(this.b.b(C3876taa.e, (SUa<E>) new d<E>(this, null)));
        UPa uPa = this.l;
        C2350WH b2 = this.h.b();
        c cVar = new c(this, null);
        b2.c(cVar);
        uPa.b(cVar);
        this.l.b((VPa) this.h.a().d((C6776kQa<? super T>) new L<Object>(this)).a((C7256rQa<? super T>) U.a).d(this.s).c(new f(this, null)));
        this.l.b((VPa) this.h.a().a((C7256rQa<? super T>) new V<Object>(this)).a((C7256rQa<? super T>) new T<Object>(this)).c(new g(this, null)));
    }

    /* access modifiers changed from: private */
    public void I() {
        if (A() || !this.o) {
            if (this.a.x() == 0) {
                F();
            }
            C();
            return;
        }
        this.q = true;
        F();
    }

    private q w() {
        return this.a.w();
    }

    private int x() {
        return a(this.a.y());
    }

    /* access modifiers changed from: private */
    public boolean y() {
        WeakReference<C0370l> weakReference = this.r;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public boolean z() {
        return this.a.w().e() && this.o && this.a.v() > 1;
    }

    /* access modifiers changed from: 0000 */
    public boolean v() {
        boolean z;
        if (y()) {
            Fragment a2 = ((C0370l) this.r.get()).a("play_queue");
            if (a2 != null) {
                z = b(a2);
                if (!z || this.j.a()) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (!z) {
        }
        return true;
    }

    /* renamed from: c */
    public void onResume(PlayerFragment playerFragment) {
        super.onResume(playerFragment);
        this.o = true;
        this.l.b((VPa) this.b.a(C3876taa.d).a(Iaa.a).h(Q.a).c(new d(this, null)));
        this.l.b(this.b.a(C3876taa.d).a(Iaa.a).a((C7256rQa<? super T>) P.a).f((C6776kQa<? super T>) new O<Object>(this)));
        this.i.a(playerFragment.Bb());
    }

    public /* synthetic */ boolean d(k kVar) throws Exception {
        return !this.q;
    }

    static /* synthetic */ boolean b(Iaa iaa) throws Exception {
        return iaa.c() == 1;
    }

    /* renamed from: b */
    public void onPause(PlayerFragment playerFragment) {
        this.i.b(playerFragment.Bb());
        this.o = false;
        super.onPause(playerFragment);
    }

    public void a(float f2) {
        this.a.a(f2);
    }

    /* renamed from: a */
    public void onCreate(PlayerFragment playerFragment, Bundle bundle) {
        super.onCreate(playerFragment, bundle);
        this.r = new WeakReference<>(playerFragment.getFragmentManager());
    }

    static /* synthetic */ Ua a(Iaa iaa) throws Exception {
        return iaa.c() == 1 ? Ua.b() : Ua.a();
    }

    public /* synthetic */ boolean b(Integer num) throws Exception {
        return this.o;
    }

    private boolean b(Fragment fragment) {
        this.p = false;
        F();
        c(fragment);
        this.c.a((J) K.h());
        return true;
    }

    /* renamed from: a */
    public void onViewCreated(PlayerFragment playerFragment, View view, Bundle bundle) {
        super.onViewCreated(playerFragment, view, bundle);
        a(playerFragment.Bb());
        H();
        G();
    }

    /* renamed from: a */
    public void onDestroyView(PlayerFragment playerFragment) {
        this.m.dispose();
        this.k.b();
        this.n.removeMessages(0);
        this.l.b();
        super.onDestroyView(playerFragment);
    }

    public /* synthetic */ void c(Iaa iaa) throws Exception {
        this.j.a();
    }

    public /* synthetic */ boolean c(k kVar) throws Exception {
        return !this.p;
    }

    /* access modifiers changed from: private */
    public void c(Fragment fragment) {
        if (fragment != null && y()) {
            A a2 = ((C0370l) this.r.get()).a();
            a2.a(com.soundcloud.android.ia.a.ak_fade_in, com.soundcloud.android.ia.a.ak_fade_out);
            a2.d(fragment);
            a2.b();
            this.b.c(C3876taa.f, Haa.w());
        }
    }

    public /* synthetic */ void a(k kVar) throws Exception {
        this.a.z();
        this.m.dispose();
    }

    /* access modifiers changed from: private */
    public boolean a(C4519wc wcVar) {
        com.soundcloud.android.foundation.ads.U u = (com.soundcloud.android.foundation.ads.U) this.f.a();
        return (u.z() && wcVar.a(TimeUnit.SECONDS.toMillis((long) u.v()))) || wcVar.a(wcVar.c() - 500);
    }

    public /* synthetic */ void a(Integer num) throws Exception {
        this.a.z();
    }

    private void a(PlayerTrackPager playerTrackPager) {
        B();
        this.k.a(playerTrackPager, this.a);
    }

    static /* synthetic */ boolean a(q qVar) {
        return qVar.j() || qVar.e();
    }

    private int a(List<q> list) {
        return C1943BD.d(list, o.b(this.d.h()));
    }

    /* access modifiers changed from: private */
    public void a(Fragment fragment) {
        if (fragment == null && y()) {
            this.b.c(C3876taa.f, Haa.t());
            A a2 = ((C0370l) this.r.get()).a();
            a2.a(com.soundcloud.android.ia.a.ak_fade_in, com.soundcloud.android.ia.a.ak_fade_out);
            a2.a(i.player_pager_holder, this.g.a(), "play_queue");
            a2.b();
        }
    }
}
