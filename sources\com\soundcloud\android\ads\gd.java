package com.soundcloud.android.ads;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.I;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.stream.C6114y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: StreamAdsController */
public class gd extends m {
    private static final long a = TimeUnit.SECONDS.toMillis(60);
    private final Na b;
    private final C3678e c;
    private final Tb d;
    private final Rb e;
    private final Ga f;
    private final C4806CMa<C2645ya> g;
    private final C2436_U h;
    /* access modifiers changed from: private */
    public final C5694cGa i;
    private final C5327TLa j;
    private final C3700b k;
    private final UPa l = new UPa();
    private VPa m = C4881Eua.b();
    private final List<C3676c> n = new ArrayList(3);
    /* access modifiers changed from: private */
    public List<C3676c> o = Collections.emptyList();
    /* access modifiers changed from: private */
    public C4928GKa<Long> p = C4928GKa.a();
    private C4928GKa<Qb> q = C4928GKa.a();
    private String r = "";
    private boolean s;
    private boolean t;
    private boolean u;

    /* compiled from: StreamAdsController */
    private class a extends C5068Kua<List<C3676c>> {
        private a() {
        }

        private void c() {
            gd gdVar = gd.this;
            gdVar.p = C4928GKa.c(Long.valueOf(gdVar.i.a()));
        }

        /* renamed from: a */
        public void onSuccess(List<C3676c> list) {
            super.onSuccess(list);
            if (list.isEmpty()) {
                c();
            } else {
                gd.this.o = list;
                gd.this.b();
            }
            dispose();
        }

        public void a(Throwable th) {
            super.a(th);
            c();
            dispose();
        }
    }

    public gd(Na na, C3678e eVar, Tb tb, Rb rb, Ga ga, C4806CMa<C2645ya> cMa, C2436_U _u, C5694cGa cga, C5327TLa tLa, C3700b bVar) {
        this.b = na;
        this.c = eVar;
        this.d = tb;
        this.e = rb;
        this.f = ga;
        this.g = cMa;
        this.h = _u;
        this.i = cga;
        this.j = tLa;
        this.k = bVar;
    }

    private boolean b(Fragment fragment) {
        return fragment.getActivity().isChangingConfigurations();
    }

    private void i() {
        com.soundcloud.android.utilities.android.m.b("Ad must be inserted on UI thread");
        if (!this.o.isEmpty() && this.q.c()) {
            C3676c cVar = (C3676c) this.o.get(0);
            if (((Qb) this.q.b()).a(cVar, this.s)) {
                this.n.add(cVar);
                this.o.remove(cVar);
                this.k.a((J) C3410BZ.a(C4928GKa.a(), cVar.f(), this.r, false, true, C4928GKa.c(cVar.k())));
            }
        }
    }

    private void j() {
        this.o = C2063HD.a(C1943BD.b(this.o, l()));
    }

    private VPa k() {
        IPa a2 = this.b.j().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new U<Object,Object>(this)).a(RPa.a());
        a aVar = new a();
        a2.c(aVar);
        return aVar;
    }

    private Predicate<C3676c> l() {
        return new T(this);
    }

    private void m() {
        this.j.c(C3876taa.h, new e(this.i.b(), false));
    }

    private void n() {
        for (C3676c cVar : this.n) {
            if (cVar instanceof aa) {
                String I = ((aa) cVar).I();
                this.f.b(I);
                this.c.a(I);
            }
        }
        this.u = false;
        this.n.clear();
        ((C2645ya) this.g.get()).d();
    }

    private boolean o() {
        return !this.p.c() || Math.abs(this.i.a() - ((Long) this.p.b()).longValue()) >= a;
    }

    private void p() {
        this.t = this.h.j();
    }

    public boolean c() {
        return this.u;
    }

    public void d() {
        if (this.t) {
            n();
        }
    }

    public void e() {
        this.m.dispose();
        this.l.b();
        this.q = C4928GKa.a();
    }

    public void f() {
        if (this.q.c() && !c()) {
            ((Qb) this.q.b()).a(true);
        }
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        this.u = false;
    }

    public void h() {
        this.u = true;
    }

    public void b(int i2) {
        this.s = i2 < 0;
        if (this.t && this.q.c()) {
            ((Qb) this.q.b()).a(false);
        }
    }

    public void a(RecyclerView recyclerView, C6114y yVar) {
        this.q = C4928GKa.c(this.e.a(recyclerView, yVar));
        this.l.a((VPa) this.h.c().e(Boolean.TRUE).c(C5220Pua.a((C6776kQa<T>) new S<T>(this))), this.d.a((Qb) this.q.b()), ((Qb) this.q.b()).b(), (VPa) this.j.a(C3876taa.d).a(Iaa.b).c(C5220Pua.a((C6776kQa<T>) new Q<T>(this))));
    }

    public void b() {
        if (this.t) {
            j();
            if (!this.o.isEmpty() || !this.m.a() || !o()) {
                i();
            } else {
                this.m = k();
            }
        }
    }

    public /* synthetic */ void a(Boolean bool) throws Exception {
        p();
    }

    public /* synthetic */ void a(Iaa iaa) throws Exception {
        m();
    }

    public void a(boolean z) {
        if (this.q.c() && !c() && z) {
            m();
        }
    }

    public void a(Fragment fragment) {
        if (!b(fragment) && !c()) {
            m();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.o = Collections.emptyList();
        this.q.a((C7733yKa<? super T>) C2543a.a);
        n();
    }

    public void a(RecyclerView recyclerView, int i2) {
        a(i2);
    }

    public void a(int i2) {
        if (i2 == 2) {
            b();
        }
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        b(i3);
    }

    public /* synthetic */ MPa a(C4928GKa gKa) throws Exception {
        Fa a2 = Fa.a.a(gKa);
        this.r = a2.h();
        return this.b.a(a2);
    }

    public /* synthetic */ boolean a(C3676c cVar) {
        if (!(cVar instanceof I)) {
            return false;
        }
        I i2 = (I) cVar;
        if (i2.b() + TimeUnit.MINUTES.toMillis((long) i2.e()) > this.i.a()) {
            return true;
        }
        return false;
    }
}
