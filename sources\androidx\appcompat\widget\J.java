package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* compiled from: ListPopupWindow */
class J implements OnItemSelectedListener {
    final /* synthetic */ ListPopupWindow a;

    J(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != -1) {
            F f = this.a.f;
            if (f != null) {
                f.setListSelectionHidden(false);
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
