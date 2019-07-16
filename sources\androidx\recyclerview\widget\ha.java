package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.f.c;

/* compiled from: SimpleItemAnimator */
public abstract class ha extends f {
    boolean g = true;

    public void a(boolean z) {
        this.g = z;
    }

    public abstract boolean a(ViewHolder viewHolder, int i, int i2, int i3, int i4);

    public abstract boolean a(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    public boolean b(ViewHolder viewHolder) {
        return !this.g || viewHolder.isInvalid();
    }

    public void c(ViewHolder viewHolder, boolean z) {
    }

    public boolean c(ViewHolder viewHolder, c cVar, c cVar2) {
        if (cVar.a == cVar2.a && cVar.b == cVar2.b) {
            j(viewHolder);
            return false;
        }
        return a(viewHolder, cVar.a, cVar.b, cVar2.a, cVar2.b);
    }

    public void d(ViewHolder viewHolder, boolean z) {
    }

    public abstract boolean f(ViewHolder viewHolder);

    public abstract boolean g(ViewHolder viewHolder);

    public final void h(ViewHolder viewHolder) {
        n(viewHolder);
        c(viewHolder);
    }

    public final void i(ViewHolder viewHolder) {
        o(viewHolder);
    }

    public final void j(ViewHolder viewHolder) {
        p(viewHolder);
        c(viewHolder);
    }

    public final void k(ViewHolder viewHolder) {
        q(viewHolder);
    }

    public final void l(ViewHolder viewHolder) {
        r(viewHolder);
        c(viewHolder);
    }

    public final void m(ViewHolder viewHolder) {
        s(viewHolder);
    }

    public void n(ViewHolder viewHolder) {
    }

    public void o(ViewHolder viewHolder) {
    }

    public void p(ViewHolder viewHolder) {
    }

    public void q(ViewHolder viewHolder) {
    }

    public void r(ViewHolder viewHolder) {
    }

    public void s(ViewHolder viewHolder) {
    }

    public boolean a(ViewHolder viewHolder, c cVar, c cVar2) {
        if (cVar == null || (cVar.a == cVar2.a && cVar.b == cVar2.b)) {
            return f(viewHolder);
        }
        return a(viewHolder, cVar.a, cVar.b, cVar2.a, cVar2.b);
    }

    public boolean b(ViewHolder viewHolder, c cVar, c cVar2) {
        int i = cVar.a;
        int i2 = cVar.b;
        View view = viewHolder.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.b;
        if (viewHolder.isRemoved() || (i == left && i2 == top)) {
            return g(viewHolder);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(viewHolder, i, i2, left, top);
    }

    public boolean a(ViewHolder viewHolder, ViewHolder viewHolder2, c cVar, c cVar2) {
        int i;
        int i2;
        int i3 = cVar.a;
        int i4 = cVar.b;
        if (viewHolder2.shouldIgnore()) {
            int i5 = cVar.a;
            i = cVar.b;
            i2 = i5;
        } else {
            i2 = cVar2.a;
            i = cVar2.b;
        }
        return a(viewHolder, viewHolder2, i3, i4, i2, i);
    }

    public final void a(ViewHolder viewHolder, boolean z) {
        c(viewHolder, z);
        c(viewHolder);
    }

    public final void b(ViewHolder viewHolder, boolean z) {
        d(viewHolder, z);
    }
}
