package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: RecyclerView */
class ba implements C0021a {
    final /* synthetic */ RecyclerView a;

    ba(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public ViewHolder a(int i) {
        ViewHolder a2 = this.a.a(i, true);
        if (a2 != null && !this.a.o.c(a2.itemView)) {
            return a2;
        }
        return null;
    }

    public void b(int i, int i2) {
        this.a.a(i, i2, false);
        this.a.ua = true;
    }

    /* access modifiers changed from: 0000 */
    public void c(b bVar) {
        int i = bVar.a;
        if (i == 1) {
            RecyclerView recyclerView = this.a;
            recyclerView.w.a(recyclerView, bVar.b, bVar.d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.a;
            recyclerView2.w.b(recyclerView2, bVar.b, bVar.d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.a;
            recyclerView3.w.a(recyclerView3, bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.a;
            recyclerView4.w.a(recyclerView4, bVar.b, bVar.d, 1);
        }
    }

    public void d(int i, int i2) {
        this.a.a(i, i2, true);
        RecyclerView recyclerView = this.a;
        recyclerView.ua = true;
        recyclerView.ra.d += i2;
    }

    public void a(int i, int i2, Object obj) {
        this.a.a(i, i2, obj);
        this.a.va = true;
    }

    public void b(b bVar) {
        c(bVar);
    }

    public void a(b bVar) {
        c(bVar);
    }

    public void a(int i, int i2) {
        this.a.g(i, i2);
        this.a.ua = true;
    }

    public void c(int i, int i2) {
        this.a.f(i, i2);
        this.a.ua = true;
    }
}
