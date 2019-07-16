package defpackage;

import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.events.B;
import com.soundcloud.android.foundation.events.H;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.playqueue.A;
import com.soundcloud.android.foundation.playqueue.D;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.n;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.p;
import com.soundcloud.android.foundation.playqueue.p.c;
import com.soundcloud.android.foundation.playqueue.p.d;
import com.soundcloud.android.foundation.playqueue.p.e;
import com.soundcloud.android.foundation.playqueue.p.f;
import com.soundcloud.android.foundation.playqueue.p.g;
import com.soundcloud.android.foundation.playqueue.p.h;
import com.soundcloud.android.foundation.playqueue.p.i;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.foundation.playqueue.t;
import com.soundcloud.android.foundation.playqueue.v;
import com.soundcloud.android.foundation.playqueue.x;
import com.soundcloud.android.foundation.playqueue.y;
import com.soundcloud.android.utilities.android.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: lca reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueManager */
public class C3814lca implements r {
    private static final Predicate<q> a = Sba.a;
    private final HPa b;
    private final HPa c;
    private final C2332VH<p> d = C2332VH.s();
    private final C2314UH<k> e = C2314UH.s();
    private final C3790ica f;
    private final C3469VY g;
    private final C3830nca h;
    private int i;
    private boolean j;
    private b k = b.REPEAT_NONE;
    private boolean l = true;
    private o m = o.g();
    private PlaySessionSource n = PlaySessionSource.a;

    /* renamed from: lca$a */
    /* compiled from: PlayQueueManager */
    private static class a extends Exception {
        private a() {
        }

        /* synthetic */ a(C3806kca kca) {
            this();
        }
    }

    /* renamed from: lca$b */
    /* compiled from: PlayQueueManager */
    public enum b {
        REPEAT_NONE(""),
        REPEAT_ONE("one"),
        REPEAT_ALL("all");
        
        private final String e;

