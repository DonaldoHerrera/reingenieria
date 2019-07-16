package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout */
class l extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    l(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        float f2 = swipeRefreshLayout.z;
        swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
        this.a.a(f);
    }
}
