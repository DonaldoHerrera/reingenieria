package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b;

/* compiled from: SwipeRefreshLayout */
class e implements AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;

    e(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (swipeRefreshLayout.e) {
            swipeRefreshLayout.D.setAlpha(255);
            this.a.D.start();
            SwipeRefreshLayout swipeRefreshLayout2 = this.a;
            if (swipeRefreshLayout2.J) {
                b bVar = swipeRefreshLayout2.d;
                if (bVar != null) {
                    bVar.onRefresh();
                }
            }
            SwipeRefreshLayout swipeRefreshLayout3 = this.a;
            swipeRefreshLayout3.o = swipeRefreshLayout3.w.getTop();
            return;
        }
        swipeRefreshLayout.c();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
