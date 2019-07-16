package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: loa reason: default package */
/* compiled from: TranslateXAnimator */
public class loa extends Zna {
    public loa(View view, float f, float f2) {
        super(view, f, f2);
    }

    /* access modifiers changed from: protected */
    public ObjectAnimator a(float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, "translationX", new float[]{f, f2});
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    public float a(float f) {
        return ((Float) this.b.getAnimatedValue()).floatValue() - f;
    }
}
