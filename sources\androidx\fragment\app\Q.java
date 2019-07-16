package androidx.fragment.app;

import android.widget.ListView;

/* compiled from: ListFragment */
class Q implements Runnable {
    final /* synthetic */ T a;

    Q(T t) {
        this.a = t;
    }

    public void run() {
        ListView listView = this.a.mList;
        listView.focusableViewAvailable(listView);
    }
}
