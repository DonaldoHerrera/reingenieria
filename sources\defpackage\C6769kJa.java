package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.l;

/* renamed from: kJa reason: default package and case insensitive filesystem */
/* compiled from: AppCollectionRenderer.kt */
public final class C6769kJa<ItemT, ErrorType> extends C5494ZEa<ItemT, ErrorType> {
    /* access modifiers changed from: private */
    public final C2332VH<Integer> q;
    /* access modifiers changed from: private */
    public final C2332VH<Integer> r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;

    public /* synthetic */ C6769kJa(C5407WEa wEa, C6308dYa dya, C6308dYa dya2, c cVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, C7264rYa rya) {
        int i2 = i;
        this(wEa, dya, (i2 & 4) != 0 ? C6565hJa.a : dya2, cVar, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? false : z5, (i2 & 512) != 0 ? false : z6);
    }

    private final void c(RecyclerView recyclerView) {
        Drawable c = a.c(recyclerView.getContext(), h.list_divider_item);
        if (c != null) {
            recyclerView.a((RecyclerView.h) new C5396Vta(c, recyclerView.getResources().getDimensionPixelSize(g.list_divider_horizontal_height)));
            return;
        }
        throw new IllegalArgumentException("Divider is null");
    }

    private final void d(RecyclerView recyclerView) {
        Drawable c = a.c(recyclerView.getContext(), g.divider_combined);
        if (c != null) {
            recyclerView.a((RecyclerView.h) new C7851zxa(c));
        } else {
            C7471uYa.a();
            throw null;
        }
    }

    public final APa<Integer> h() {
        return this.q;
    }

    public final APa<Integer> i() {
        return this.r;
    }

    public static /* synthetic */ void a(C6769kJa kja, View view, boolean z, PXa pXa, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            pXa = new C6633iJa(view);
        }
        if ((i2 & 8) != 0) {
            i = l.emptyview_container;
        }
        kja.a(view, z, pXa, i);
    }

    private final void b(RecyclerView recyclerView) {
        recyclerView.a((RecyclerView.h) new C5483Yta(recyclerView.getResources().getDimensionPixelSize(g.grid_divider_left_right_inset), recyclerView.getResources().getDimensionPixelSize(g.grid_divider_top_bottom_inset)));
    }

    public C6769kJa(C5407WEa<ItemT> wEa, C6308dYa<? super ItemT, ? super ItemT, Boolean> dya, C6308dYa<? super ItemT, ? super ItemT, Boolean> dya2, c<ErrorType> cVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C5407WEa<ItemT> wEa2 = wEa;
        C7471uYa.b(wEa, "adapter");
        C6308dYa<? super ItemT, ? super ItemT, Boolean> dya3 = dya;
        C7471uYa.b(dya, "sameIdentity");
        C6308dYa<? super ItemT, ? super ItemT, Boolean> dya4 = dya2;
        C7471uYa.b(dya2, "sameContent");
        super(wEa2, dya3, dya4, cVar, z, z6);
        this.s = z2;
        this.t = z3;
        this.u = z4;
        this.v = z5;
        C2332VH<Integer> s2 = C2332VH.s();
        String str = "PublishRelay.create<Int>()";
        C7471uYa.a((Object) s2, str);
        this.q = s2;
        C2332VH<Integer> s3 = C2332VH.s();
        C7471uYa.a((Object) s3, str);
        this.r = s3;
    }

    public final void a(View view, boolean z, PXa<? extends i> pXa, int i) {
        C7471uYa.b(view, "view");
        C7471uYa.b(pXa, "layoutManagerProvider");
        super.a(view, z, pXa, i, ia.i.ak_recycler_view, ia.i.str_layout);
    }

    public void a(RecyclerView recyclerView) {
        C7471uYa.b(recyclerView, "recyclerView");
        if (this.s) {
            c(recyclerView);
        }
        if (this.u) {
            b(recyclerView);
        }
        if (this.t) {
            d(recyclerView);
        }
        if (this.v) {
            recyclerView.a((m) new C5561aJa());
            recyclerView.a((m) new C6701jJa(this));
        }
    }
}
