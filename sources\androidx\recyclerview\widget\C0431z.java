package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* renamed from: androidx.recyclerview.widget.z reason: case insensitive filesystem */
/* compiled from: ItemTouchHelper */
class C0431z implements Runnable {
    final /* synthetic */ G a;

    C0431z(G g) {
        this.a = g;
    }

    public void run() {
        G g = this.a;
        if (g.c != null && g.c()) {
            G g2 = this.a;
            ViewHolder viewHolder = g2.c;
            if (viewHolder != null) {
                g2.a(viewHolder);
            }
            G g3 = this.a;
            g3.r.removeCallbacks(g3.s);
            C1778vc.a((View) this.a.r, (Runnable) this);
        }
    }
}
