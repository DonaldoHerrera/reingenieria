package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

public class Constraints extends ViewGroup {
    b a;

    public static class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {
        public float na;
        public boolean oa;
        public float pa;
        public float qa;
        public float ra;
        public float sa;
        public float ta;
        public float ua;
        public float va;
        public float wa;
        public float xa;
        public float ya;
        public float za;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.na = 1.0f;
            this.oa = false;
            this.pa = 0.0f;
            this.qa = 0.0f;
            this.ra = 0.0f;
            this.sa = 0.0f;
            this.ta = 1.0f;
            this.ua = 1.0f;
            this.va = 0.0f;
            this.wa = 0.0f;
            this.xa = 0.0f;
            this.ya = 0.0f;
            this.za = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.na = 1.0f;
            this.oa = false;
            this.pa = 0.0f;
            this.qa = 0.0f;
            this.ra = 0.0f;
            this.sa = 0.0f;
            this.ta = 1.0f;
            this.ua = 1.0f;
            this.va = 0.0f;
            this.wa = 0.0f;
            this.xa = 0.0f;
            this.ya = 0.0f;
            this.za = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == d.ConstraintSet_android_alpha) {
                    this.na = obtainStyledAttributes.getFloat(index, this.na);
                } else if (index == d.ConstraintSet_android_elevation) {
                    this.pa = obtainStyledAttributes.getFloat(index, this.pa);
                    this.oa = true;
                } else if (index == d.ConstraintSet_android_rotationX) {
                    this.ra = obtainStyledAttributes.getFloat(index, this.ra);
                } else if (index == d.ConstraintSet_android_rotationY) {
                    this.sa = obtainStyledAttributes.getFloat(index, this.sa);
                } else if (index == d.ConstraintSet_android_rotation) {
                    this.qa = obtainStyledAttributes.getFloat(index, this.qa);
                } else if (index == d.ConstraintSet_android_scaleX) {
                    this.ta = obtainStyledAttributes.getFloat(index, this.ta);
                } else if (index == d.ConstraintSet_android_scaleY) {
                    this.ua = obtainStyledAttributes.getFloat(index, this.ua);
                } else if (index == d.ConstraintSet_android_transformPivotX) {
                    this.va = obtainStyledAttributes.getFloat(index, this.va);
                } else if (index == d.ConstraintSet_android_transformPivotY) {
                    this.wa = obtainStyledAttributes.getFloat(index, this.wa);
                } else if (index == d.ConstraintSet_android_translationX) {
                    this.xa = obtainStyledAttributes.getFloat(index, this.xa);
                } else if (index == d.ConstraintSet_android_translationY) {
                    this.ya = obtainStyledAttributes.getFloat(index, this.ya);
                } else if (index == d.ConstraintSet_android_translationZ) {
                    this.xa = obtainStyledAttributes.getFloat(index, this.za);
                }
            }
        }
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
        super.setVisibility(8);
    }

    private void a(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    public b getConstraintSet() {
        if (this.a == null) {
            this.a = new b();
        }
        this.a.a(this);
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
        super.setVisibility(8);
    }
}