        private b(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    public C3814lca(C3830nca nca, C3469VY vy, C3790ica ica, HPa hPa, HPa hPa2) {
        this.h = nca;
        this.g = vy;
        this.f = ica;
        this.b = hPa;
        this.c = hPa2;
    }

    private boolean H() {
        if (!n().j()) {
            return true;
        }
        t tVar = (t) n();
        if (!tVar.a(com.soundcloud.android.foundation.playqueue.v.a.AUTO_PLAY) || this.l || tVar.t()) {
            return true;
        }
        return false;
    }

    private boolean I() {
        if (!n().j()) {
            return true;
        }
        t tVar = (t) n();
        if (!tVar.a(com.soundcloud.android.foundation.playqueue.v.a.AUTO_PLAY) || tVar.t()) {
            return true;
        }
        return false;
    }

    private int J() {
        int p = p();
        for (int i2 = this.i + 1; i2 < p; i2++) {
            if (d(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int K() {
        int i2 = this.i;
        for (int i3 = 0; i3 < this.i; i3++) {
            if (!this.m.r(i3)) {
                i2--;
            }
        }
        return i2;
    }

    private int L() {
        for (int i2 = this.i - 1; i2 > 0; i2--) {
            if (d(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private void M() {
        if (this.m != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            Iterator it = this.m.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (qVar.f()) {
                    i2++;
                } else if (qVar.k()) {
                    i3++;
                }
                sb.append(qVar.b());
                sb.append(':');
                sb.append(qVar.c());
                sb.append(',');
            }
            sb.append(']');
            SDb.c("New play queue is %s", sb.toString());
            if (i2 > 1 || i3 > 1) {
                C3469VY vy = this.g;
                a aVar = new a(null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid number of ads in play queue: ");
                sb2.append(sb.toString());
                vy.a(aVar, new HVa("queue", sb2.toString()));
            }
        }
    }

    private int N() {
        int i2 = this.i + 1;
        if (i2 >= this.m.size()) {
            return i2;
        }
        return i2 + C1943BD.d(this.m.k().subList(i2, this.m.size()), a);
    }

    private void O() {
        a((k) new n(h(), e(), j()));
    }

    private void P() {
        a((k) new x(h(), e(), j()));
    }

    private void Q() {
        a((k) new A(h(), e(), j()));
    }

    private boolean R() {
        this.j = false;
        q h2 = h();
        if (h2.e()) {
            c(this.j);
        } else {
            a((k) new y(h2, e(), j()));
        }
        return true;
    }

    private void S() {
        b((p) new e(e()));
    }

    private void T() {
        b((p) new f(e()));
    }

    private void c(o oVar) {
        int a2 = oVar.a(h());
        C7457uKa.a(a2, this.m.size(), "The current play queue item must be present in the new play queue.");
        d(oVar, this.n);
        this.i = a2;
        S();
    }

    public boolean A() {
        return c(true);
    }

    public void B() {
        for (q qVar : this.m.k()) {
            if (qVar.j()) {
                t tVar = (t) qVar;
                if (!tVar.t() && tVar.a(com.soundcloud.android.foundation.playqueue.v.a.AUTO_PLAY)) {
                    b(this.m.a(qVar), true);
                    return;
                }
            }
        }
    }

    public boolean C() {
        if (!u()) {
            return false;
        }
        int L = L();
        if (L == -1) {
            L = 0;
        }
        b(L, true);
        return true;
    }

    public List<C3676c> D() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            q c2 = this.m.c(i2);
            if (c2.a().c() && c2.j()) {
                arrayList.add(c2.a().b());
                this.m.b(i2, Collections.singletonList(((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a((F) c2).b()).c()));
            }
        }
        return arrayList;
    }

    public void E() {
        if (this.m.i()) {
            this.h.a(K(), this.n);
        }
    }

    public void F() {
        c((o) this.m.s(this.i + 1 >= this.m.size() ? 0 : this.i + 1));
    }

    public void G() {
        o oVar = this.m;
        if (oVar instanceof D) {
            c(((D) oVar).l());
            return;
        }
        throw new IllegalStateException("unshuffle must be called on a shuffled play queue.");
    }

    public C2350WH<p> b() {
        return this.d;
    }

    public boolean d(C3508cda cda) {
        int j2 = j();
        return j2 < p() && !a(j2).g() && a(j2).c().equals(cda);
    }

    public boolean e(C3508cda cda) {
        return cda.x() && d(cda);
    }

    public void f(q qVar) {
        b(this.m.a(qVar), true);
        E();
    }

    public C4928GKa<C3508cda> g() {
        q h2 = h();
        if (!h2.g()) {
            return C4928GKa.c(h2.c());
        }
        return C4928GKa.a();
    }

    public q h() {
        return a(this.i);
    }

    public PlaySessionSource i() {
        return this.n;
    }

    public int j() {
        return this.i;
    }

    public List<C3508cda> k() {
        return this.m.h();
    }

    public I l() {
        if (this.m.isEmpty()) {
            return null;
        }
        I i2 = new I(this.n.g(), this.j);
        q h2 = h();
        if (h2.j()) {
            F f2 = (F) h2;
            i2.a(f2.p(), f2.r());
            i2.a(f2.o());
        }
        if (this.n.n()) {
            i2.a(this.n.j());
        }
        if (this.n.m()) {
            i2.a(this.n.h());
        }
        if (this.n.o()) {
            i2.a(this.n.d(), new H(h2.j() ? ((F) h2).m() : C3508cda.a));
        }
        if (this.n.k()) {
            B i3 = this.n.i();
            if (i3 != null) {
                i2.a(i3);
            }
        }
        C3508cda d2 = this.n.d();
        if (d2.u()) {
            i2.a(d2, j(), this.n.b());
        }
        if (d2.w()) {
            i2.a(d2, j());
        }
        return i2;
    }

    public q m() {
        return a(p() - 1);
    }

    public q n() {
        if (t()) {
            return this.m.c(j() + 1);
        }
        return q.a;
    }

    public int o() {
        int p = p();
        int i2 = 0;
        for (int i3 = this.i + 1; i3 < p; i3++) {
            if (d(i3)) {
                i2++;
            }
        }
        return i2;
    }

    public int p() {
        return this.m.size();
    }

    public b q() {
        return this.k;
    }

    public String r() {
        return this.n.g();
    }

    public List<q> s() {
        int i2 = this.i;
        ArrayList arrayList = new ArrayList(this.m.k());
        ArrayList arrayList2 = new ArrayList();
        if (i2 < arrayList.size() && i2 >= 0) {
            for (q qVar : arrayList.subList(i2, arrayList.size())) {
                if (qVar.h() && qVar != h() && ((t) qVar).a(com.soundcloud.android.foundation.playqueue.v.a.EXPLICIT)) {
                    arrayList2.add(qVar);
                }
            }
        }
        return arrayList2;
    }

    public boolean t() {
        return this.m.n(this.i);
    }

    public boolean u() {
        return this.m.o(this.i);
    }

    public boolean v() {
        return this.m.p(this.i);
    }

    public boolean w() {
        return this.l;
    }

    public boolean x() {
        return this.m.isEmpty();
    }

    public boolean y() {
        return this.m.j();
    }

    public C7531vPa<o> z() {
        return this.h.d().a(this.b).b((C6776kQa<? super T>) new Tba<Object>(this));
    }

    private boolean b(o oVar, PlaySessionSource playSessionSource) {
        return a(oVar, playSessionSource) && b(oVar);
    }

    public C2314UH<k> a() {
        return this.e;
    }

    public C3508cda e() {
        return this.n.d();
    }

    private boolean b(o oVar) {
        return oVar.j() == this.m.j();
    }

    public void a(o oVar, PlaySessionSource playSessionSource, int i2) {
        m.b("Play queues must be set from the main thread only.");
        c(oVar, playSessionSource);
        this.i = i2;
        if (!b(oVar, playSessionSource)) {
            d(oVar, playSessionSource);
            b((p) new c(e()));
        }
        O();
        E();
    }

    public void e(q qVar) {
        this.m.c(qVar);
        b((p) new h(e()));
    }

    public boolean f(C3508cda cda) {
        I l2 = l();
        if (l2 != null && l2.q()) {
            PromotedSourceInfo f2 = l2.f();
            if (l2.p() && l2.e() < this.n.c()) {
                return l2.a().equals(f2.b());
            }
            if (j() == 0) {
                return cda.equals(f2.b());
            }
        }
        return false;
    }

    public boolean b(q qVar) {
        return h().equals(qVar);
    }

    private boolean d(int i2) {
        return this.f.a(this.m.c(i2));
    }

    public List<C3508cda> b(int i2) {
        if (!u()) {
            return Collections.emptyList();
        }
        int max = Math.max(0, this.i - i2);
        return this.m.a(max, this.i - max);
    }

    private void d(o oVar, PlaySessionSource playSessionSource) {
        m.b("Play queues must be set from the main thread only.");
        if (!playSessionSource.equals(this.n)) {
            this.k = b.REPEAT_NONE;
            this.l = true;
        }
        this.m = oVar;
        this.j = true;
        this.n = playSessionSource;
    }

    public List<C3508cda> c(int i2) {
        if (!t()) {
            return Collections.emptyList();
        }
        return this.m.a(this.i + 1, i2);
    }

    public void b(C3508cda cda) {
        if (!this.m.isEmpty()) {
            this.m.a(N(), (q) ((com.soundcloud.android.foundation.playqueue.F.a) ((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a(cda).a(com.soundcloud.android.foundation.playqueue.m.PLAY_NEXT.a(), "")).a(v.a(com.soundcloud.android.foundation.playqueue.v.a.EXPLICIT))).c());
            b((p) new d(e()));
            return;
        }
        throw new IllegalStateException("It is not possible to insert when the play queue is empty");
    }

    public List<C3508cda> f() {
        return this.h.b();
    }

    private boolean a(o oVar, PlaySessionSource playSessionSource) {
        return this.m.a(oVar) && this.n.equals(playSessionSource);
    }

    static /* synthetic */ boolean c(q qVar) {
        if (qVar.e()) {
            return false;
        }
        if (qVar.j()) {
            return !((t) qVar).a(com.soundcloud.android.foundation.playqueue.v.a.EXPLICIT);
        }
        return true;
    }

    public int a(q qVar) {
        return this.m.a(qVar);
    }

    public List<q> a(Predicate<q> predicate) {
        return C2063HD.a(C1943BD.b(this.m, predicate));
    }

    public List<C3508cda> a(int i2, int i3) {
        if (i2 < 0 || this.m.size() < i2) {
            return Collections.emptyList();
        }
        return this.m.a(i2, i3);
    }

    public void d() {
        m.b("Play queues must be set from the main thread only.");
        this.h.a();
        this.m = o.g();
        this.n = PlaySessionSource.a;
        a((p) new c(C3508cda.a));
        O();
    }

    private void c(o oVar, PlaySessionSource playSessionSource) {
        if (oVar.isEmpty()) {
            this.g.a(new IllegalStateException("Setting empty play queue"), new HVa("PlaySessionSource", playSessionSource.toString()));
        }
    }

    public void a(C3508cda cda, List<C3508cda> list) {
        for (q qVar : this.m.b(cda)) {
            t tVar = (t) qVar;
            int a2 = this.m.a(qVar);
            int i2 = this.i;
            if (a2 < i2) {
                this.i = i2 + (list.size() - 1);
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (C3508cda aVar : list) {
                arrayList.add(((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a(aVar).a(tVar)).c());
            }
            this.m.b(a2, (List<q>) arrayList);
        }
        T();
    }

    public boolean c() {
        int i2 = C3806kca.a[this.k.ordinal()];
        if (i2 == 1) {
            return R();
        }
        if (i2 != 2) {
            return c(false);
        }
        return b(false);
    }

    private void b(int i2, boolean z) {
        if (i2 != this.i && i2 < this.m.size()) {
            this.i = i2;
            q h2 = h();
            if (h2.h()) {
                ((t) h2).v();
            }
            this.j = z;
            P();
        }
    }

    public F d(q qVar) {
        F c2 = ((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a((F) qVar).b()).c();
        o oVar = this.m;
        oVar.b(oVar.a(qVar), Collections.singletonList(c2));
        return c2;
    }

    private boolean c(boolean z) {
        if (t()) {
            int J = J();
            if (J == -1) {
                J = this.i + 1;
            }
            if (H()) {
                b(J, z);
                E();
                return true;
            }
        }
        return false;
    }

    private boolean b(boolean z) {
        if (x()) {
            return false;
        }
        if (J() != -1 && I()) {
            return c(z);
        }
        if (this.i == 0) {
            return R();
        }
        if (d(0)) {
            b(0, z);
            return true;
        }
        this.i = 0;
        return c(z);
    }

    public void a(q qVar, List<q> list) {
        o oVar = this.m;
        oVar.b(oVar.a(qVar), list);
        T();
    }

    public boolean c(C3508cda cda) {
        return e().equals(cda);
    }

    private void c(p pVar) {
        M();
        a(pVar);
        this.h.b(this.m.f()).b(this.c).g();
    }

    public void a(List<C3508cda> list) {
        if (!this.m.isEmpty()) {
            int N = N();
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.m.a(N + i2, (q) ((com.soundcloud.android.foundation.playqueue.F.a) ((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a((C3508cda) list.get(i2)).a(com.soundcloud.android.foundation.playqueue.m.PLAY_NEXT.a(), "")).a(v.a(com.soundcloud.android.foundation.playqueue.v.a.EXPLICIT))).c());
            }
            b((p) new d(e()));
            return;
        }
        throw new IllegalStateException("It is not possible to insert when the play queue is empty");
    }

    public List<q> b(Predicate<q> predicate) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.m.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (predicate.apply(qVar)) {
                it.remove();
                arrayList.add(qVar);
                int i3 = this.i;
                if (i2 <= i3) {
                    this.i = i3 - 1;
                }
            } else {
                i2++;
            }
        }
        return arrayList;
    }

    public void a(Iterable<q> iterable) {
        this.m.a(iterable);
        T();
    }

    /* access modifiers changed from: 0000 */
    public q a(int i2) {
        if (i2 < 0 || i2 >= p()) {
            return q.a;
        }
        return this.m.c(i2);
    }

    private void b(p pVar) {
        if (this.m.i()) {
            c(pVar);
        }
    }

    @Deprecated
    public void a(int i2, boolean z) {
        b(i2, z);
    }

    public void a(b bVar) {
        this.k = bVar;
    }

    public void b(int i2, int i3) {
        this.m.b(i2, i3);
        b((p) new g(e()));
    }

    public void a(boolean z) {
        this.l = z;
        a((p) new com.soundcloud.android.foundation.playqueue.p.b(e()));
    }

    public /* synthetic */ void a(o oVar) throws Exception {
        this.i = this.h.c();
        SDb.c("Restoring playqueue: position %s of %s", Integer.valueOf(this.i), Integer.valueOf(oVar.size()));
        d(oVar, this.h.e());
        a((p) new i(e()));
        Q();
    }

    public PromotedSourceInfo a(C3508cda cda) {
        if (f(cda)) {
            I l2 = l();
            if (l2 != null) {
                return l2.f();
            }
        }
        return null;
    }

    public void a(q qVar, boolean z) {
        int a2 = this.m.a(qVar);
        if (a2 > this.i) {
            this.m.q(a2);
            if (z) {
                T();
            }
        }
    }

    public void a(int i2, List<q> list) {
        this.m.a(i2, list);
        a((p) new d(e()));
    }

    private void a(p pVar) {
        this.d.accept(pVar);
    }

    private void a(k kVar) {
        this.e.accept(kVar);
    }
}
