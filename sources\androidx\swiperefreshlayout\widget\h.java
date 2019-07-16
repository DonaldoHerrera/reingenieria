package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: SwipeRefreshLayout */
class h extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ SwipeRefreshLayout c;

    h(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        d dVar = this.c.D;
        int i = this.a;
        dVar.setAlpha((int) (((float) i) + (((float) (this.b - i)) * f)));
    }
}
