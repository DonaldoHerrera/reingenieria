package com.soundcloud.android.ads;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3692t;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.stream.C6109va;
import com.soundcloud.android.stream.C6109va.e;
import com.soundcloud.android.stream.C6114y;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* compiled from: InlayAdHelper */
class Qb {
    /* access modifiers changed from: private */
    public final RecyclerView a;
    /* access modifiers changed from: private */
    public final C6114y b;
    private final C5694cGa c;
    private final C5327TLa d;
    /* access modifiers changed from: private */
    public final id e;
    int f = -1;
    int g = -1;

    /* compiled from: InlayAdHelper */
    private class a extends C5037Jua<defpackage.C3431IZ.a> {
        final HashMap<aa, Integer> d;

        private a() {
            this.d = new HashMap<>(3);
        }

        public void a(defpackage.C3431IZ.a aVar) {
            aa k = aVar.k();
            if (!this.d.containsKey(k)) {
                a(aVar, k);
            } else if (a(((Integer) this.d.get(k)).intValue(), k)) {
                a(aVar, ((Integer) this.d.get(k)).intValue());
            } else {
                this.d.remove(k);
                a(aVar, k);
            }
        }

        private void a(defpackage.C3431IZ.a aVar, aa aaVar) {
            if (a(aaVar)) {
                a(aVar, ((Integer) this.d.get(aaVar)).intValue());
            }
        }

        private void a(defpackage.C3431IZ.a aVar, int i) {
            View c = Qb.this.a.getLayoutManager().c(i);
            if (c != null) {
                Qb.this.e.a(c, aVar.j(), aVar.l());
            }
        }

        private boolean a(aa aaVar) {
            for (int c = Qb.this.d(); c <= Qb.this.f(); c++) {
                if (a(c, aaVar)) {
                    this.d.put(aaVar, Integer.valueOf(c));
                    return true;
                }
            }
            return false;
        }

        private boolean a(int i, aa aaVar) {
            if (i > 0 && i < Qb.this.e()) {
                C6109va vaVar = (C6109va) Qb.this.b.g(i);
                if (vaVar instanceof e) {
                    return ((e) vaVar).j().equals(aaVar);
                }
            }
            return false;
        }
    }

    /* compiled from: InlayAdHelper */
    static abstract class b {
        b() {
        }

        static b a(float f, int i, aa aaVar) {
            return new C2626tb(i, f, aaVar);
        }

        /* access modifiers changed from: 0000 */
        public abstract aa a();

        /* access modifiers changed from: 0000 */
        public abstract int b();

        /* access modifiers changed from: 0000 */
        public abstract float c();

        /* access modifiers changed from: 0000 */
        public boolean a(C4928GKa<b> gKa) {
            return c() > (gKa.c() ? ((b) gKa.b()).c() : 0.0f);
        }
    }

    Qb(RecyclerView recyclerView, C6114y yVar, C5694cGa cga, C5327TLa tLa) {
        this.a = recyclerView;
        this.b = yVar;
        this.c = cga;
        this.d = tLa;
        this.e = yVar.k();
    }

    private List<C7664xKa<Integer, C3676c>> c() {
        return a(d(), f());
    }

