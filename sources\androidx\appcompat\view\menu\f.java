package androidx.appcompat.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* compiled from: CascadingMenuPopup */
class f implements OnAttachStateChangeListener {
    final /* synthetic */ i a;

    f(i iVar) {
        this.a = iVar;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.z = view.getViewTreeObserver();
            }
            i iVar = this.a;
            iVar.z.removeGlobalOnLayoutListener(iVar.k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
