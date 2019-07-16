package com.soundcloud.android.playback.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ads.Ma;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.collections.data.J;
import com.soundcloud.android.comments.Ea;
import com.soundcloud.android.comments.Ua;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.O;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.C;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.playback.Ba;
import com.soundcloud.android.playback.C4416rb;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4518wb;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.playback.Ic;
import com.soundcloud.android.playback.ke;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.android.stations.ic;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import com.soundcloud.android.utilities.android.m;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;
import com.soundcloud.lightcycle.SupportFragmentLightCycleDispatcher;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PlayerPagerPresenter extends SupportFragmentLightCycleDispatcher<PlayerFragment> implements com.soundcloud.android.cast.C2732f.a, com.soundcloud.android.playback.ui.view.m.b {
    /* access modifiers changed from: private */
    public List<q> A = Collections.emptyList();
    /* access modifiers changed from: private */
    public Iaa B;
    /* access modifiers changed from: private */
    public C4431ub C;
    /* access modifiers changed from: private */
    public boolean D;
    private boolean E;
    /* access modifiers changed from: private */
    public final Z<C3508cda, C6849lVa<C6185ma>> F = new Z<>(10);
    private final androidx.viewpager.widget.ViewPager.e G = new Ib(this);
    private int H = -1;
    /* access modifiers changed from: private */
    public PlayerTrackPager I;
    @LightCycle
    final Eb a;
    /* access modifiers changed from: private */
    public final C3814lca b;
    private final C4416rb c;
    private final Fea d;
    private final Ca e;
    /* access modifiers changed from: private */
    public final mc f;
    /* access modifiers changed from: private */
    public final La g;
    /* access modifiers changed from: private */
    public final rc h;
    private final C2732f i;
    private final Na j;
    private final C5327TLa k;
    private final ic l;
    /* access modifiers changed from: private */
    public final Ic m;
    private final Ea n;
    /* access modifiers changed from: private */
    public final pc o;
    private final ke p;
    private final Ua q;
    private final r r;
    private final C3989m s;
    private final C5039Jwa t;
    private final C6699jHa u;
    /* access modifiers changed from: private */
    public final Map<View, q> v = new HashMap(6);
    private final i w;
    private UPa x = new UPa();
    private UPa y = new UPa();
    /* access modifiers changed from: private */
    public Xb z;

    public final class LightCycleBinder {
        public static void bind(PlayerPagerPresenter playerPagerPresenter) {
            playerPagerPresenter.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) playerPagerPresenter.a));
        }
    }

    private final class a extends C5037Jua<k> {
        private a() {
        }

        /* synthetic */ a(PlayerPagerPresenter playerPagerPresenter, Ib ib) {
            this();
        }

        public void a(k kVar) {
            for (Entry entry : PlayerPagerPresenter.this.v.entrySet()) {
                q qVar = (q) entry.getValue();
                Cb a = PlayerPagerPresenter.this.f(qVar);
                View view = (View) entry.getKey();
                if (qVar.j() && !PlayerPagerPresenter.this.b.b(qVar)) {
                    a.e(view);
                }
            }
        }
    }

    private final class b extends C5037Jua<Iaa> {
        private b() {
        }

        /* synthetic */ b(PlayerPagerPresenter playerPagerPresenter, Ib ib) {
            this();
        }

        public void a(Iaa iaa) {
            if (iaa.c() == 0) {
                for (Entry key : PlayerPagerPresenter.this.v.entrySet()) {
                    PlayerPagerPresenter.this.b((View) key.getKey());
                }
            }
        }
    }

    private final class c extends C5037Jua<C4519wc> {
        private c() {
        }

        /* synthetic */ c(PlayerPagerPresenter playerPagerPresenter, Ib ib) {
            this();
        }

        public void a(C4519wc wcVar) {
            for (Entry entry : PlayerPagerPresenter.this.v.entrySet()) {
                Cb a = PlayerPagerPresenter.this.f((q) entry.getValue());
                View view = (View) entry.getKey();
                if (a((q) entry.getValue(), view, wcVar)) {
                    a.a(view, wcVar);
                }
            }
        }

        private boolean a(q qVar, View view, C4519wc wcVar) {
            return (wcVar.e().x() && PlayerPagerPresenter.this.a(view, wcVar.e())) || (wcVar.e().e() && wcVar.e().equals(qVar.c()));
        }
    }

    private final class d extends C5037Jua<C4431ub> {
        private d() {
        }

        /* synthetic */ d(PlayerPagerPresenter playerPagerPresenter, Ib ib) {
            this();
        }

        public void a(C4431ub ubVar) {
            PlayerPagerPresenter.this.C = ubVar;
            for (Entry entry : PlayerPagerPresenter.this.v.entrySet()) {
                PlayerPagerPresenter.this.a(ubVar, PlayerPagerPresenter.this.f((q) entry.getValue()), (View) entry.getKey());
            }
        }
    }

    private class e extends C5068Kua<Set<C3799jda>> {
        private final Cb d;
        private final View e;
        private q f;

        e(Cb cb, View view, q qVar) {
            this.d = cb;
            this.e = view;
            this.f = qVar;
        }

        /* renamed from: a */
        public void onSuccess(Set<C3799jda> set) {
            super.onSuccess(set);
            if (this.f.equals(PlayerPagerPresenter.this.v.get(this.e))) {
                this.d.a(this.e, set);
            }
        }
    }

    private static class f extends C5037Jua<C4510zb> {
        private final Cb d;
        private final View e;

        f(Cb cb, View view) {
            this.d = cb;
            this.e = view;
        }

        public void a(C4510zb zbVar) {
            this.d.a(this.e, zbVar);
        }
    }

    private final class g extends C5037Jua<Iaa> {
        private g() {
        }

        /* synthetic */ g(PlayerPagerPresenter playerPagerPresenter, Ib ib) {
            this();
        }

        public void a(Iaa iaa) {
            PlayerPagerPresenter.this.B = iaa;
            for (Entry entry : PlayerPagerPresenter.this.v.entrySet()) {
                PlayerPagerPresenter.this.a(iaa, PlayerPagerPresenter.this.f((q) entry.getValue()), (View) entry.getKey());
            }
        }
    }

    private class h extends C5037Jua<Map<C3508cda, J>> {
        private h() {
        }

        /* synthetic */ h(PlayerPagerPresenter playerPagerPresenter, Ib ib) {
            this();
        }

        public void a(Map<C3508cda, J> map) {
            for (C3508cda cda : map.keySet()) {
                PlayerPagerPresenter.this.F.remove(cda);
                for (Entry entry : PlayerPagerPresenter.this.v.entrySet()) {
                    Cb a = PlayerPagerPresenter.this.f((q) entry.getValue());
                    View view = (View) entry.getKey();
                    if (PlayerPagerPresenter.this.a(view, cda)) {
                        a.a(view, (J) map.get(cda));
                    }
                }
            }
        }
    }

    private class i extends androidx.viewpager.widget.a {
        private i() {
        }

        private View e(int i) {
            View view;
            q qVar = (q) PlayerPagerPresenter.this.A.get(i);
            C3508cda c2 = qVar.c();
            if (PlayerPagerPresenter.this.o.a(c2)) {
                view = PlayerPagerPresenter.this.o.b(c2);
                if (!PlayerPagerPresenter.this.D) {
                    PlayerPagerPresenter.this.f.c(view);
                }
            } else {
                View a = PlayerPagerPresenter.this.o.a((C7054oVa<View>) new C4508z<View>(this));
                PlayerPagerPresenter.this.f(qVar).g(a);
                view = a;
            }
            PlayerPagerPresenter.this.a(i, view);
            PlayerPagerPresenter.this.a(view, i);
            return view;
        }

        private boolean f(int i) {
            return i > 0 && i < PlayerPagerPresenter.this.A.size() - 1;
        }

        public int a(Object obj) {
            if (!PlayerPagerPresenter.this.a(obj)) {
                return PlayerPagerPresenter.this.A();
            }
            int indexOf = PlayerPagerPresenter.this.A.indexOf(PlayerPagerPresenter.this.v.get(obj));
            if (!f(indexOf)) {
                indexOf = -2;
            }
            return indexOf;
        }

        public /* synthetic */ View d() {
            C7316sHa.d(new IllegalStateException("No recycled or scrap views available in player"));
            return PlayerPagerPresenter.this.f.a((ViewGroup) PlayerPagerPresenter.this.I, PlayerPagerPresenter.this.z);
        }

        /* synthetic */ i(PlayerPagerPresenter playerPagerPresenter, Ib ib) {
            this();
        }

        public int a() {
            return PlayerPagerPresenter.this.A.size();
        }

        public final Object a(ViewGroup viewGroup, int i) {
            View view;
            int b = PlayerPagerPresenter.this.c(i);
            if (b == 1) {
                view = a((Ca) PlayerPagerPresenter.this.g, viewGroup, i);
            } else if (b != 2) {
                view = e(i);
            } else {
                view = a((Ca) PlayerPagerPresenter.this.h, viewGroup, i);
            }
            PlayerPagerPresenter.this.a(view);
            try {
                viewGroup.addView(view);
                q qVar = (q) PlayerPagerPresenter.this.A.get(i);
                if (PlayerPagerPresenter.this.b.b(qVar)) {
                    PlayerPagerPresenter.this.f(qVar).b(view, qVar, PlayerPagerPresenter.this.B());
                }
                return view;
            } catch (IllegalStateException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("itemViewType: ");
                sb.append(b);
                throw new IllegalStateException(sb.toString(), e);
            }
        }

        private View a(Ca ca, ViewGroup viewGroup, int i) {
            PlayerPagerPresenter playerPagerPresenter = PlayerPagerPresenter.this;
            View a = ca.a(viewGroup, playerPagerPresenter.z);
            playerPagerPresenter.a(i, a);
            return a;
        }

        public void a(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            if (viewGroup.indexOfChild(view) >= 0) {
                viewGroup.removeView(view);
                if (PlayerPagerPresenter.this.a((Object) view)) {
                    q qVar = (q) PlayerPagerPresenter.this.v.get(view);
                    PlayerPagerPresenter.this.o.a(qVar.c(), view);
                    if (!PlayerPagerPresenter.this.b.b(qVar)) {
                        PlayerPagerPresenter.this.f.c(view);
                    }
                }
                PlayerPagerPresenter.this.v.remove(view);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("View is not a child of container: ");
            sb.append(view);
            sb.append(" Container: ");
            sb.append(viewGroup);
            sb.append(" Parent: ");
            sb.append(view.getParent());
            throw new IllegalStateException(sb.toString());
        }

        public boolean a(View view, Object obj) {
            return view.equals(obj);
        }
    }

    private class j extends C5037Jua<C> {
        private j() {
        }

        /* synthetic */ j(PlayerPagerPresenter playerPagerPresenter, Ib ib) {
            this();
        }

        public void a(C c) {
            for (com.soundcloud.android.foundation.events.C.a aVar : c.a().values()) {
                PlayerPagerPresenter.this.F.remove(aVar.b());
                for (Entry entry : PlayerPagerPresenter.this.v.entrySet()) {
                    Cb a = PlayerPagerPresenter.this.f((q) entry.getValue());
                    View view = (View) entry.getKey();
                    if (PlayerPagerPresenter.this.a(view, aVar.b())) {
                        a.a(view, aVar);
                    }
                }
            }
        }
    }

    PlayerPagerPresenter(C3814lca lca, C4416rb rbVar, Ca ca, ic icVar, mc mcVar, Fea fea, La la, rc rcVar, C2732f fVar, Na na, ke keVar, Eb eb, C5327TLa tLa, Ic ic, Ua ua, Ea ea, r rVar, C3989m mVar, C5039Jwa jwa, C6699jHa jha) {
        this.b = lca;
        this.e = ca;
        this.f = mcVar;
        this.c = rbVar;
        this.d = fea;
        this.g = la;
        this.h = rcVar;
        this.i = fVar;
        this.j = na;
        this.p = keVar;
        this.a = eb;
        this.k = tLa;
        this.l = icVar;
        this.m = ic;
        this.q = ua;
        this.n = ea;
        this.r = rVar;
        this.s = mVar;
        this.t = jwa;
        this.u = jha;
        this.w = new i(this, null);
        this.o = new pc();
    }

    /* access modifiers changed from: private */
    public int A() {
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((q) this.A.get(i2)).f() && this.j.e()) {
                return i2;
            }
        }
        return -2;
    }

    /* access modifiers changed from: private */
    public boolean B() {
        Iaa iaa = this.B;
        return iaa != null && iaa.c() == 0;
    }

    private void C() {
        for (Entry entry : this.v.entrySet()) {
            f((q) entry.getValue()).f((View) entry.getKey());
        }
    }

    private void D() {
        this.y.b((VPa) this.r.a().a(RPa.a()).c(new a(this, null)));
    }

    private void E() {
        UPa uPa = this.y;
        C6713jVa a2 = this.n.a();
        C5220Pua a3 = C5220Pua.a((C6776kQa<T>) new C4496v<T>(this));
        a2.c(a3);
        uPa.b(a3);
    }

    private void F() {
        if (M()) {
            this.y.b(this.k.a(C3876taa.d, (SUa<E>) new b<E>(this, null)));
        }
    }

    private void G() {
        this.x.b((VPa) this.k.a(C3876taa.c).a((C7256rQa<? super T>) new C4493u<Object>(this)).a(RPa.a()).c(new c(this, null)));
    }

    private void H() {
        this.x.b((VPa) this.k.a(C3876taa.b).a(RPa.a()).c(new d(this, null)));
    }

    private void I() {
        this.y.b(this.k.a(C3876taa.d, (SUa<E>) new g<E>(this, null)));
    }

    private void J() {
        UPa uPa = this.y;
        APa a2 = this.k.a(C3876taa.p).c((C7118pQa<? super T, ? extends EPa<? extends R>>) D.a).a(RPa.a());
        Z<C3508cda, C6849lVa<C6185ma>> z2 = this.F;
        z2.getClass();
        uPa.b((VPa) a2.c(C5220Pua.a((C6776kQa<T>) new C4440c<T>(z2))));
    }

    private void K() {
        this.y.b((VPa) this.s.g().a(RPa.a()).c(new h(this, null)));
    }

    private void L() {
        this.y.b((VPa) this.k.a(C3876taa.s).a((C7256rQa<? super T>) C4479p.a).a(RPa.a()).c(new j(this, null)));
    }

    private boolean M() {
        return !this.d.b("play_queue") && !this.i.e();
    }

    private void N() {
        for (Entry entry : this.v.entrySet()) {
            f((q) entry.getValue()).h((View) entry.getKey());
        }
    }

    /* access modifiers changed from: 0000 */
    public int v() {
        return this.I.getAdapter().a();
    }

    /* access modifiers changed from: 0000 */
    public q w() {
        return b(this.I.getCurrentItem());
    }

    /* access modifiers changed from: 0000 */
    public int x() {
        if (this.I.getCurrentItem() <= this.A.size() - 1) {
            return this.I.getCurrentItem();
        }
        int i2 = this.H;
        if (i2 == -1) {
            i2 = 0;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public List<q> y() {
        return this.A;
    }

    /* access modifiers changed from: 0000 */
    public void z() {
        for (Entry key : this.v.entrySet()) {
            View view = (View) key.getKey();
            if (a((Object) view)) {
                this.f.k(view);
            }
        }
    }

    private APa<C4510zb> d(q qVar) {
        if (qVar.e()) {
            return a((C3676c) qVar.a().b());
        }
        if (!qVar.j() || !this.b.e().v()) {
            return a(qVar.c(), qVar.a()).h(new A(this, qVar));
        }
        return c(qVar);
    }

    private boolean e(q qVar) {
        int i2 = this.H;
        return i2 != -1 && qVar.equals(this.A.get(i2));
    }

    /* renamed from: c */
    public void onResume(PlayerFragment playerFragment) {
        super.onResume(playerFragment);
        this.D = true;
        H();
        G();
        for (Entry entry : this.v.entrySet()) {
            q qVar = (q) entry.getValue();
            View view = (View) entry.getKey();
            f(qVar).d(view);
            a(qVar, view);
        }
    }

    public void f() {
        C();
        N();
    }

    public void g() {
        C();
        N();
    }

    /* access modifiers changed from: private */
    public Cb f(q qVar) {
        if (!qVar.e()) {
            return this.f;
        }
        return qVar.k() ? this.h : this.g;
    }

    private C7118pQa<C6185ma, Pb> g(q qVar) {
        C4431ub ubVar = this.C;
        if (ubVar == null) {
            ubVar = Ba.a;
        }
        return new C4490t(this, qVar, ubVar);
    }

    /* access modifiers changed from: 0000 */
    public q b(int i2) {
        return (q) this.A.get(i2);
    }

    /* renamed from: b */
    public void onPause(PlayerFragment playerFragment) {
        this.D = false;
        this.x.b();
        for (Entry entry : this.v.entrySet()) {
            f((q) entry.getValue()).c((View) entry.getKey());
        }
        super.onPause(playerFragment);
    }

    /* access modifiers changed from: private */
    public void d(int i2) {
        q qVar = (q) this.A.get(i2);
        for (Entry entry : this.v.entrySet()) {
            if (qVar.equals(entry.getValue())) {
                View view = (View) entry.getKey();
                f((q) this.v.get(view)).b(view, (q) entry.getValue(), B());
            }
        }
        this.H = i2;
    }

    private void b(com.soundcloud.android.playback.ui.view.m.a aVar) {
        C4518wb wbVar = B() ? C4518wb.FULL : C4518wb.MINI;
        if (aVar == com.soundcloud.android.playback.ui.view.m.a.RIGHT) {
            this.m.f(wbVar);
        } else {
            this.m.e(wbVar);
        }
    }

    /* access modifiers changed from: private */
    public int c(int i2) {
        q qVar = (q) this.A.get(i2);
        if (!qVar.e()) {
            return 0;
        }
        return qVar.k() ? 2 : 1;
    }

    /* access modifiers changed from: 0000 */
    public void a(List<q> list, int i2) {
        m.b("Cannot set playqueue from non-UI thread");
        this.H = i2;
        this.A = list;
        this.w.b();
    }

    private void b(PlayerTrackPager playerTrackPager) {
        for (int i2 = 0; i2 < 6; i2++) {
            this.o.a(this.f.a((ViewGroup) playerTrackPager, this.z));
        }
    }

    private APa<C4510zb> c(q qVar) {
        return APa.b((EPa<? extends T1>) a(qVar.c(), qVar.a()).h(g(qVar)), (EPa<? extends T2>) this.l.a(this.b.e()).g(), (C6504gQa<? super T1, ? super T2, ? extends R>) B.a);
    }

    public /* synthetic */ MPa b(q qVar, k kVar) throws Exception {
        return this.q.a(qVar.c()).b(Collections.emptySet());
    }

    private APa<C4510zb> b(q qVar) {
        if (qVar.e()) {
            return APa.c(b((C3676c) qVar.a().b()));
        }
        return APa.c(Pb.b);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, boolean z2) {
        if (i2 >= 0 && x() != i2) {
            this.I.a(i2, z2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        for (Entry entry : this.v.entrySet()) {
            f((q) entry.getValue()).a((View) entry.getKey(), f2);
        }
    }

    /* access modifiers changed from: private */
    public C4489sb b(C3676c cVar) {
        return cVar instanceof aa ? new tc((aa) cVar) : new Qa((C3693u) cVar);
    }

    private Boolean b(View view, C4510zb zbVar) {
        if (!(zbVar instanceof C4489sb)) {
            return Boolean.valueOf(a(view, zbVar.f()));
        }
        return Boolean.valueOf(this.v.containsKey(view) && ((q) this.v.get(view)).e() && ((C3676c) ((q) this.v.get(view)).a().b()).f().equals(((C4489sb) zbVar).h()));
    }

    /* renamed from: a */
    public void onViewCreated(PlayerFragment playerFragment, View view, Bundle bundle) {
        super.onViewCreated(playerFragment, view, bundle);
        this.I = playerFragment.Bb();
        this.I.a(this.G);
        this.I.setSwipeListener(this);
        this.H = this.I.getCurrentItem();
        this.I.setPageMargin(view.getResources().getDimensionPixelSize(com.soundcloud.android.ia.g.player_pager_spacing));
        this.I.setPageMarginDrawable(com.soundcloud.android.ia.f.black);
        this.I.setAdapter(this.w);
        this.z = a(this.I);
        this.i.b(this);
        b(this.I);
        I();
        F();
        J();
        L();
        K();
        D();
        E();
    }

    /* access modifiers changed from: private */
    public void b(View view) {
        q qVar = (q) this.v.get(view);
        if (this.D && e(qVar) && !this.i.e()) {
            f(qVar).i(view);
        }
    }

    public /* synthetic */ void a(Boolean bool) throws Exception {
        this.E = bool.booleanValue();
    }

    public /* synthetic */ boolean a(C4519wc wcVar) throws Exception {
        q h2 = this.b.h();
        return !h2.g() && h2.c().equals(wcVar.e());
    }

    /* renamed from: a */
    public void onDestroyView(PlayerFragment playerFragment) {
        for (Entry entry : this.v.entrySet()) {
            f((q) entry.getValue()).b((View) entry.getKey());
        }
        if (playerFragment.getActivity().isChangingConfigurations()) {
            this.p.a(com.soundcloud.android.playback.ke.b.PLAYER);
        } else {
            this.p.b(com.soundcloud.android.playback.ke.b.PLAYER);
        }
        playerFragment.Bb().b(this.G);
        this.i.a(this);
        this.z = null;
        this.y.b();
        super.onDestroyView(playerFragment);
    }

    private Xb a(PlayerTrackPager playerTrackPager) {
        return new Jb(this, playerTrackPager);
    }

    public void a(com.soundcloud.android.playback.ui.view.m.a aVar) {
        b(aVar);
    }

    /* access modifiers changed from: private */
    public boolean a(Object obj) {
        return this.f.j((View) obj);
    }

    /* access modifiers changed from: private */
    public View a(int i2, View view) {
        q qVar = (q) this.A.get(i2);
        this.v.put(view, qVar);
        Cb f2 = f(qVar);
        if (this.D) {
            f2.d(view);
            a(qVar, view);
        }
        this.x.b((VPa) d(qVar).a(RPa.a()).a((C7256rQa<? super T>) new C4499w<Object>(this, view)).e((EPa<? extends T>) b(qVar)).c(new f(f2, view)));
        if (qVar.j() && this.u.m()) {
            UPa uPa = this.x;
            IPa a2 = a(qVar).a(RPa.a());
            e eVar = new e(f2, view, qVar);
            a2.c(eVar);
            uPa.b(eVar);
        }
        return view;
    }

    public /* synthetic */ boolean a(View view, C4510zb zbVar) throws Exception {
        return b(view, zbVar).booleanValue();
    }

    private IPa<Set<C3799jda>> a(q qVar) {
        return this.r.a().a((C7256rQa<? super T>) new E<Object>(this, qVar)).g().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4502x<Object,Object>(this, qVar));
    }

    public /* synthetic */ boolean a(q qVar, k kVar) throws Exception {
        q b2 = kVar.b();
        return b2.j() && b2.c().equals(qVar.c()) && this.t.b();
    }

    private void a(q qVar, View view) {
        if (qVar.k()) {
            this.p.a(((aa) qVar.a().b()).I(), com.soundcloud.android.playback.ke.b.PLAYER, this.h.j(view), this.h.k(view));
        }
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        Cb f2 = f((q) this.v.get(view));
        Iaa iaa = this.B;
        if (iaa != null) {
            a(iaa, f2, view);
        }
        C4431ub ubVar = this.C;
        if (ubVar != null) {
            a(ubVar, f2, view);
        }
    }

    public /* synthetic */ C4510zb a(q qVar, C6185ma maVar) throws Exception {
        return (Pb) g(qVar).apply(maVar);
    }

    public /* synthetic */ Pb a(q qVar, C4431ub ubVar, C6185ma maVar) throws Exception {
        Pb pb = new Pb(maVar, this.b.b(qVar), this.D, this.c.c(qVar.c()), ubVar);
        return pb;
    }

    private APa<C6185ma> a(C3508cda cda, C4928GKa<C3676c> gKa) {
        return a(cda).d((C6776kQa<? super T>) new C4505y<Object>(gKa));
    }

    static /* synthetic */ void a(C4928GKa gKa, C6185ma maVar) throws Exception {
        if (gKa.c() && (gKa.b() instanceof O)) {
            ((C3676c) gKa.b()).b(maVar.B());
            ((C3676c) gKa.b()).a(maVar.d());
        }
    }

    private APa<C4510zb> a(C3676c cVar) {
        return a(cVar.i()).h(new C(cVar)).h(new F(this));
    }

    static /* synthetic */ C3676c a(C3676c cVar, C6185ma maVar) throws Exception {
        cVar.b(maVar.B());
        cVar.a(maVar.d());
        return cVar;
    }

    /* access modifiers changed from: private */
    public void a(View view, int i2) {
        q qVar = (q) this.A.get(i2);
        this.f.a(view, i2, this.A.size());
        this.f.h(view);
        if (Ma.a(qVar)) {
            this.f.a(view, (ca) qVar.a().b());
            return;
        }
        this.f.e(view);
    }

    private APa<C6185ma> a(C3508cda cda) {
        C6849lVa lva = (C6849lVa) this.F.get(cda);
        if (lva != null) {
            return lva;
        }
        C6849lVa s2 = C6849lVa.s();
        this.e.c(cda).g().a(RPa.a()).a((GPa<? super T>) s2);
        this.F.put(cda, s2);
        return s2;
    }

    /* access modifiers changed from: private */
    public boolean a(View view, C3508cda cda) {
        if (!this.v.containsKey(view) || !((q) this.v.get(view)).j()) {
            return this.o.a(view, cda);
        }
        return ((q) this.v.get(view)).c().equals(cda);
    }

    /* access modifiers changed from: private */
    public void a(C4431ub ubVar, Cb cb, View view) {
        cb.a(view, ubVar, (this.v.containsKey(view) && ((q) this.v.get(view)).j() && a(view, ubVar.s())) || (this.v.containsKey(view) && ((q) this.v.get(view)).e() && ubVar.s().equals(((q) this.v.get(view)).c())), this.D, this.E);
    }

    /* access modifiers changed from: private */
    public void a(Iaa iaa, Cb cb, View view) {
        int c2 = iaa.c();
        if (c2 == 0) {
            q qVar = (q) this.v.get(view);
            cb.a(view, qVar, e(qVar));
        } else if (c2 == 1) {
            cb.a(view);
        }
    }
}
