package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.f;

/* compiled from: RecyclerView */
class X implements Runnable {
    final /* synthetic */ RecyclerView a;

    X(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void run() {
        f fVar = this.a.W;
        if (fVar != null) {
            fVar.i();
        }
        this.a.xa = false;
    }
}
