package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* compiled from: SwipeRefreshLayout */
class i implements AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;

    i(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (!swipeRefreshLayout.t) {
            swipeRefreshLayout.a((AnimationListener) null);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
