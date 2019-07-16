package androidx.recyclerview.widget;

import android.animation.Animator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: ItemTouchHelper */
class B extends c {
    final /* synthetic */ int o;
    final /* synthetic */ ViewHolder p;
    final /* synthetic */ G q;

    B(G g, ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4, int i3, ViewHolder viewHolder2) {
        this.q = g;
        this.o = i3;
        this.p = viewHolder2;
        super(viewHolder, i, i2, f, f2, f3, f4);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.l) {
            if (this.o <= 0) {
                G g = this.q;
                g.m.a(g.r, this.p);
            } else {
                this.q.a.add(this.p.itemView);
                this.i = true;
                int i = this.o;
                if (i > 0) {
                    this.q.a((c) this, i);
                }
            }
            G g2 = this.q;
            View view = g2.x;
            View view2 = this.p.itemView;
            if (view == view2) {
                g2.c(view2);
            }
        }
    }
}
