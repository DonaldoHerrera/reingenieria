package androidx.appcompat.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* compiled from: StandardMenuPopup */
class B implements OnAttachStateChangeListener {
    final /* synthetic */ C a;

    B(C c) {
        this.a = c;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.q = view.getViewTreeObserver();
            }
            C c = this.a;
            c.q.removeGlobalOnLayoutListener(c.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
