package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;

/* renamed from: jJa reason: default package and case insensitive filesystem */
/* compiled from: AppCollectionRenderer.kt */
public final class C6701jJa extends m {
    final /* synthetic */ C6769kJa a;

    C6701jJa(C6769kJa kja) {
        this.a = kja;
    }

    public void a(RecyclerView recyclerView, int i) {
        C7471uYa.b(recyclerView, "recyclerView");
        super.a(recyclerView, i);
        this.a.q.accept(Integer.valueOf(i));
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        C7471uYa.b(recyclerView, "recyclerView");
        super.a(recyclerView, i, i2);
        this.a.r.accept(Integer.valueOf(i2));
    }
}
