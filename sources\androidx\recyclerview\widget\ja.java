package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.k;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.r.b;

/* compiled from: SnapHelper */
public abstract class ja extends k {
    RecyclerView a;
    private Scroller b;
    private final m c = new ia(this);

    private void b() {
        this.a.b(this.c);
        this.a.setOnFlingListener(null);
    }

    private void c() throws IllegalStateException {
        if (this.a.getOnFlingListener() == null) {
            this.a.a(this.c);
            this.a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public abstract int a(i iVar, int i, int i2);

    public boolean a(int i, int i2) {
        i layoutManager = this.a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && b(layoutManager, i, i2)) {
            z = true;
        }
        return z;
    }

    public abstract int[] a(i iVar, View view);

    /* access modifiers changed from: protected */
    @Deprecated
    public abstract M b(i iVar);

    public abstract View c(i iVar);

    private boolean b(i iVar, int i, int i2) {
        if (!(iVar instanceof b)) {
            return false;
        }
        r a2 = a(iVar);
        if (a2 == null) {
            return false;
        }
        int a3 = a(iVar, i, i2);
        if (a3 == -1) {
            return false;
        }
        a2.c(a3);
        iVar.b(a2);
        return true;
    }

    public void a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                b();
            }
            this.a = recyclerView;
            if (this.a != null) {
                c();
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c2 = c(layoutManager);
                if (c2 != null) {
                    int[] a2 = a(layoutManager, c2);
                    if (!(a2[0] == 0 && a2[1] == 0)) {
                        this.a.i(a2[0], a2[1]);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public r a(i iVar) {
        return b(iVar);
    }
}
