package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.s;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.t;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.Yc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PlayQueuePresenter */
class Pa {
    private final C3814lca a;
    private final C4412qb b;
    private final Yc c;
    private final C4392qa d;
    private final C5327TLa e;
    private final C3700b f;
    private final Xa g;
    private final C2014EO h;
    private final HPa i;
    private final UPa j = new UPa();
    private final C6985nVa<RVa> k = C6781kVa.s();
    /* access modifiers changed from: private */
    public C4928GKa<PlayQueueView> l = C4928GKa.a();
    private C4928GKa<b> m = C4928GKa.a();
    private List<Va> n = new ArrayList();
    /* access modifiers changed from: private */
    public boolean o = true;
    /* access modifiers changed from: private */
    public boolean p = false;

    /* compiled from: PlayQueuePresenter */
    private class a extends C5037Jua<List<Va>> {
        private a() {
        }

        /* synthetic */ a(Pa pa, Oa oa) {
            this();
        }

        public void a(List<Va> list) {
            Pa.this.l.a((C7733yKa<? super T>) new C4404x<Object>(this, list));
        }

        public /* synthetic */ void a(List list, PlayQueueView playQueueView) {
            Pa.this.k();
            playQueueView.a(list);
            if (Pa.this.o) {
                playQueueView.a(Pa.this.h(), false);
                playQueueView.v();
                Pa.this.o = false;
                Pa.this.a(u.PLAY_QUEUE_LOAD, list.size());
            } else if (Pa.this.p) {
                playQueueView.a(Pa.this.i(), false);
                Pa.this.p = false;
            }
        }
    }

    /* compiled from: PlayQueuePresenter */
    private class b {
        /* access modifiers changed from: private */
        public final List<q> a;
        /* access modifiers changed from: private */
        public final int b;
        /* access modifiers changed from: private */
        public final List<Va> c;
        /* access modifiers changed from: private */
        public final int d;

        b(List<q> list, int i, List<Va> list2, int i2) {
            this.a = list;
            this.b = i;
            this.c = list2;
            this.d = i2;
        }
    }

    Pa(C3814lca lca, C4412qb qbVar, C4392qa qaVar, Yc yc, C5327TLa tLa, C3700b bVar, Xa xa, C2014EO eo, HPa hPa) {
        this.a = lca;
        this.b = qbVar;
        this.d = qaVar;
        this.c = yc;
        this.e = tLa;
        this.f = bVar;
        this.g = xa;
        this.h = eo;
        this.i = hPa;
    }

    /* access modifiers changed from: private */
    public int h() {
        return b(this.a.h());
    }

    /* access modifiers changed from: private */
    public int i() {
        return C1943BD.d(this.n, N.a);
    }

    private defpackage.C3814lca.b j() {
        defpackage.C3814lca.b[] values = defpackage.C3814lca.b.values();
        return values[(this.a.q().ordinal() + 1) % values.length];
    }

    /* access modifiers changed from: private */
    public void k() {
        i(a(this.a.h()));
    }

    private void l() {
        this.j.b((VPa) this.e.a(C3876taa.b).c(1).a(RPa.a()).h(new B(this)).c(new a(this, null)));
    }

