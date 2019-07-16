package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.f.c;

/* compiled from: RecyclerView */
class Z implements b {
    final /* synthetic */ RecyclerView a;

    Z(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(ViewHolder viewHolder, c cVar, c cVar2) {
        this.a.a(viewHolder, cVar, cVar2);
    }

    public void b(ViewHolder viewHolder, c cVar, c cVar2) {
        this.a.l.c(viewHolder);
        this.a.b(viewHolder, cVar, cVar2);
    }

    public void c(ViewHolder viewHolder, c cVar, c cVar2) {
        viewHolder.setIsRecyclable(false);
        RecyclerView recyclerView = this.a;
        if (recyclerView.N) {
            if (recyclerView.W.a(viewHolder, viewHolder, cVar, cVar2)) {
                this.a.t();
            }
        } else if (recyclerView.W.c(viewHolder, cVar, cVar2)) {
            this.a.t();
        }
    }

    public void a(ViewHolder viewHolder) {
        RecyclerView recyclerView = this.a;
        recyclerView.w.a(viewHolder.itemView, recyclerView.l);
    }
}
