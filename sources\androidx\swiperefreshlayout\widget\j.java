package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout */
class j extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    j(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i;
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (!swipeRefreshLayout.L) {
            i = swipeRefreshLayout.B - Math.abs(swipeRefreshLayout.A);
        } else {
            i = swipeRefreshLayout.B;
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        int i2 = swipeRefreshLayout2.y;
        this.a.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.w.getTop());
        this.a.D.a(1.0f - f);
    }
}
