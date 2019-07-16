package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: SearchView */
class Z implements OnClickListener {
    final /* synthetic */ SearchView a;

    Z(SearchView searchView) {
        this.a = searchView;
    }

    public void onClick(View view) {
        SearchView searchView = this.a;
        if (view == searchView.u) {
            searchView.f();
        } else if (view == searchView.w) {
            searchView.e();
        } else if (view == searchView.v) {
            searchView.g();
        } else if (view == searchView.x) {
            searchView.i();
        } else if (view == searchView.q) {
            searchView.c();
        }
    }
}
