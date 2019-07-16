package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: ItemTouchHelper */
class H implements AnimatorUpdateListener {
    final /* synthetic */ c a;

    H(c cVar) {
        this.a = cVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(valueAnimator.getAnimatedFraction());
    }
}
