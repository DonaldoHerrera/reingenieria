package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.f.a;

/* compiled from: ItemTouchHelper */
class C implements Runnable {
    final /* synthetic */ c a;
    final /* synthetic */ int b;
    final /* synthetic */ G c;

    C(G g, c cVar, int i) {
        this.c = g;
        this.a = cVar;
        this.b = i;
    }

    public void run() {
        RecyclerView recyclerView = this.c.r;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            c cVar = this.a;
            if (!cVar.l && cVar.e.getAdapterPosition() != -1) {
                f itemAnimator = this.c.r.getItemAnimator();
                if ((itemAnimator == null || !itemAnimator.a((a) null)) && !this.c.a()) {
                    this.c.m.b(this.a.e, this.b);
                } else {
                    this.c.r.post(this);
                }
            }
        }
    }
}
