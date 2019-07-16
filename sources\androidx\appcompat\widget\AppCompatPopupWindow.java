package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.k;

class AppCompatPopupWindow extends PopupWindow {
    private static final boolean a = (VERSION.SDK_INT < 21);
    private boolean b;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        na a2 = na.a(context, attributeSet, C1406j.PopupWindow, i, i2);
        if (a2.g(C1406j.PopupWindow_overlapAnchor)) {
            a(a2.a(C1406j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a2.b(C1406j.PopupWindow_android_popupBackground));
        a2.a();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    private void a(boolean z) {
        if (a) {
            this.b = z;
        } else {
            k.a((PopupWindow) this, z);
        }
    }
}