    /* access modifiers changed from: private */
    public int d() {
        int i = -1;
        if (this.a.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.a.getLayoutManager();
            int[] a2 = staggeredGridLayoutManager.a(new int[staggeredGridLayoutManager.K()]);
            int length = a2.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = a2[i2];
                i = i >= 0 ? Math.min(i, i3) : i3;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public int e() {
        return this.b.h().size();
    }

    /* access modifiers changed from: private */
    public int f() {
        int i = -1;
        if (this.a.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.a.getLayoutManager();
            for (int max : staggeredGridLayoutManager.b(new int[staggeredGridLayoutManager.K()])) {
                i = Math.max(i, max);
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.b.m();
    }

    /* access modifiers changed from: 0000 */
    public VPa b() {
        return (VPa) this.d.a(C3876taa.h).a((C7256rQa<? super T>) C2578ha.a).a(defpackage.C3431IZ.a.class).c(new a());
    }

    private boolean c(int i) {
        return !((C6109va) this.b.g(i)).i();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(C3676c cVar, boolean z) {
        int i;
        if (z) {
            i = b(d(), -1);
        } else {
            i = b(f(), 1);
        }
        if (i != -1) {
            C4928GKa a2 = a(cVar);
            if (a2.c()) {
                this.b.a(i, (C6109va) a2.b());
                return true;
            }
        }
        return false;
    }

    private int b(int i, int i2) {
        int i3 = i + i2;
        while (Math.abs(i - i3) < 5) {
            if (d(i3)) {
                return i3;
            }
            i3 += i2;
        }
        return -1;
    }

    private boolean d(int i) {
        return i > 4 && i < e() && c(i) && b(i);
    }

    private C4928GKa<C6109va> a(C3676c cVar) {
        if (cVar instanceof C3692t) {
            return C4928GKa.c(new com.soundcloud.android.stream.C6109va.a((C3692t) cVar));
        }
        if (cVar instanceof aa) {
            return C4928GKa.c(new e((aa) cVar));
        }
        return C4928GKa.a();
    }

    private boolean b(int i) {
        int min = Math.min(i + 4, e() - 1);
        for (int max = Math.max(0, i - 4); max <= min; max++) {
            if (((C6109va) this.b.g(max)).g()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        Date b2 = this.c.b();
        this.f = d();
        this.g = f();
        a(b2, c(), z);
    }

    private void a(Date date, List<C7664xKa<Integer, C3676c>> list, boolean z) {
        C4928GKa a2 = C4928GKa.a();
        for (C7664xKa xka : list) {
            C3676c cVar = (C3676c) xka.b();
            if (cVar instanceof C3692t) {
                a(date, ((Integer) xka.a()).intValue(), (C3692t) cVar);
            } else if (cVar instanceof aa) {
                View c2 = this.a.getLayoutManager().c(((Integer) xka.a()).intValue());
                a2 = a(a2, xka, c2);
                if (z) {
                    a(c2, (aa) cVar);
                }
            }
        }
        if (a2.c()) {
            b bVar = (b) a2.b();
            a((C3431IZ) new defpackage.C3431IZ.d.b(date, bVar.b(), bVar.a()));
            return;
        }
        a((C3431IZ) new e(date, true));
    }

    private void a(View view, aa aaVar) {
        if (view != null) {
            this.e.a(view, aaVar);
        }
    }

    private C4928GKa<b> a(C4928GKa<b> gKa, C7664xKa<Integer, C3676c> xka, View view) {
        float a2 = a(view);
        b a3 = b.a(a2, ((Integer) xka.a()).intValue(), (aa) xka.b());
        return (a2 <= 50.0f || !a3.a(gKa)) ? gKa : C4928GKa.c(a3);
    }

    private float a(View view) {
        if (view != null) {
            return C6768kIa.a((View) this.e.b(view));
        }
        return 0.0f;
    }

    private void a(Date date, int i, C3692t tVar) {
        if (!tVar.p()) {
            a((C3431IZ) new defpackage.C3431IZ.d.b(date, i, tVar));
        }
    }

    private void a(C3431IZ iz) {
        this.d.c(C3876taa.h, iz);
    }

    public boolean a(int i) {
        int i2 = this.f;
        return i2 >= 0 && i2 <= i && i <= this.g;
    }

    private List<C7664xKa<Integer, C3676c>> a(int i, int i2) {
        ArrayList arrayList = new ArrayList(3);
        int min = Math.min(i2, e() - 1);
        for (int max = Math.max(i, 0); max <= min; max++) {
            if (max != -1) {
                C4928GKa a2 = ((C6109va) this.b.g(max)).a();
                if (a2.c()) {
                    arrayList.add(C7664xKa.a(Integer.valueOf(max), a2.b()));
                }
            }
        }
        return arrayList;
    }
}
