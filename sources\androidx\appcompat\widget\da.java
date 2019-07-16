package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* compiled from: SearchView */
class da implements OnItemSelectedListener {
    final /* synthetic */ SearchView a;

    da(SearchView searchView) {
        this.a = searchView;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.d(i);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
