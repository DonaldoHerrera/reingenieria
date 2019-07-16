package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: androidx.appcompat.widget.y reason: case insensitive filesystem */
/* compiled from: AppCompatSpinner */
class C0357y implements OnDismissListener {
    final /* synthetic */ OnGlobalLayoutListener a;
    final /* synthetic */ b b;

    C0357y(b bVar, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = bVar;
        this.a = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
