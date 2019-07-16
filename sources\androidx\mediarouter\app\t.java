package androidx.mediarouter.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* compiled from: MediaRouteControllerDialog */
class t implements AnimationListener {
    final /* synthetic */ u a;

    t(u uVar) {
        this.a = uVar;
    }

    public void onAnimationEnd(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.a.F.a();
        u uVar = this.a;
        uVar.F.postDelayed(uVar.qa, (long) uVar.ia);
    }
}
