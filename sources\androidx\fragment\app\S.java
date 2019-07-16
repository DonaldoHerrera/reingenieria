package androidx.fragment.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/* compiled from: ListFragment */
class S implements OnItemClickListener {
    final /* synthetic */ T a;

    S(T t) {
        this.a = t;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.onListItemClick((ListView) adapterView, view, i, j);
    }
}
