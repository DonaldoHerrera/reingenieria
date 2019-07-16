package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.c;

public class Fade extends Visibility {

    private static class a extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        a(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            wa.a(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C1778vc.x(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        a(i);
    }

    private Animator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        wa.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, wa.d, new float[]{f2});
        ofFloat.addListener(new a(view));
        a((c) new C0461t(this, view));
        return ofFloat;
    }

    public Animator b(ViewGroup viewGroup, View view, ha haVar, ha haVar2) {
        wa.e(view);
        return a(view, a(haVar, 1.0f), 0.0f);
    }

    public void c(ha haVar) {
        super.c(haVar);
        haVar.a.put("android:fade:transitionAlpha", Float.valueOf(wa.c(haVar.b)));
    }

    public Fade() {
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.f);
        a(C0286Za.b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, D()));
        obtainStyledAttributes.recycle();
    }

    public Animator a(ViewGroup viewGroup, View view, ha haVar, ha haVar2) {
        float f = 0.0f;
        float a2 = a(haVar, 0.0f);
        if (a2 != 1.0f) {
            f = a2;
        }
        return a(view, f, 1.0f);
    }

    private static float a(ha haVar, float f) {
        if (haVar == null) {
            return f;
        }
        Float f2 = (Float) haVar.a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }
}
