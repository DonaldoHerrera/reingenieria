package androidx.appcompat.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: androidx.appcompat.widget.k reason: case insensitive filesystem */
/* compiled from: ActivityChooserView */
class C0344k implements OnGlobalLayoutListener {
    final /* synthetic */ ActivityChooserView a;

    C0344k(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public void onGlobalLayout() {
        if (!this.a.b()) {
            return;
        }
        if (!this.a.isShown()) {
            this.a.getListPopupWindow().dismiss();
            return;
        }
        this.a.getListPopupWindow().c();
        C0278Xb xb = this.a.j;
        if (xb != null) {
            xb.a(true);
        }
    }
}
