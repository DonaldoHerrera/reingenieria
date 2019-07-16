package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.m;

/* compiled from: SnapHelper */
class ia extends m {
    boolean a = false;
    final /* synthetic */ ja b;

    ia(ja jaVar) {
        this.b = jaVar;
    }

    public void a(RecyclerView recyclerView, int i) {
        super.a(recyclerView, i);
        if (i == 0 && this.a) {
            this.a = false;
            this.b.a();
        }
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.a = true;
        }
    }
}
