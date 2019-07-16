package androidx.recyclerview.widget;

/* compiled from: RecyclerView */
class W implements Runnable {
    final /* synthetic */ RecyclerView a;

    W(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void run() {
        RecyclerView recyclerView = this.a;
        if (recyclerView.E && !recyclerView.isLayoutRequested()) {
            RecyclerView recyclerView2 = this.a;
            if (!recyclerView2.B) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.H) {
                recyclerView2.G = true;
            } else {
                recyclerView2.b();
            }
        }
    }
}
