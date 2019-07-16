package androidx.recyclerview.widget;

/* compiled from: StaggeredGridLayoutManager */
class ka implements Runnable {
    final /* synthetic */ StaggeredGridLayoutManager a;

    ka(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.a = staggeredGridLayoutManager;
    }

    public void run() {
        this.a.G();
    }
}
