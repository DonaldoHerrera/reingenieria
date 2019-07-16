package androidx.mediarouter.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* compiled from: MediaRouteControllerDialog */
class k implements AnimationListener {
    final /* synthetic */ u a;

    k(u uVar) {
        this.a = uVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.b(true);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
