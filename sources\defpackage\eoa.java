package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: eoa reason: default package */
/* compiled from: ScrollXAnimator */
public class eoa extends Zna {
    eoa(View view, float f, float f2) {
        super(view, f, f2);
    }

    /* access modifiers changed from: protected */
    public ObjectAnimator a(float f, float f2) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a, "scrollX", new int[]{(int) f, (int) f2});
        ofInt.setInterpolator(new LinearInterpolator());
        return ofInt;
    }

    public float a(float f) {
        return ((float) ((Integer) this.b.getAnimatedValue()).intValue()) - f;
    }
}
