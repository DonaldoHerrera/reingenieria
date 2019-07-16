package androidx.appcompat.widget;

/* compiled from: SearchView */
class W implements Runnable {
    final /* synthetic */ SearchView a;

    W(SearchView searchView) {
        this.a = searchView;
    }

    public void run() {
        Qc qc = this.a.S;
        if (qc != null && (qc instanceof ga)) {
            qc.a(null);
        }
    }
}
