package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.ha;
import java.util.Map;

/* compiled from: TextScale */
public class q extends Transition {
    private void d(ha haVar) {
        View view = haVar.b;
        if (view instanceof TextView) {
            String str = "android:textscale:scale";
            haVar.a.put(str, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public void a(ha haVar) {
        d(haVar);
    }

    public void c(ha haVar) {
        d(haVar);
    }

    public Animator a(ViewGroup viewGroup, ha haVar, ha haVar2) {
        ValueAnimator valueAnimator = null;
        if (!(haVar == null || haVar2 == null || !(haVar.b instanceof TextView))) {
            View view = haVar2.b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                Map<String, Object> map = haVar.a;
                Map<String, Object> map2 = haVar2.a;
                String str = "android:textscale:scale";
                float f = 1.0f;
                float floatValue = map.get(str) != null ? ((Float) map.get(str)).floatValue() : 1.0f;
                if (map2.get(str) != null) {
                    f = ((Float) map2.get(str)).floatValue();
                }
                if (floatValue == f) {
                    return null;
                }
                valueAnimator = ValueAnimator.ofFloat(new float[]{floatValue, f});
                valueAnimator.addUpdateListener(new p(this, textView));
            }
        }
        return valueAnimator;
    }
}
