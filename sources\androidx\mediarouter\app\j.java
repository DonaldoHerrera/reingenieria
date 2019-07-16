package androidx.mediarouter.app;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: MediaRouteControllerDialog */
class j implements OnGlobalLayoutListener {
    final /* synthetic */ u a;

    j(u uVar) {
        this.a = uVar;
    }

    public void onGlobalLayout() {
        this.a.F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        this.a.h();
    }
}
