package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: androidx.appcompat.widget.ca reason: case insensitive filesystem */
/* compiled from: SearchView */
class C0336ca implements OnItemClickListener {
    final /* synthetic */ SearchView a;

    C0336ca(SearchView searchView) {
        this.a = searchView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.a(i, 0, (String) null);
    }
}
