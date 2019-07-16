package androidx.appcompat.widget;

import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.widget.O.a;

/* compiled from: PopupMenu */
class N implements OnDismissListener {
    final /* synthetic */ O a;

    N(O o) {
        this.a = o;
    }

    public void onDismiss() {
        O o = this.a;
        a aVar = o.f;
        if (aVar != null) {
            aVar.a(o);
        }
    }
}