    private void m() {
        this.j.b((VPa) this.k.h(new r(this)).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C4394s<Object,Object>(this)).d((C6776kQa<? super T>) new A<Object>(this)).d((C6776kQa<? super T>) new C4387o<Object>(this)).b(this.i).a(RPa.a()).c(new a(this, null)));
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        if (this.l.c() && this.m.c()) {
            b bVar = (b) this.m.b();
            this.n.addAll(bVar.d, bVar.c);
            this.k.a(RVa.a);
            this.a.a(bVar.b, bVar.a);
            this.f.a((J) K.b(Yca.PLAY_QUEUE));
        }
    }

    private APa<List<eb>> f(List<Va> list) {
        return APa.c(list).h(C4406y.a).h(C4389p.a);
    }

    private boolean h(int i2) {
        return g(i2 + -1) && g(i2 + 1);
    }

    private void i(int i2) {
        if (this.n.size() != i2 || !((Va) this.n.get(i2)).i() || !((Va) this.n.get(i2)).g()) {
            boolean isPlaying = this.b.isPlaying();
            C4928GKa a2 = C4928GKa.a();
            boolean z = false;
            for (int i3 = 0; i3 < this.n.size(); i3++) {
                Va va = (Va) this.n.get(i3);
                if (va.i()) {
                    hb hbVar = (hb) va;
                    a(i2, i3, hbVar, isPlaying);
                    hbVar.a(hbVar.b().equals(bb.COMING_UP));
                    if (!z && a2.c()) {
                        z = a(hbVar);
                        ((C4382la) a2.b()).a(hbVar.b());
                        ((C4382la) a2.b()).a(hbVar.b().equals(bb.COMING_UP));
                    }
                } else if (va.e()) {
                    a2 = C4928GKa.c((C4382la) va);
                    z = false;
                }
            }
        }
    }

    public /* synthetic */ void c(List list) throws Exception {
        this.n = list;
    }

    public /* synthetic */ void d(List list) throws Exception {
        k();
    }

    /* access modifiers changed from: 0000 */
    public void e(int i2) {
        if (((Va) this.n.get(i2)).i()) {
            hb hbVar = (hb) this.n.get(i2);
            i(i2);
            ((PlayQueueView) this.l.b()).a(this.n);
            this.a.f(hbVar.m());
            if (this.b.m()) {
                this.b.j();
            } else {
                this.b.play();
            }
        }
    }

    private void c(int i2, int i3) {
        ArrayList<Va> arrayList = new ArrayList<>();
        arrayList.add(this.n.get(i2));
        int i4 = i2 + 1;
        while (i4 < this.n.size()) {
            Va va = (Va) this.n.get(i4);
            if (!va.i()) {
                break;
            } else if (va.h()) {
                arrayList.add(va);
                i4++;
            } else {
                return;
            }
        }
        ((PlayQueueView) this.l.b()).c(i3);
        this.n.removeAll(arrayList);
        this.k.a(RVa.a);
        ArrayList arrayList2 = new ArrayList();
        int i5 = -1;
        for (Va va2 : arrayList) {
            if (va2.i()) {
                hb hbVar = (hb) va2;
                arrayList2.add(hbVar.m());
                if (i5 == -1) {
                    i5 = this.a.a((q) arrayList2.get(0));
                }
                this.a.e(hbVar.m());
            }
        }
        b bVar = new b(arrayList2, i5, arrayList, i2);
        this.m = C4928GKa.c(bVar);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.l = C4928GKa.a();
        this.j.b();
        this.o = true;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.l.a((C7733yKa<? super T>) new C<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    public void a(PlayQueueView playQueueView) {
        this.l = C4928GKa.c(playQueueView);
        this.h.a(u.PLAY_QUEUE_LOAD);
        playQueueView.f(this.a.y());
        a(this.a.q());
        if (this.n.isEmpty()) {
            ((PlayQueueView) this.l.b()).z();
        }
        this.j.b((VPa) this.d.a().a(RPa.a()).d((C6776kQa<? super T>) new C4402w<Object>(this)).d((C6776kQa<? super T>) new C4400v<Object>(this)).h(C4367e.a).c(new a(this, null)));
        l();
        m();
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2) {
        int i3 = i2 - 5;
        if (i3 < 0) {
            i3 = 0;
        }
        this.c.a(i3, 5);
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        boolean z = !this.a.y();
        if (z) {
            this.a.F();
        } else {
            this.a.G();
        }
        this.l.a((C7733yKa<? super T>) new C4398u<Object>(z));
        this.f.a((J) K.a(z));
    }

    public /* synthetic */ EPa b(List list) throws Exception {
        return APa.b((EPa<? extends T1>) f(list), (EPa<? extends T2>) e(list), (C6504gQa<? super T1, ? super T2, ? extends R>) this.g);
    }

    private boolean g(int i2) {
        return this.n.size() >= i2 && i2 >= 0 && ((Va) this.n.get(i2)).e();
    }

    public /* synthetic */ void b(PlayQueueView playQueueView) {
        playQueueView.a(h(), true);
    }

    private int b(q qVar) {
        return Math.max(a(qVar), 0);
    }

    private void b(defpackage.C3814lca.b bVar) {
        for (Va a2 : this.n) {
            a2.a(bVar);
        }
        if (this.l.c()) {
            ((PlayQueueView) this.l.b()).a(this.n);
        }
    }

    private int f(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.n.size(); i4++) {
            if (i4 == i2) {
                return i3;
            }
            if (((Va) this.n.get(i4)).i()) {
                i3++;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        defpackage.C3814lca.b j2 = j();
        this.a.a(j2);
        a(j2);
        b(j2);
        this.f.a((J) K.a(Yca.PLAY_QUEUE, j2.a()));
    }

    public void b(int i2) {
        if (this.l.c()) {
            Va va = (Va) this.n.get(i2);
            if (va.i()) {
                q m2 = ((hb) va).m();
                int a2 = this.a.a(m2);
                if (h(i2)) {
                    c(i2 - 1, p.track_removed);
                } else {
                    a(i2, m2, a2);
                }
            } else if (va.e()) {
                c(i2, p.tracks_removed);
            }
        }
        this.f.a((J) K.a(Yca.PLAY_QUEUE));
    }

    private APa<Map<C3508cda, String>> e(List<Va> list) {
        return APa.c(list).h(new C4408z(list));
    }

    public /* synthetic */ void a(Za za) throws Exception {
        this.n = za.f();
    }

    public /* synthetic */ List a(C4431ub ubVar) throws Exception {
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.p = true;
        this.a.B();
    }

    public /* synthetic */ List a(RVa rVa) throws Exception {
        return this.n;
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2) {
        this.c.a(i2, 5);
    }

    static /* synthetic */ eb a(Va va) {
        hb hbVar = (hb) va;
        return new eb(hbVar.q(), (F) hbVar.m());
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2, int i3) {
        if (this.l.c()) {
            Collections.swap(this.n, i2, i3);
            ((PlayQueueView) this.l.b()).a(i2, i3);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.e.c(C3876taa.e, Ua.b());
        this.f.a((J) K.h());
    }

    private void a(defpackage.C3814lca.b bVar) {
        if (this.l.c()) {
            int i2 = Oa.a[bVar.ordinal()];
            if (i2 == 1) {
                ((PlayQueueView) this.l.b()).y();
            } else if (i2 != 2) {
                ((PlayQueueView) this.l.b()).x();
            } else {
                ((PlayQueueView) this.l.b()).w();
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(Za za) {
        if (za.e()) {
            a(u.PLAY_QUEUE_SHUFFLE, za.f().size());
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i2) {
        if (!this.l.c() || i2 < 0 || i2 >= this.n.size()) {
            return false;
        }
        return ((Va) this.n.get(i2)).h();
    }

    private void a(int i2, q qVar, int i3) {
        ((PlayQueueView) this.l.b()).c(p.track_removed);
        ((PlayQueueView) this.l.b()).b(i2);
        ArrayList a2 = C2063HD.a((E[]) new q[]{qVar});
        ArrayList arrayList = a2;
        int i4 = i3;
        b bVar = new b(arrayList, i4, C2063HD.a((E[]) new Va[]{(Va) this.n.remove(i2)}), i2);
        this.m = C4928GKa.c(bVar);
        if (i3 >= 0) {
            this.a.e(qVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.a.a(z);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3) {
        if (this.l.c()) {
            this.k.a(RVa.a);
            this.a.b(f(i2), f(i3));
            this.f.a((J) K.c(Yca.PLAY_QUEUE));
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.soundcloud.android.playback.playqueue.Va>, for r3v0, types: [java.util.List, java.util.List<com.soundcloud.android.playback.playqueue.Va>] */
    static /* synthetic */ Map a(List<Va> list, List list2) throws Exception {
        HashMap hashMap = new HashMap();
        for (Va va : list) {
            if (va.i()) {
                hb hbVar = (hb) va;
                C4928GKa j2 = hbVar.j();
                if (j2.c()) {
                    C4928GKa d2 = ((t) hbVar.m()).l().d();
                    if (d2.c()) {
                        hashMap.put(d2.b(), j2.b());
                    }
                }
            }
        }
        return hashMap;
    }

    private int a(q qVar) {
        return C1943BD.d(this.n, new C4396t(qVar));
    }

    static /* synthetic */ boolean a(q qVar, Va va) {
        return va.i() && ((hb) va).m().equals(qVar);
    }

    /* access modifiers changed from: private */
    public void a(u uVar, int i2) {
        this.h.b(C1994DO.a().a(uVar).a(com.soundcloud.android.foundation.events.t.a(s.PLAY_QUEUE_SIZE, (long) i2)).b());
    }

    private boolean a(hb hbVar) {
        return hbVar.g() || bb.COMING_UP.equals(hbVar.b());
    }

    private void a(int i2, int i3, hb hbVar, boolean z) {
        if (i2 == i3) {
            hbVar.a(z ? bb.PLAYING : bb.PAUSED);
        } else if (i3 > i2) {
            hbVar.a(bb.COMING_UP);
        } else {
            hbVar.a(bb.PLAYED);
        }
    }
}
