package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* compiled from: SearchView */
class X implements OnFocusChangeListener {
    final /* synthetic */ SearchView a;

    X(SearchView searchView) {
        this.a = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.a;
        OnFocusChangeListener onFocusChangeListener = searchView.N;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
