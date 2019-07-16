package defpackage;

import android.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: REa reason: default package and case insensitive filesystem */
/* compiled from: RecyclerViewPaginator.kt */
final class C5260REa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C5349UEa a;

    C5260REa(C5349UEa uEa) {
        this.a = uEa;
    }

    /* renamed from: a */
    public final Pair<Integer, Integer> apply(i iVar) {
        C7471uYa.b(iVar, "it");
        if (iVar instanceof LinearLayoutManager) {
            return this.a.a((LinearLayoutManager) iVar);
        }
        if (iVar instanceof StaggeredGridLayoutManager) {
            return this.a.a((StaggeredGridLayoutManager) iVar);
        }
        if (iVar instanceof GridLayoutManager) {
            return this.a.a((GridLayoutManager) iVar);
        }
        throw new IllegalArgumentException("Unexpected layout manager in recycler view");
    }
}
