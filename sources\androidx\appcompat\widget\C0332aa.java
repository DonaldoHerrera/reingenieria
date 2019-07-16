package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: androidx.appcompat.widget.aa reason: case insensitive filesystem */
/* compiled from: SearchView */
class C0332aa implements OnKeyListener {
    final /* synthetic */ SearchView a;

    C0332aa(SearchView searchView) {
        this.a = searchView;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.a;
        if (searchView.ga == null) {
            return false;
        }
        if (searchView.q.isPopupShowing() && this.a.q.getListSelection() != -1) {
            return this.a.a(view, i, keyEvent);
        }
        if (this.a.q.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        SearchView searchView2 = this.a;
        searchView2.a(0, (String) null, searchView2.q.getText().toString());
        return true;
    }
}
