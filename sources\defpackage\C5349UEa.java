package defpackage;

import android.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: UEa reason: default package and case insensitive filesystem */
/* compiled from: RecyclerViewPaginator.kt */
public final class C5349UEa {
    private VPa a;
    /* access modifiers changed from: private */
    public final RecyclerView b;
    /* access modifiers changed from: private */
    public final PXa<RVa> c;

    public C5349UEa(RecyclerView recyclerView, PXa<RVa> pXa) {
        C7471uYa.b(recyclerView, "recyclerView");
        C7471uYa.b(pXa, "nextPage");
        this.b = recyclerView;
        this.c = pXa;
        a();
    }

    public final void b() {
        VPa vPa = this.a;
        if (vPa != null) {
            vPa.dispose();
        }
        this.a = null;
    }

    public final void a() {
        b();
        this.a = C2238QH.a(this.b).h(new C5200PEa(this)).a((C7256rQa<? super T>) C5230QEa.a).h(new C5260REa(this)).a((C7256rQa<? super T>) new C5290SEa<Object>(this)).d().f((C6776kQa<? super T>) new C5320TEa<Object>(this));
    }

    /* access modifiers changed from: private */
    public final Pair<Integer, Integer> a(LinearLayoutManager linearLayoutManager) {
        return new Pair<>(Integer.valueOf(linearLayoutManager.H()), Integer.valueOf(linearLayoutManager.j()));
    }

    /* access modifiers changed from: private */
    public final Pair<Integer, Integer> a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        int[] b2 = staggeredGridLayoutManager.b(new int[staggeredGridLayoutManager.K()]);
        return new Pair<>(Integer.valueOf(b2[b2.length - 1]), Integer.valueOf(staggeredGridLayoutManager.j()));
    }

    /* access modifiers changed from: private */
    public final Pair<Integer, Integer> a(GridLayoutManager gridLayoutManager) {
        return new Pair<>(Integer.valueOf(gridLayoutManager.H()), Integer.valueOf(gridLayoutManager.j()));
    }

    /* access modifiers changed from: private */
    public final boolean a(Pair<Integer, Integer> pair) {
        Integer num = (Integer) pair.first;
        return num != null && num.intValue() == ((Number) pair.second).intValue() - 1;
    }
}
