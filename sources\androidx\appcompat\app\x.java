package androidx.appcompat.app;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: AppCompatDelegateImpl */
class x extends Gc {
    final /* synthetic */ c a;

    x(c cVar) {
        this.a = cVar;
    }

    public void b(View view) {
        w.this.q.setVisibility(8);
        w wVar = w.this;
        PopupWindow popupWindow = wVar.r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (wVar.q.getParent() instanceof View) {
            C1778vc.G((View) w.this.q.getParent());
        }
        w.this.q.removeAllViews();
        w.this.t.a((Fc) null);
        w.this.t = null;
    }
}
