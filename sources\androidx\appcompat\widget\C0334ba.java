package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: androidx.appcompat.widget.ba reason: case insensitive filesystem */
/* compiled from: SearchView */
class C0334ba implements OnEditorActionListener {
    final /* synthetic */ SearchView a;

    C0334ba(SearchView searchView) {
        this.a = searchView;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.g();
        return true;
    }
}
