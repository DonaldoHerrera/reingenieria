package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* compiled from: ItemTouchHelper */
class E implements Interpolator {
    E() {
    }

    public float getInterpolation(float f) {
        return f * f * f * f * f;
    }
}
