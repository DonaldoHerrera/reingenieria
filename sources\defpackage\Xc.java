package defpackage;

import android.view.animation.Interpolator;

/* renamed from: Xc reason: default package */
/* compiled from: ViewDragHelper */
class Xc implements Interpolator {
    Xc() {
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
