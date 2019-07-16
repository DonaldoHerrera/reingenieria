package androidx.mediarouter.app;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: MediaRouteControllerDialog */
class q implements OnGlobalLayoutListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ u b;

    q(u uVar, boolean z) {
        this.b = uVar;
        this.a = z;
    }

    public void onGlobalLayout() {
        this.b.u.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        u uVar = this.b;
        if (uVar.ga) {
            uVar.ha = true;
        } else {
            uVar.e(this.a);
        }
    }
}
