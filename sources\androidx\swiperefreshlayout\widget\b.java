package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: CircularProgressDrawable */
class b implements AnimatorUpdateListener {
    final /* synthetic */ a a;
    final /* synthetic */ d b;

    b(d dVar, a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.b.a(floatValue, this.a);
        this.b.a(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
